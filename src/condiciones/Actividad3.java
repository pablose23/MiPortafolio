package condiciones;
import java.util.Scanner;
public class Actividad3 {
	public final static int BASE=40;
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int nhoras=0, horasextras=0, salario=0;
	System.out.println("Nº de horas trabajadas");
	nhoras=teclado.nextInt();
	if(nhoras<=BASE) {
		salario=nhoras*10;
	}else {
		horasextras=nhoras-40;
		System.out.println("las horas extras son: "+horasextras);
		salario=(BASE*10)+horasextras*20;
	}
	System.out.println("el salario es: "+salario);
	
	}

}
