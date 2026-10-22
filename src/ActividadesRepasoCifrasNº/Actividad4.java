package ActividadesRepasoCifrasNº;
import java.util.Scanner;
public class Actividad4 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, ultimon=0; 
		int resto=0, cociente=0;
		int cifras=1;
		System.out.println("Dame un número");
		n=t.nextInt();
		cociente=n;
		ultimon=cociente%10;
		n=cociente/10;
		while(cociente>=10) {
			resto=cociente%10;
			cociente=cociente/10;
			cifras++;
		}
		System.out.println("Nº de cifras: "+cifras);
		if(cifras>1) {
			n=(int)(ultimon*Math.pow(10, cifras-1))+n;
			System.out.println("Nº final: "+n);
		}
	}
}
