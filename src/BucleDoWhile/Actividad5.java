package BucleDoWhile;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int numero=0;
		int secreto=(int)(1+Math.random()*20);
		int intentos=6;
		System.out.println("Numeros de intentos: "+intentos);
		System.out.println(secreto);
		do {
		System.out.println("Dame un número");
		numero=t.nextInt();
		intentos--;
		System.out.println("Numeros de intentos: "+intentos);
		if(secreto>numero) {
			System.out.println("Es mayor");
			} else{
				System.out.println("Es menor");
			}
			}while(secreto!=numero && intentos>0);
			if(secreto==numero) {
				System.out.println("Has acertado "+secreto);
			} else {
				System.out.println("Perdedor!!!");
				System.out.println("el numero era: "+secreto);
				
			}
		
		
		}
	}

