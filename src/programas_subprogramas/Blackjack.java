package programas_subprogramas;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {

		// 1. Declaración variables/objetos

		Scanner t = new Scanner(System.in);
		int opcion = 0;
		int cartaSecretap = 0, cartaSecretapc = 0;
		int sumacartat = 0;

		do {
			menu();
			opcion = t.nextInt();

			if (opcion == 1) {

				sumacartat = sumacartat + sacarcarta();
				System.out.println(sumacartat);
			}

			if (opcion == 2) {
				System.out.println("Cartas Pc: " + sacarcartapc());
				
				if(sacarcartapc()>21) {
					System.out.println("Has Ganado!!");
				}
				
				if(sacarcartapc()<sumacartat && sumacartat<21) {
					System.out.println("Has Ganado!!");
				}
			}

			if (sumacartat > 21) {
				System.out.println("Has perdido!!!");
			}

			
//			 
//				System.out.println("carta secreta pc"+cartaSecretapc); //La carta que saca el pc
//				System.out.println("Cartas pc: "+cartaSecretapc);
//				if(cartaSecretapc>21) {
//					System.out.println("Has Ganado!!!");
//				}else 
//					if(cartaSecretapc==cartaSecretap) {
//						System.out.println("Empate!");
//					}
//				
//				break;

		} while (opcion != 2);

	}

	public static void menu() {
		System.out.println("1. Dame una carta");
		System.out.println("2. Me planto");
		System.out.println("Elige una opción");
	}

	public static int sacarcarta() {
		int carta = 0;
		do {
			carta = (int) (1 + Math.random() * 12);
		} while (carta == 8 || carta == 9);
		System.out.println("Mis cartas son: " + carta);
		return (carta);
	}

	public static int sacarcartapc() {
		int cartapc = 0;
		cartapc = 16 + (int) (Math.random() * 10);
		return (cartapc);
	}
}
