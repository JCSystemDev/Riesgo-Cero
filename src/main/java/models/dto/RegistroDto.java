package models.dto;

/**
 * 
 * @author lgrey
 *Clase registro donde se crean los métodos constructores y getters and setter.
 */
public class RegistroDto {
	
	private int idRegistro;
	private String nombre;
	private String username;
	private String password;
	
	public RegistroDto(int idRegistro, String nombre, String username, String password) {
		super();
		this.idRegistro = idRegistro;
		this.nombre = nombre;
		this.username = username;
		this.password = password;
	}
	public RegistroDto() {		
	}
	
	public int getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
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
		return "RegistroDto [idRegistro=" + idRegistro + ", nombre=" + nombre + ", username=" + username + ", password="
				+ password + "]";
	}
	
}
