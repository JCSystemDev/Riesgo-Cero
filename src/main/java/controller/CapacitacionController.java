package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.services.CapacitacionService;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado, trabajando con la lista de capacitaciones.
 */
@WebServlet("/Listados")
public class CapacitacionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	CapacitacionService capacitacionService = new CapacitacionService();
	
    public CapacitacionController() {
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
				
		request.setAttribute("capacitacion", capacitacionService.findAll());
	
		getServletContext().getRequestDispatcher("/Views/CapacitacionList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);			
		
	}

}
