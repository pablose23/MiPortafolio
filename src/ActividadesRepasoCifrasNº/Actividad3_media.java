package ActividadesRepasoCifrasNº;

import java.util.Scanner;

public class Actividad3_media {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
	    int n=0, cociente=0, resto=0, nsuma=0;
	    String cifra="";
	    System.out.println("Dame un número");
	    n=t.nextInt();
	    cociente=n;
	    while(cociente>=10) {
	    	resto=cociente%10;
	    	cociente=cociente/10;
	    	nsuma=nsuma+resto;
	    }
	    nsuma=nsuma+cociente;
	    System.out.println("Revés nº "+nsuma);

	}

}
