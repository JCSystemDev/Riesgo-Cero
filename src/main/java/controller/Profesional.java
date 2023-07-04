package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import models.services.ProfesionalService;
import models.dto.ProfesionalDto;
import models.dto.UsuarioDto;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado,y manipula los datos de tipo profesional.
 */
@WebServlet("/Profesional")
public class Profesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProfesionalService ps = new ProfesionalService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profesional() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
				getServletContext().getRequestDispatcher("/Views/Profesional.jsp").forward(request, response);
				break;
			}
			case "edit": {
				if (id > 0) {
					ProfesionalDto profesional = ps.findOne(id);				
					request.setAttribute("profesional", profesional);	
					getServletContext().getRequestDispatcher("/Views/Profesional.jsp").forward(request, response);			
				}
				break;
			}
			case "read": {
				if (id > 0) {
					ProfesionalDto profesional = ps.findOne(id);					
					request.setAttribute("profesional", profesional);	
					getServletContext().getRequestDispatcher("/Views/Profesional.jsp").forward(request, response);			
				}
				break;
			}
			case "delete": {
				if (id > 0) {					
					ps.delete(id);
					response.sendRedirect(request.getContextPath() + "/ProfesionalList");								
				}
				break;
			}		
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strId = request.getParameter("id");
		String run = request.getParameter("run");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String cargo = request.getParameter("cargo");
		
		
		
		if (!strId.isEmpty()) {
			int id = Integer.parseInt(strId);			
			ProfesionalDto profesional = new ProfesionalDto(id, run, nombre, apellido, correo, telefono, cargo);
			ps.update(profesional);
			
		} else {
			ProfesionalDto profesional = new ProfesionalDto();
			profesional.setRun(run);
			profesional.setNombreProfesional(nombre);
			profesional.setApellidoProfesional(apellido);
			profesional.setCorreo(correo);
			profesional.setTelefono(telefono);
			profesional.setCargo(cargo);
			ps.create(profesional);
			
		}
		
		response.sendRedirect(request.getContextPath() + "/ProfesionalList");	
		
	}
	

}
