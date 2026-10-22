package trabajadores;

public class Consultor extends Trabajador{
	private double horas;
	private double tarifa;
	
	public Consultor() {
		super();
		this.horas = 0;
		this.tarifa = 0;
	}

	public Consultor(String nombre, String puesto, String telefono, String nUSS, double horas, double tarifa) {
		super(nombre, puesto, telefono, nUSS);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPaga() {
		return this.horas*this.tarifa;
	}
	
}
