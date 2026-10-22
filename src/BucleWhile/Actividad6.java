package BucleWhile;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	int num=0, suma=0, contador=0;
	System.out.println("Dame un numero: ");
	num=teclado.nextInt();
	
	while(num!=0) {
		suma=suma+num;
		contador++;
		System.out.println("Dame un numero: ");
		num=teclado.nextInt();
	}
	System.out.println("La suma es: "+suma);
	System.out.println("Nº de numeros: "+contador);
	}
}
