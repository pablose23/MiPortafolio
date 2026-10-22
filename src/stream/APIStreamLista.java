package stream;

import java.util.Arrays;
import java.util.List;

public class APIStreamLista {
	public static void main(String[] args) {
		List<Integer>lista=Arrays.asList(3,2,12,5,6,11,13);
		
		//imprimir
//		for(Integer i: lista)
//			System.out.println(i);
		
		//Stream
		lista.forEach(i->System.out.println(i));
		lista.forEach(System.out::println);
		
//		Número de números mayores de 7
		int contador=(int) (lista.stream().filter(i->i>7).mapToInt(i->i.intValue()).count());
		System.out.println("Mayores que 7 -> "+contador);
//		long contador=(lista.stream().filter(i->i>7).mapToInt(i->i.intValue()).count());
		
//		Crear una lista con los números mayores de 7
		List<Integer>nueva=lista.stream().filter(i->i>7).sorted().toList();
		System.out.println(nueva);
		
		List<String>ciudades=Arrays.asList("Talavera","Madrid","Granada", "Oviedo");
		System.out.println(ciudades.stream().sorted().toList());
		
//		Ciudades que empiezan por T
		ciudades.stream().filter(c-> c.startsWith("T")).forEach(System.out::println);
		
//		Lista de ciudades que tengan más de 7 letras
		ciudades.stream().filter(c->c.length()>=7).forEach(System.out::println);
		List<String>nuevaCiudad=ciudades.stream().filter(c->c.length()>=7).toList();
		System.out.println(nuevaCiudad);
	}
}
