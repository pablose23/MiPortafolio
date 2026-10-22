package cadenas;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		String palabra=""; int conta=0, conte=0;
		Scanner t=new Scanner(System.in);
		
		System.out.println("Dame una frase");
		palabra=t.nextLine();
		
		for(int i=0;i<palabra.length(); i++) {
			if(palabra.charAt(i)=='A'|| palabra.charAt(i)=='a'||palabra.charAt(i)=='á'|| palabra.charAt(i)=='Á') {
				conta++;
			}
			if(palabra.charAt(i)=='E'|| palabra.charAt(i)=='e'||palabra.charAt(i)=='é'|| palabra.charAt(i)=='É') {
				conte++;
			}
		}
		System.out.println("A: "+conta);
		System.out.println("E: "+conte);
	}

}
