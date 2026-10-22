package singleton;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {
	public static void main(String[] args) throws Exception {
		String dni="";
		if(args.length>0) {
			System.out.println(args[0]);
			dni=args[0].split("=")[1];
			System.out.println("El dni es: "+dni);
			System.out.println(args[1]);
		}
		
		
		
		Bd.getInstance().setUsuario("jardineria");
		Bd.getInstance().setPassword("jardineria");
		Bd.getInstance().setCadenaConexion("jdbc:oracle:thin:@192.168.12.200:1521:XE");
			
			try {
				ResultSet rset=Bd.getInstance().consultaBD("select count(*) from pedidos");
				
				 while (rset.next())
			         System.out.println ("Son: "+rset.getString(1)); 
				 Bd.getInstance().cerrarConsulta();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
