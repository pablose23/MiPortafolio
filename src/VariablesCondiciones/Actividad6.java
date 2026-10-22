package VariablesCondiciones;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n1=0, n2=0;
		System.out.println("Dame un número");
		n1=t.nextInt();
		System.out.println("Dame un número");
		n2=t.nextInt();
		if(n1%n2==0) {
			System.out.println("El primer numero es multiplo del segundo numero");
		}if(n2%n1==0) {
				System.out.println("El segundo numero es multiplo del primer numero");
			}else{
				System.out.println("Ningun numero es multiplo del otro");
		}
		
	}

}
