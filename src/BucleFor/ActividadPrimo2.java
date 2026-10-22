package BucleFor;

import java.util.Scanner;

public class ActividadPrimo2 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int numero=0;
		boolean hayDivisor=false;
		System.out.println("Dame un múmero");
		numero=t.nextInt();
		for(int i=3; i<=numero/2;i++) {
			if(numero%i==0) {
				//System.out.println("Divido entre "+i);
				hayDivisor=true;
			}
		}
		if(hayDivisor) {
			System.out.println(numero+" no es primo");
		}else {
			System.out.println(numero+" es primo");
		}
	}
}
