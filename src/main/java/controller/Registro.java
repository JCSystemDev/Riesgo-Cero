package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.dto.RegistroDto;
import models.dto.UsuarioDto;
import models.services.RegistroServicio;

/**
 * 
 * @author lgrey
 *Controlador que manipula los datos para un nuevo registro de usuario.
 */

@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	public Registro() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		}		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}


