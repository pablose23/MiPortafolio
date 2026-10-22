package condiciones;

import java.util.Scanner;

public class Actividad7switch {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia = 0;
		System.out.println("DAme un numero entre el 1 y 7");
		dia = teclado.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Tiene que ser un numero entre 1 y 7");
		}
	}
}
