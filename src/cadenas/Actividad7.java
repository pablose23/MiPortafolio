package cadenas;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		String nif = "";
		Scanner t = new Scanner(System.in);
		int contador = 0;

		System.out.println("Ingresa un NIF");
		nif = t.next();
		if (nif.length() == 9) {
			for (int i = 0; i <= 7; i++) {
				if (Character.isDigit(nif.charAt(i))) {
					contador++;
				}
			}
			if(Character.isUpperCase(nif.charAt(8))) {
				contador++;
				}
			if(contador==9) {
				System.out.println("NIF correcto");
			}else {
				System.out.println("NIF no es correcto");
			}
			
		} else {
			System.out.println("NIF no correcto");
		}

	}
}
