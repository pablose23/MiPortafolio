package ActividadesRepaso;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		int random=(int) (1+Math.random()*20);
		//System.out.println("Nº random "+random); //Para saber el nº random
		System.out.println("Dime un número");
		n=t.nextInt();
		while(n!=random) {
			if(n>random) {
				System.out.println("Es menor");
			}
			if(n<random) {
				System.out.println("Es mayor");
			}
			
			System.out.println("Dime un número");
			n=t.nextInt();
			if(n==random) {
				System.out.println("Fin, nº random "+random);
		}
		}
		
	}

}
