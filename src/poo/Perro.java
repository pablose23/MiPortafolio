package poo;

public class Perro {
	private String id;
	private String nombre;
	private String raza;
	private int edad;
	private boolean sobrepeso;

	// Constructor

	public Perro() {
		this.id = "";
		this.nombre = "";
		this.raza = "";
		this.edad = 0;
		this.sobrepeso = false;
	}

	public Perro(String id, String nombre, String raza, int edad, boolean sobrepeso) {
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.sobrepeso = sobrepeso;
	}

	public Perro(String nombre) {
		this.nombre = nombre;
		this.id = "";
		this.raza = "";
		this.edad = 0;
		this.sobrepeso = false;
	}

	public Perro(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.sobrepeso=false;
		this.id=this.generarId();
	}

	// Getters y setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSobrepeso() {
		return sobrepeso;
	}

	public void setSobrepeso(boolean sobrepeso) {
		this.sobrepeso = sobrepeso;
	}

	// toString

	@Override
	public String toString() {
		return "Nombre=" + nombre + "\n raza=" + raza + "\n Edad=" + edad + "\n";
	}

	public String generarId() {
		if(this.getNombre().length()<2 || this.getRaza().length()<3)
			return ((int) (1 + Math.random() * 20)+ this.getNombre()+ this.getRaza());
		return ((int) (1 + Math.random() * 20)+ this.getNombre().substring(0, 2) + this.getRaza().substring(0, 3));
	}
}
