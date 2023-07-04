package models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Interfaces.IClienteDAO;
import models.conexion.Conexion;
import models.dto.ClienteDto;

/**
 * 
 * @author lgrey
 *Clase de cliente con la que se manipulan las consultas sql a la base de datos.
 */
public class ClienteDAO implements IClienteDAO {

	@Override
	public void create(ClienteDto a) {
		String sql = "insert into cliente (rut, nombre, apellido, correo, telefono, afp, sistema_salud, "
				+ "direccion, comuna, edad) "
						+ "values ("						
						+ " '" + a.getRun() + "',"
						+ " '" + a.getNombreCliente() + "',"
						+ " '" + a.getApellidoCliente() + "',"
						+ " '" + a.getCorreo() + "',"
						+ " '" + a.getTelefono() + "',"
						+ " '" + a.getAfp() + "',"
						+ " '" + a.getSistemaSalud() + "',"
						+ " '" + a.getDireccion() + "',"
						+ " '" + a.getComuna() + "',"
						+ " '" + a.getEdad() + "'"
						
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
	public List<ClienteDto> read() {
		List<ClienteDto> lista = new ArrayList<ClienteDto>();
		
		try {
			
			Connection conn = Conexion.getConexion();			
			Statement statement = conn.createStatement();
			String sql = "select id, rut, nombre, apellido, correo, telefono, afp, "
					+ "sistema_salud, direccion, comuna, edad, usuario_id from cliente";
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
	                        
	            ClienteDto a = new ClienteDto();		             	
	            a.setIdCliente(result.getInt("id"));          
	            a.setRun(result.getString("rut"));
	            a.setNombreCliente(result.getString("nombre"));
	            a.setApellidoCliente(result.getString("apellido"));
	            a.setCorreo(result.getString("correo"));
	            a.setTelefono(result.getString("telefono"));
	            a.setAfp(result.getString("afp"));
	            a.setSistemaSalud(result.getString("sistema_salud"));
	            a.setDireccion(result.getString("direccion"));
	            a.setComuna(result.getString("comuna"));
	            a.setEdad(result.getInt("edad"));
	           
	            
	            lista.add(a);
	        }
			
		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public ClienteDto read(int id) {
		
		ClienteDto cliente = null;
		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id,rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad, usuario_id from cliente where id = " + id;
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) { 
				cliente = new ClienteDto(
				rs.getInt("id"),
				rs.getString("rut"),
				rs.getString("nombre"),
				rs.getString("apellido"),
				rs.getString("correo"),
				rs.getString("telefono"),
				rs.getString("afp"),
				rs.getString("sistema_salud"),
				rs.getString("direccion"),
				rs.getString("comuna"),
				rs.getInt("edad")
				
				);
				}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}
		
		return cliente;
	}

	@Override
	public void update(ClienteDto a) {
		String sql = "update cliente set "
				+ "rut = '" + a.getRun() + "', "
				+ "nombre = '" + a.getNombreCliente() + "', "
				+ "apellido = '" + a.getApellidoCliente() + "', "
				+ "correo = '" + a.getCorreo() + "', "
				+ "telefono = '" + a.getTelefono() + "', "
				+ "afp = '" + a.getAfp() + "',"
				+ "sistema_salud = '" + a.getSistemaSalud() + "',"
				+ "direccion = '" + a.getDireccion() + "',"
				+ "comuna = '" + a.getComuna() + "',"
				+ "edad = '" + a.getEdad() + "'"
				+ " where id = " + a.getIdCliente();
		
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
		String sql = "delete from cliente where id = " + id;
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
