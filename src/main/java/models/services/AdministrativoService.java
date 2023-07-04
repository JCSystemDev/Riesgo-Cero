package models.services;
import java.util.List;
import models.dao.AdministrativoDAO;
import models.dto.AdministrativoDto;
import Interfaces.IAdministrativoDAO;

/**
 * 
 * @author lgrey
 *Clase de servicio administrativo donde se implementa la interfaz en la manipulación de los CRUD.
 */
public class AdministrativoService {	
	
	private IAdministrativoDAO administrativoDAO = new AdministrativoDAO();
	
	public AdministrativoService() {		
	}
	
	public List<AdministrativoDto> findAll(){
		
		return administrativoDAO.read();	
	}
	
	public AdministrativoDto findOne(int idUsuario) {
		return administrativoDAO.read(idUsuario);	
	}
	
	public void update(AdministrativoDto a) {
		administrativoDAO.update(a);
	}
	
	public void create(AdministrativoDto a) {
		administrativoDAO.create(a);
	}
	
	public void delete(int id) {
		administrativoDAO.delete(id);
	}
}
