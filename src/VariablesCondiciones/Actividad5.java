package VariablesCondiciones;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		System.out.println("Dame un numero: ");
		numero=teclado.nextInt();
		if(numero>0){
			System.out.println("es positivo");
		}else {
			if(numero<0) {
				System.out.println("es negativo");
			}else {
				System.out.println("es cero");
			}
		}
		/*if(numero<0) {
			System.out.println("es negativo");
		}
		if(numero==0) {
			System.out.println("es cero");
		}*/
	}
}
