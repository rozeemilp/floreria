package Servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import util.Authenticator;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public LoginController() {
		super();
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
 
		String usuario = request.getParameter("username");
		String contraseña = request.getParameter("password");
		RequestDispatcher rd = null;
 
		Authenticator authenticator = new Authenticator();
		String result = authenticator.authenticate(usuario, contraseña);
		if (result.equals("admin")) {
			rd = request.getRequestDispatcher("/WEB-INF/indexAdmin.jsp");
			User user = new User(usuario, contraseña);
			request.setAttribute("user", user);
		} else {
			rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
		}
		rd.forward(request, response);
		
		
		
		
	}
 
}