package fruteria2_repasoExamen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona {
	private String metodoPago;
	private ArrayList<Pedido> historicoPedidos;

	public Cliente(String dni, String nombre, String apellidos, String direccion, String metodoPago,
			ArrayList<Pedido> historicoPedidos) {
		super(dni, nombre, apellidos, direccion);
		this.metodoPago = metodoPago;
		this.historicoPedidos = new ArrayList<>();
	}

	public Cliente() {
		this.metodoPago = "";
		this.historicoPedidos = new ArrayList<>();
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public ArrayList<Pedido> getHistoricoPedidos() {
		return historicoPedidos;
	}

	public void setHistoricoPedidos(ArrayList<Pedido> historicoPedidos) {
		this.historicoPedidos = historicoPedidos;
	}

	@Override
	public String toString() {
		return "cliente metodoPago=" + metodoPago + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion;
	}

	public void asignarMetodoPago() {
		File f = new File("metodoPagoCliente.csv");
		String cadena = "";
		String linea[];
		try {
			Scanner entrada = new Scanner(f);
			cadena = entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
//				System.out.println(cadena);
				linea = cadena.split(";");
				if (linea[0].equals(this.getDni())) {
					this.setMetodoPago(linea[1]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cargarHistorico() {
		File fichero = new File("Pedidos2022.csv");
		String cadena = "";
		String linea[];
		try {
			Scanner entrada = new Scanner(fichero);
			cadena = entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
//				System.out.println(cadena);
				linea = cadena.split(";");
				if (this.dni.equals(linea[1])) {
					this.historicoPedidos
							.add(new Pedido(Integer.parseInt(linea[0]), linea[1], Double.parseDouble(linea[2])));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
