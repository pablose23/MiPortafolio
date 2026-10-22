package fruteria2_repasoExamen;

public class Empleado extends Persona {
	private int turno;

	public Empleado(String dni, String nombre, String apellidos, String direccion, int turno) {
		super(dni, nombre, apellidos, direccion);
		this.turno = turno;
	}

	public Empleado() {
		this.turno = 0;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleado [turno=" + turno + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + "]";
	}
}
