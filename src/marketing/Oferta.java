package marketing;

public class Oferta {
	private int codProducto;
	private String nombre;
	private String categoria;
	private int puntos;
	
	public Oferta() {
		this.codProducto=0;
		this.nombre="";
		this.categoria="";
		this.puntos=0;
	}

	public Oferta(int codProducto, String nombre, String categoria, int puntos) {
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.categoria = categoria;
		this.puntos = puntos;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Oferta [codProducto=" + codProducto + ", nombre=" + nombre + ", categoria=" + categoria + ", puntos="
				+ puntos + "]";
	}
	
}
