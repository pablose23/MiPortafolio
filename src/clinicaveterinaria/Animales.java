package clinicaveterinaria;

import java.util.ArrayList;

public abstract class Animales {
	protected int edad;
	protected double peso;
	protected String raza;
	protected String sexo;
	protected String nombre;
	protected ArrayList<Vacunas>vacuna;
	
	public Animales(int edad, double peso, String raza, 
			String sexo, String nombre, ArrayList<Vacunas> vacuna) {
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.vacuna = vacuna;
	}
	
	public Animales(int edad, double peso, String raza, 
			String sexo, String nombre) {
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.vacuna = new ArrayList<>();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vacunas> getVacuna() {
		return vacuna;
	}

	public void setVacuna(ArrayList<Vacunas> vacuna) {
		this.vacuna = vacuna;
	}

	@Override
	public String toString() {
		return "Animales [edad=" + edad + ", peso=" + peso + ", raza=" + raza + ", sexo=" + sexo + ", nombre=" + nombre
				+ ", vacuna=" + vacuna + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getRaza()="
				+ getRaza() + ", getSexo()=" + getSexo() + ", getNombre()=" + getNombre() + ", getVacuna()="
				+ getVacuna() + "]";
	}
	
}
