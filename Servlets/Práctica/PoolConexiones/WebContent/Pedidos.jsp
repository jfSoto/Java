<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Consulta de Libros</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
			String sqlStr = "SELECT * FROM pedidos ";
			sqlStr += "ORDER by idPedido ASC";
			System.out.println(sqlStr);
			ResultSet rs = stmt.executeQuery(sqlStr);
	%>
	<hr />
	<table class="table table-dark">
		<tr>
			<th>ID Pedido</th>
			<th>Fecha de Pedido</th>
			<th>ID Usuario</th>
			<th>Estado del Pedido</th>
			<th>Procesar Pedido</th>
		</tr>
		<%
			// Paso 5: Recoger los resultados y procesarlos
				while (rs.next())
				{
		%>
		<tr>
			<td><%=rs.getString("idPedido")%></td>
			<td><%=rs.getString("fechaPedido")%></td>
			<td><%=rs.getString("idUsuarioFK1")%></td>
			<td><%=rs.getString("estadoPedido")%></td>
			<td>
				<form action="#" method="post">
				<input type="hidden" name="idPedido" value="<%=rs.getString("idPedido")%>">
					<input class="btn btn-primary" type="submit" value="Procesar" />
				</form>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		String[] idPedido = request.getParameterValues("idPedido");
		if (idPedido != null)
		{
			String estadoPedido = "UPDATE pedidos SET estadoPedido = 1 WHERE idPedido = " + idPedido[0] + ";";
			System.out.println(estadoPedido);
			try
			{
				stmt.executeUpdate(estadoPedido);
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			%><h3><%=idPedido[0]%></h3><%
		}
		// Cierre de recursos
			rs.close();
			stmt.close();
			conn.close();%>
	<a href="login?usuario=usuario1&password=usuario1&Acceder=Enviar+consulta"><button class="btn btn-primary">Volver</button></a>
</body>
</html>