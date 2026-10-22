package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		String[]semana= {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado","domingo"};
		System.out.println(Arrays.toString(semana));
		float[]temp=new float[7];
		Scanner t=new Scanner(System.in);
		float suma=0;
		float media=0;
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura del "+semana[i]+ " es:");
			temp[i]=t.nextFloat();
		}
		
		System.out.println(Arrays.toString(temp));
		
		//media
		
		for (int i = 0; i < temp.length; i++) {
			suma=suma+temp[i];
			
		}
		media=suma/temp.length;
		System.out.println(media);
//		if(temp[i]<media) {
//			System.out.println("Temperatura del "+semana[i]+ " esta por debajo de la media");
//	}else {
//		System.out.println("Temperatura del "+semana[i]+ " esta por encima de la media");
//		}
	}

}
