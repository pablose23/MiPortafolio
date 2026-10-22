package cadenas;

import java.util.Scanner;

public class Actividad8 {
	public static void main (String[] args) {
		Scanner t=new Scanner (System.in);
		String correo="";
		
		System.out.println("Dame un mensaje");
		correo=t.next();
		
		if(correo.contains("@") && correo.endsWith("riberadeltajo.es")) {
			System.out.println("Correo valido");
		}else {
			System.out.println("Correo no valido");
		}
	}
}
