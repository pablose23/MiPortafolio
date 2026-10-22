package condiciones;
import java.util.*;
public class Actividad4 {
	public static void main(String[]args) {
		//declaramos variables/objetos
	Scanner teclado=new Scanner(System.in);
	int numero=0;
	//procesamiento y resultados
	System.out.println("Dame un número");
	numero=teclado.nextInt();
	if(numero%2==0) {
		System.out.println("Es par");
	}else {
		System.out.println("Es impar");
	}
}
}

