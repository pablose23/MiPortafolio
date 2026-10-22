package clinica;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pacientes extends Persona{
	private float peso;
	private int edad;
	private String cita;
	private String historia;
	
	public Pacientes(String dni, String nombre, String apellidos,
			String telefono, float peso, int edad, String cita,
			String historia) {
		super(dni, nombre, apellidos, telefono);
		this.peso = peso;
		this.edad = edad;
		this.cita = cita;
		this.historia = historia;
	}

	public Pacientes() {
		this.peso = 0;
		this.edad = 0;
		this.cita = "";
		this.historia = "";
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCita() {
		return cita;
	}

	public void setCita(String cita) {
		this.cita = cita;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}
	
	@Override
	public String toString() {
		return "Pacientes [peso=" + peso + ", edad=" + edad + ", cita=" + cita + ", historia=" + historia + ", dni="
				+ dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + "]";
	}

	public void guardarHistoria() {
		FileWriter file;
		PrintWriter salida;
			String fichero="Historia"+this.getDni()+".txt";
			try {
				file=new FileWriter(fichero, true);
				salida=new PrintWriter(fichero);
				salida.println(this.getHistoria());
				salida.close();
				salida.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
