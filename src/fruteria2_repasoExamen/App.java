package fruteria2_repasoExamen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class App implements Informe {
	@Override
	public void informeVentas() {
		// TODO Auto-generated method stub
		ArrayList<Cliente> clientes = BD.getInstance().cargarClientes();
		double totalprecio = 0;
		PrintWriter salida;
		try {
			salida= new PrintWriter("VentasAño.txt");
			for(Cliente c: clientes) {
				c.cargarHistorico();
				salida.println("**********Cliente***********");
				for(Pedido p: c.getHistoricoPedidos()) {
					totalprecio+=p.getTotal();
				}
				salida.println(c.getNombre()+" "+c.getApellidos()+" "+totalprecio+"€");
				salida.println("----------------------------");
			}
			salida.flush();
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		App a=new App();
		BD.getInstance().cargarParametrosConexion();
		ArrayList<Cliente> clientes = BD.getInstance().cargarClientes();
		String dni = "";
		double totalp = 0;
		
		for (String arg : args) {
			if (arg.startsWith("--cliente=")) {
				dni = arg.substring("--cliente=".length());
			}
		}
		
		if (args.length != 0) {
//			System.out.println(args[0]);
			for (Cliente cli : clientes) {
				if (cli.getDni().equals(dni)) {
					cli.asignarMetodoPago();
					cli.cargarHistorico();
					System.out.println("Cliente: " + cli.getNombre() + " " + cli.getApellidos());
					System.out.println("Método de pago: " + cli.getMetodoPago());
					System.out.println("Pedidos realizados este año: ");
					for (Pedido p : cli.getHistoricoPedidos()) {
						System.out.println("\t" + p+"€");
						totalp += p.getTotal();
					}
					System.out.println("IMPORTE TOTAL: " + totalp+"€");
				}
			}
		}
		
		if(args.length==0) {
			a.informeVentas();
		}
	}
}
