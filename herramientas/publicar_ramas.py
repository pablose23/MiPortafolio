#!/usr/bin/env python3
"""
Publica los proyectos de la carpeta DAM como ramas independientes de miportafolio.

Uso (en tu PC, con Python 3.8+ y git instalados):

  1) Clona el repo y ponte en main:
       git clone https://github.com/pablose23/miportafolio
       cd miportafolio && git checkout main

  2) Escanea tu carpeta DAM. Genera proyectos.json (NO toca git):
       python herramientas/publicar_ramas.py escanear --dam "C:/ruta/a/DAM"

  3) Abre proyectos.json y revisa cada entrada:
       - "incluir": false  -> la actividad no se publica (incompleta / no es tuya)
       - "ia": "no" | "parcial" | "si"
             no       = hecho por mí
             parcial  = hecho por mí, IA solo para corregir errores
             si       = hecho con IA
       - "descripcion": una o dos frases (es / en)
       - "revisar": avisos del escaneo (puedes borrarlos al revisarlo)
     Proyectos fuera de DAM: añade una entrada con "origen" absoluto y
     "curso": "Otros" (los hechos con IA, por ejemplo).

  4) Simulacro (no cambia nada, muestra qué haría + avisos de secretos):
       python herramientas/publicar_ramas.py publicar --repo .

  5) Ejecutar de verdad (crea ramas locales y actualiza el README de main):
       python herramientas/publicar_ramas.py publicar --repo . --ejecutar
     Y para subirlo a GitHub:
       python herramientas/publicar_ramas.py publicar --repo . --ejecutar --subir

Cada rama es independiente (historial propio, no comparte nada con main).
El script se puede repetir: salta las ramas que ya existen (usa --reemplazar
para rehacerlas).
"""
import argparse
import fnmatch
import json
import os
import re
import shutil
import subprocess
import sys
import tempfile
import unicodedata
from pathlib import Path

# ---- Qué asignaturas se publican -------------------------------------------
# clave que debe contener el nombre normalizado de la carpeta -> (nombre, slug)
ASIGNATURAS = {
    "DAM1": {
        "programacion": ("Programación", "programacion"),
        "marcas": ("Lenguaje de marcas", "lenguaje-marcas"),
    },
    "DAM2": {
        "datos": ("Acceso a Datos", "acceso-datos"),
        "android": ("Android", "android"),
        "interfaces": ("Desarrollo de Interfaces", "interfaces"),
        "psp": ("PSP", "psp"),
        "procesos": ("PSP", "psp"),
    },
}

# ---- Qué se copia / qué no -------------------------------------------------
IGNORAR_DIRS = {
    ".git", "node_modules", "build", ".gradle", ".idea", ".vs", ".vscode",
    "bin", "obj", "target", "out", "__pycache__", ".dart_tool", "venv",
    ".venv", ".metadata", ".settings", "captures",
}
IGNORAR_FICHEROS = [
    "*.class", "*.apk", "*.aab", "*.exe", "*.o", "*.dll", "*.log", "*.iml",
    "*.keystore", "*.jks", "*.pem", "*.key", "*.p12", ".env", ".env.*",
    "local.properties", "Thumbs.db", ".DS_Store", "google-services.json",
    "*.tmp", "*.bak",
]
MAX_BYTES = 25 * 1024 * 1024

EXT_TECNOLOGIAS = {
    ".java": "Java", ".kt": "Kotlin", ".py": "Python", ".cs": "C#",
    ".c": "C", ".cpp": "C++", ".js": "JavaScript", ".ts": "TypeScript",
    ".html": "HTML", ".css": "CSS", ".sql": "SQL", ".php": "PHP",
    ".fxml": "JavaFX", ".xsd": "XSD", ".dtd": "DTD", ".xsl": "XSLT",
    ".xslt": "XSLT", ".json": "JSON", ".xml": "XML", ".md": None,
}
EXT_CODIGO = {e for e, t in EXT_TECNOLOGIAS.items() if t and e not in {".json", ".xml"}} | {".xml"}

