package repasoExamen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fruteria2_repasoExamen.Cliente;
import fruteria2_repasoExamen.Pedido;

public class App1 {
	
	public static void main(String[] args) {
		App1 a=new App1();
		BD.getInstance().cargarParámetrosConexion();
		ArrayList<Empleado>empleados=BD.getInstance().cargarEmpleados();
		String dni = "";
		for (String arg : args) {
			if (arg.startsWith("--empleado=")) {
				dni = arg.substring("--empleado=".length());
			}
		}
		
		if (args.length != 0) {
//			System.out.println(args[0]);
			for (Empleado emp : empleados) {
				Factura f=new Factura();
				if (emp.getDni().equals(dni)) {
					emp.asignarPedidosTurno();
					emp.asignarPedidosTurno();
					int contador=0;
					for(Pedido1 p: emp.getPedidosAsignados()) {
						f=emp.generarFactura(p);
						contador++;
					}
					System.out.println("El empleado " + emp.getNombre() + " con DNI " + emp.getDni() + " prepara " + contador + " pedidos.");
				}
			}
		}
		
		if(args.length==0) {
			for (Empleado emp : empleados) {
				Factura f=new Factura();
				System.out.print("El empleado "+emp.getNombre()+" con DNI "+emp.getDni());
				emp.asignarPedidosTurno();
				int contador=0;
				for(Pedido1 p: emp.getPedidosAsignados()) {
					f=emp.generarFactura(p);
					contador++;
				}
				System.out.println(" prepara "+contador+" pedidos");
			}
		}
	}
}
