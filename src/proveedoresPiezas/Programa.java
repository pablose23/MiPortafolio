package proveedoresPiezas;

import java.io.*;
import java.util.ArrayList;

public class Programa {
	
	private ArrayList<Pieza>piezas;
	private ArrayList<Proveedor>proveedor;
	
	public Programa() {
		this.piezas=new ArrayList<>();
		this.proveedor=new ArrayList<>();
	}
	
	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}


	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}


	public ArrayList<Proveedor> getProveedor() {
		return proveedor;
	}


	public void setProveedor(ArrayList<Proveedor> proveedor) {
		this.proveedor = proveedor;
	}

	public void generarFichero(String filename) {
		PrintWriter salida;
			try {
				salida=new PrintWriter(new File(filename));
				//para cada proveedor cuáles son sus piezas?
				for (Proveedor prov : this.getProveedor()) {
					salida.println("El proveedor "+prov.getNombreProveedor()+" suministra: ");
					for(Pieza p: this.getPiezas()) {
						if(prov.getCodProveedor()==p.getProveedor())
						salida.println("* "+p.getNombrePieza());
					}
				}
				salida.flush();
				salida.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		Programa p=new Programa();
		Utilidades u = new Utilidades();
		p.setPiezas(u.leerPiezas("piezas.csv"));
		p.setProveedor(u.leerProveedor("proveedor.csv"));
		p.generarFichero("proveedorPieza.txt");
	}
}
