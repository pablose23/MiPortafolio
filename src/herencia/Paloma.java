package herencia;

public class Paloma extends Animal {
	//atributos
	private String color;

	public Paloma() {
		super();
		this.color="";
	}
	
	public Paloma(String id, String nombre, float peso, int edad, String tipo, String color) {
		super(id, nombre, peso, edad, tipo);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Paloma [color=" + color + ", id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", edad=" + edad
				+ ", tipo=" + tipo + "]";
	}
	
	public String emitirSonido() {
		return "Gruuuuuu";
	}
}
