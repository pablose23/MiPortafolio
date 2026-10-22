package ActividadesRepaso;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		while(n!=0) {
			if(n>0) {
				System.out.println("Nº positivo");
			}
			if(n<0) {
				System.out.println("Nº negativo");
			}
			System.out.println("Dame un número");
			n=t.nextInt();
		}

	}

}
