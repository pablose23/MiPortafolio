package Ejemplos;

import java.util.Scanner;

public class Calculadora {

	public static int suma(int x, int y) {
		return x + y;
	}
	
	public static boolean perfecto(int a) {
		return amigos(a,a); //Es amigo de sí mismo
	}

	// devuelve verdadero si son amigos y falso si no lo son
	public static boolean amigos(int x, int y) {
		int sumaX = 0, sumaY = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				sumaX = sumaX + i;
			}
		}
		for (int i = 1; i < y; i++) {
			if (y % i == 0) {
				sumaY = sumaY + i;
			}
		}
		return (sumaX == y && sumaY == x); 
	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.println("Dame un nº");
		a = t.nextInt();
		System.out.println("Dame otro nº");
		b = t.nextInt();

		//System.out.println("La suma es: " + suma(a, b));
		
		if(amigos(a,b)) {
			System.out.println("Son amigos");
		}else {
			System.out.println("No son amigos");
		}
		
		
		
		
		

	}

}
