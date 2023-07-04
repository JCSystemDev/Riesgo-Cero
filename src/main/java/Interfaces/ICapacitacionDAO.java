package Interfaces;

import java.util.List;


import models.dto.CapacitacionDto;

/**
 * 
 * @author lgrey
 * Interfaz de operacion para los datos de tipo capacitación.
 * Se aplica el modelo CRUD.
 */
public interface ICapacitacionDAO {

	/**
	 * C = Create
	 * R = Read
	 * U = Update
	 * D = Delete
	 */
	
	public void create(CapacitacionDto a);
	public List<CapacitacionDto> read();
	public CapacitacionDto read(int id);
	public void update(CapacitacionDto a);
	public void delete(int id);
}