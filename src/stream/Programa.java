package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Programa p1 = new Programa();
		int opcion = 0;
		Scanner t = new Scanner(System.in);

		ArrayList<Productos> productos = new ArrayList<>();

//		Productos vendidos
		productos.add(new Productos("1", "HP Laptop", 0.5, 2500, "portátil"));
		productos.add(new Productos("2", "Teclado de logitech", 0.15, 25, "teclado"));
		productos.add(new Productos("3", "Ratón logitech", 0.25, 15, "ratón"));
		productos.add(new Productos("4", "Samsung Galaxy Note 20", 0.1, 1000, "telefono"));
		productos.add(new Productos("5", "Iphone 7", 0.1, 1000, "telefono"));
		productos.add(new Productos("6", "Disco SSD", 0.2, 300, "disco"));

		do {
			p1.menu();
			opcion = t.nextInt();

			switch (opcion) {
			case 1:
//				System.out.println("1) Ver los nombres de los productos vendidos");
				productos.stream().map(p->p.getNombre()).forEach(System.out::println);
				break;
			case 2:
//				System.out.println("2) Cuantos productos hay cuyo nombre empiezan por H");
				productos.stream().map(p->p.getNombre()).filter(p->p.startsWith("H")).forEach(System.out::println);
				break;
			case 3:
//				System.out.println("3) Nombre de los productos vendidos de más de 1000€");
				productos.stream().filter(p->p.getPrecio()>1000).map(p->p.getNombre()).forEach(System.out::println);
				break;
			case 4:
//				System.out.println("4) Nombre, peso y precio de productos con el peso menor que 0.5Kg");
				productos.stream().filter(p->p.getPeso()<0.5).map(p->p.getNombre()+" "+p.getPeso()+" "+p.getPrecio())
				.forEach(System.out::println);
				break;
			case 5:
//				System.out.println("5) Total obtenido con la venta de los productos");
				System.out.println(productos.stream().mapToDouble(p->p.getPrecio()).sum());
				break;
			case 6:
//				System.out.println("6) Crea otra lista e imprime por pantalla esa nueva lista que contiene con los teléfonos vendidos");
				List<Productos>telefonos=productos.stream().filter(p->p.getCategoria().equals("telefono")).toList();
				System.out.println(telefonos);
				break;
			case 7:
//				System.out.println("7) Crea una lista de los precios de los productos que superen los 500€");
				List<Productos>precios=productos.stream().filter(p->p.getPrecio()>500).toList();
				System.out.println(precios);
				break;
			case 8:
//				System.out.println("8) Precio de producto vendido más caro");
				double caro=productos.stream().mapToDouble(p->p.getPrecio()).max().getAsDouble();
				System.out.println(caro+"€");
				break;
			case 9:
//				System.out.println("9) Precio del producto vendido más barato");
				double barato=productos.stream().mapToDouble(p->p.getPrecio()).min().getAsDouble();
				System.out.println(barato+"€");
				break;
			case 10:
//				System.out.println("10) Nombres de los productos de menos de 100€ y peso < 0.5kg en mayúscula");
				productos.stream().filter(p->p.getPrecio()<100 && p.getPeso()<0.5).map(p->p.getNombre().toUpperCase()+" "+p.getPrecio()+"€"+" "+p.getPeso()+"Kg")
				.forEach(System.out::println);
				break;
			case 11:
//				System.out.println("11) Salir");
				System.out.println("Saliendo...");
				break;
			}

		} while (opcion != 11);
	}

	public void menu() {
		System.out.println("1) Ver los nombres de los productos vendidos");
		System.out.println("2) Cuantos productos hay cuyo nombre empiezan por H");
		System.out.println("3) Nombre de los productos vendidos de más de 1000€");
		System.out.println("4) Nombre, peso y precio de productos con el peso menor que 0.5Kg");
		System.out.println("5) Total obtenido con la venta de los productos");
		System.out.println("6) Crea otra lista e imprime por pantalla esa nueva lista que contiene con los teléfonos vendidos");
		System.out.println("7) Crea una lista de los precios de los productos que superen los 500€");
		System.out.println("8) Precio de producto vendido más caro");
		System.out.println("9) Precio del producto vendido más barato");
		System.out.println("10) Nombres de los productos de menos de 100€ y peso < 0.5kg en mayúscula");
		System.out.println("11) Salir");
		System.out.println("Elige una opción: ");
	}
}