ETIQUETAS = {
    "no": ("🧑‍💻 Hecho por mí", "🧑‍💻 Made by me"),
    "parcial": ("🧑‍💻🛠️ Hecho por mí (IA solo para corregir errores)",
                "🧑‍💻🛠️ Made by me (AI only used to fix bugs)"),
    "si": ("🤖 Realizado con IA", "🤖 Built with AI"),
}

SECRETOS = [
    (re.compile(r"(?i)(password|passwd|pwd|contrase[nñ]a|secret|api[_-]?key|token)\s*[=:]\s*[\"']?[^\s\"']{4,}"),
     "posible contraseña/clave"),
    (re.compile(r"-----BEGIN [A-Z ]*PRIVATE KEY-----"), "clave privada"),
    (re.compile(r"AKIA[0-9A-Z]{16}"), "clave AWS"),
    (re.compile(r"AIza[0-9A-Za-z_\-]{35}"), "clave API de Google"),
    (re.compile(r"(?i)jdbc:[a-z]+://[^\s\"']*[?&;]password=[^\s\"'&;]+"), "contraseña en URL JDBC"),
]
EXT_TEXTO = {".java", ".kt", ".py", ".cs", ".c", ".cpp", ".js", ".ts", ".html", ".css",
             ".sql", ".php", ".xml", ".json", ".properties", ".txt", ".md", ".gradle",
             ".yml", ".yaml", ".ini", ".cfg", ".conf", ".fxml", ".kts", ".toml"}


# ---- utilidades ------------------------------------------------------------
def norm(s):
    s = unicodedata.normalize("NFKD", s)
    return "".join(c for c in s if not unicodedata.combining(c)).lower()


def slug(s, maxlen=50):
    return re.sub(r"[^a-z0-9]+", "-", norm(s)).strip("-")[:maxlen].strip("-") or "proyecto"


def git(repo, *args, check=True):
    r = subprocess.run(["git", *args], cwd=str(repo), capture_output=True,
                       text=True, encoding="utf-8", errors="replace")
    if check and r.returncode != 0:
        sys.exit(f"git {' '.join(args)} falló:\n{r.stderr.strip()}")
    return r


def fichero_ignorado(nombre):
    return any(fnmatch.fnmatch(nombre, p) for p in IGNORAR_FICHEROS)


def recorrer(raiz):
    """Devuelve (ruta_relativa, ruta_absoluta) de los ficheros a publicar."""
    raiz = Path(raiz)
    for d, dirs, files in os.walk(raiz):
        dirs[:] = [x for x in dirs if x not in IGNORAR_DIRS]
        for f in files:
            p = Path(d) / f
            yield p.relative_to(raiz), p


def tecnologias(raiz):
    techs = []
    for rel, p in recorrer(raiz):
        t = EXT_TECNOLOGIAS.get(rel.suffix.lower())
        if t and t not in techs:
            techs.append(t)
        if rel.name == "AndroidManifest.xml" and "Android" not in techs:
            techs.append("Android")
    return techs


def avisos(raiz):
    n_codigo, n_total, vacios = 0, 0, 0
    todo = False
    for rel, p in recorrer(raiz):
        n_total += 1
        if rel.suffix.lower() in EXT_CODIGO:
            n_codigo += 1
            try:
                if p.stat().st_size == 0:
                    vacios += 1
                elif p.stat().st_size < 400_000 and "TODO" in p.read_text(encoding="utf-8", errors="ignore"):
                    todo = True
            except OSError:
                pass
    out = []
    if n_codigo == 0:
        out.append("no se han encontrado ficheros de código")
    if vacios:
        out.append(f"{vacios} fichero(s) de código vacío(s)")
    if todo:
        out.append("contiene TODO: puede estar incompleto")
    if n_total <= 2:
        out.append("muy pocos ficheros")
    return out, n_codigo


