package ejemplo;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Notas {

	public static void main(String[] args) {
		//Declaración de variables
		String []modulos= {"PROG","BD","ED","SISI","LM","FOL","Inglés"};
		double a1[]=new double[7];
		double a2[]=new double[7];
		//int variableCopia=10;
		asignarNotas(a1);
		//System.out.println(variableCopia);
		asignarNotas(a2);
		System.out.println("Las notas de a1 son: ");
		imprimirNotas(a1,modulos);
		System.out.println("\nLa nota media es: "+media(a1));
		
		double copia[]=new double[7];
//		copia=a1;//copia de la referencia
//		Arrays.sort(copia);
//		System.out.println("la mayor nota es: "+copia[copia.length-1]);
//		System.out.println("la menor nota es: "+copia[0]);
		
		//hay q copiar valor a valor en el arary
		for (int i = 0; i < a1.length; i++) {
			copia[i]=a1[i];
			Arrays.sort(copia);
			System.out.println("la mayor nota es: "+copia[copia.length-1]);
			System.out.println("la menor nota es: "+copia[0]);
		}
		
		
		System.out.println("\nLas notas de a2 son: ");
		imprimirNotas(a2,modulos);
		System.out.println("\nLa nota media es: "+media(a2));

		copia=a2;
		Arrays.sort(copia);
		System.out.println("la mayor nota es: "+copia[copia.length-1]);
		System.out.println("la menor nota es: "+copia[0]);
	
	
	}

	private static void imprimirNotas(double []a, String modulos[]) {
		DecimalFormat df = new DecimalFormat("#.##");
        for(int i=0; i<a.length; i++) {
        	System.out.println(modulos[i]+": "+df.format(a[i])+" ");
        }
	}

	private static double media(double[] a) {
		double suma=0;
		for(int i=0; i<a.length; i++)
			suma+=a[i];
		
		return (suma/a.length);
	}



	private static void asignarNotas(double[] a) {
		for(int i=0; i<a.length; i++) 
			a[i]=(Math.random()*10);
		
		
	
		
	}
	

}