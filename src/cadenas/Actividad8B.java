package cadenas;

import java.util.Scanner;

public class Actividad8B {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String correo = "";
		String[]servidores= {"gmail.com","hotmail.es","hotmail.com","outlook.es","riberadeltajo.es","yahoo.es"};
		boolean existe=false;
		System.out.println("Dame un mensaje");
		correo = t.next();
		for(int i=0; i<servidores.length; i++) {
		if (correo.contains("@") && correo.endsWith(servidores[i])) {
			System.out.println("Es un correo correcto de "+servidores[i]);
			existe=true;
		}
	}
	if(!existe)
		System.out.println("Correo incorrecto");
	}
}
