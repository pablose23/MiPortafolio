package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Barcos {

	public static void main(String[] args) {
		String boleto="AAAAAAAAAA";
		Scanner sc=new Scanner(System.in);
		int cont=0;
		int pos=0;
		//Colocar 4 barcos de forma aleatoria
		while(cont<4) {
			pos=(int)(Math.random()*10);
			//System.out.println(pos);
		
			if(boleto.charAt(pos)!='B') {
				if(pos!=9) {
					boleto=boleto.substring(0, pos)+'B'+boleto.substring(pos+1);
				}
				else {
					boleto=boleto.substring(0, pos)+'B';
				}
				
				cont++;
			}//if
			
		}//while
		
	//System.out.println(boleto);
	int intentos=6;
	
	do {
		System.out.println("Dame una posici�n");
		pos=sc.nextInt();
		if(boleto.charAt(pos)=='A')
			System.out.println("Agua");
		else
		{
			System.out.println("Hundido");
			if(pos!=9)
				boleto=boleto.substring(0, pos)+'A'+boleto.substring(pos+1);
			else
				boleto=boleto.substring(0, pos)+'A';
		}
		
		intentos--;
		
	}while(!boleto.equals("AAAAAAAAAA") && intentos>0);
	
	if(intentos>=0 && boleto.equals("AAAAAAAAAA"))
		System.out.println("Has ganado!!!");
	else {
		System.out.println("LOOSERRR!!!");
		
	}
	System.out.println(boleto);

	}

}
