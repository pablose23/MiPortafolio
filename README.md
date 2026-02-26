# 🔒 ASBIOCAM - Escape Room Digital

Escape Room digital interactivo con temática de sistema comprometido tipo ransomware, diseñado para conmemorar el **Día Internacional de la Mujer y la Niña en la Ciencia** (11 de febrero).

## 🌐 Despliegue

**Juega ahora:** [https://escaperoomasbiocam.netlify.app/](https://escaperoomasbiocam.netlify.app/)

El proyecto está desplegado en Netlify y es accesible desde cualquier navegador moderno.

## 📋 Descripción

Los jugadores se enfrentan a un sistema comprometido donde un hacker ficticio ha encriptado expedientes de científicas candidatas al Premio Nobel. Con un temporizador de cuenta regresiva, deben encontrar la clave maestra para desencriptar el sistema antes de que los archivos sean eliminados permanentemente.

## ✨ Características

- **⏱️ Temporizador dinámico**: Cuenta regresiva configurable (45 minutos por defecto)
- **🎨 Efectos visuales retro**: Estilo terminal CRT con efectos de escaneo y glitch
- **🔊 Efectos de audio**: Pitidos que se aceleran conforme se agota el tiempo
- **🎯 Sistema de validación**: Comprobación de clave con retroalimentación visual
- **🔧 Modo administrador**: Atajo para modificar el tiempo durante la partida
- **📱 Diseño responsive**: Adaptable a diferentes tamaños de pantalla

### Clave de Desencriptación

🔑 La clave correcta es: **8194**

## ⚙️ Configuración

### Tiempo Personalizado (URL)

Puedes configurar un tiempo personalizado usando parámetros de URL:

```
index.html?time=20
```

Esto iniciará el juego con 20 minutos en lugar de los 45 minutos predeterminados.

### Atajo de Administrador

Durante el juego, haz **triple clic** en el subtítulo "ASBIOCAM DATACENTER" para cambiar el tiempo restante. Útil para:
- Pruebas y demostraciones
- Ajustar dificultad sobre la marcha
- Sesiones de tiempo limitado

## 📁 Estructura del Proyecto

```
EscapeRoom/
│
├── index.html          # Página principal del juego
├── css/
│   └── styles.css      # Estilos con efectos visuales retro
├── js/
│   └── script.js       # Lógica del juego y control del temporizador
└── README.md           # Este archivo
```

## 🎯 Tecnologías Utilizadas

- **HTML5**: Estructura semántica
- **CSS3**: Efectos visuales (glitch, scanlines, animaciones)
- **JavaScript (Vanilla)**: Lógica del juego, temporizador, Web Audio API
- **Google Fonts**: Tipografía Share Tech Mono para efecto terminal

## 🎨 Paleta de Colores

- **Fondo**: `#0d0d0d` (Negro profundo)
- **Texto comprometido**: `#ff3333` / `#ff0000` (Rojo)
- **Texto restaurado**: `#00ff41` (Verde Matrix)
- **Fondo restaurado**: `#001a09` (Verde oscuro)

## 🔊 Sistema de Audio

El juego incluye efectos de audio generados dinámicamente:
- **Pitidos de alerta**: Se aceleran conforme se agota el tiempo
  - Últimos 10 segundos: 500ms (1200 Hz)
  - Último minuto: 1000ms (1000 Hz)
  - Últimos 5 minutos: 1500ms (800 Hz)
  - Normal: 2000ms (600 Hz)
- **Sonido de error**: Tono grave al introducir clave incorrecta
- **Sonido de victoria**: Secuencia melódica al desencriptar

## 🎓 Finalidad Educativa

Este proyecto está diseñado para:
- Generar conciencia sobre científicas que han sido invisibilizadas
- Crear una experiencia interactiva para eventos del 11 de febrero
- Fomentar el interés en la ciencia entre niñas y jóvenes
- Proporcionar una actividad lúdica educativa

## 🛠️ Personalización

### Modificar la Clave

Edita en [js/script.js](js/script.js#L6):

```javascript
const CORRECT_KEY = "8194";
```

### Cambiar el Tiempo Predeterminado

Edita en [js/script.js](js/script.js#L5):

```javascript
const TOTAL_MINUTES = 45; // Cambia a los minutos deseados
```

### Modificar Mensajes

Los textos del ransomware y éxito se encuentran en [js/script.js](js/script.js#L21-L40).

## 📝 Posibles Estados del Juego

1. **Sistema Comprometido** (inicial): Temporizador activo, mensaje de ransomware visible
2. **Sistema Restaurado** (éxito): Se detiene el temporizador, mensaje de victoria, efectos verdes
3. **Sistema Purgado** (fallo): El tiempo se agota, mensaje de error fatal

## 🐛 Solución de Problemas

### El audio no funciona
- El audio requiere interacción del usuario (hacer clic o presionar tecla)
- Algunos navegadores bloquean autoplay de audio

### El temporizador no se detiene
- Recarga la página (F5)
- Verifica la consola del navegador por errores

### Efectos visuales no aparecen
- Asegúrate de usar un navegador moderno (Chrome, Firefox, Edge)
- Verifica que JavaScript esté habilitado

## 📄 Licencia

Este proyecto es de código abierto y está disponible para uso educativo.

## 👨‍💻 Autor

Proyecto desarrollado para actividades educativas del Día Internacional de la Mujer y la Niña en la Ciencia.

---

**¡Buena suerte desencriptando el sistema!** ⏱️🔓
