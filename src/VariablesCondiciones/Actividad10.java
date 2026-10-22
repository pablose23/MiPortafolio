package VariablesCondiciones;

import java.util.Scanner;

public class Actividad10 {
// O sino caso por caso.
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n1=0, n2=0, n3=0, aux=0;
		System.out.println("Dame un número");
		n1=t.nextInt();
		System.out.println("Dame un número");
		n2=t.nextInt();
		System.out.println("Dame un número");
		n3=t.nextInt();
		if(n1<n2) {
			aux=n1;
			n1=n2;
			n2=aux;
		}
		if(n2<n3) {
			aux=n2;
			n2=n3;
			n3=aux;
		}
		if(n1<n2) {
			aux=n1;
			n1=n2;
			n2=aux;
		}
		System.out.println(+n1+">"+n2+">"+n3);
}
}