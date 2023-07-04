package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author lgrey
 * Controlador que manipula los datos para el cierre de sesión.
 */
@WebServlet("/Logout")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LogoutController() {
        super();
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession session = request.getSession();
		
		 // Verificar si la sesión está abierta
        if (session != null && session.getAttribute("isLogged") != null) {
            session.invalidate(); // Cierra la sesión
            getServletContext().getRequestDispatcher("/Views/Login.jsp").forward(request, response);
        }else {

         getServletContext().getRequestDispatcher("/Views/Login.jsp").forward(request, response);
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
