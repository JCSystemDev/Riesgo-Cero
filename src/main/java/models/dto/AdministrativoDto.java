package models.dto;

/**
 * 
 * @author lgrey
 *Clase administrativo donde se crean los métodos constructores y getters and setter.
 */

public class AdministrativoDto extends UsuarioDto {
	private int idAdministrativo;
	private String run;
	private String nombre;
	private String apellido;
	private String correo;
	private String area;
	
	public AdministrativoDto (int idAdministrativo, String run, String nombre, String apellido, String correo,String area) {
		
		this.idAdministrativo = idAdministrativo;
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.area = area;
	}
	public AdministrativoDto() {
	}
	
	public int getIdAdministrativo() {
		return idAdministrativo;
	}
	public void setIdAdministrativo(int idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
	}
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "AdministrativoDto [idAdministrativo=" + idAdministrativo + ", run=" + run + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", correo=" + correo + ", area=" + area + "]";
	}

	
	
}
