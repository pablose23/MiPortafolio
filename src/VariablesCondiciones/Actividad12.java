package VariablesCondiciones;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int nota=0;
		System.out.println("Dime nota entre 0 y 10");
		nota=t.nextInt();
		if(nota>=0 && nota<=4) {
		System.out.println("Suspenso");
		}
		if(nota==5) {
			System.out.println("Aprobado");
		}
		if(nota==6) {
			System.out.println("Bien");
		}
		if(nota>=7 && nota<=8) {
			System.out.println("Notable");
		}
		if(nota>=9 && nota<=10) {
			System.out.println("Sobresaliente");
		}
		}
	}
	


