package BucleWhile;

import java.util.Scanner;

public class Binario {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, cociente=0, resto=0;
		String binario="";
		do {
			System.out.println("Dame un número");
			n=t.nextInt();
		}while(n<=0);
		System.out.println("Número: "+n);
			cociente=n;
		while(cociente>=2) {
			resto=cociente%2;
			cociente=cociente/2;
			binario=resto+binario;
//			System.out.println(cociente);
//			System.out.println(resto);
//			System.out.println("Binario: "+binario);		
		}
		binario=cociente+binario;
		System.out.println("Binario: "+binario);
		
		}
		}
	

