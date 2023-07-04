package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import models.conexion.Conexion;
import models.dto.RegistroDto;
import Interfaces.IRegistroDAO;

/**
 * 
 * @author lgrey
 *Clase de registro con la que se manipulan las consultas sql a la base de datos.
 */

public class RegistroDAO implements IRegistroDAO  {
	@Override
	public void create(RegistroDto a) {
		String sql = "insert into usuarios (nombre,username,password) values "
				+ "('" + a.getNombre() + "', '" + a.getUsername()+ a.getPassword() + "')";
		try {
			
			Connection cnn = Conexion.getConexion();
			Statement st = cnn.createStatement();
			st.execute(sql);				
			
		} catch (SQLException e) {
			System.out.println("Error en método create");
			e.printStackTrace();
		}	
		
	}

	@Override
	public List<RegistroDto> read() {
		List<RegistroDto> lista = new ArrayList<RegistroDto>();
		
		try {
			
			Connection conn = Conexion.getConexion();			
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, tipo from usuarios";
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
	                        
	            RegistroDto a = new RegistroDto();		             	
	            a.setIdRegistro(result.getInt("id"));          
	            a.setNombre(result.getString("nombre"));
	            a.setUsername(result.getString("username")); 
	            a.setPassword(result.getString("password")); 
	            
	            lista.add(a);
	        }
			
		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public RegistroDto read(int id) {
		RegistroDto registro = null;		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, username,password from usuarios where id = " + id;
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {   			    			    
			        registro = new RegistroDto(
			        rs.getInt("id"), 
			        rs.getString("nombre"),
			        rs.getString("username"),  
			        rs.getString("tipo")  
			    );		   
			}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}
		
		return registro;
	}

	@Override
	public void update(RegistroDto a) {
		String sql = "update usuarios set nombre = '" + a.getNombre() + "', usuario = '" +  
				a.getUsername() + "', password = '" + a.getPassword() + "' where id = " + a.getIdRegistro();		
		
				try {
					
					Connection conn = Conexion.getConexion();
					Statement statement = conn.createStatement();
					System.out.println(sql);
					statement.execute(sql);
					
					
				} catch (SQLException e) {
					System.out.println("Erorr en método update");
					e.printStackTrace();
				}	
		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from usuarios where id = " + id;
		try {
		
			Connection conn = Conexion.getConexion();
			Statement st = conn.createStatement();
			st.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error en método delete");
			e.printStackTrace();
		}
		
	}

}
