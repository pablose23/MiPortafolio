package marketing;

import java.io.*;
import java.util.ArrayList;

public class Cliente {
	private int codigo;
	private String nombre;
	private String apellidos;
	private String correo;
	private int edad;
	private int nPuntos;
	private ArrayList<String>lista;
	
	public void interesesCliente(String filename) {
		try {
			FileInputStream fichero=new FileInputStream(filename);
			ObjectInputStream entrada=new ObjectInputStream(fichero);
			String c;
			try {
				c=(String)entrada.readObject();
				while(c!=null) {
					try {
						lista.add(c);
						System.out.println(c);
						c=(String)entrada.readObject();
					} catch (Exception e) {
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("No esxiste");
		}
	}

	public Cliente() {
		this.codigo = 0;
		this.nombre = "";
		this.apellidos = "";
		this.correo = "";
		this.edad = 0;
		this.nPuntos = 0;
		this.lista = new ArrayList<>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getnPuntos() {
		return nPuntos;
	}

	public void setnPuntos(int nPuntos) {
		this.nPuntos = nPuntos;
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo
				+ ", edad=" + edad + ", nPuntos=" + nPuntos + ", lista=" + lista + "]";
	}
}
