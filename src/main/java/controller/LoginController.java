package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.services.UserService;


/**
 * 
 * @author lgrey
 *Controlador que manipula los datos de ingreso al sistema. 
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService = new UserService();

  
    public LoginController() {
        super();
    }    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/Views/Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.isEmpty() || password.isEmpty()) {
			getServletContext().getRequestDispatcher("/Views/Login.jsp").forward(request, response);
		}
	
		HttpSession session = request.getSession();		
		
		
		
		if (userService.login(username, password)) {	
			session.setAttribute("isLogged", true);
			
			getServletContext().getRequestDispatcher("/Views/Contacto.jsp").forward(request, response);	
		} else {
			
			session.setAttribute("isLogged", false);
			getServletContext().getRequestDispatcher("/Views/Login.jsp").forward(request, response);
		}
	}
}
