package BucleWhile;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int n=0;
		do{
			System.out.println("Dame un número");
			n=t.nextInt();
			if(n>0) {
				System.out.println("El número e positivo");
			}else {
				if(n<0) {
					System.out.println("El número es negativo");
				}
			}
		}while(n!=0);
		System.out.println("Fin");

	

}
}