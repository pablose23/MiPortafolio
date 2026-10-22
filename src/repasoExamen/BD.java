package repasoExamen;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import singleton.Bd;

public class BD {
	private static BD miInstancia = null;
	private static boolean permitirInstancianueva;
	private String cadenaConexion;
	private String usuario;
	private String password;
	private Connection conn;
	private Statement stmt;

	BD() throws Exception {
		if (!permitirInstancianueva)
			throw new Exception("No se puede crear otro objeto. Utiliza getInstance()");
	}

	public static BD getInstance() {
		if (miInstancia == null) {
			permitirInstancianueva = true;
			try {
				miInstancia = new BD();
			} catch (Exception e) {
				// TODO: handle exception
			}
			permitirInstancianueva = false;
		}
		return miInstancia;
	}

	public ResultSet consultaBD(String consulta) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		conn = DriverManager.getConnection(cadenaConexion, usuario, password);
		stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(consulta);
		return rset;
	}

	public void cerrarConsulta() throws SQLException {
		stmt.close();
	}

	public String getCadenaConexion() {
		return cadenaConexion;
	}

	public void setCadenaConexion(String cadenaConexion) {
		this.cadenaConexion = cadenaConexion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public void cargarParámetrosConexion() {
		String cadena="";
		String linea[];
		File fichero= new File("configTienda.txt");
		try {
			Scanner entrada= new Scanner(fichero);
			while(entrada.hasNext()) {
			cadena = entrada.nextLine();
			linea = cadena.split("-");
			this.setCadenaConexion(linea[0]);
			this.setUsuario(linea[1]);
			this.setPassword(linea[2]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No existe");
		}
	}
	
	public ArrayList<Empleado>cargarEmpleados(){
		ArrayList<Empleado>empleados=new ArrayList<>();
		
		try {
			ResultSet rset = BD.getInstance().consultaBD("select * from persona where turno!=0");

			while (rset.next()) {
				empleados.add(new Empleado(rset.getString(1), rset.getString(2), rset.getString(3),
						rset.getString(4), rset.getInt(5), null));
			}
			BD.getInstance().cerrarConsulta();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleados;
	}
}
