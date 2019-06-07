<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Consulta de Libros</title>
</head>
<body>
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
			String sqlStr = "SELECT * FROM libros ";
			sqlStr += "ORDER by tituloLibro DESC";
			System.out.println(sqlStr);
			ResultSet rs = stmt.executeQuery(sqlStr);
	%>
	<hr />
	<table class="table table-dark">
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
	%>
	<a href="login?usuario=usuario1&password=usuario1&Acceder=Enviar+consulta"><button class="btn btn-primary">Volver</button></a>
</body>
</html>