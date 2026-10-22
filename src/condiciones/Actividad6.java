package condiciones;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	float precio=0, iva=0, preciofinal=0;
	System.out.println("precio: ");
	precio=teclado.nextInt();
	System.out.println("iva: ");
	iva=teclado.nextInt();
	if(iva>0) {
		preciofinal=precio+(precio*iva);
		System.out.println("el precio final es: ");
	}else {
		System.out.println("el precio final es: ");
	}

	}

}
