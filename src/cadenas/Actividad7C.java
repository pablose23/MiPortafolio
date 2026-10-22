package cadenas;

import java.util.Scanner;

public class Actividad7C {

	public static void main(String[] args) {
		String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		Scanner t=new Scanner(System.in);
		String dni="";
		String numeros="";
		String letra="";
		int numeroDNI=0;
		int posicion=0;
		
		System.out.println("DNI: ");
		dni=t.next();
		if(dni.length()==9) {
		letra=dni.substring(8).toUpperCase();
		System.out.println(numeros+" "+letra);
		try {
			numeros=dni.substring(0, 8);
			numeroDNI=Integer.parseInt(numeros);
			posicion=numeroDNI%23;
			System.out.println(posicion);
			if(letrasDNI[posicion].equals(letra)) {
				System.out.println("DNI correcto");
			}else {
				System.out.println("DNI incorrecto");
			}
		}catch(Exception e) {
			System.out.println("DNI incorrecto");
		}

	}else {
		System.out.println("DNI incorrecto");
	}

}
}