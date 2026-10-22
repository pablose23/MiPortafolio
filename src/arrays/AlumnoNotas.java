package arrays;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AlumnoNotas {
	public static void main(String[] args) {
		double[] alumno1 = new double[7];
		double[] alumno2 = new double[7];
		String[] asignaturas = { "PROG", "BDD", "ED", "SISI", "LM", "FOL", "ING" };
		double suma1=0, suma2=0;
		DecimalFormat df=new DecimalFormat("#.##");
		for (int i = 0; i < alumno1.length; i++) {
			alumno1[i] = (double) (1 + Math.random() * 10);
			System.out.println("Nota alumno1 de " + asignaturas[i] + " = " +df.format(alumno1[i]));
			suma1=suma1+alumno1[i];
		}
		System.out.println("La media del alumno 1 es: "+suma1/7);
		System.out.println();
		for (int i = 0; i < alumno2.length; i++) {
			alumno2[i] = (double) (1 + Math.random() * 10);
			System.out.println("Nota alumno2 de " + asignaturas[i] + " = " +df.format(alumno1[i]));
			suma2=suma2+alumno2[i];
		}
		System.out.println("La media del alumno 2 es: "+suma2/7);
		
	}
}
