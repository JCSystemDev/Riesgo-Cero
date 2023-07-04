package Interfaces;

import java.util.List;
import models.dto.UsuarioDto;

/**
 * 
 * @author lgrey
 ** Interfaz de operacion para los datos de tipo usuario.
 * Se aplica el modelo CRUD. 
 * */

public interface IUsuarioDAO {
	
	public void create(UsuarioDto a);
	public List<UsuarioDto> read();
	public UsuarioDto read(int id);
	public void update(UsuarioDto a);
	public void delete(int id);
	public UsuarioDto findByUsername (String username);

}
