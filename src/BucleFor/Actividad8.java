package BucleFor;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int N=0;
		
		System.out.println("Dame el número N");
		N=t.nextInt();
		for(int i=1; i<N; i++)
			System.out.println(i);
		
		// Otra forma de ejercicio
		//for(int i=0; i<N; i=i+2)
			//System.out.println(i);
	}

}
