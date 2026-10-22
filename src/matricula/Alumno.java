package matricula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona{
	
	private ArrayList<Nota> matricula;

	public Alumno(int codigo, String dNI, String nombre, String apellidos) {
		super(codigo, dNI, nombre, apellidos);
		matricula=new ArrayList<>();
		
	}
	
	
	public void addModulo(Nota n) {
		this.matricula.add(n);
	}
	
	public ArrayList<Nota> getMatricula() {
		return matricula;
	}



	public void setMatricula(ArrayList<Nota> matricula) {
		this.matricula = matricula;
	}



	public void listarNotas() {
		for(Nota m: this.matricula) {
			System.out.println("\t"+m);
		}
	}

	
	public void cargarNotas() throws FileNotFoundException {
		File ficheroTexto=new File("matricula.csv");
		Scanner entrada=new Scanner(ficheroTexto);
		String cadena="";
		String []linea;
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			if(Integer.parseInt(linea[2])==this.getCodigo())
				this.getMatricula().add(new Nota(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3])));
			
		}
		
		
		entrada.close();
		
	}
	
	
	
	@Override
	public String toString() {
		return "Alumno: codigo=" + codigo + ", DNI=" + DNI + ", nombre=" + nombre
				+ ", apellidos=" + apellidos;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Alumno a=new Alumno(501, "123", "dfa", "adfa");
		a.cargarNotas();
		for (Nota n:a.getMatricula()) {
			System.out.println(n);
		}

	}

}
