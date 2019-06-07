<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Consulta de Libros</title>
</head>
<body>
	<h1>Consulta de Libros</h1>
	<h3>Elige libro(s) a consultar:</h3>
	<form method="get">
		<input type="checkbox" name="libro" value="1" />1 
		<input type="checkbox" name="libro" value="2" />2
		<input type="checkbox" name="libro" value="3" />3
		<input type="checkbox" name="libro" value="4" />4
		<input type="submit" value="Buscar..." />
	</form>
	<%
		String[] libros = request.getParameterValues("libro");
		if (libros != null)
		{
	%>
	<%@ page import="java.sql.*"%>
	<%
		// Paso 1: Cargamos el driver
			Class.forName("com.mysql.jdbc.Driver");
			// Paso 2: Conectarse a la base de datos utilizando un objeto de la clase Connection
			String userName = "servletUser2";
			String password = "Studium2018;";
			// URL de la base de datos
			String url = "jdbc:mysql://localhost:3306/tiendalibros";
			Connection conn = DriverManager.getConnection(url, userName, password);
			// Paso 3: Crear las sentencias SQL utilizando objetos de la clase Statement
			Statement stmt = conn.createStatement();
			// Paso 4: Ejecutar las sentencias
			String sqlStr = "SELECT * FROM libros WHERE ";
			for (int i = 0; i < libros.length; i++)
			{
				sqlStr = sqlStr + "idlibro = " + libros[i] + " ";
				if (i != libros.length - 1)
				{
					sqlStr += "OR ";
				}
			}
			sqlStr += "ORDER by precioLibro DESC";
			System.out.println(sqlStr);
			ResultSet rs = stmt.executeQuery(sqlStr);
	%>
	<hr />
	<table border=1 cellpadding=5>
		<tr>
			<th>Autor</th>
			<th>Título</th>
			<th>Precio</th>
			<th>Cantidad</th>
		</tr>
		<%
			// Paso 5: Recoger los resultados y procesarlos
				while (rs.next())
				{
		%>
		<tr>
			<td><%=rs.getString("autorLibro")%></td>
			<td><%=rs.getString("tituloLibro")%></td>
			<td><%=rs.getString("precioLibro")%></td>
			<td><%=rs.getString("cantidadLibro")%></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		// Cierre de recursos
			rs.close();
			stmt.close();
			conn.close();
		}
	%>
</body>
</html>