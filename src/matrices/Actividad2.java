package matrices;

import java.util.*;

public class Actividad2 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int nºfilas=0;
		int nºcolumnas=0;
		
		do {
			System.out.println("Dame el nº de filas: ");
			nºfilas = t.nextInt();
			System.out.println("Dame el nº de columnas: ");
			nºcolumnas = t.nextInt();
		} while ( nºfilas< 2 || nºfilas > 10 || nºcolumnas < 2 || nºcolumnas > 10);
		
		int[][] matriz = new int[nºfilas][nºcolumnas];
		System.out.println("Dame un nº");
		int n=t.nextInt();
		
		imprimirmatriz(matriz);
		buscarnumero(matriz,n);
	}
			
		
		private static void imprimirmatriz (int[][]matriz) {
			for(int i=0; i<matriz.length;i++) {
				for(int j=0; j<matriz[0].length;j++) {
					matriz[i][j]=(int)(1+Math.random()*5);
					System.out.print(matriz[i][j]+" \t");
				}	
				System.out.println();		
			}
		}


		private static void buscarnumero(int[][]matriz,int n) {
			for(int i=0; i<matriz.length;i++) {
				for(int j=0; j<matriz[0].length;j++) {
					matriz[i][j]=(int)(1+Math.random()*5);
					if(matriz[i][j]==n) {
						System.out.println("Encontrado "+n+" en la posición "+"["+i+","+j+"]");
					}
				}
			}
		}
}
