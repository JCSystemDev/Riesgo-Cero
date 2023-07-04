package models.services;
import java.util.List;
import models.dao.ProfesionalDAO;
import models.dto.ProfesionalDto;
import Interfaces.IProfesionalDAO;
/**
 * 
 * @author lgrey
 *Clase de servicio profesional donde se implementa la interfaz en la manipulación de los CRUD.
 */
public class ProfesionalService {
	
	private IProfesionalDAO profesionalDAO = new ProfesionalDAO();
	
	
	public ProfesionalService() {		
	}
	
	public List<ProfesionalDto> findAll(){
		
		return profesionalDAO.read();	
	}
	
	public ProfesionalDto findOne(int idUsuario) {
		return profesionalDAO.read(idUsuario);	
	}
	
	public void update(ProfesionalDto a) {
		profesionalDAO.update(a);
	}
	
	public void create(ProfesionalDto a) {
		profesionalDAO.create(a);
	}
	
	public void delete(int id) {
		profesionalDAO.delete(id);
	}

}
