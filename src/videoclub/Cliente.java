package videoclub;

import java.io.*;
import java.util.ArrayList;

public class Cliente {
	private String Nombre;
	private ArrayList<Alquiler>alquiler;

	public Cliente() {
		this.Nombre = "";
		this.alquiler=new ArrayList<>();
	}

	public Cliente(String nombre, ArrayList<Alquiler> Alquiler) {
		this.Nombre = nombre;
		this.alquiler = new ArrayList<>();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public ArrayList<Alquiler> getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(ArrayList<Alquiler> alquiler) {
		alquiler = alquiler;
	}

	public void nuevoAlquiler(Alquiler a) {
		this.alquiler.add(a);
	}

	public void informe() throws FileNotFoundException {
//		PrintWriter salida=new PrintWriter(new File("ticket.txt"));
		double precio=0;
		double total=0;
		int puntos=0;
		System.out.println("Informe para " + this.getNombre());
		for (Alquiler a: this.alquiler) {
			puntos++;
			switch(a.getDVD().getTipo()) {
			case Dvd.infantil:
				precio=1.5*a.getTiempo();
				break;
			case Dvd.normal:
				precio=2*a.getTiempo();
				break;
			case Dvd.novedad:
				precio=3*a.getTiempo();
				if(a.getTiempo()>1)
					puntos++;
				break;
			}
			System.out.println("\t"+a.getDVD().getTitulo()+"\t"+precio+" euros");
			total=total+precio;
		}
		System.out.println("IMPORTE TOTAL = "+total);
		System.out.println("Dispone de " +puntos+ " puntos");
		
//		salida.flush();
//		salida.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Cliente c1 = new Cliente();
		c1.setNombre("Juan Lopez Sanchez");
		Dvd casablanca = new Dvd("Casablanca", Dvd.normal);
		Dvd indy = new Dvd("Indiana Jones", Dvd.novedad);
		Dvd sherk = new Dvd("Sherk", Dvd.infantil);
		Alquiler a1 = new Alquiler(casablanca, 2);
		//Alquiler a2= new  Alquiler(sherk, 6);
		c1.nuevoAlquiler(a1);
		//c1.nuevoAlquiler(a2);
		c1.informe();
		
	}
}
