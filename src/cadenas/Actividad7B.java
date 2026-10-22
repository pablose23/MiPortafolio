package cadenas;

import java.util.Scanner;

public class Actividad7B {

	public static void main(String[] args) {
		String nif = "";
		Scanner t = new Scanner(System.in);
		boolean num=true;
		boolean letraM=true;

		System.out.println("Ingresa un NIF");
		nif = t.next();
		if (nif.length() == 9) {
			for (int i = 0; i <= 7; i++) {
				if (!Character.isDigit(nif.charAt(i))) {
					num=false;
				}
			}
			if(!Character.isUpperCase(nif.charAt(8))) {
				letraM=false;
				}
			if(num && letraM) {
				System.out.println("NIF correcto");
			}else {
				System.out.println("NIF no es correcto");
			}
			
		} else {
			System.out.println("NIF no correcto");
		}

	
	}

}
