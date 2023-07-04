package models.services;

import java.util.List;
import models.dao.RegistroDAO;
import models.dto.RegistroDto;
import Interfaces.IRegistroDAO;
/**
 * 
 * @author lgrey
 *Clase de servicio registro donde se implementa la interfaz en la manipulación de los CRUD.
 */


public class RegistroServicio {
	
	private IRegistroDAO registroDAO = new RegistroDAO();
	
	
	public RegistroServicio() {		
	}
	
	public List<RegistroDto> findAll(){
		
		return registroDAO.read();	
	}
	
	public RegistroDto findOne(int idRegistro) {
		return registroDAO.read(idRegistro);	
	}
	
	public void update(RegistroDto a) {
		registroDAO.update(a);
	}
	
	public void create(RegistroDto a) {
		registroDAO.create(a);
	}
	
	public void delete(int id) {
		registroDAO.delete(id);
	}
	

}
