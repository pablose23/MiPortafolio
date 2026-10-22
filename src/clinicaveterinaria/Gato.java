package clinicaveterinaria;

import java.util.ArrayList;

public class Gato extends Animales {
	private boolean obesidad;

	public Gato(int edad, double peso, String raza, String sexo, 
			String nombre, ArrayList<Vacunas> vacuna,
			boolean obesidad) {
		super(edad, peso, raza, sexo, nombre, vacuna);
		this.obesidad = obesidad;
	}

	public Gato(int edad, double peso, String raza, String sexo, 
			String nombre) {
		super(edad, peso, raza, sexo, nombre);
		this.obesidad=false;
	}

	public boolean isObesidad() {
		return obesidad;
	}

	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}
	
}
