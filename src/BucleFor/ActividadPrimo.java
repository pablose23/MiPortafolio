package BucleFor;

import java.util.Scanner;

public class ActividadPrimo {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int numero=0;
		int contador=0;
		System.out.println("Dame un número");
		numero=t.nextInt();
		for(int i=1;i<=numero; i++) {
			if(numero%i==0) {
				System.out.print(i+" ");
				contador++;
			}
		}
		System.out.println("\nNº de divisores "+contador);
		if(contador==2) {
			System.out.println("\n"+numero+" es primo");
		}else {
			System.out.println("\n"+numero+" no es primo");
		}
	}
}
