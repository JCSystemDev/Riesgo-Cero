package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado,desplegando el formulario de contacto.
 *Además como solicita el ejercico, se imprimen los datos por consola.
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
       
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
		
		
		
		getServletContext().getRequestDispatcher("/Views/Contacto.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	       
	        String nombre = request.getParameter("nombre");
	        String email = request.getParameter("email");
	        String mensaje = request.getParameter("mensaje");        
	        // Mostrar los datos en la consola de Java
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Email: " + email);
	        System.out.println("Mensaje: " + mensaje);
	        
	        response.sendRedirect(request.getContextPath() + "/");		
	        
	}
	

}
