package ActividadesRepaso;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, suma=0;
		System.out.println("Dame un nº");
		n=t.nextInt();
		while(n!=0) {
			suma=suma+n;
			System.out.println("Dame un nº");
			n=t.nextInt();
		}
		System.out.println("La suma de los Nºs "+suma);
	}

}
