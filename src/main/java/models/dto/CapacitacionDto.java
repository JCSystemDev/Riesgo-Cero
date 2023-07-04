package models.dto;

import java.sql.Date;
import java.sql.Time;

/**
 * 
 * @author lgrey
 *Clase capacitación donde se crean los métodos constructores y getters and setter.
 */

public class CapacitacionDto {
	private int idCapacitacion;
	private String nombre;
	private String detalle;
	private Date fecha;
	//private Time hora;
	private String lugar;
	private Float duracion;
	private int cantidad;
	
	public CapacitacionDto() {
		
	}
	
	public CapacitacionDto(int idCapacitacion, String nombre, String detalle,String lugar,
			Float duracion, int cantidad) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.nombre = nombre;
		this.detalle = detalle;
		//this.fecha = fecha;
		//this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidad = cantidad;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/**public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}*/

	
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Float getDuracion() {
		return duracion;
	}

	public void setDuracion(Float duracion) {
		this.duracion = duracion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "CapacitacionDto [idCapacitacion=" + idCapacitacion + ", nombre=" + nombre + ", detalle=" + detalle
				+ ", fecha=" + fecha + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidad=" + cantidad + "]";
	}
	

		
}
