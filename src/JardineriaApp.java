import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class JardineriaApp {

	public void menu() {
		System.out.println("1. Crear pedidos.csv");
		System.out.println("2. Crear detalles.csv");
		System.out.println("3. Cargar productos");
		System.out.println("4. Consultar pedidos");
		System.out.println("5. Salir");
		System.out.println("Elige una opción: ");
	}

	public void generarPedidos() throws FileNotFoundException {

	}

	public static void main(String[] args) throws FileNotFoundException {
		JardineriaApp j1 = new JardineriaApp();
		Scanner t = new Scanner(System.in);
		int opcion = 0;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jardineria",
					"jardineria");

			Statement stmt = conn.createStatement();

			do {
				j1.menu();
				opcion = t.nextInt();
				switch (opcion) {
				case 1:
					ResultSet rset = stmt.executeQuery("select codigopedido, estado, codigocliente from pedidos");
					PrintWriter salida;
					salida = new PrintWriter("pedidos.csv");
					salida.println("codigoPedido;Estado;codigoCliente");
					while (rset.next()) {
						salida.println(rset.getString(1) + ";" + rset.getString(2) + ";" + rset.getString(3));
					}
					salida.flush();
					salida.close();
					stmt.close();
					break;
				case 2:
					ResultSet rsetd = stmt.executeQuery("select * from detallepedidos");
					PrintWriter salidad;
					salida = new PrintWriter("detalle.csv");
					salida.println("codigoPedido;codigoProducto;Cantidad;precioUnidad;numeroLinea");
					while (rsetd.next()) {
						salida.println(rsetd.getString(1) + ";" + rsetd.getString(2) + ";" + rsetd.getString(3) + ";"
								+ rsetd.getString(4) + ";" + rsetd.getString(5));
					}
					salida.flush();
					salida.close();
					stmt.close();
					break;
				case 3:
					ArrayList<Productos> productos = new ArrayList<Productos>();
					ResultSet rsetp = stmt.executeQuery("select * from productos where CANTIDADENSTOCK>100");
					while (rsetp.next()) {
						productos.add(new Productos(rsetp.getString(1), rsetp.getString(2), rsetp.getString(3),
								rsetp.getString(4), rsetp.getString(5), rsetp.getString(6),
								Integer.parseInt(rsetp.getString(7)), Integer.parseInt(rsetp.getString(8)),
								Integer.parseInt(rsetp.getString(9))));
					}
					//System.out.println(productos);
					break;
				case 4:
					
					break;
				case 5:

					break;
				}
			} while (opcion != 5);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}