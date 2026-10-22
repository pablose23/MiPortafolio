package ActividadesRepasoDivisores;
import java.util.Scanner;
public class Actividad4_nºamigo {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int nA=0, nB=0, sumaA=0, sumaB=0;
		System.out.println("Dame un número");
		nA=t.nextInt();
		System.out.println("Dame un número");
		nB=t.nextInt();
		for(int i=1; i<nA; i++) {
			if(nA%i==nB) {
				sumaA=sumaA+i;
			}
		}
		for(int j=1; j<nB; j++) {
			if(nB%j==nA) {
				sumaB=sumaB+j;
			}
		}
		if(sumaA==sumaB) {
			System.out.println("Son amigos");
		}else {
			System.out.println("No son amigos");
		}
	}

}
