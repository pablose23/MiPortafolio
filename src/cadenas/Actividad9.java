package cadenas;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		String contraseña="";
		String numeros="";
		String letras="";
		
		System.out.println("Ingrese la contrseña: ");
		contraseña=t.next();
		if(contraseña.equalsIgnoreCase("123abc")) {
			System.out.println("Contraseña correcta");
		}else {
			System.out.println("Contraseña incorrecta");
		}
}
}