def buscar_secretos(raiz):
    hallazgos = []
    for rel, p in recorrer(raiz):
        if rel.suffix.lower() not in EXT_TEXTO:
            continue
        try:
            if p.stat().st_size > 1_000_000:
                continue
            for i, linea in enumerate(p.read_text(encoding="utf-8", errors="ignore").splitlines(), 1):
                for rx, tipo in SECRETOS:
                    if rx.search(linea):
                        hallazgos.append((str(rel), i, tipo))
                        break
        except OSError:
            pass
    return hallazgos


# ---- escanear --------------------------------------------------------------
def cmd_escanear(a):
    dam = Path(a.dam).expanduser()
    if not dam.is_dir():
        sys.exit(f"No existe la carpeta {dam}")
    nuevos = []
    omitidas = []
    for curso_dir in sorted(p for p in dam.iterdir() if p.is_dir()):
        curso = curso_dir.name.upper().replace(" ", "")
        if curso not in ASIGNATURAS:
            omitidas.append(str(curso_dir.name))
            continue
        for asig_dir in sorted(p for p in curso_dir.iterdir() if p.is_dir()):
            n = norm(asig_dir.name)
            match = next((v for k, v in ASIGNATURAS[curso].items() if k in n), None)
            if not match:
                omitidas.append(f"{curso}/{asig_dir.name}")
                continue
            nombre_asig, asig_slug = match
            for proy in sorted(p for p in asig_dir.iterdir()
                               if p.is_dir() and p.name not in IGNORAR_DIRS and not p.name.startswith(".")):
                av, n_cod = avisos(proy)
                nuevos.append({
                    "origen": str(proy.relative_to(dam)).replace("\\", "/"),
                    "curso": curso,
                    "asignatura": nombre_asig,
                    "nombre": proy.name,
                    "rama": f"{curso.lower()}/{asig_slug}/{slug(proy.name)}",
                    "incluir": n_cod > 0,
                    "ia": "no",
                    "descripcion": {"es": "", "en": ""},
                    "tecnologias": tecnologias(proy),
                    "revisar": av,
                })
    manifiesto = Path(a.manifiesto)
    previo = {}
    if manifiesto.exists():
        datos = json.loads(manifiesto.read_text(encoding="utf-8"))
        previo = {e["origen"]: e for e in datos["proyectos"]}
    final = [previo.get(e["origen"], e) for e in nuevos]
    # conserva entradas manuales (p. ej. proyectos de fuera de DAM)
    vistos = {e["origen"] for e in nuevos}
    final += [e for o, e in previo.items() if o not in vistos]
    manifiesto.write_text(json.dumps({"dam": str(dam), "proyectos": final},
                                     ensure_ascii=False, indent=2), encoding="utf-8")
    print(f"{len(final)} proyectos en {manifiesto}")
    print(f"  marcados para incluir: {sum(e['incluir'] for e in final)}")
    con_aviso = [e for e in final if e.get("revisar")]
    if con_aviso:
        print("  con avisos (revísalos):")
        for e in con_aviso:
            print(f"    - {e['origen']}: {'; '.join(e['revisar'])}")
    if omitidas:
        print("  carpetas ignoradas (no son asignaturas a publicar):")
        for o in omitidas:
            print(f"    - {o}")
    print("Ahora edita el JSON y ejecuta el comando 'publicar'.")


# ---- publicar --------------------------------------------------------------
def readme_rama(e):
    es, en = ETIQUETAS[e["ia"]]
    techs = ", ".join(e.get("tecnologias") or []) or "—"
    d = e.get("descripcion") or {}
    d_es = d.get("es") or "_(Descripción pendiente.)_"
    d_en = d.get("en") or "_(Description pending.)_"
    return f"""# {e['nombre']}

> {e['curso']} · {e['asignatura']}

**Autoría:** {es}

## Descripción
{d_es}

## Tecnologías
{techs}

## Cómo ejecutarlo
_(Pendiente de documentar.)_

[← Volver al portafolio](https://github.com/pablose23/miportafolio)

---

# {e['nombre']} (English)

> {e['curso']} · {e['asignatura']}

**Authorship:** {en}

## Description
{d_en}

## Technologies
{techs}

## How to run it
_(To be documented.)_
"""


