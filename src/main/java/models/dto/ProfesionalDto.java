package models.dto;

/**
 * 
 * @author lgrey
 *Clase profesional donde se crean los métodos constructores y getters and setter.
 */

public class ProfesionalDto extends UsuarioDto {
	private int idProfesional;
	private String run;
	private String nombreProfesional;
	private String apellidoProfesional;
	private String correo;
	private String telefono;
	private String cargo;
	
	
	public ProfesionalDto() {
		super();
		
	}

	public ProfesionalDto(int idProfesional, String run, String nombreProfesional, String apellidoProfesional,
			String correo, String telefono, String cargo) {
		super();
		this.idProfesional = idProfesional;
		this.run = run;
		this.nombreProfesional = nombreProfesional;
		this.apellidoProfesional = apellidoProfesional;
		this.correo = correo;
		this.telefono = telefono;
		this.cargo = cargo;		
	}

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombreProfesional() {
		return nombreProfesional;
	}

	public void setNombreProfesional(String nombreProfesional) {
		this.nombreProfesional = nombreProfesional;
	}

	public String getApellidoProfesional() {
		return apellidoProfesional;
	}

	public void setApellidoProfesional(String apellidoProfesional) {
		this.apellidoProfesional = apellidoProfesional;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "ProfesionalDto [idProfesional=" + idProfesional + ", run=" + run + ", nombreProfesional="
				+ nombreProfesional + ", apellidoProfesional=" + apellidoProfesional + ", correo=" + correo
				+ ", telefono=" + telefono + ", cargo=" + cargo + "]";
	}

	
}
