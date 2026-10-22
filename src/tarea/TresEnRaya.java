package tarea;

import java.util.Scanner;

public class TresEnRaya {
	public static void main(String[] args) {
		String[][] matriz = new String[3][3];
		int x = 0, y = 0;
		Scanner t = new Scanner(System.in);
		String jugador = "X";
		String pc ="O";
		int contador = 0;
		mostrarTablero(matriz);

		do {
			do {
				System.out.println("Jugador elige una posición x");
				x = t.nextInt();
				System.out.println("Jugador elige una posición y");
				y = t.nextInt();
			} while (x < 0 || x > 2 | y < 0 | y > 2);
		
			System.out.println(colocaFicha(jugador, x, y, matriz));
			System.out.println(juegaPc(pc,matriz));
			contador++;
		} while (contador < 4);

	}

	public static void crearTablero(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = " ";
			}
		}
	}

	public static void mostrarTablero(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = " ";
				System.out.print("| " + matriz[i][j]);
			}
			System.out.println("|");
		}
	}

	private static int colocaFicha(String jugador, int x, int y, String[][] matriz) {
		int ficha = 0;
		if (x < 0 || x > 2 || y < 0 | y > 2) {
			ficha = -1;
		}
		if (ficha == 0) {
			for (int j = 0; j < matriz.length; j++) {
				for (int i = 0; i < matriz[0].length; i++) {
					matriz[x][y] = "X";
					System.out.print("| " + matriz[i][j]);
				}
				System.out.println("|");
			}
		}
		return ficha;
	}

	private static int juegaPc(String pc, String[][] matriz) {
		int ficha = 0;
	
		int xpc = (int) (Math.random() * 2);
		int ypc = (int) (Math.random() * 2);
		if (matriz[xpc][ypc].equals("X")) {
			ficha = -1;
		}
		if (matriz[xpc][ypc].equals(" ")) {
				ficha = 0;
		}
		if (ficha == 0) {
			for (int j = 0; j < matriz.length; j++) {
				for (int i = 0; i < matriz[0].length; i++) {
					matriz[xpc][ypc] = "O";
					System.out.print("| " + matriz[i][j]);
				}
				System.out.println("|");
			}
		}
		if(ficha==-1) {
			System.out.println("Pc pierde turno");
		}
			return ficha;
	}

}
