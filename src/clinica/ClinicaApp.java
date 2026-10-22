package clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ClinicaApp implements EntradasUsuario {

	@Override
	public boolean esEntero(String entero) {
		try {
			Integer.parseInt(entero);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private ArrayList<Profesionales> medicos;
	private ArrayList<Pacientes> cola;

	public ClinicaApp() {
		this.medicos = new ArrayList<Profesionales>();
		this.cola = new ArrayList<Pacientes>();
	}

	public ArrayList<Profesionales> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Profesionales> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Pacientes> getCola() {
		return cola;
	}

	public void setCola(ArrayList<Pacientes> cola) {
		this.cola = cola;
	}

	@Override
	public String toString() {
		return "ClinicaApp [medicos=" + medicos + ", cola=" + cola + "]";
	}

	public void menu() {
		System.out.println("1. Listado de pacientes");
		System.out.println("2. Cargar historias clinicas");
		System.out.println("3. Atender paciente");
		System.out.println("4. Salir");
		System.out.println("Elija una opción: ");
	}

	public void leerPersonas(String fichero) {
		File f = new File(fichero);
		try {
			Scanner entrada = new Scanner(f);
			String linea[];
			String cadena;
			cadena = entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
//				System.out.println(cadena);
				linea = cadena.split(";");
				if (cadena.length()>6	) {
					this.medicos.add(new Profesionales(linea[1], linea[2], linea[3], linea[4], linea[5],
							Integer.parseInt(linea[6])));
				} else {
					this.cola.add(new Pacientes(linea[1], linea[2], linea[3], linea[4], Float.parseFloat(linea[7]),
							Integer.parseInt(linea[8]), linea[10], null));
				}
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No existe");
		}
	}

	public void generarPacientesAlergologia() {
		for (Profesionales medicos : this.medicos) {
			if(medicos.getEspecialidad().equals("Alergologia")) {
			System.out.println(
					"********************************* Alergologia *********************************");
			System.out.println(
					"La lista de pacientes de Dr/Dra." + medicos.getNombre() + " " + medicos.getApellidos() + " es:");
			}
		}
		for (Pacientes pacientes : this.cola) {
			if(pacientes.getCita().equals("Alergologia")) {
			System.out.println("\t"+pacientes.getNombre() + " " + pacientes.getApellidos());
			System.out.println();
			}
		}
	}
	
	public void generarPacientesCardiolagia() {
		for (Profesionales medicos : this.medicos) {
			if(medicos.getEspecialidad().equals("Cardiologia")) {
			System.out.println(
					"********************************* Cardiologia *********************************");
			System.out.println(
					"La lista de pacientes de Dr/Dra." + medicos.getNombre() + " " + medicos.getApellidos() + " es:");
			}
		}
		for (Pacientes pacientes : this.cola) {
			if(pacientes.getCita().equals("Cardiologia")) {
			System.out.println("\t"+pacientes.getNombre() + " " + pacientes.getApellidos());
			System.out.println();
			}
		}
	}

	public void generarPacientesCirugia() {
		for (Profesionales medicos : this.medicos) {
			if(medicos.getEspecialidad().equals("Cirugia")) {
			System.out.println(
					"********************************* Cirugia *********************************");
			System.out.println(
					"La lista de pacientes de Dr/Dra." + medicos.getNombre() + " " + medicos.getApellidos() + " es:");
			}
		}
		for (Pacientes pacientes : this.cola) {
			if(pacientes.getCita().equals("Cirugia")) {
			System.out.println("\t"+pacientes.getNombre() + " " + pacientes.getApellidos());
			System.out.println();
			}
		}
	}
	
	public void generarHistoria() throws FileNotFoundException {
		for(int j=0; j<this.getCola().size(); j++) {
			String cadena="";
			String fichero="Historia"+this.getCola().get(j).getDni()+".txt";
			File nombre= new File(fichero);
			String texto="";
			if(nombre.exists()) {
					System.out.println("Existe "+this.getCola().get(j).getDni()+".txt");
					Scanner entrada= new Scanner(nombre);
					while(entrada.hasNext()) {
						cadena=entrada.nextLine();
						texto=texto+cadena;
					}
					this.getCola().get(j).setHistoria(texto);
			}
		}
			
	}
	
	public void atenderPacientes(String Dni) {
		Scanner t=new Scanner(System.in);
		String cadena="";
		for(int j=0; j<this.getCola().size(); j++) {
			if(this.getCola().get(j).getDni().equals(Dni)) {
			System.out.println("El paciente es: "+this.getCola().get(j).getNombre()+" "+this.cola.get(j).getApellidos());
			System.out.println("El motivo de su visita");
			String visita="";
			do {
				cadena=t.nextLine();
				if(!cadena.equalsIgnoreCase("fin")) {
					visita=visita+cadena;
				}
			}while(!cadena.equalsIgnoreCase("fin"));
				visita=this.cola.get(j).getHistoria()+"\r"+"\n"+visita+"\r"+"\n";
				this.cola.get(j).setHistoria(visita);
				this.cola.get(j).guardarHistoria();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		ClinicaApp c1 = new ClinicaApp();
		String opcion = "";
		Scanner sc = new Scanner(System.in);
		c1.leerPersonas("personas_sin_tildes.csv");
		do {
			c1.menu();
			opcion = sc.next();
			switch (opcion) {
			case "1":
				c1.generarPacientesAlergologia();
				c1.generarPacientesCardiolagia();
				c1.generarPacientesCirugia();
				break;
			case "2":
				c1.generarHistoria();
				break;
			case "3":
				String cadena="";
				String visita="";
					System.out.println("Dime tu DNI");
					String dni=sc.next();
					c1.atenderPacientes(dni);
				break;
			case "4":
				System.out.println("Saliendo...");
				break;
			}
		} while (!opcion.equals("4"));
	}

}
