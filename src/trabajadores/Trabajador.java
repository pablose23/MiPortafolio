package trabajadores;

public abstract class Trabajador {
	private String nombre;
	private String puesto;
	private String telefono;
	private String NUSS;
	
	public Trabajador() {
		this.nombre = "";
		this.puesto = "";
		this.telefono = "";
		this.NUSS = "";
	}
	
	public Trabajador(String nombre, String puesto, String telefono, String nUSS) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.telefono = telefono;
		this.NUSS = nUSS;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNUSS() {
		return NUSS;
	}
	public void setNUSS(String nUSS) {
		this.NUSS = nUSS;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", telefono=" + telefono + ", NUSS=" + NUSS + "]";
	}
	
	public abstract double calcularPaga();
	
}
