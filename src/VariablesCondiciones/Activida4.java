package VariablesCondiciones;
import java.util.Scanner;
public class Activida4 {
	public static void main(String[]args) {
		Scanner t=new Scanner(System.in);
		int n1=0;
		int n2=0;
		System.out.println("Dame un número");
		n1=t.nextInt();
		System.out.println("Dame un número");
		n2=t.nextInt();
		if(n1==n2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}
}
