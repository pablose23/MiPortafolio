package VariablesCondiciones;
import java.util.*;
public class Actividad1 {
	public static void main(String[]args) {
		double a=0, b=0, c=0;
		Scanner teclado=new Scanner(System.in);
		double x1,x2;
		double d=0;
		System.out.println("Coenficiente a:");
		a=teclado.nextDouble();
		System.out.println("Coeficiente b");
		b=teclado.nextDouble();
		System.out.println("Coeficiente c");
		c=teclado.nextDouble();
		d=Math.pow(b, 2)-4*a*c;
		if(a!=0 && d>0) {
			x1=(-(b)+Math.sqrt(d))/2*a;
			x2=(-(b)-Math.sqrt(d))/2*a;
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}else {
			System.out.println("no existe solucion");
		}
	}
}
