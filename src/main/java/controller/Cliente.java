package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import models.dto.ClienteDto;
import models.dto.UsuarioDto;
import models.services.ClienteService;

/**
 * 
 * @author lgrey
 *Este controlador valida el ingreso logeado,trabajando con los datos de tipo cliente.
 */
@WebServlet("/Cliente")
public class Cliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClienteService as = new ClienteService(); 
    
    public Cliente() {
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
				getServletContext().getRequestDispatcher("/Views/Cliente.jsp").forward(request, response);
				break;
			}
			case "edit": {
				if (id > 0) {
					ClienteDto cliente = (ClienteDto) as.findOne(id);				
					request.setAttribute("cliente", cliente);	
					getServletContext().getRequestDispatcher("/Views/Cliente.jsp").forward(request, response);			
				}
				break;
			}
			case "read": {
				if (id > 0) {
					ClienteDto cliente = (ClienteDto) as.findOne(id);					
					request.setAttribute("cliente", cliente);	
					getServletContext().getRequestDispatcher("/Views/Cliente.jsp").forward(request, response);			
				}
				break;
			}
			case "delete": {
				if (id > 0) {					
					as.delete(id);
					response.sendRedirect(request.getContextPath() + "/ClienteList");								
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
		String telefono = request.getParameter("telefono");
		String afp = request.getParameter("afp");
		String LSistemaSalud = request.getParameter("sistema_salud");
		String direccion = request.getParameter("direccion");
		String comuna = request.getParameter("comuna");
		String edad = request.getParameter("edad");		
		
		if (!strId.isEmpty()) {
			int id = Integer.parseInt(strId);			
			int edadi = Integer.parseInt(edad);
			String sistemaSalud = LSistemaSalud.toLowerCase();
			ClienteDto cliente = new ClienteDto(id,run, nombre, apellido, correo, telefono, afp,sistemaSalud,direccion, 
					comuna, edadi);
			as.update(cliente);		
			
		} else {
			int edadi = Integer.parseInt(edad);
			String sistemaSalud = LSistemaSalud.toLowerCase();
			ClienteDto cliente = new ClienteDto();
			cliente.setRun(run); ;
			cliente.setNombreCliente(nombre);
			cliente.setApellidoCliente(apellido);
			cliente.setCorreo(correo);
			cliente.setTelefono(telefono);
			cliente.setAfp(afp);
			cliente.setSistemaSalud(sistemaSalud);
			cliente.setDireccion(direccion);
			cliente.setComuna(comuna);
			cliente.setEdad(edadi);
			as.create(cliente);
			
		}
		
		response.sendRedirect(request.getContextPath() + "/ClienteList");	
		
	}
	
}
	

