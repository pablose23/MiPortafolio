package Simulacro;
import java.util.Scanner;
public class ActividadD {
	public static void main (String[] args) {
		Scanner t=new Scanner(System.in);
		int n1=0, n2=0, cociente1=0, cociente2=0, resto1=0, resto2=0;
		int cifras1=0, cifras2=0;
		do {
			System.out.println("Dame un nº de tres cifras");
			n1=t.nextInt();
			System.out.println("Dame otro nº de tres cifras");
			n2=t.nextInt();
		}while(n1<=100 && n2<=100 && n1<1000 && n2<1000);
		cociente1=n1;	
		
		while(cociente1>=10) {
			cifras1=cociente1%10;
			cociente1=cociente1/10;
			if(cifras1%2==1) {
				cifras1++;
				}
		}
		System.out.println("cifras impares nº1: "+cifras1);
		cociente2=n2;
		while(cociente2>=10) {
			cifras2=cociente2%10;
			cociente2=cociente2/10;
			if(cifras2%2==1) {
				cifras2++;
				
		}
		if(cociente2%2==1) {
			cifras2++;
			System.out.println("cifras impares nº2: "+cifras2);
		}
		}
		
	}
	}

