package models.services;
import java.util.List;
import models.dto.CapacitacionDto;
import models.dao.CapacitacionDAO;
import Interfaces.ICapacitacionDAO;
/**
 * 
 * @author lgrey
 *Clase de servicio capacitación donde se implementa la interfaz en la manipulación de los CRUD.
 */
public class CapacitacionService {
	
	
	
	private ICapacitacionDAO capacitacionDAO = new CapacitacionDAO();
	
	
	public CapacitacionService() {		
	}
	
	public List<CapacitacionDto> findAll(){
		
		return capacitacionDAO.read();	
	}
	
	public CapacitacionDto findOne(int idCapacitacion) {
		return capacitacionDAO.read(idCapacitacion);
		
	
	}
	
	public void update(CapacitacionDto a) {
		capacitacionDAO.update(a);
	}
	
	public void create(CapacitacionDto a) {
		capacitacionDAO.create(a);
	}
	
	public void delete(int id) {
		capacitacionDAO.delete(id);
	}
}
