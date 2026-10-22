package singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Bd {
	private static Bd miInstancia=null;
	private static boolean permitirInstancianueva;
	private String cadenaConexion;
	private String usuario;
	private String password;
	private Connection conn;
	private Statement stmt;


	Bd() throws Exception {
		if(!permitirInstancianueva)
			throw new Exception("No se puede crear otro objeto. Utiliza getInstance()");
	}

	public static Bd getInstance() {
		if(miInstancia==null) {
			permitirInstancianueva=true;
			try {
				miInstancia=new Bd();
			} catch (Exception e) {
				// TODO: handle exception
			}
			permitirInstancianueva=false;
		}
		return miInstancia;
	}

	 public  ResultSet consultaBD(String consulta) throws SQLException {
		 DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		 conn = DriverManager.getConnection(cadenaConexion, usuario, password);
		  stmt = conn.createStatement();
		  ResultSet rset =stmt.executeQuery(consulta);
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

}
