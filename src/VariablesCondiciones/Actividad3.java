package VariablesCondiciones;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		float radioc=0;
		float longitud=0;
		System.out.println("Nº del radio");
		radioc=t.nextFloat();
		longitud=(float)(2*Math.PI*radioc);
		System.out.println("La longitud es: "+longitud);

	}

}
