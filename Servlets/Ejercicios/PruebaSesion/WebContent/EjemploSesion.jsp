<%@ page session="true"%>
<%
	java.util.ArrayList accesos = (java.util.ArrayList) session.getAttribute("accesos");
	if (accesos == null)
		accesos = new java.util.ArrayList();
	accesos.add(new java.util.Date().toString());
	session.setAttribute("accesos", accesos);
	if (request.getParameter("invalidaSesion") != null)
		session.invalidate();
%>
<html>
<body>
	<form>
		<input type="submit" name="invalidaSesion" value="Invalidar
sesi�n" />
		<input type="submit" value="Recargar p�gina" />
	</form>
	<br /> Usted accedi� a esta p�gina en los siguientes momentos:
	<br>
	<%
		for (int i = 0; i < accesos.size(); i++)
		{
	%>
	<%=accesos.get(i)%>
	<br>
	<%
		}
	%>
</body>
</html>