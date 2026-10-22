package herencia;

public class Animal {
	//atributos
	protected String id;
	protected String nombre;
	protected float peso;
	protected int edad;
	protected String tipo;
	
	//metodos
	//constructores: inicializan variables y crean objetos
	//por defecto
	public Animal() {
		this.id = "";
		this.nombre = "";
		this.peso = 0;
		this.edad = 0;
		this.tipo = "";
	}

	public Animal(String id, String nombre, float peso, int edad, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.tipo = tipo;
	}
	
	public Animal(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.peso = 0;
		this.edad = 0;
		this.tipo = "";
	}

	//getters y setters
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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", tipo=" + tipo + "]";
	}
	
	//metodo que va a herederar y a sobreescribir
	public String emitirSonido() {
		return "";
	}
}
