package Interfaces;

import java.util.List;

import models.dto.AdministrativoDto;

/**
 * @author lgrey
 * Interfaz de operacion para los datos de tipo administrativo.
 * Se aplica el modelo CRUD.
 */

public interface IAdministrativoDAO {
	
	public void create(AdministrativoDto a);
	public List<AdministrativoDto> read();
	public AdministrativoDto read(int id);
	public void update(AdministrativoDto a);
	public void delete(int id);


}
