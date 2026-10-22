package coches;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
	//atributo de la clase App
	private ArrayList<Coche>misCoches;
	
	public App(){
		this.misCoches=new ArrayList<>();
	}
	
	public ArrayList<Coche> getMisCoches() {
		return misCoches;
	}

	public void setMisCoches(ArrayList<Coche> misCoches) {
		this.misCoches = misCoches;
	}

	public ArrayList cargarCoches(String fichero) throws FileNotFoundException{
		Scanner entrada=new Scanner(new File(fichero));
		ArrayList<Coche>coches=new ArrayList<Coche>();
		String linea[];
		String cadena;
		entrada.nextLine();
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			coches.add(new Coche(linea[0], linea[1], linea[2], linea[3], Integer.parseInt(linea[4]), Double.parseDouble(linea[5])));
		}
		return coches;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		App app=new App();
		app.setMisCoches(app.cargarCoches("coches.csv"));
		System.out.println(app.getMisCoches());
		
//		System.out.println(app.getMisCoches().get(0).getMatricula());
		
		//ver la matricula de todos los coches
		//for each
		System.out.println("Todas las matrículas de los coches");
		for (Coche Coche : app.getMisCoches()) {
			System.out.println("\t"+Coche.getMatricula()+" ");
		}
		
		//imprimir los coches que tenga la letra f en la matricula
		System.out.println("Imprimir los coches que tenga la letra f en la matrícula");
		for (Coche Coche : app.getMisCoches()) {
			if(Coche.getMatricula().contains("F"))
			System.out.println("\t"+Coche.getMatricula());
		}
		
		
		//contar cúantos coches hay de 5 puertas y cúantos de 3
		System.out.println("Contar cúantos coches hay de 5 puertas y cúantos de 3");
		int np5=0, np3=0;
		for (Coche Coche : app.getMisCoches()) {
			if(Coche.getnPuertas()==5)
				np5++;
			else
				np3++;
		}
		System.out.println("\tCoches con 5 puertas: "+np5);
		System.out.println("\tCoches con 3 puertas: "+np3);
		
		//mostrar la marca, el modelo y el color de los coches que tengan
		//más de 30k km
		System.out.println("mostrar la marca, el modelo y el color de los coches que tengan más de 30k km");
		for (Coche Coche : app.getMisCoches()) {
			if(Coche.getKm()>=30000)
				System.out.println("\t"+ Coche.getMarca() + Coche.getModelo() + Coche.getColor());
		}
		
		
		
	
	
	
	
	}
}
