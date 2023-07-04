package models.dto;

/**
 * 
 * @author lgrey
 *Clase usuario donde se crean los métodos constructores y getters and setter.
 */
public class UsuarioDto {
	private int idUsuario;
	private String nombre;
	private String username;
	private String password;
	
	
	public UsuarioDto() {
		super();
	}


	public UsuarioDto(int idUsuario, String nombre, String username, String password) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.username = username;
		this.password = password;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UsuarioDto [idUsuario=" + idUsuario + ", nombre=" + nombre + ", username=" + username + ", password="
				+ password + "]";
	}
	
}
