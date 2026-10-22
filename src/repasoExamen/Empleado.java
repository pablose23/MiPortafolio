package repasoExamen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona{
	private int turno;
	private ArrayList<Pedido1>pedidosAsignados;
	
	public Empleado(String dni, String nombre, String apellidos, String direccion, int turno,
			ArrayList<Pedido1> pedidosAsignados) {
		super(dni, nombre, apellidos, direccion);
		this.turno = turno;
		this.pedidosAsignados = new ArrayList<Pedido1>();
	}

	public Empleado() {
		this.turno = 0;
		this.pedidosAsignados = new ArrayList<Pedido1>();
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public ArrayList<Pedido1> getPedidosAsignados() {
		return pedidosAsignados;
	}

	public void setPedidosAsignados(ArrayList<Pedido1> pedidosAsignados) {
		this.pedidosAsignados = pedidosAsignados;
	}

	@Override
	public String toString() {
		return "Empleado [turno=" + turno + ", pedidosAsignados=" + pedidosAsignados + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + "]";
	}
	
	public void asignarPedidosTurno() {
		File fichero = new File("Pedidos.csv");
		String cadena="";
		String linea[];
		try {
			Scanner entrada= new Scanner(fichero);
			cadena = entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
//				System.out.println(cadena);
				linea = cadena.split(";");
				if(this.turno==1) {
					this.pedidosAsignados.add(new Pedido1(linea[0], linea[1], linea[2], Integer.parseInt(linea[3])));
				}
				if(this.turno==2) {
					this.pedidosAsignados.add(new Pedido1(linea[0], linea[1], linea[2], Integer.parseInt(linea[3])));
					}
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Factura generarFactura(Pedido1 p) {
		String nombre = "Factura" + p.getDniCliente() + ".txt";

		Factura f = new Factura();
		f.setCodigoPedido(Integer.parseInt(p.getCodigoPedido()));
		f.setDniCliente(p.getDniCliente());
		f.setCodigoFactura(p.getCodigoPedido() + "_" + p.getDniCliente());

		PrintWriter salida;
		double sumaTotal = 0;
		double suma;
		double descuento = Double.parseDouble(p.getDescuento());
		try {
		    salida = new PrintWriter(new File(nombre));
		    salida.println("Factura: " + f.getCodigoFactura());
			salida.println("Cliente: "+f.getDniCliente());
			salida.println("************Productos*************");
			f.setProductosPedidos(f.cargarProductos());
			for (ProductoPedido productoPedido : f.getProductosPedidos()) {
				salida.println("\t"+productoPedido.getNombreProducto()+"\t"
						+productoPedido.getPrecioKg()+"€/Kg"+"\t"+productoPedido.getKg()+"Kg \n");
			}
			salida.println("\t\t\t\t TOTAL: "+f.totalSinIVA()+"€");
			salida.println("\t\t\t\t IVA: "+f.ivaReducido()+"€");
			salida.println("\t\t\t\t Descuento "+descuento+"€");
			salida.println("\t\t\t\t IMPORTE TOTAL: "+((f.totalSinIVA() + f.ivaReducido()) - descuento)+"€");
			f.setTotal(f.totalSinIVA() + f.ivaReducido() - descuento);
			salida.flush();
			salida.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
	public static void main(String[] args) {
		Empleado e=new Empleado("15151515P", "Paco", "", "", 2, null);
		e.asignarPedidosTurno();
		Factura f=new Factura();
		BD.getInstance().cargarParámetrosConexion();
		for(Pedido1 p: e.getPedidosAsignados()) {
			//System.out.println(p);
			f=e.generarFactura(p);
			
			try {
				BD.getInstance().consultaBD("delete from Factura");
				BD.getInstance().consultaBD("Insert into Factura values('"+f.getCodigoFactura()+"',"+f.getCodigoPedido()+",'"+f.getDniCliente()+"',"+f.getTotal()+")");
				BD.getInstance().cerrarConsulta();
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Insert into Factura values('"+f.getCodigoFactura()+"',"+f.getCodigoPedido()+",'"+f.getDniCliente()+"',"+f.getTotal()+")");
			
		}
	}
}
