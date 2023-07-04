package models.services;

import java.util.List;
import Interfaces.IClienteDAO;
import models.dao.ClienteDAO;
import models.dto.ClienteDto;
/**
 * 
 * @author lgrey
 *Clase de servicio cliente donde se implementa la interfaz en la manipulación de los CRUD.
 */
public class ClienteService {
	
	private IClienteDAO clienteDAO = new ClienteDAO();
	
	
	public ClienteService() {		
	}
	
	
	public List<ClienteDto> findAll(){
		
		return clienteDAO.read();	
	}
	
	public ClienteDto findOne(int idUsuario) {
		return clienteDAO.read(idUsuario);	
	}
	
	public void update(ClienteDto a) {
		clienteDAO.update(a);
	}
	
	public void create(ClienteDto a) {
		clienteDAO.create(a);
	}
	
	public void delete(int id) {
		clienteDAO.delete(id);
	}
}
