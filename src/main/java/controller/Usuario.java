package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import models.dto.UsuarioDto;
import models.services.UsuariosServicio;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado, manipulando los datos de tipo usuario.
 */
@WebServlet("/Usuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UsuariosServicio as = new UsuariosServicio(); 
    
    public Usuario() {
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
				getServletContext().getRequestDispatcher("/Views/Registro.jsp").forward(request, response);
				break;
			}
			case "edit": {
				if (id > 0) {
					UsuarioDto usuario = as.findOne(id);				
					request.setAttribute("usuario", usuario);	
					getServletContext().getRequestDispatcher("/Views/Registro.jsp").forward(request, response);			
				}
				break;
			}
			case "read": {
				if (id > 0) {
					UsuarioDto usuario = as.findOne(id);					
					request.setAttribute("usuario", usuario);	
					getServletContext().getRequestDispatcher("/Views/Registro.jsp").forward(request, response);			
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
		String nombre = request.getParameter("nombre");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		
		if (!strId.isEmpty()) {
			int id = Integer.parseInt(strId);			
			UsuarioDto usuario = new UsuarioDto(id,nombre,username,password);
			as.update(usuario);
			
		} else {
			UsuarioDto usuario = new UsuarioDto();
			usuario.setNombre(nombre);
			usuario.setUsername(username);
			usuario.setPassword(password); 			
			as.create(usuario);
			
		}
		
		response.sendRedirect(request.getContextPath() + "/UsuariosList");	
		
	}
	
}

