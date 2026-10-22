package trabajadores;

public class Empleado extends Trabajador{
	private double sueldo;
	private double impuestos;
	private static final int PAGAS=14;
	
	public Empleado() {
		super();
		this.sueldo = 0;
		this.impuestos = 0;
	}
	
	public Empleado(String nombre, String puesto, String telefono, String nUSS, double sueldo) {
		super(nombre, puesto, telefono, nUSS);
		this.sueldo = sueldo;
		this.impuestos = 0.3*this.sueldo; //este atributo es calculado
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public double calcularPaga() {
		return (this.sueldo-this.impuestos)/PAGAS;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", toString()=" + super.toString() + "]";
	}

}
