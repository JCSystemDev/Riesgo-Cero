package models.services;

import java.util.List;

import models.dao.UsuarioDAO;
import models.dto.UsuarioDto;
import Interfaces.IUsuarioDAO;
/**
 * 
 * @author lgrey
 *Clase de servicio usuario donde se implementa la interfaz en la manipulación de los CRUD.
 */
public class UsuariosServicio {
	
	
	
	private IUsuarioDAO usuarioDAO = new UsuarioDAO();
	
	
	public UsuariosServicio() {		
	}
	
	public List<UsuarioDto> findAll(){
		
		return usuarioDAO.read();	
	}
	
	public UsuarioDto findOne(int idUsuario) {
		return usuarioDAO.read(idUsuario);	
	}
	
	public void update(UsuarioDto a) {
		usuarioDAO.update(a);
	}
	
	public void create(UsuarioDto a) {
		usuarioDAO.create(a);
	}
	
	public void delete(int id) {
		usuarioDAO.delete(id);
	}

}
