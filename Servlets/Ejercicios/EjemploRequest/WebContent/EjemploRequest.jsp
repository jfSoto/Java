<html>
<body>
	<form>
		<input type="text" name="parametro" /> <input type="submit" />
	</form>
	<br>
	<br> Su IP:
	<%=request.getRemoteAddr()%>
	<br> Su nombre de host:
	<%=request.getRemoteHost()%>
	<br> Valor del parámetro:
	<%=request.getParameter("parametro")%>
</body>
</html>