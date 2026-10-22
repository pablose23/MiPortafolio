package VariablesCondiciones;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n1=0, n2=0;
		System.out.println("Primer número");
		n1=t.nextInt();
		System.out.println("Segundo número");
		n2=t.nextInt();
		if(n1>n2) {
			System.out.println(+n2+" < "+n1);
		}
		if(n2>n1) {
			System.out.println(+n1+" < "+n2);

	}

}
}
