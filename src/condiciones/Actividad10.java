package condiciones;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	float areat=0, areac=0, areaci=0, arear=0;
	float baset=0, alturat=0;
	float ladoc=0;
	float radioci=0;
	float baser=0, alturar=0;
	String opcion="";
	System.out.println("Dame una opcion: ");
	opcion=teclado.next();
	switch(opcion) {
	case "a":
		System.out.println("base del triangulo: ");
		baset=teclado.nextInt();
		System.out.println("altura del triangulo: ");
		alturat=teclado.nextInt();
		areat=(float)(baset*alturat)/2;
		System.out.println("el area del triangulo es: "+areat);
		break;
	case "b":
		System.out.println("lado del cuadrado: ");
		ladoc=teclado.nextInt();
		areac=(float)ladoc*ladoc;
		System.out.println("el area del cuadrado es: "+areac);
		break;
	case "c":
		System.out.println("radio del circulo: ");
		radioci=teclado.nextInt();
		areaci=(float)((radioci*radioci)*Math.PI);
		System.out.println("el area del circulo es: "+areaci);
		break;
	case "d":
		System.out.println("base del rectangulo: ");
		baser=teclado.nextInt();
		System.out.println("altura del rectangulo: ");
		alturar=teclado.nextInt();
		arear=(float)baser*alturar;
		System.out.println("el area del rectangulo es: "+arear);
		break;
	}
	
	
	}
	

}
