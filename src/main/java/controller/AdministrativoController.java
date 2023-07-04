package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.services.AdministrativoService;
import models.dto.AdministrativoDto;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado, trabajando con los datos del tipo administrativo.
 */


@WebServlet("/Administrativo")
public class AdministrativoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdministrativoService as = new AdministrativoService(); 
	
       
    public AdministrativoController() {
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
				getServletContext().getRequestDispatcher("/Views/Administrativo.jsp").forward(request, response);
				break;
			}
			case "edit": {
				if (id > 0) {
					AdministrativoDto administrativo = as.findOne(id);				
					request.setAttribute("administrativo", administrativo);	
					getServletContext().getRequestDispatcher("/Views/Administrativo.jsp").forward(request, response);			
				}
				break;
			}
			case "read": {
				if (id > 0) {
					AdministrativoDto administrativo = as.findOne(id);					
					request.setAttribute("administrativo", administrativo);	
					getServletContext().getRequestDispatcher("/Views/Administrativo.jsp").forward(request, response);			
				}
				break;
			}
			case "delete": {
				if (id > 0) {					
					as.delete(id);
					response.sendRedirect(request.getContextPath() + "/AdministrativoList");								
				}
				break;
			}		
		
		}	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strId = request.getParameter("id");
		String run = request.getParameter("run");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String area = request.getParameter("area");
		
		
		
		
		if (!strId.isEmpty()) {
			int id = Integer.parseInt(strId);			
			AdministrativoDto administrativo = new AdministrativoDto(id,run,nombre,apellido,correo,area);
			as.update(administrativo);
			
		} else {
			AdministrativoDto administrativo = new AdministrativoDto();
			
			administrativo.setRun(run);
			administrativo.setNombre(nombre);
			administrativo.setApellido(apellido);
			administrativo.setCorreo(correo);
			administrativo.setArea(area);			
			as.create(administrativo);
			
		}
		
		response.sendRedirect(request.getContextPath() + "/AdministrativoList");	
		
	}

}

