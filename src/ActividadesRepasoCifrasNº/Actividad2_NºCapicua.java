package ActividadesRepasoCifrasNº;
import java.util.Scanner;
public class Actividad2_NºCapicua {
	public static void main(String[]args) {
		Scanner t=new Scanner(System.in);
	    int n=0, cociente=0, resto=0;
	    int ncapicua=0;
	    System.out.println("Dame un número");
	    n=t.nextInt();
	    cociente=n;
	    while(cociente>=10) {
	    	resto=cociente%10;
	    	cociente=cociente/10;
	    	ncapicua=ncapicua*10+resto;
	    }
	    ncapicua=ncapicua*10+cociente;
	    if(n==ncapicua) {
	    	System.out.println(ncapicua+" Es capicua");
	    }else {
	    	System.out.println("No es capicua");
	    }
	    
	}
}
