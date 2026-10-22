package ejemplo;

import java.util.Arrays;

public class Dados {

	public static void main(String[] args) {
		int dado1=0, dado2=0, dado3=0, dado4=0, dado5=0;
		int suma1=0, suma2=0;

		int[]lanzamientos1=new int[5];
		int[]lanzamientos2=new int[5];
		
		//Rellenar el array
		//posicion a posicion
		
		for(int i=0; i<lanzamientos1.length; i++) {
			lanzamientos1[i]=(int)(1+Math.random()*6);
			lanzamientos2[i]=(int)(1+Math.random()*6);
		}
		
		//Mostrar posiciones del array
		
		System.out.println(Arrays.toString(lanzamientos1));
		System.out.println(Arrays.toString(lanzamientos2));
		
		System.out.println(lanzamientos1[3]);
		System.out.println(lanzamientos1[3]);
		
		//Operar con ararys
		
//		for (int i=0; i< lanzamientos2.length; i++) {
//			suma1=suma1+lanzamientos1[i];
//			suma2=suma2+lanzamientos2[i];
//		}
//		
//		System.out.println("suma j1: "+suma1);
//		System.out.println("suma j2: "+suma2);
//		
//		//String []semana=new String[7]
//		//semana[o]="Lunes";
//		
//		String[]semana= {"Lunes", "martes", "miercoles", "jueves", "viernes", "sabado","domingo"};
//		semana[0]="lunes";
//		System.out.println(Arrays.toString(semana));
//		
//		
//		
		
//		for(int i=1; i<6; i++) {
//			System.out.println("Dado "+i+" es: "+(int)(1+Math.random()*6));
//			suma=suma+i;
//		}
//		
//		System.out.println("La suma de los 5 dados es: "+suma);
//		dado1=(int)(1+Math.random()*6);
//		dado2=(int)(1+Math.random()*6);  
//		dado3=(int)(1+Math.random()*6);
//		dado4=(int)(1+Math.random()*6);
//		dado5=(int)(1+Math.random()*6); 
//		suma=suma+dado1+dado2+dado3+dado4+dado5;
//		System.out.println("dado1: "+dado1);
//		System.out.println("dado2: "+dado2);
//		System.out.println("dado3: "+dado3);
//		System.out.println("dado4: "+dado4);
//		System.out.println("dado5: "+dado5);
//		System.out.println("La suma de los 5 dados es: "+suma);
	}

}
