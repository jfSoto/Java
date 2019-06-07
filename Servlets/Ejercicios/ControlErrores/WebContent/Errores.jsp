<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Manejo de errores JSP</title>
</head>
<body>
	<%@page isErrorPage="true"%>
	<h1>Página de errores</h1>
	<p>
		division.jsp ha reportado el siguiente error:<b><%=exception%></b>
	</p>
	<p>El error que se ha producido es:
	<pre>
		<%
			exception.printStackTrace(new java.io.PrintWriter(out));
		%>
	</pre>
	</p>
</body>
</html>