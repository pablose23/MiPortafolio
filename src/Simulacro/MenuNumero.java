package Simulacro;

import java.util.Scanner;

public class MenuNumero {

	public static void menu() {
		System.out.println("a. ¿Son números amigos?");
		System.out.println("b. ¿Cuántos números afortunados hay entre ambos?");
		System.out.println("c. Imprimir los palíndromos entre a y b");
		System.out.println("d. ¿Cuántas cifras pares tiene a?");
		System.out.println("e. Salir");
		System.out.println("Elige una opción:");
	}

	public static boolean amigos(int x, int y) {
		int sumana = 0, sumanb = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				sumana = sumana + i;
			}
		}
		for (int i = 1; i < y; i++) {
			if (y % i == 0) {
				sumanb = sumanb + i;
			}
		}
		return (sumana == y && sumanb == x);
	}
	
	public static boolean suerte(int x, int y) {
		int cocientea = 0, cocienteb = 0, restoa = 0, restob = 0;
		int sumana=0, sumanb=0;
		int cifrasA=0, cifrasB=0;
		cocientea=x;
		while(cocientea>=10) {
			restoa=cocientea%10;
			cocientea=cocientea/10;
			cifrasA=cifrasA+restoa;
			
		}
		 cifrasA=cifrasA+cocientea;
		 cocienteb=y;
			while(cocienteb>=10) {
				restob=cocienteb%10;
				cocienteb=cocienteb/10;
				cifrasB=cifrasB+restob;
				
			}
			 cifrasB=cifrasB+cocienteb;
		return(cifrasA==3 && cifrasA==7 && cifrasA==8 && cifrasA==9 && cifrasB==0 && cifrasB==1 && cifrasB==2 && cifrasB==4 && cifrasB==5 && cifrasB==6) ;
		
			
		}
		
	

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String letra = "";
		
		int na = 0, nb = 0;

		int naafor = 0, nbafor = 0, sumaafor = 0;

		do {
			System.out.println("Dame un número A");
			na = t.nextInt();
			System.out.println("Dame un número B");
			nb = t.nextInt();
			menu();
			letra = t.next();
		} while (na < 0 || nb < 0 || na == nb);
		switch (letra) {
		case "a":

			if (amigos(na, nb)) {
				System.out.println("Los nºs "+ na +" y " + nb + " son amigos");
			} else {
				System.out.println("Los nºs " + na + " y " + nb + " no son amigos");
			}
			break;
		case "b":
			
			if(suerte(na,nb)) {
				System.out.println("Hay "+na+" nºs afortunados");
			}else {
				System.out.println("");
			}

		}
	}
}