package BucleWhile;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int num=0, contador=0;
		float suma=0;
		System.out.println("Dame un número: ");
		num=t.nextInt();
		
		while(num>=0) {
			contador++;
			suma=suma+num;
			System.out.println("Dame un número:");
			num=t.nextInt();
			if(num>=0) {
			
			}
			
		}
		System.out.println("La media de los números es: "+(float)(suma/contador));
	}

}
