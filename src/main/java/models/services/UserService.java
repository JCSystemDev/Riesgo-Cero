package models.services;
import Interfaces.IUsuarioDAO;
import models.dao.UsuarioDAO;
import models.dto.UsuarioDto;
/**
 * 
 * @author lgrey
 *Clase de servicio User (la que valida el ingreso al sistema) donde se implementa la interfaz en la manipulación de los CRUD.
 */
public class UserService {		
	
	public boolean login(String username, String password) {		
		
		IUsuarioDAO usuariodao = new UsuarioDAO();	

		
		UsuarioDto usuariodto = usuariodao.findByUsername(username);
		
		usuariodto.getPassword();		
		
		if (usuariodto.getPassword().equals(password)) {
			return true;
		}		
		return false;		
	}	
}
