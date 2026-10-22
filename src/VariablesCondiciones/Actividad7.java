package VariablesCondiciones;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n1=0, n2=0;
		System.out.println("Primer número");
		n1=t.nextInt();
		System.out.println("Segundo número");
		n2=t.nextInt();
		if(n1>n2) {
			System.out.println("El 1º número es mayor");
		}
		if(n2>n1) {
			System.out.println("El 2º numero es mayor");
		}
	}
	

}
