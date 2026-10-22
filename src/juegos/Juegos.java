package juegos;

import java.util.Scanner;

public class Juegos {

	public static void menu() {
		System.out.println("1. Blackjack");
		System.out.println("2. Tute remix");
		System.out.println("3. Salir");
	}

	private static void menuBlackjack() {
		System.out.println("1. Sacar carta");
		System.out.println("2. Plantarse");

	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador();
		j1.setNombre("Pablo");
		j2.setNombre("paco");
		int opcionmenu = 0, opcionblackjack = 0;
		int suma1 = 0, suma2 = 0;
		int contador1 = 0, contador2 = 0;

		do {
			menu();
			opcionmenu = t.nextInt();
			switch (opcionmenu) {
			case 1:
				do {
					j1.extraerCarta();
					System.out.println(j1);
					suma1 = suma1 + j1.getC().getNumero();
					System.out.println("Sumas: " + suma1);
					System.out.println("Sacar otra carta \n si=1/no=2");
					opcionblackjack = t.nextInt();
				} while (suma1 < 21 && opcionblackjack != 2);

				System.out.println("-----------------------------------------------");

				do {
					j2.extraerCarta();
					System.out.println(j2);
					suma2 = suma2 + j2.getC().getNumero();
					System.out.println("Sumas: " + suma2);
					System.out.println("Sacar otra carta \n si=1/no=2");
					opcionblackjack = t.nextInt();
				} while (suma2 < 21 && opcionblackjack != 2);

				if (suma1 > suma2)
					System.out.println(j1.getNombre() + " Ha Ganado!!!");
				if (suma2 > suma1)
					System.out.println(j2.getNombre() + " Ha Ganado!!!");
				if (suma1 == suma2)
					System.out.println("Empate");

				break;

			case 2:
				do {
					j1.extraerCarta();
					System.out.println(j1);
					suma1 = suma1 + j1.getC().getNumero();
					System.out.println("Sumas: " + suma1);
					contador1++;
				} while (contador1 != 8);
				
				System.out.println("-----------------------------------------------");

				do {
					j2.extraerCarta();
					System.out.println(j2);
					suma2 = suma2 + j2.getC().getNumero();
					System.out.println("Sumas: " + suma2);
					contador2++;
				} while (contador2 != 8);

				if (suma1 > suma2)
					System.out.println(j1.getNombre() + " Ha Ganado!!!");
				if (suma2 > suma1)
					System.out.println(j2.getNombre() + " Ha Ganado!!!");
				if (suma1 == suma2)
					System.out.println("Empate");
				break;

			case 3:
				System.out.println("FIN");
				break;
			}
		} while (opcionmenu != 3);
	}
}
