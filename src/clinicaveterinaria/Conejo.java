package clinicaveterinaria;

import java.util.ArrayList;

public class Conejo extends Animales{
	private double longOrejas;

	public Conejo(int edad, double peso, String raza, String sexo, 
			String nombre, ArrayList<Vacunas> vacuna,
			double longOrejas) {
		super(edad, peso, raza, sexo, nombre, vacuna);
		this.longOrejas = longOrejas;
	}

	public Conejo(int edad, double peso, String raza, String sexo, 
			String nombre) {
		super(edad, peso, raza, sexo, nombre);
		this.longOrejas=0;
	}

	public double getLongOrejas() {
		return longOrejas;
	}

	public void setLongOrejas(double longOrejas) {
		this.longOrejas = longOrejas;
	}
	
}
