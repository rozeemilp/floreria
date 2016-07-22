
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<%@include file="WEB-INF/jspf/jscss.jspf" %>

<title>Alta de Producto</title>
</head>
<body>
<%@include file="WEB-INF/jspf/menuAdmin.jspf" %>

<h3>Alta de Producto</h3>

	<div>
	<form action="altaProductoController" method="post">
		Ingresar datos del producto <BR>
		
		<table class="table table-bordered" style="width: 600px;">
			<tr>
				<td><label>Nombre</label></td>
				<td><input type="text" name="nombre" required /></td>
			</tr>
			<tr>
				<td><label>Precio</label></td>
				<td><input type="number" name="precio" required /></td>
			</tr>
			<tr>
				<td><label>Categoria</label></td>
				<td><input type="text" name="categoria" /></td>
			</tr>
			<tr>
				<td><label>Stock</label></td>
				<td><input type="number" name="stock" required /></td>
			</tr>
			<tr>
				<td><label>Stock</label></td>
				<td><input type="number" name="estado" required /></td>
			</tr>
			<tr>
				<td colspan="2">
				
				<input type="submit" value="Aceptar" class="btn btn-success" />
				
				<input type="button" value="Regresar" class="btn btn-danger" />
								
			</tr>
		</table>
		
									
		<BR><input type="submit" />
	</form>
	

</div>		
	
<%@include file="WEB-INF/jspf/botton.jspf" %>
</body>
</html>