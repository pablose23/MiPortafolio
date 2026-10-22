package clinicaveterinaria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String DNI;
	private String direccion;
	private String email;
	private ArrayList<Animales>mascotas;
	
	public Cliente(String nombre, String dNI, String direccion, 
			String email, ArrayList<Animales> mascotas) {
		this.nombre = nombre;
		this.DNI = dNI;
		this.direccion = direccion;
		this.email = email;
		this.mascotas = mascotas;
	}
	
	public Cliente() {
		this.nombre = "";
		this.DNI = "";
		this.direccion = "";
		this.email = "";
		this.mascotas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Animales> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Animales> mascotas) {
		this.mascotas = mascotas;
	}
	
}
