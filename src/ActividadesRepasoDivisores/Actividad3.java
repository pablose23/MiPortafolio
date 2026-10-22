package ActividadesRepasoDivisores;
import java.util.Scanner;
public class Actividad3 {
	public static void main (String[]args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		for(int i=1; i<n; i++) {	
			if(n%1==0 && n%n==0) {
				System.out.println("");
			i++;
			System.out.println(i);
			}
		
		}
		
	}
}
