package Interfaces;

import java.util.List;

import models.dto.RegistroDto;

/**
 * 
 * @author lgrey
 * Interfaz de operacion para los datos de tipo registro.
 * Se aplica el modelo CRUD.
 */

public interface IRegistroDAO {
	public void create(RegistroDto a);
	public List<RegistroDto> read();
	public RegistroDto read(int id);
	public void update(RegistroDto a);
	public void delete(int id);
}
