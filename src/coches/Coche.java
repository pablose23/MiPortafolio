package coches;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int nPuertas;
	private double km;

	public Coche() {
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.nPuertas = 0;
		this.km = 0;
	}

	public Coche(String matricula, String marca, String modelo, String color, int nPuertas, double km) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nPuertas = nPuertas;
		this.km = km;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", nPuertas=" + nPuertas + ", km=" + km + "]";
	}

}
