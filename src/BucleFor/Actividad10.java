package BucleFor;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int numero=0, suma=0;
		for(int i=0; i<15;i++) {
			System.out.println("Dame un número");
			numero=t.nextInt();
			suma=suma+numero;
		}
			System.out.println("La suma es: "+suma);
	}

}
