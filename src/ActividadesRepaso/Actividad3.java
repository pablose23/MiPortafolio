package ActividadesRepaso;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		while(n!=0) {
			if(n%2==0) {
				System.out.println("Es par");
			}
			if(n%2!=0) {
				System.out.println("Es impar");
			}
			System.out.println("Dame un número");
			n=t.nextInt();
		}
		
	}

}
