package practica;

public class Grupos {
	private String codigo;
	private String nombre;
	private int añoCreacion;
	private String tipoMusica;
	
	public Grupos(String codigo, String nombre, int añoCreacion, String tipoMusica) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.añoCreacion = añoCreacion;
		this.tipoMusica = tipoMusica;
	}

	public Grupos() {
		this.codigo = "";
		this.nombre = "";
		this.añoCreacion = 0;
		this.tipoMusica = "";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAñoCreacion() {
		return añoCreacion;
	}

	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}

	public String getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}

	@Override
	public String toString() {
		return "Grupos [codigo=" + codigo + ", nombre=" + nombre + ", añoCreacion=" + añoCreacion + ", tipoMusica="
				+ tipoMusica + "]";
	}
}
