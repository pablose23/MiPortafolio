package Simulacro;
import java.util.Scanner;
public class ActividadA {
	public static void main (String[] args) {
		Scanner t=new Scanner (System.in);
		int num=0, contadorimpares=0, n1=0, sumapares=0;
		System.out.println("Dame un número");
		num=t.nextInt();
		n1=num;
		while(num!=0) {
			if(num%2==0 && num>10) {
				sumapares+=num;
			}
			if(num%2==1) {
				contadorimpares++;
			}
			System.out.println("Dame un número");
			num=t.nextInt();
		}
		if(n1%2==0) {
			System.out.println("Nºs de impares: "+contadorimpares);
		}else {
			System.out.println("Suma pares > que 10: "+sumapares);
		}
	}
}
