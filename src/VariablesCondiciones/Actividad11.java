package VariablesCondiciones;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		int cifras=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		if(n==0) {
			cifras=1;
			System.out.println("Numero de cifras "+cifras);
		}
		if(n>=10) {
			cifras=2;
			System.out.println("Numero de cifras "+cifras);
		}
		if(n>=100) {
			cifras=3;
			System.out.println("Numero de cifras "+cifras);
			}
		}

	}


