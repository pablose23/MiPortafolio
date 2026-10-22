package poo;

import java.util.Objects;
import java.util.Scanner;

public class Password {
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud=8;
		this.contraseña="";
	}
	
	public Password(int longitud, String contraseña) {
		this.longitud = this.contraseña.length();
		this.contraseña = contraseña;
	}

	public void generarPassword(String texto) {
		//texto tiene longitud 6
		//int num=10; //para comprobar si son iguales
		this.contraseña=texto.substring(0, 2).toUpperCase()+texto.substring(2)+(int)(1+Math.random()*99);	
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	

	public boolean equals(String texto) {
		return this.contraseña.equals(texto);
	}

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		String cadena="";
		do {
			System.out.println("Introduce una contraseña");
			cadena=t.next();
		}while(cadena.length()!=6);
		Password contraseña=new Password();
		contraseña.generarPassword(cadena);
		System.out.println(contraseña.getContraseña());
		Password contraseña2=new Password();
		contraseña2.generarPassword(cadena);
		System.out.println(contraseña2.getContraseña());
		if(contraseña.equals(contraseña2.getContraseña()))
			System.out.println("Contraseña igual");
		else
			System.out.println("Contraseñas diferentes");
	}
}
