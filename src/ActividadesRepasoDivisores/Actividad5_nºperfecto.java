package ActividadesRepasoDivisores;
import java.util.Scanner;
public class Actividad5_nºperfecto {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, suma=0;
		System.out.println("Dame un numero");
		n=t.nextInt();
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				suma=suma+i;
			}
		}
		if(suma==n) {
			System.out.println("Es perfecto");
		}else {
			System.out.println("No es perfecto");
		}
	}

}
