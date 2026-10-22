package repasoExamen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura implements Impuestos{
	private String codigoFactura;
	private int codigoPedido;
	private String dniCliente;
	private ArrayList<ProductoPedido>productosPedidos;
	private double total;
	
	public Factura(String codigoFactura, int codigoPedido, String dniCliente,
			ArrayList<ProductoPedido> productosPedidos, double total) {
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.productosPedidos = productosPedidos;
		this.total = total;
	}

	public Factura() {
		this.codigoFactura = "";
		this.codigoPedido = 0;
		this.dniCliente = "";
		this.productosPedidos = new ArrayList<ProductoPedido>();
		this.total = 0;
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public ArrayList<ProductoPedido> getProductosPedidos() {
		return productosPedidos;
	}

	public void setProductosPedidos(ArrayList<ProductoPedido> productosPedidos) {
		this.productosPedidos = productosPedidos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", codigoPedido=" + codigoPedido + ", dniCliente="
				+ dniCliente + ", productosPedidos=" + productosPedidos + ", total=" + total + "]";
	}

	public ArrayList<ProductoPedido> cargarProductos() throws IOException{
		File fichero = new File("ProductosPedidos.csv");
		Scanner entrada = new Scanner(fichero);
		String cadena="";
		String linea[];
		cadena = entrada.nextLine();
		while (entrada.hasNext()) {
			cadena = entrada.nextLine();
//			System.out.println(cadena);
			linea = cadena.split(";");
			if(this.codigoPedido==Integer.parseInt(linea[0])) {
				this.productosPedidos.add(new ProductoPedido(Integer.parseInt(linea[0]), 
					Integer.parseInt(linea[1]), linea[2], linea[3], linea[4], 
					Double.parseDouble(linea[5]), Double.parseDouble(linea[6])));
			}
		}
		entrada.close();
		
		return productosPedidos;
	}
	
	@Override
	public double ivaReducido() {
		return this.total*0.04;
	}

	@Override
	public double totalSinIVA() {
		double total=0;
		for(ProductoPedido p: this.productosPedidos) {
			total+=p.getPrecioKg()*p.getKg();
		}
		this.total=total;
		return total;
	}
	
}
