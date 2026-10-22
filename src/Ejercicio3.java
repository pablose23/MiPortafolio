import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio3 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE", "jardineria", "jardineria");
			
			Statement stmt=conn.createStatement();
			ResultSet rset= stmt.executeQuery("select nombre, apellido1 || apellido2 \"apellidos\", email from empleados where nombre like 'Alberto' and apellido1 like 'Soria' ");
			
			while(rset.next()) {
				System.out.println(rset.getString(1)+" "+rset.getString(2)+" "+rset.getString(3));
			}
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
