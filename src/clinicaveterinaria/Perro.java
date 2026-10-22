package clinicaveterinaria;

import java.util.ArrayList;

public class Perro extends Animales{
	private boolean segObligatorio;
	private String chipID;
	
	public Perro(int edad, double peso, String raza, String sexo, 
			String nombre, ArrayList<Vacunas> vacuna,
			boolean segObligatorio, String chipID) {
		super(edad, peso, raza, sexo, nombre, vacuna);
		this.segObligatorio = segObligatorio;
		this.chipID = chipID;
	}

	public Perro(int edad, double peso, String raza, String sexo, 
			String nombre) {
		super(edad, peso, raza, sexo, nombre);
		this.segObligatorio = false;
		this.chipID = "";
	}

	public boolean isSegObligatorio() {
		return segObligatorio;
	}

	public void setSegObligatorio(boolean segObligatorio) {
		this.segObligatorio = segObligatorio;
	}

	public String getChipID() {
		return chipID;
	}

	public void setChipID(String chipID) {
		this.chipID = chipID;
	}
	
}
