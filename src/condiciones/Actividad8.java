package condiciones;

import java.util.Scanner;

public class Actividad8 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int n1=0, n2=0, resultado=0;
		String opcion="";
		System.out.println("Opciones: +(suma), -(resta), *(multiplicacion, /(division)");
		System.out.println("Dame una opcion: ");
		opcion=teclado.next();
		switch(opcion) {
		case "+":
			System.out.println("Primer numero: ");
			n1=teclado.nextInt();
			System.out.println("Segundo numero: ");
			n2=teclado.nextInt();
			resultado=n1+n2;
			System.out.println("Resultado: "+resultado);
			break;
		case "-":
			System.out.println("Primer numero: ");
			n1=teclado.nextInt();
			System.out.println("Segundo numero: ");
			n2=teclado.nextInt();
			resultado=n1-n2;
			System.out.println("Resultado: "+resultado);
			break;
		case "*":
			System.out.println("Primer numero: ");
			n1=teclado.nextInt();
			System.out.println("Segundo numero: ");
			n2=teclado.nextInt();
			resultado=n1+n2;
			System.out.println("Resultado: "+resultado);
			break;
		case "/":
			System.out.println("Primer numero: ");
			n1=teclado.nextInt();
			System.out.println("Segundo numero: ");
			n2=teclado.nextInt();
			resultado=n1%(n2);
			System.out.println("Resultado: "+resultado);
			break;
			
		}
	}
}
