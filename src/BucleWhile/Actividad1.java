package BucleWhile;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int n=0, cuadrado=0;
		System.out.println("Dame un número");
		n=t.nextInt();		
		while (n>=0) {
			cuadrado=n*n;
		System.out.println("El cuadrado es: "+cuadrado);
		System.out.println("Dame un número");
		n=t.nextInt();
		}

		System.out.println("Fin");
}
}

