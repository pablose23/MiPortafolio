package boletinNotas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoletinNotas {
	private ArrayList<Alumno> dam;

	public BoletinNotas() {
		this.dam=new ArrayList<>();
	}

	public void cargaInicial() throws IOException {

		File fichero = new File("Alumnos.csv");
		Scanner entrada = new Scanner(fichero);
		String cadena = "";
		String[] linea;

		while (entrada.hasNext()) {
			cadena = entrada.nextLine();
			linea = cadena.split(";");
			this.getDam().add(new Alumno(Integer.parseInt(linea[0]), linea[1], linea[2], linea[3]));

		}
		entrada.close();

	}

	public ArrayList<Alumno> getDam() {
		return dam;
	}

	public void setDam(ArrayList<Alumno> dam) {
		this.dam = dam;
	}

	public void generarBoletines() {
		double suma = 0.0;
		for (Alumno a : this.getDam()) {
			String nombre = "./boletin/Boletin" + a.getNombre() + a.getApellidos() + ".txt";
			File fichero = new File(nombre);
			try {
				suma = 0.0;
				PrintWriter salida = new PrintWriter(fichero);
				salida.println("*******************IES Ribera del Tajo**************");
				salida.println("Curso 1DAM");
				salida.println("Alumno/a: " + a.getNombre() + " " + a.getApellidos());
				// Notas
				for (Nota n : a.getMatricula()) {
					salida.println("\t" + n);
					suma += n.getNota();
				}
				// Media
				salida.println("Nota media: " + suma / a.getMatricula().size());
				salida.flush();
				salida.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void generarBoletinesHTML() {
		double suma = 0.0;
		for (Alumno a : this.getDam()) {
			String nombre = "./html/boletin" + a.getNombre() + a.getApellidos() + ".html";
			File fichero = new File(nombre);
			try {
				suma = 0.0;
				PrintWriter salida = new PrintWriter(fichero);
				salida.println("<html><head><titulo>Boletin Notas</titulo></head><body>");
				salida.println("<h1>*******************IES Ribera del Tajo**************</h1>");
				salida.println("<h2>Curso 1DAM</h2>");
				salida.println("<h3>Alumno/a: " + a.getNombre() + " " + a.getApellidos()+"</h3>");
				// Notas
				salida.println("<table border: 1px;>");
				for (Nota n : a.getMatricula()) {
					salida.println("\t" + n);
					suma += n.getNota();
				}
				salida.println("</table>");
				// Media
				salida.println("<h4>Nota media: " + suma / a.getMatricula().size()+"</h4>");
				salida.flush();
				salida.close();
				salida.println("</body></html>");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws IOException  {
		BoletinNotas b = new BoletinNotas();
		b.cargaInicial();
		int opcion;
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		do {
			System.out.println("1. Leer notas");
			System.out.println("2. Imprimir boletines");
			System.out.println("3. Salir");
			System.out.println("Elige una opci�n:");

			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				for (Alumno a : b.getDam())
					a.cargarNotas();
				break;
			case 2:
				b.generarBoletinesHTML();
				break;
			case 3:
				salir = true;
				break;
			}
		} while (!salir);
	}
}