def copiar(origen, destino):
    n = 0
    for rel, p in recorrer(origen):
        if fichero_ignorado(p.name):
            continue
        if p.stat().st_size > MAX_BYTES:
            print(f"      (omitido por tamaño >25MB: {rel})")
            continue
        (destino / rel).parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(p, destino / rel)
        n += 1
    return n


def rama_existe(repo, rama):
    return git(repo, "rev-parse", "--verify", "--quiet", f"refs/heads/{rama}", check=False).returncode == 0


def tabla(entradas, lang):
    if not entradas:
        return "_Próximamente._" if lang == "es" else "_Coming soon._"
    if lang == "es":
        cab = "| Proyecto | Curso | Asignatura | Tecnologías | Autoría | Código |\n|---|---|---|---|---|---|"
        txt = "Ver rama"
    else:
        cab = "| Project | Year | Subject | Technologies | Authorship | Code |\n|---|---|---|---|---|---|"
        txt = "View branch"
    filas = []
    for e in sorted(entradas, key=lambda x: (x["curso"], x["asignatura"], x["nombre"].lower())):
        etiqueta = ETIQUETAS[e["ia"]][0 if lang == "es" else 1]
        techs = ", ".join(e.get("tecnologias") or [])
        filas.append(f"| {e['nombre']} | {e['curso']} | {e['asignatura']} | {techs} | {etiqueta} | "
                     f"[{txt}](../../tree/{e['rama']}) |")
    return cab + "\n" + "\n".join(filas)


def actualizar_readme(repo, publicadas):
    readme = Path(repo) / "README.md"
    texto = readme.read_text(encoding="utf-8")
    propios = [e for e in publicadas if e["ia"] != "si"]
    con_ia = [e for e in publicadas if e["ia"] == "si"]
    for marca, ents, lang in (("ES_PROPIOS", propios, "es"), ("ES_IA", con_ia, "es"),
                              ("EN_PROPIOS", propios, "en"), ("EN_IA", con_ia, "en")):
        rx = re.compile(rf"(<!-- {marca}:START -->)(.*?)(<!-- {marca}:END -->)", re.S)
        if not rx.search(texto):
            sys.exit(f"Falta el marcador {marca} en README.md")
        texto = rx.sub(lambda m: f"{m.group(1)}\n{tabla(ents, lang)}\n{m.group(3)}", texto)
    readme.write_text(texto, encoding="utf-8")


