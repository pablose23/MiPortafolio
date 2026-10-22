package condiciones;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int notas=0;
		System.out.println("Numero de nota: ");
		notas=teclado.nextInt();
		switch(notas) {
		case 0,1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5,6:
			System.out.println("Aprobado");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
			break;
		}

	}

}
