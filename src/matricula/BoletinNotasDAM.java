package matricula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class BoletinNotasDAM {
	private ArrayList<Alumno>dam;
	
	public BoletinNotasDAM() {
		this.dam=new ArrayList<>();
	}
	
	public void cargaInicial() throws IOException {
		
		File fichero=new File("Alumnos.csv");
		Scanner entrada=new Scanner(fichero);
		String cadena="";
		String []linea;
		
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
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
	double suma=0.0;
	for(Alumno a: this.getDam()) {
		String nombre="./boletin/Boletin"+a.getNombre()+a.getApellidos()+".txt";
		File fichero=new File(nombre);
		try {
			suma=0.0;
			PrintWriter salida=new PrintWriter(fichero);
			salida.println("*******************IES Ribera del Tajo**************");
			salida.println("Curso 1DAM");
			salida.println("Alumno/a: "+a.getNombre()+" "+a.getApellidos());
			//Notas
			for(Nota n: a.getMatricula()) {
				salida.println("\t"+n);
				suma+=n.getNota();
			}
			//Media
			salida.println("Nota media: "+suma/a.getMatricula().size());
			salida.flush();
			salida.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}

public void generarBoletinesHTML() throws FileNotFoundException {
	double precio=0.0;
	
	for(Alumno a: this.getDam())
	{
		//Generar un fichero
		String nombreFichero="./html/Boletin"+a.getNombre()+a.getApellidos()+".html";
		File f=new File(nombreFichero);
		PrintWriter salida=new PrintWriter(f);
		salida.println("<html><head><title>Boletin Notas</title></head><body>");
		salida.println("<h2>*************IES RIBERA DEL TAJO******************</h2> ");
		salida.println("<h2>Curso 1DAM</h2>");
		salida.println("<h1>"+a.getNombre()+" "+a.getApellidos()+"</h1>" );
		
		
		salida.println("<table border=1>");
		for(Nota n: a.getMatricula()) {
			salida.println("<tr><td>"+n+"</tr></td>");
		}
		salida.println("</table>");
		double suma=0.0;
		int cont=0;
		salida.println("<p>");
		for(Nota n: a.getMatricula())
		{
			suma+=n.getNota();
			cont++;
		}
		salida.println("</p>");
		salida.println("<h2>Nota media: "+(suma/cont)+"</h2>");
		
		
		salida.flush();
	}
}


	public static void main(String[] args) throws IOException {
		BoletinNotasDAM b=new BoletinNotasDAM();
		b.cargaInicial();
		
		int opcion;
		Scanner sc=new Scanner(System.in);
		boolean salir=false;
		do {
			System.out.println("1. Leer notas");
			System.out.println("2. Imprimir boletines");
			System.out.println("3. Salir");
			System.out.println("Elige una opción:");
			
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				for(Alumno a:b.getDam())
					a.cargarNotas();
				
				break;
			
			case 2:
				b.generarBoletines();
				break;
			case 3:
				salir=true;
				break;
			
			}
			
		
			
		}while(!salir);
		
		
		
		
	}

}
