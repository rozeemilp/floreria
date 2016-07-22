<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.Producto" %>
<jsp:useBean id="list" scope = "session" class="java.util.List" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<%@include file="../WEB-INF/jspf/jscss.jspf" %>
		<title>Floreria</title>
	</head>
	<body>
	
		<%@include file="WEB-INF/jspf/menuAdmin.jspf" %>
	
		<div style="width: 600px;">
			<a href="agregarProducto.jsp" class="btn btn-mini btn-primary">Nuevo</a>
			<table class="table table-bordered">
				<tr>
						<th>ID</th>
						<th>Nombre</th>
						<th>Precio</th>
						<th>Estado</th>
						
				</tr>
				<% for(int i=0; i<list.size();i++){
						Producto producto = new Producto();
						producto = (Producto)list.get(i);
					}
				%>
				<tr>
					<td><%=producto.getId() %></td>
					<td><%=producto.getNombre() %></td>
					<td><%=producto.getPrecio() %></td>
					<td><%=producto.getEstado() %></td>
				
				</tr>
			</table>
		
		</div>
	
	
	</body>
</html>