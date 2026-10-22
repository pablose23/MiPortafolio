package matrices;

public class Actividad1 {

	public static void main(String[] args) {
		int [][]matriz=new int[3][4];
		int numero=1;
		
//		System.out.println(matriz.length); //filas=3
//		System.out.println(matriz[0].length); //coumnas=4
		
		for(int i=0; i<matriz.length; i++) { //bucle de las filas
			for(int j=0; j<matriz[0].length;j++) {
				//System.out.println("Fila "+i+" columna "+j);
				matriz[i][j]=numero;
				numero++;
				System.out.print(matriz[i][j]+" \t");
			}
			System.out.println();
		}

	}

}
