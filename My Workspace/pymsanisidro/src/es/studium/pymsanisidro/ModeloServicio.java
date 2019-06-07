package es.studium.pymsanisidro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModeloServicio 
{
	private static final long serialVersionUID = 1L;

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/Empresa";
	String login = "root";
	String password = "Studium2018;";
	Connection connection = null;
	Statement statement = null;

	public ModeloServicio()
	{

	try
	{
		Class.forName(driver);
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("Se ha producido un error al cargar el Driver");
	}
	//Establecer la conexión con la base de datos
	try
	{
		connection = DriverManager.getConnection(url, login, password);
	}
	catch(SQLException e)
	{
		System.out.println("Se produjo un error al conectar a la Base de Datos");
	}
	//Preparar el statement
	try
	{
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	}
	catch(SQLException e)
	{
		System.out.println("Error en la sentencia SQL");
	}
}
}
