package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
 
import javax.servlet.http.HttpSession;

import model.Producto;
 
@WebServlet("/CrearSession")
public class CrearSession extends HttpServlet {
private static final long serialVersionUID = 1L;
 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
HttpSession misession= request.getSession(true);
Producto miproducto= new Producto("gerbera",20,35,"flor");
misession.setAttribute("producto",miproducto);
PrintWriter pw= response.getWriter();
pw.println("<html><body>Producto en session</body></html>");
pw.close();
 
}
}