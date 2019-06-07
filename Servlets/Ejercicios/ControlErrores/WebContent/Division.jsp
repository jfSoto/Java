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
	<h1>Ejemplo de manejo de errores JSP</h1>
	<%@page errorPage="errores.jsp"%>
	<%!private double toDouble(String valor)
	{
		return (Double.valueOf(valor).doubleValue());
	}%>
	<%
		double op1 = toDouble(request.getParameter("op1"));
		double op2 = toDouble(request.getParameter("op2"));
		double res = op1 / op2;
	%>
	<table border=1>
		<tr>
			<th></th>
			<th>División</th>
		</tr>
		<tr>
			<td>Operando 1:</td>
			<td><%=op1%></td>
		</tr>
		<tr>
			<td>Operando 2:</td>
			<td><%=op2%></td>
		</tr>
		<tr>
			<td>División:</td>
			<td><%=res%></td>
		</tr>
	</table>
</body>
</html>