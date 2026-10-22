package condiciones;

import java.util.Scanner;

public class Actividad1{
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		int grados=0;
		System.out.println("¿Cuantos grados hace?: ");
		grados=teclado.nextInt();
		if(grados>=-10&&grados<=0) {
			System.out.println("Tienes que hacer Esqui");
		}
		if(grados>0&&grados<=10) {
			System.out.println("Tienes que hacer Atletismo");
		}
		if(grados>10&&grados<=20) {
			System.out.println("Tienes que hacer Futbol");
		}
		if(grados>20&&grados<=30) {
			System.out.println("Tienes que hacer Balonmano");
		}
		if(grados>30&&grados<=40) {
			System.out.println("Tienes que hacer Badminton");
		}
	}
}