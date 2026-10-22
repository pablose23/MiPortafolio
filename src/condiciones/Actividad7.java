package condiciones;
import java.util.Scanner;
public class Actividad7 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int dia=0;
		System.out.println("Dame un numero entre 1 y 7");
		dia=teclado.nextInt();
		if(dia==1) {
			System.out.println("Lunes");
		}
		if(dia==2) {
			System.out.println("Martes");
		}
		if(dia==3) {
			System.out.println("Miercoles");
		}
		if(dia==4) {
			System.out.println("Jueves");
		}
		if(dia==5) {
			System.out.println("Viernes");
		}
		if(dia==6) {
			System.out.println("Sabado");
		}
		if(dia==7) {
			System.out.println("Domingo");
		}
	}
}
