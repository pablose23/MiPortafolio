package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		int[] naleatorio = new int[20];
		Scanner t=new Scanner(System.in);
		int n=0;
		int contador=0;
		do {
		System.out.println("Dame un numero");
		n=t.nextInt();
		}while(n<=1 || n>=25);
		
		for (int i = 0; i < naleatorio.length; i++) {
			naleatorio[i] = (int) (1 + Math.random() * 25);
	}
		System.out.println(Arrays.toString(naleatorio));
		
		//busco n en el array de nºs
		
		for (int i = 0; i < naleatorio.length; i++) {
			if(n==naleatorio[i]) {
				System.out.println("Esta en la posicion "+i);
				contador++;
			}
		}
		System.out.println("numero de veces encontrado: "+contador);
}
}