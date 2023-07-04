package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import models.services.UsuariosServicio;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado, deplegando la lista de usuarios para posterior manipulación de datos.
 */
@WebServlet("/UsuariosList")
public class UsuariosList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	UsuariosServicio usuariosServicio = new UsuariosServicio();
       

    public UsuariosList() {
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
				
		request.setAttribute("usuarios", usuariosServicio.findAll());
	
		getServletContext().getRequestDispatcher("/Views/UsuariosList.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
