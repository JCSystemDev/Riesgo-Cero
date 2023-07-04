package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import models.services.ProfesionalService;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado, despliega la lista de profesionales para manipulacion de datos.
 */
@WebServlet("/ProfesionalList")
public class ProfesionalList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    ProfesionalService profesionalService = new ProfesionalService();
	
    public ProfesionalList() {
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
				
		request.setAttribute("profesional", profesionalService.findAll());
	
		getServletContext().getRequestDispatcher("/Views/ProfesionalList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
