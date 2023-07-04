package models.dto;

/**
 * 
 * @author lgrey
 *Clase cliente donde se crean los métodos constructores y getters and setter.
 */

public class ClienteDto extends UsuarioDto {
	private int idCliente;
	private String run;
	private String nombreCliente;
	private String apellidoCliente;
	private String correo;
	private String telefono;
	private String afp;
	private String sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	
	public ClienteDto() {
		super();
	}

	public ClienteDto(int idCliente, String run, String nombreCliente, String apellidoCliente, String correo,
			String telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super();
		this.idCliente = idCliente;
		this.run = run;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.correo = correo;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
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

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "ClienteDto [idCliente=" + idCliente + ", run=" + run + ", nombreCliente=" + nombreCliente
				+ ", apellidoCliente=" + apellidoCliente + ", correo=" + correo + ", telefono=" + telefono + ", afp="
				+ afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad="
				+ edad + "]";
	}
	
}
