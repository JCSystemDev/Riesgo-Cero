package models.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author lgrey
 *Clase con la que se genera la conección con la base de datos.
 */

public class Conexion {
	
	private static Connection connection = null;
	
	private Conexion() {
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver"); // para Oracle
			Class.forName("com.mysql.cj.jdbc.Driver");// para MySQL
			// url de la base de datos: jdbc:mysql://<host_base_de_datos>:<port>/<nombre_base_de_datos>
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prevencion", "root", "Jalisco1975");	
			
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static Connection getConexion() {
		if (connection == null) {
			new Conexion();
		}	
		return connection;
	}
}