package ActividadesRepaso;
import java.util.Scanner;
public class Actividad4 {
	public static void main(String[]args) {
		Scanner t=new Scanner(System.in);
		int n=0;
		int contador=0;
		System.out.println("Dame un número");
		n=t.nextInt();
		while(n>=0){
			contador++;
			
			System.out.println("Dame un número");
			n=t.nextInt();
		}
		System.out.println("Nº usados "+contador);
	}
}
