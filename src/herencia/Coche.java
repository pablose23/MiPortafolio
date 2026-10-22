package herencia;

public class Coche extends Vehiculo{
	private String color;
	private int numeroPuertas;
	
	public Coche() {
		super();
		this.color="";
		this.numeroPuertas=0;
	}

	public Coche(String matricula, String marca, String modelo, String color, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.color = color;
		this.numeroPuertas = numeroPuertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	public String getTipo() {
		return "coche";
	}
		
}
