<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Expresiones JSP</title>
</head>
<body>
	<h1>Ejemplo de expresiones JSP</h1>
	<ul>
		<li>Fecha actual: <%=new java.util.Date()%></li>
		<li>Nombre del host: <%=request.getRemoteHost()%></li>
		<li>ID de sesión: <%=session.getId()%></li>
		<li>El parámetro nombre vale: <%=request.getParameter("nombre")%></li>
	</ul>
</body>
</html>