def cmd_publicar(a):
    repo = Path(a.repo).resolve()
    if git(repo, "rev-parse", "--is-inside-work-tree", check=False).returncode != 0:
        sys.exit(f"{repo} no es un repositorio git")
    datos = json.loads(Path(a.manifiesto).read_text(encoding="utf-8"))
    dam = Path(datos["dam"])
    entradas = [e for e in datos["proyectos"] if e.get("incluir")]
    for e in entradas:
        if e["ia"] not in ETIQUETAS:
            sys.exit(f"{e['origen']}: 'ia' debe ser no, parcial o si")

    if a.ejecutar:
        if git(repo, "rev-parse", "--abbrev-ref", "HEAD").stdout.strip() != "main":
            sys.exit("Ponte en la rama main antes de ejecutar (git checkout main).")
        if git(repo, "status", "--porcelain", "--untracked-files=no").stdout.strip():
            sys.exit("Hay cambios sin guardar en el repo; haz commit o stash primero.")

    publicadas, bloqueadas = [], []
    for e in entradas:
        origen = Path(e["origen"])
        origen = origen if origen.is_absolute() else dam / origen
        print(f"\n• {e['rama']}  [{e['ia']}]  <- {origen}")
        if not origen.is_dir():
            print("    ✗ no existe la carpeta de origen, se omite")
            continue
        if not (e.get("descripcion") or {}).get("es"):
            print("    ! sin descripción (se publicará con texto pendiente)")
        sec = [] if e.get("ignorar_secretos") else buscar_secretos(origen)
        if sec:
            print("    ✗ POSIBLES SECRETOS (revisa y quítalos, o pon \"ignorar_secretos\": true):")
            for f, i, t in sec[:10]:
                print(f"        {f}:{i}  {t}")
            if len(sec) > 10:
                print(f"        ... y {len(sec) - 10} más")
            bloqueadas.append(e["rama"])
            continue
        if rama_existe(repo, e["rama"]) and not a.reemplazar:
            print("    = la rama ya existe, se conserva")
            publicadas.append(e)
            continue
        if not a.ejecutar:
            print("    (simulacro) se crearía la rama")
            continue
        crear_rama(repo, e, origen, a.reemplazar)
        publicadas.append(e)
        if a.subir:
            git(repo, "push", "-u", "origin", e["rama"])
            print("    ↑ subida")

    if a.ejecutar:
        actualizar_readme(repo, publicadas)
        git(repo, "add", "README.md")
        if git(repo, "diff", "--cached", "--quiet", check=False).returncode != 0:
            git(repo, "commit", "-m", "docs: actualizar tabla de proyectos")
            print("\nREADME de main actualizado.")
            if a.subir:
                git(repo, "push", "origin", "main")
    print(f"\nResumen: {len(publicadas)} publicadas, {len(bloqueadas)} bloqueadas por secretos.")
    if not a.ejecutar:
        print("Era un simulacro. Añade --ejecutar para crear las ramas.")


def crear_rama(repo, e, origen, reemplazar):
    tmp = Path(tempfile.mkdtemp(prefix="portafolio_"))
    wt = tmp / "wt"
    git(repo, "worktree", "add", "--detach", str(wt), "HEAD")
    try:
        if reemplazar and rama_existe(repo, e["rama"]):
            git(repo, "branch", "-D", e["rama"])
        git(wt, "checkout", "--orphan", e["rama"])
        git(wt, "rm", "-rf", "-q", ".", check=False)
        for x in wt.iterdir():
            if x.name != ".git":
                shutil.rmtree(x, ignore_errors=True) if x.is_dir() else x.unlink()
        n = copiar(origen, wt)
        (wt / "README.md").write_text(readme_rama(e), encoding="utf-8")
        git(wt, "add", "-A")
        git(wt, "commit", "-m", f"Añadir {e['nombre']} ({e['asignatura']}, {e['curso']})")
        print(f"    ✓ rama creada ({n} ficheros)")
    finally:
        git(repo, "worktree", "remove", "--force", str(wt), check=False)
        shutil.rmtree(tmp, ignore_errors=True)


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest="cmd", required=True)
    e = sub.add_parser("escanear", help="genera proyectos.json a partir de la carpeta DAM")
    e.add_argument("--dam", required=True, help="ruta a la carpeta DAM")
    e.add_argument("--manifiesto", default="proyectos.json")
    e.set_defaults(f=cmd_escanear)
    p = sub.add_parser("publicar", help="crea una rama por proyecto y actualiza el README")
    p.add_argument("--repo", default=".", help="ruta al clon de miportafolio (en main)")
    p.add_argument("--manifiesto", default="proyectos.json")
    p.add_argument("--ejecutar", action="store_true", help="hacerlo de verdad (por defecto, simulacro)")
    p.add_argument("--subir", action="store_true", help="git push de cada rama y de main")
    p.add_argument("--reemplazar", action="store_true", help="rehacer ramas que ya existen")
    p.set_defaults(f=cmd_publicar)
    a = ap.parse_args()
    a.f(a)


if __name__ == "__main__":
    main()
