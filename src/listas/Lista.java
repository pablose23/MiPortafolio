package listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista {
	
	public static void main(String[] args) {
		int []array = {1,5,2,5,9};
		ArrayList<Integer> lista=new ArrayList<>();
		System.out.println(Arrays.toString(array));
		//rellenar el arraylist
		lista.add(1);
		lista.add(5);
		lista.add(2);
		lista.add(5);
		lista.add(9);
		
		lista.add(1,18);
		System.out.println(lista);
		lista.addFirst(9);
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		
		//recorrer un array
		for(int i=0; i<array.length;i++)
			System.out.println(array[i]);
		
		//for each
		for (Integer numero : lista) {
			System.out.print(numero+" ");
		}
		
		//for similar al del array
		System.out.println("\nOtro for");
		for(int i=0; i<lista.size();i++)
			System.out.println(lista.get(i));
		

		//añadir un lemento al array ?? si esta lleno no!
		
		//borrardo lógico
		
		//Acceder a un elemento -> indice
		System.out.println(array[1]);
	}
}
