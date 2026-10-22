package VariablesCondiciones;
import java.util.Scanner;
public class Actividad2 {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		float radioc=0;
		float areac=0;
			System.out.println("Número de radio");
			radioc=t.nextFloat();
			areac=(float)(radioc*radioc*Math.PI);
			System.out.println("El area del circulo es: "+areac);
	}
}
