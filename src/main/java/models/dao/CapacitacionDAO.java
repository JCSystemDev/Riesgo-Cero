package models.dao;

import java.util.List;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Interfaces.ICapacitacionDAO;
import models.conexion.Conexion;
import models.dto.CapacitacionDto;

/**
 * 
 * @author lgrey
 *Clase de capacitación con la que se manipulan las consultas sql a la base de datos.
 */

public class CapacitacionDAO implements ICapacitacionDAO {

	@Override
	public void create(CapacitacionDto a) {
		
		String sql = "insert into capacitacion (nombre, detalle,lugar,duracion,cantidad) "
				+ "values ("				
				+ "'" + a.getNombre() + "',"
				+ "'" + a.getDetalle() + "',"				
				+ "'" + a.getLugar() + "',"
				+ "'" + a.getDuracion() + "',"
				+ "'" + a.getCantidad() + "'"				
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
	public List<CapacitacionDto> read() {

		List<CapacitacionDto> lista = new ArrayList<CapacitacionDto>();
		
		try {
			
			Connection conn = Conexion.getConexion();			
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, detalle,lugar,duracion,cantidad from capacitacion";
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
	                        
	            CapacitacionDto a = new CapacitacionDto();		             	
	            a.setIdCapacitacion(result.getInt("id"));          
	            a.setNombre(result.getString("nombre"));
	            a.setDetalle(result.getString("detalle"));	                               
	            a.setLugar(result.getString("lugar"));
	            a.setDuracion(result.getFloat("duracion"));
	            a.setCantidad(result.getInt("cantidad"));
	            lista.add(a);
	        }
			
		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public CapacitacionDto read(int idCap) {

		CapacitacionDto capacitacion = null;
		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, detalle,lugar,duracion,cantidad from capacitacion"
					+ " where id = " + idCap;
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {   			    			    
			        capacitacion = new CapacitacionDto(
			        rs.getInt("id"), 
			        rs.getString("nombre"),
			        rs.getString("detalle"),			       			        
			        rs.getString("lugar"),
			        rs.getFloat("duracion"),
			        rs.getInt("cantidad")
			    );		   
			}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}
		
		return capacitacion;
	}

	@Override
	public void update(CapacitacionDto a) {		
		
		String sql = "update capacitacion set "
				+ "nombre = '" + a.getNombre() + "',"
				+ "detalle = '" + a.getDetalle() + "',"  
				+ "lugar = '" + a.getLugar() + "',"
				+ "duracion = '" + a.getDuracion() + "',"
				+ "cantidad = '" + a.getCantidad() + "'"
				+ " where id = " + a.getIdCapacitacion();
		
		
		
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
	public void delete(int idCap) {
		String sql = "delete from capacitacion where id = " + idCap;
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