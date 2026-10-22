package ActividadesRepaso;
import java.util.Scanner;
public class Actividad7 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, media=0, contador=0, suma=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		while(n>0) {
			contador++;
			suma=suma+n;
			media=(suma)/contador;
			System.out.println("Dame un número");
			n=t.nextInt();
		}
		System.out.println("Suma de los nºs "+suma);
		System.out.println("La media es: "+media);
	}
}
