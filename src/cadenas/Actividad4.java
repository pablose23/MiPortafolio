package cadenas;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[]args) {
		String palabra="", reves="";
		Scanner t=new Scanner(System.in);
		
		System.out.println("Dame una palabra");
		palabra=t.next();
		
		for(int i=palabra.length()-1;i>=0; i--) {
			reves=reves+palabra.charAt(i);
		}
		//System.out.println(reves);
		if(palabra.equalsIgnoreCase(reves)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
	}
}
