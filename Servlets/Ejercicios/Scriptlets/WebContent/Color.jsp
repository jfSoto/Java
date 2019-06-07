<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Expresiones JSP</title>
<%
	String bgColor = request.getParameter("bgColor");
	boolean hayColor;
	if (bgColor != null)
	{
		hayColor = true;
	} 
	else
	{
		hayColor = false;
		bgColor = "WHITE";
	}
%>
</head>
<body bgcolor="<%=bgColor%>">
	<h1>Ejemplo de scriptlet JSP</h1>
	<%
		if (hayColor)
		{
			out.println("Se ha utilizado el color: " + bgColor);
		} 
		else
		{
			out.println("Se ha utilizado el color por defecto WHITE");
		}
	%>
</body>
</html>
