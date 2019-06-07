package es.studium.PracticaVideojuego;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo
{
	public String[][] Top10()
	{
		String contenido[][] = new String[10][10];
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practicavideojuego?autoreconnect=true&useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM top10 ORDER BY manosJugador";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try
		{
			//Cargar los controladores para el acceso a la BD
			Class.forName(driver);
			//Establecer la conexión con la BD 
			connection = DriverManager.getConnection(url, login, password);
			//Crear una sentencia
			statement = connection.createStatement();
			//Crear un objeto ResultSet para guardar lo obtenido
			//y ejecutar la sentencia SQL
			rs = statement.executeQuery(sentencia);
			int i = 0;
			while((rs.next())&&(i<10))
			{
				contenido[i][0]=rs.getString("nombreJugador");
				contenido[i][1]=rs.getInt("manosJugador")+"";
				i++;
			}

		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		}
		finally
		{
			try
			{
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch (SQLException e)
			{
				System.out.println("Error 3-"+e.getMessage());
			}
		}
		
		return(contenido);
	}
	public void InsertarNombreJugador(String nombreJugador, int manosJugador)
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practicavideojuego?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "INSERT INTO Top10(nombreJugador, manosJugador) VALUES('"+nombreJugador+"','"+manosJugador+"')";
		Connection connection = null;
		Statement statement = null;
		try
		{
			//Cargar los controladores para el acceso a la BD
			Class.forName(driver);
			//Establecer la conexión con la BD 
			connection = DriverManager.getConnection(url, login, password);
			//Crear una sentencia
			statement = connection.createStatement();
			//Crear un objeto ResultSet para guardar lo obtenido
			//y ejecutar la sentencia SQL
			statement.executeUpdate(sentencia);

		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		}
		finally
		{
			try
			{
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch (SQLException e)
			{
				System.out.println("Error 3-"+e.getMessage());
			}
		}
	}
	
}
