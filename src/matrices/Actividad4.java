package matrices;

import java.util.Arrays;

public class Actividad4 {

	public static void main(String[] args) {
		int [][] matriz= new int [3][4];
	
		System.out.println(Arrays.toString(sumacolumnasmatriz(matriz)));
	}
	private static int[] sumacolumnasmatriz(int[][]matriz) {
		int ncolum[] =new int[matriz[0].length];
		int sumacolum=0;
		for(int i=0; i<matriz[0].length; i++) { 
			for(int j=0; j<matriz.length;j++) {
				sumacolum=sumacolum+matriz[i][j];
			}
			ncolum[i]=sumacolum;
			sumacolum=0;
		}
		
		return ncolum;
	}
	
}

