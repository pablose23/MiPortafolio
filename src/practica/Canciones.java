package practica;

public class Canciones {
	private String codigo;
	private String disco;
	private String nombre;
	private double duraccion;
	
	public Canciones(String codigo, String disco, String nombre, double duraccion) {
		this.codigo = codigo;
		this.disco = disco;
		this.nombre = nombre;
		this.duraccion = duraccion;
	}

	public Canciones() {
		this.codigo = "";
		this.disco = "";
		this.nombre = "";
		this.duraccion = 0;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDuraccion() {
		return duraccion;
	}

	public void setDuraccion(double duraccion) {
		this.duraccion = duraccion;
	}

	@Override
	public String toString() {
		return "Canciones [codigo=" + codigo + ", disco=" + disco + ", nombre=" + nombre + ", duraccion=" + duraccion
				+ "]";
	}
}
