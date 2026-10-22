package condiciones;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int alumnos=0, costo=0;
		System.out.println("Numero de alumnos: ");
		alumnos=teclado.nextInt();
		if(alumnos>=100) {
			costo=alumnos*65;
			System.out.println("Precio por cada alumno es "+costo);
		
			if(alumnos<=99 && alumnos>=50) {
				costo=alumnos*70;
				System.out.println("Precio por cada alumno es "+costo);
		
				if(alumnos>=30 && alumnos<=49) {
					costo=alumnos*95;
					System.out.println("Precio por cada alumno es "+costo);
		
					if(alumnos<30) {
						costo=alumnos/4000;
						System.out.println("Precio por cada alumno es "+costo);
	    			}
				}
			}
		}

	}

}
