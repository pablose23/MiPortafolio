package BucleFor;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		//1. Declaración variables / objetos
		Scanner t=new Scanner (System.in);
		int numero=0;
		float sumaPo=0;
		int contadorPo=0;
		float sumaNg=0;
		int contadorNg=0;
		//2.Procesamiento
		for(int i=0; i<5; i++) {
			System.out.println("Dame un número");
			numero=t.nextInt();
			if(numero>0) {
				sumaPo=sumaPo+numero;
				contadorPo++;
			}
			if(numero<0) {
				sumaNg=sumaNg+numero;
				contadorNg++;
				}
			if(numero==0) {
				contadorPo++;
				}
			}
			
		if(contadorPo>0) {
		System.out.println("La media de los números positivos es: "+sumaPo/contadorPo);
	}
		if(contadorNg>0) {
		System.out.println("La media de los números negativo es: "+sumaNg/contadorNg);
	}
		if(contadorPo==0) {
			System.out.println("Cantidad de ceros: "+contadorPo);
		}
	}
}

