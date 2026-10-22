package recursividad;

import java.util.Scanner;

public class ActividadRecursividad {

	public static void menu() {
		System.out.println("Elige una opción: ");
		System.out.println();
		System.out.println("1. Sumar números naturales de 1 a N");
		System.out.println("2. Factorial de un número N");
		System.out.println("3. Recorrer un array");
		System.out.println("4. Mostrar los elementos de un array al revés");
		System.out.println("5. Sucesión de Fibonacci de N");
		System.out.println("6. Suma de los dígitos de un número de forma recursiva");
		System.out.println("7. Salir");
	}

	public static int naturales (int n) {
		if (n == 0)
			return 0;
		else
			return n + naturales(n - 1);
	}

	public static int factorial (int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void array (int n[], int indice) {
		System.out.println(n[indice]+" ");
		if(indice<n.length-1)
			array(n,indice+1);
		
	}
	
	public static void arrayReves (int n [], int indice) {
		if(indice<n.length-1)
			arrayReves(n,indice+1);
		System.out.println(n[indice]+" ");
	}
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int opcion = 0;
		int n = 0;
		int N[]= {1,2,3,4};
		
		do {
			menu();
			opcion = t.nextInt();
			switch (opcion) {
			case 1:
				System.out.println(naturales(n));
				break;

			case 2:
				System.out.println(factorial(n));
				break;

			case 3:
				array(N, 0);
				break;

			case 4:
				arrayReves(N, 0);
				break;

			case 5:

				break;

			case 6:

				break;

			}

		} while (opcion != 7);
	}

}
