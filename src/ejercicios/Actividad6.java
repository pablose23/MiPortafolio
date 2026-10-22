package ejercicios;

import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
	int numero = 0;
	int suma = 0;
	int contador=0;
	Scanner sn=new Scanner(System.in);
	System.out.print("Introduce un número: ");
	numero = sn.nextInt();
	
	while(numero>=0)
	{
	suma+=numero;
	contador++;
	System.out.println("la suma hasta ahora es: "+suma);
	System.out.println("el contador hasta ahora es: "+contador);
	
	System.out.print("Introduce un número: ");
	numero = sn.nextInt();
	}
	System.out.println("la suma es: "+suma);
	System.out.println("el contador es: " +contador);
	System.out.println("La media de los numeros positivos es: "+(suma/contador));
	sn.close();
	}

}
