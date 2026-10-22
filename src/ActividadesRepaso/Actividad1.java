package ActividadesRepaso;
import java.util.Scanner;
public class Actividad1 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=0, cuadradon=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		while (n>=0) {
			cuadradon=n*n;
			System.out.println("El cuadrado es: "+cuadradon);
			System.out.println("Dame un número");
			n=t.nextInt();
	}
}
}

