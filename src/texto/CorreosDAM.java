package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CorreosDAM {

		ArrayList<String>correos;
		
		public CorreosDAM(){
			this.correos=new ArrayList<String>();
		}

		public ArrayList<String> getCorreos() {
			return correos;
		}

		public void setCorreos(ArrayList<String> correos) {
			this.correos = correos;
		}
		
		public void leerFichero(String nombreFichero) {
			String linea;
			//1. Crear un objeto file con el nombre nombreFichero
			File f=new File(nombreFichero);
			//2. Crear un objeto Scanner asociado a ese fichero
			try {
				Scanner sc=new Scanner(f);
				linea=sc.nextLine();
				linea=sc.nextLine();
				linea=sc.nextLine();
				linea=sc.nextLine();
				linea=sc.nextLine();
				while(sc.hasNext()) {
					linea=sc.nextLine();
					this.correos.add(linea);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}	
		}
		
		public void escribirFichero() {
			PrintWriter salida;
			try {
				salida = new PrintWriter(new File("salida.txt"));
				for (String correo : this.getCorreos()) {
					salida.println(correo);
				}
				salida.flush();
				salida.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			CorreosDAM c=new CorreosDAM();
			c.leerFichero("dam.csv");
			c.setCorreos(c.getCorreos());
			c.escribirFichero();
		}

		private ArrayList<String> obtenerCorreos() {
			ArrayList<String>nuevo=new ArrayList<String>();
			//nombre.apellido1apellido2@riberadeltajo.es
			String[]linea;
			for (String nombre : this.getCorreos()) {
				linea=nombre.split(",");
				System.out.println(linea[1].toLowerCase().replace("é", "e").replace("á", "a")
						.replace(";", "").replace(" ", "")
						+"."+linea[0].replace("ó", "o").replace("í", "i").replace(" ", "")
						.toLowerCase().replace("é", "e").replace("á", "a").replace("ñ", "n")
						+"@riberadeltajo.es");
			}
			return nuevo;
		}
}
