package ActividadesRepasoCifrasNº;
import java.util.Scanner;
public class Actividad1_NºReves {
	public static void main(String[]args) {
		Scanner t=new Scanner(System.in);
		    int n=0, cociente=0, resto=0;
		    String reves="";
		    System.out.println("Dame un número");
		    n=t.nextInt();
		    cociente=n;
		    while(cociente>=10) {
		    	resto=cociente%10;
		    	cociente=cociente/10;
		    	reves=reves+resto;
		    }
		    reves=reves+cociente;
		    System.out.println("Revés nº "+reves);
	}
}
