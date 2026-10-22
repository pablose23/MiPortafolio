package proveedoresPiezas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
	public ArrayList<Pieza>leerPiezas(String filename){
		ArrayList<Pieza>pie=new ArrayList<Pieza>();
		File f=new File (filename);
		try {
			Scanner entrada=new Scanner(new File(filename));
			String linea[];
			String cadena="";
			
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				//System.out.println(cadena);
				linea=cadena.split(";");
				pie.add(new Pieza(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]),Double.parseDouble(linea[3])));
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("No existe");
		}
		return pie;
	}
	
	public ArrayList<Proveedor>leerProveedor(String filename){
		ArrayList<Proveedor>pro=new ArrayList<>();
		File f1=new File (filename);
		try {
			Scanner entrada1=new Scanner(new File(filename));
			String linea1[];
			String cadena1="";
			
			cadena1=entrada1.nextLine();
			while(entrada1.hasNext()) {
				cadena1=entrada1.nextLine();
				//System.out.println(cadena1);
				linea1=cadena1.split(";");
				pro.add(new Proveedor(Integer.parseInt(linea1[0]),linea1[1], linea1[2]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("No existe");
		}
		return pro;
	}
}
