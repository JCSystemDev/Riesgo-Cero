package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Interfaces.IUsuarioDAO;
import models.conexion.Conexion;
import models.dto.UsuarioDto;

/**
 * 
 * @author lgrey
 *Clase de usuario con la que se manipulan las consultas sql a la base de datos.
 */

public class UsuarioDAO implements IUsuarioDAO {

	@Override
	public void create(UsuarioDto a) {
		
		String sql = "insert into usuario (nombre, username,password) "
				+ "values ("
				+ " '" + a.getNombre() + "',"
				+ " '" + a.getUsername() + "',"
				+ " '" + a.getPassword() + "'"				
				+ ")";
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
	public List<UsuarioDto> read() {
		List<UsuarioDto> lista = new ArrayList<UsuarioDto>();
		
		try {
			
			Connection conn = Conexion.getConexion();			
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, username,password from usuario";
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
	                        
	            UsuarioDto a = new UsuarioDto();		             	
	            a.setIdUsuario(result.getInt("id"));          
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
	public UsuarioDto read(int id) {
		UsuarioDto usuario = null;		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, username,password from usuario where id = " + id;
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {   			    			    
			        usuario = new UsuarioDto(
			        rs.getInt("id"), 
			        rs.getString("nombre"),
			        rs.getString("username"),
			        rs.getString("password")
			    );		   
			}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}
		
		return usuario;
	}

	@Override
	public void update(UsuarioDto a) {
		
		String sql = "update usuario set "
				+ "nombre = '" + a.getNombre() + "',"
				+ "username = '" + a.getUsername() + "',"  
				+ "password = '" + a.getPassword() + "'"
				+ " where id = " + a.getIdUsuario();		
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
		String sql = "delete from usuario where id = " + id;
		try {
		
			Connection conn = Conexion.getConexion();
			Statement st = conn.createStatement();
			st.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error en método delete");
			e.printStackTrace();
		}
		
	}

	@Override
	public UsuarioDto findByUsername(String username) {
		UsuarioDto usuario = null;		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, username, password from usuario where username = " + "'" + username + "'";
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {   			    			    
			        usuario = new UsuarioDto(
			        rs.getInt("id"), 
			        rs.getString("nombre"),
			        rs.getString("username"),
			        rs.getString("password")
			    );		   
			}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(username)");
			e.printStackTrace();
		}
		
		return usuario;
	}

}
