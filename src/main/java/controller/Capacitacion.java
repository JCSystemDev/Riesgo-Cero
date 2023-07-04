package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.dto.CapacitacionDto;
import models.services.CapacitacionService;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado, trabajando con los datos de capacitación.
 */
@WebServlet("/Capacitacion")
public class Capacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private CapacitacionService as = new CapacitacionService();
	
    public Capacitacion() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("isLogged") == null) {
			getServletContext().getRequestDispatcher("/Login").forward(request, response);
		}
		
		boolean isLogged = (boolean)session.getAttribute("isLogged");
		
		if (!isLogged) {
			getServletContext().getRequestDispatcher("/Login").forward(request, response);
		} 	
		
		String strId = request.getParameter("id");
		
			
		int id = 0;
		if (strId != null && !strId.isEmpty()) {
		    id = Integer.parseInt(strId);
		}
		
		String op = request.getParameter("op");
		request.setAttribute("op", op);			
		
		switch (op) {
			case "new": {
				getServletContext().getRequestDispatcher("/Views/Capacitacion.jsp").forward(request, response);
				break;
			}
			case "edit": {
				if (id > 0) {
					CapacitacionDto capacitacion = as.findOne(id);				
					request.setAttribute("capacitacion", capacitacion);	
					getServletContext().getRequestDispatcher("/Views/Capacitacion.jsp").forward(request, response);			
				}
				break;
			}
			case "read": {
				if (id > 0) {
					CapacitacionDto capacitacion = as.findOne(id);					
					request.setAttribute("capacitacion", capacitacion);	
					getServletContext().getRequestDispatcher("/Views/Capacitacion.jsp").forward(request, response);			
				}
				break;
			}
			case "delete": {
				if (id > 0) {					
					as.delete(id);
					response.sendRedirect(request.getContextPath() + "/Listados");								
				}
				break;
			}		
		
		}	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String strId = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String detalle = request.getParameter("detalle");
		//String strFecha = request.getParameter("fecha");		
		String lugar = request.getParameter("lugar");
		String flduracion = request.getParameter("duracion");
		String strCantidad = request.getParameter("cantidad");
		
		
		
		if (!strId.isEmpty()) {
			int id = Integer.parseInt(strId);
			int cantidad = Integer.parseInt(strCantidad);	
			float duracion = Float.parseFloat(flduracion);
	       /** DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");	        
	        // Parsear la cadena en un objeto LocalTime
	        LocalTime hora = LocalTime.parse(dtHora, formato);			
			
	        DateFormat formatof = new SimpleDateFormat("dd/MM/yyyy");
	        java.util.Date fecha = formatof.parse(strFecha);*/
		
			CapacitacionDto capacitacion = new CapacitacionDto(id,nombre,detalle,lugar,duracion,cantidad);
			as.update(capacitacion);
			
		} else {
			CapacitacionDto capacitacion = new CapacitacionDto();
			float duracion = Float.parseFloat(flduracion);
			int cantidad = Integer.parseInt(strCantidad);
			capacitacion.setNombre(nombre);
			capacitacion.setDetalle(detalle); 	
			capacitacion.setLugar(lugar);
			capacitacion.setDuracion(duracion);
			capacitacion.setCantidad(cantidad);
			as.create(capacitacion);
			
		}		
		response.sendRedirect(request.getContextPath() + "/Listados");		
	}

}