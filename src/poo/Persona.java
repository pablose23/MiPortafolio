package poo;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;

	// Constructor: Inicializa variables y reserva memeoria
	
	// Constructor por defecto
	
	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
	}

	public Persona(String dni, String nombre, String apellidos) {
		this.setDni (dni);
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Persona(String nombre, String apellidos) {
		this.dni = "";
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Persona(String dni) {
		this.dni = dni;
		this.nombre = "";
		this.apellidos = "";
	}

	// Getters y setters
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(this.comprobarDni(dni))
			this.dni = dni;
		else {
			System.err.println("Formato incorrecto");
			this.dni="";
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean comprobarDni(String dni) {
		return dni.matches("[0-9]{8}[A-Z]{1}$");
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
}
