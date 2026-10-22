package clinica;

public class Profesionales extends Persona {
	private String especialidad;
	private int entero;
	public static final int MAÑANA=0;
	public static final int TARDE=1;
	public static final int GUARDIA=2;
	
	public Profesionales(String dni, String nombre, String apellidos,
			String telefono, String especialidad, int entero) {
		super(dni, nombre, apellidos, telefono);
		this.especialidad = especialidad;
		this.entero = entero;
	}

	public Profesionales() {
		this.especialidad = "";
		this.entero = 0;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	@Override
	public String toString() {
		return "Profesionales [especialidad=" + especialidad + ", entero=" + entero + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + "]";
	}
}
