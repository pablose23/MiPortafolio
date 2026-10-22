package clinicaveterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	private ArrayList<Cliente>clientes;
	
	public App() {
		this.clientes=new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static void menu() {
		System.out.println("1. Dar de alta un cliente");
		System.out.println("2. Atender un cliente");
		System.out.println("\t Ver mascotas");
		System.out.println("3. Dar de alta mascota");
		System.out.println("6. Salir");
		System.out.println("Elige una opcion: ");
	}
	
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int opcion=0;
		String DNI="";
		String Dni="";
		Perro p1=new Perro(2, 3.5, "Pastor Aleman", "Macho", "Pepe");
		Perro p2=new Perro(2, 2.3, "Caniche", "Hembra", "Lola");
		Gato g1=new Gato(1, 2, "Siberiano", "Macho", "Paco");
		Gato g2=new Gato(2, 2.2, "Siames", "Hembra", "Nala");
		Conejo co1=new Conejo(3, 4.1, "Marron", "Macho", "Pedro");
		Conejo co2=new Conejo(2, 3.1, "Blanco", "Hembra", "Alba");
		ArrayList<Animales> mascotas=new ArrayList<>();
		mascotas.add(p1);
		mascotas.add(p2);
		ArrayList<Animales>mascotas1=new ArrayList<>();
		mascotas1.add(g1);
		Cliente cl1=new Cliente("Pablo", "02333906G", "C/Del Sol", 
				"pablo.sedenofrias@ribera.es", mascotas);
		Cliente cl2=new Cliente("Alvaro", "02333905G", "C/fff", "fsfs@fef.es", mascotas1);
		App a=new App();
			a.getClientes().add(cl1);
			a.getClientes().add(cl2);
		do {
			a.menu();
			opcion=t.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Nombre del Cliente");
					String nombre=t.next();
					System.out.println("DNI del Cliente");
					String dni=t.next();
					t.nextLine();
					System.out.println("Dirección del Cliente");
					String direccion=t.nextLine();
					System.out.println("Email del Cliente");
					String email=t.next();
					a.getClientes().add(new Cliente(nombre, DNI, direccion, email, mascotas));
					break;
					
				case 2:
					System.out.println("Introduce el DNI: ");
					t.nextLine();
					Dni=t.nextLine();
					for (Cliente cli : a.getClientes()) {
						if(cli.getDNI().equals(Dni)) {
							System.out.println("El cliente es "+cli.getNombre());
							System.out.println("-------Ver mis Mascotas-------");
						}
						for (Animales an : cli.getMascotas()) {
							if(an instanceof Perro) {
								System.out.println("\tPerro: "+an.getNombre());
							}
							if(an instanceof Gato) {
								System.out.println("\tGato: "+an.getNombre());
							}
							if(an instanceof Conejo) {
								System.out.println("\tConejo: "+an.getNombre());
							}
						}
					}
					break;
					
				case 3:
					System.out.println("Introduce el DNI: ");
					t.nextLine();
					Dni=t.nextLine();
					for (Cliente cli : a.getClientes()) {
						if(cli.getDNI().equals(Dni)) {
							System.out.println("El cliente es "+cli.getNombre());
							System.out.println("-------Ver mis Mascotas-------");
						}
						for (Animales an : cli.getMascotas()) {
							if(an instanceof Perro) {
								System.out.println("\tPerro: "+an.getNombre());
							}
							if(an instanceof Gato) {
								System.out.println("\tGato: "+an.getNombre());
							}
							if(an instanceof Conejo) {
								System.out.println("\tConejo: "+an.getNombre());
							}
						}
					}
					
					System.out.println("1. Dar de alta a la mascota");
					opcion=t.nextInt();
					System.out.println("2.Dar de baja a la mascota");
					opcion=t.nextInt();
					if(opcion==1)
						
					break;
				case 4:
					System.out.println("Gracias por su visita");
					break;
			}
		}while(opcion!=6);
	}
}
