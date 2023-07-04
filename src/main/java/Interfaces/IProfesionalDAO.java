package Interfaces;

import java.util.List;
import models.dto.ProfesionalDto;

/**
 * 
 * @author lgrey
 * Interfaz de operacion para los datos de tipo profesional.
 * Se aplica el modelo CRUD.
 */
public interface IProfesionalDAO {
	
	public void create(ProfesionalDto a);
	public List<ProfesionalDto> read();
	public ProfesionalDto read(int id);
	public void update(ProfesionalDto a);
	public void delete(int id);
	

}