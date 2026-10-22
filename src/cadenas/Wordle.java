package cadenas;

import java.util.*;

public class Wordle {
	public static void main(String[] args) {
		// 1.Declaración de variables/objetos
		Scanner t = new Scanner(System.in);
		String[] palabra = { "PLATO", "PISAR", "PLANO", "MAREO", "LISTA", "LISTO", "SUCIO", "PERRO", "MIXTO", "BULTO",
				"CASTO", "PRADO", "MOSCA", "PISTO", "TURCO", "BRAVO", "VISTO", "QUESO", "GUISO", "USADO" };
		String palabrausuario = "";
		int nalea = 0;
		String adivina = "";
		int intentos=0;

		//2.Procedimiento
		nalea = (int) (Math.random() * 20);
		String palabrasecreta = palabra[nalea];
		System.out.println(palabrasecreta); //Para ver la palabra secreta

		do {
			do {
				System.out.println("Dame una palabra de 5 letras");
				palabrausuario = t.next();
			} while (!palabrausuario.matches("^[A-Z]+$"));
			System.out.println("Número de intento: "+intentos+" |Número máximo de intentos = 6");
			adivina = comparar(palabra[nalea], palabrausuario, intentos);
			System.out.println(adivina);
			intentos++;
			
			
		}while(intentos<6 && !palabrausuario.equals(palabrasecreta));
		if(intentos==6) {
			System.out.println("La palabra era: "+palabrasecreta+" LOSEEEEEEER!!!");
			}
		if(palabrausuario.equals(palabrasecreta)) {
			System.out.println("Winner!!!!");
		}
	}

	private static String comparar(String palabrasecreta, String palabrausuario, int intentos) {
		String adivina = "";
		for (int i = 0; i < palabrasecreta.length(); i++) {
			if (palabrasecreta.charAt(i) == palabrausuario.charAt(i)) {
				adivina = adivina + palabrausuario.charAt(i);
			} else {
				adivina = adivina + " _ ";
			}
		}
		return adivina;
	}
}
