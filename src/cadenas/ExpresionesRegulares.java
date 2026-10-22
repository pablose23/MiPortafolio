package cadenas;

import java.util.Scanner;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String texto = "";

		System.out.println("Dame un texto");
		texto = t.next();
		if (esMatricula(texto)) {
			System.out.println("Es una matricula");
		}
		if(esBinario(texto)) {
			System.out.println("Es un nº binario");
		}
		if(esOctal(texto)) {
			System.out.println("Es un nº octal");
		}
		if(esEntero(texto)) {
			System.out.println("Es un nº entero");
		}
		if(esEmail(texto)) {
			System.out.println("Es un correo");
		}
		if(esCorreoRibera(texto)) {
			System.out.println("Es correo del Ribera del Tajo");
		}
	}

	private static boolean esCorreoRibera(String texto) {
		return texto.matches("^[a-z]+\\.[a-z]+@riberadeltajo.es$");
	}

	private static boolean esEmail(String texto) {
		return texto.matches("^[\\w-\\.]+@[a-zA-Z_\\.]+$");
	}

	private static boolean esEntero(String texto) {
		return texto.matches("^(-|\\+)?[0-9]+$");
	}

	private static boolean esOctal(String texto) {
		return texto.matches("^[0-7]+$");
	}

	private static boolean esBinario(String texto) {
		return texto.matches("^[0-1]+$");
	}

	private static boolean esMatricula(String texto) {
		return texto.matches("^[0-9]{4}[A-Z]{3}$");
	}
}
