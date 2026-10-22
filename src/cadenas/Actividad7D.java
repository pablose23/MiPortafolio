package cadenas;

import java.util.Scanner;

public class Actividad7D {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String dni = "";

		System.out.println("DNI: ");
		dni = t.next();
		if (dni.matches("[0-9]{8}[A-Z]{1}$")) {
			System.out.println("DNI correcto");
		} else {
			System.out.println("DNI incorrecto");
		}
	}
}
