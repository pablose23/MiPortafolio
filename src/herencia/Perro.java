package herencia;

public class Perro extends Animal {
	//atributos Animal + 
	private String raza;
	private boolean seguro;

	public Perro(String id, String nombre, float peso, int edad, String tipo, String raza, boolean seguro) {
		super(id, nombre, peso, edad, tipo);
		this.raza = raza;
		this.seguro = seguro;
	}

	public Perro() {
		super();
		this.raza="";
		this.seguro=false;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", seguro=" + seguro + ", id=" + id + ", nombre=" + nombre + ", peso=" + peso
				+ ", edad=" + edad + ", tipo=" + tipo + "]";
	}
	
	public String emitirSonido() {
		return "Guau";
	}
}

