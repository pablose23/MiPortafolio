package cine;

import java.util.ArrayList;
import java.util.Scanner;

import coches.Coche;

public class App {
	private ArrayList<Pelicula>peliculas;
	
	
	public App() {
		this.peliculas = new ArrayList<>();
	}

	public App(ArrayList<Pelicula> peliculas) {
		this.peliculas =new ArrayList<>(); 
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public static void menu() {
		System.out.println("1) Añadir película");
		System.out.println("2) Borrar película");
		System.out.println("3) Mostrar películas");
		System.out.println("4) Buscar por género");
		System.out.println("5) Salir");
		System.out.println("Elige una opción:");
	}
	
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int opcion=0;
		int año=0;
		String genero="";
		String nombre="";
		String director="";
		App a=new App(); 
		
		
		do {
			menu();
			opcion=t.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("El año de la película");
				año=t.nextInt();
				System.out.println("El director de la película");
				director=t.next();
				System.out.println("Género de la película");
				genero=t.next();
				System.out.println("Nombre de la película");
				nombre=t.next();
				a.peliculas.add(new Pelicula(año, director, genero, nombre));
				break;
				
			case 2:
				for (Pelicula peliculas : a.getPeliculas()) {
					System.out.println("\t"+peliculas.getNombre());
					System.out.println("Que pelicula quieres borrar?");
					opcion=t.nextInt();
					//if(opcion==peliculas.getNombre())
						a.getPeliculas().remove(nombre);
				}
				
				
				break;
				
			case 3:
				for (Pelicula peliculas : a.getPeliculas()){
					System.out.println("\t"+peliculas.getNombre());
				}
				break;
				
			case 4:
				
				break;
				
			case 5:
				System.out.println("Saliendo....");
				break;
			}
			
		}while(opcion!=5);
		
	}
}
