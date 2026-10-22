package objetos;

import java.util.Scanner;

public class Programa {
	public void menu() {
		System.out.println("1)Imprimir agenda");
		System.out.println("2) Añadir contacto");
		System.out.println("3) Eliminar contacto");
		System.out.println("4) Salir");
		System.out.println("Elige una opcion: ");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean salir=false;
		int opcion;
		Programa p=new Programa();
		Agenda agenda=new Agenda();
		agenda.cargarAgenda("contactos.bin");
		String nombre="",direccion="", email="",telefono="";
		do {
			p.menu();
			opcion=sc.nextInt();
			sc.nextLine();
			switch(opcion) {
			
			case 1:
				
				break;
			case 2: 
				
				break;
			case 3:
				
				break;
			case 4:salir=true;
				break;
			}
			
		}while(!salir);
		


	}

}
