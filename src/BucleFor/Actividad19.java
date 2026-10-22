package BucleFor;

import java.util.Scanner;

public class Actividad19 {

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int n=0;
		boolean hayDivisor=false;
		int contadorprimos=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i/2; j++) {
				if(i%j==0) {
					hayDivisor=true;
				}
			}
//			if(hayDivisor) {
//				System.out.println(i+" no es primo");
//			}else {
//				System.out.println(i+" es primo");
//				contadorprimos++;
//		}
		if(!hayDivisor) {
			contadorprimos++;
		}
		hayDivisor=false;
		}
		System.out.println("Nº de primos entre 1 y "+n+": "+contadorprimos++);
	}
}

