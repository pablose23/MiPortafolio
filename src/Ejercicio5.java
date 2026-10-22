
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio5 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jardineria",
					"jardineria");

			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select codigoCliente, nombreContacto, apellidocontacto, telefono  from clientes");
			PrintWriter salida;
			salida = new PrintWriter("index.html");
			salida.println("<html><head><title>Conctatos de Clientes</title></head><body class=container>");
			salida.println("<h1>Conctatos de Clientes</h1>");
			salida.println("<table border= 1px solid> ");
			while (rset.next()) {
				salida.println("<tr>");
				salida.println("<td>" + rset.getString(1) + "</td>");
				salida.println("<td>" + rset.getString(2) + "</td>");
				salida.println("<td>" + rset.getString(3) + "</td>");
				salida.println("<td>" + rset.getString(4) + "</td>");
				salida.println("</tr>");
			}
			salida.println("</table></body></html>");
			salida.println("<style>.container{width:55%;margin:0 auto;}table{border:1px solid black;margin-top:3em;width:900px;background-color:rgb(174,232,243);}"
					+ "td{text-align:center;height:17px;border:1px solid black;}"
					+ "th{text-align:center;height:17px;border:1px solid black;color:#001247;}</style>");
			salida.flush();
			salida.close();
			stmt.close();

		} catch (SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
