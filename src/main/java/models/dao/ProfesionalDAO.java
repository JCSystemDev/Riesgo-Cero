package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Interfaces.IProfesionalDAO;
import models.conexion.Conexion;
import models.dto.ProfesionalDto;

/**
 * 
 * @author lgrey
 *Clase de profesional con la que se manipulan las consultas sql a la base de datos.
 */

public class ProfesionalDAO implements IProfesionalDAO {

	@Override
	public void create(ProfesionalDto p) {
		String sql = "insert into profesional (run, nombre, apellido, correo, telefono, cargo) "
						+ "values ("
						+ " '" + p.getRun() + "',"
						+ " '" + p.getNombreProfesional() + "',"
						+ " '" + p.getApellidoProfesional() + "',"
						+ " '" + p.getCorreo() + "',"
						+ " '" + p.getTelefono() + "',"
						+ " '" + p.getCargo() + "'"					
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
	public List<ProfesionalDto> read() {
		List<ProfesionalDto> lista = new ArrayList<ProfesionalDto>();
		
		try {
			
			Connection conn = Conexion.getConexion();			
			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, telefono, cargo from profesional";
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
	                        
	            ProfesionalDto p = new ProfesionalDto();		             	
	            p.setIdProfesional(result.getInt("id"));          
	            p.setRun(result.getString("run"));
	            p.setNombreProfesional(result.getString("nombre"));
	            p.setApellidoProfesional(result.getString("apellido"));
	            p.setCorreo(result.getString("correo"));
	            p.setTelefono(result.getString("telefono"));
	            p.setCargo(result.getString("cargo"));            
	            
	            lista.add(p);
	        }
			
		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public ProfesionalDto read(int id) {
		
		ProfesionalDto profesional = null;
		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, telefono, cargo from profesional where id = " + id;
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) { 
				profesional = new ProfesionalDto(
				rs.getInt("id"),
				rs.getString("run"),
				rs.getString("nombre"),
				rs.getString("apellido"),
				rs.getString("correo"),
				rs.getString("telefono"),
				rs.getString("cargo")				
				);
				}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}
		
		return profesional;
	}

	@Override
	public void update(ProfesionalDto a) {
		
		String sql = "update profesional set "
				+ "run = '" + a.getRun() + "', "
				+ "nombre = '" + a.getNombreProfesional() + "', "
				+ "apellido = '" + a.getApellidoProfesional() + "', "
				+ "correo = '" + a.getCorreo() + "', "
				+ "telefono = '" + a.getTelefono() + "', "
				+ "cargo = '" + a.getCargo() + "'"				
				+ " where id = " + a.getIdProfesional();
		
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
		String sql = "delete from profesional where id = " + id;
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