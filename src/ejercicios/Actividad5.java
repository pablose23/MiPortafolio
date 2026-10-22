package ejercicios;

import java.util.Scanner;

public class Actividad5 {
public static void main(String[] args) {
	int suma=0,resta=0,producto=0,resto=0;
	float division=0.0f;
	Scanner s=new Scanner(System.in);
	System.out.println("dame un número");
	int n1=s.nextInt();
	System.out.println("dame otro número");
	int n2=s.nextInt();
	System.out.println("los numeros son "+n1+" y "+n2);
	suma=n1+n2;
	resta=n1-n2;
	producto=n1*n2;
	division=(float)n1/n2;
	resto=n1%n2;
	System.out.println("la suma es: "+suma);
	System.out.println("la resta es: "+resta);		
	System.out.println("la multiplicacion es: "+producto);
	System.out.println("la divison es: "+division);
	System.out.println("el resto es: "+resto);
	
	if(n1%2==0) {
		System.out.println(n1+" es par");
	} else {
		System.out.println(n1+" es impar");
	}
	
	}
}