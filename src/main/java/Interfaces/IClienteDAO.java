package Interfaces;

import java.util.List;
import models.dto.ClienteDto;

/**
 * 
 * @author lgrey
 * Interfaz de operacion para los datos de tipo cliente.
 * Se aplica el modelo CRUD.
 */
public interface IClienteDAO {
	
	public void create(ClienteDto a);
	public ClienteDto read(int id);
	public void update(ClienteDto a);
	public void delete(int id);
	List<ClienteDto> read();

}