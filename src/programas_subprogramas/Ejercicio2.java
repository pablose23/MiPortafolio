package programas_subprogramas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// 1. Declaración de variables/objetos.

		Scanner t = new Scanner(System.in);
		int opcion = 0;

		do {
			menu();
			opcion = t.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Lado del cuadrado");
				int lado = t.nextInt();
				System.out.println("El área es: " + areaCuadrado(lado));
				break;

			case 2:
				System.out.println("Radio del círculo");
				int radio = t.nextInt();
				System.out.println("El área es: " + areaCirculo(radio));
				break;

			case 3:
				System.out.println("Base del rectángulo");
				int base = t.nextInt();
				System.out.println("Altura del rectángulo");
				int altura = t.nextInt();
				System.out.println("El área es: " + areaRectangulo(base, altura));
				break;

			case 4:
				System.out.println("Hasta pronto");
				break;

			default:
				System.out.println("Números entre 1 y 4");
			}

		} while (opcion != 4);
		System.out.println("Fin");
	}

	private static int areaCuadrado(int lado) {
		return (lado * lado);
	}

	public static double areaCirculo(int radio) {
		return (Math.PI * Math.pow(radio, 2));
	}

	private static int areaRectangulo(int altura, int base) {
		return (base * altura);
	}

	public static void menu() {
		System.out.println("1. Área del cuadrado");
		System.out.println("2. Área del círculo");
		System.out.println("3. Área del rectángulo");
		System.out.println("4. Salir");
		System.out.println("Elige una opción:");
	}
}