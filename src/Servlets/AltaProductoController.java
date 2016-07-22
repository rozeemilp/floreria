package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductoDAO;
import dao.ProductoDaoImpl;
import model.Producto;

public class AltaProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AltaProductoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String op = request.getParameter("op");
		String pagina;
		if(op.equals("create")){
			pagina="/WEB-INF/jspf/create.jsp";
		}
		this.listar(request, response);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		float precio  = Integer.parseInt(request.getParameter("precio"));
		String categoria = request.getParameter("categoria");
		int stock = Integer.parseInt(request.getParameter("stock"));
		int estado  = Integer.parseInt(request.getParameter("estado"));
		
		Producto miProducto = new Producto(nombre,precio,stock,categoria);
		
		ProductoDAO productoDao = new ProductoDaoImpl();
		productoDao.guardar(miProducto);	
		
		this.listar(request,response);
	}
	
	protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String pagina = "/WEB-INF/jspf/list.jsp";
	ProductoDAO productoDao = new ProductoDaoImpl();
	HttpSession session = request.getSession(true);
	session.setAttribute("list", productoDao);
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
	dispatcher.forward(request, response);
	
	}
}
