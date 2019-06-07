package es.studium.TiendaTrajeFlamenca;

import java.awt.Choice;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class ModeloModificacionTraje
{
	VistaModificacionTraje vistaModificacionTraje = null;
	String usuario = null;
	ModeloModificacionTraje(String usuario)
	{
		this.usuario = usuario;
	}
	public Choice RellenarModificacion()
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practica3trimestreprogramacion?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM Trajes";
		Choice lista = new Choice();
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
			while(rs.next())
			{
				lista.add(rs.getInt("idTraje") + " - " +rs.getString("tipoTraje") + " - " +rs.getString("fechaAdquisicionTrajeCliente"));
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
		return(lista);
	}
	@SuppressWarnings({ "rawtypes" })
	public Vector RellenarUpdate(int idTraje)
	{
		Vector<String> resultado= new Vector<String>();
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practica3trimestreprogramacion?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM trajes WHERE idTraje = "+idTraje;
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
			rs.next();
			resultado.add(rs.getString("tipoTraje"));
			resultado.add(rs.getInt("tallaTraje")+"");
			resultado.add(rs.getString("fechaAdquisicionTrajeCliente"));
			resultado.add(rs.getInt("idClienteFK1")+"");
			

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
		return resultado;
	}
	public void ModificarTraje(int idTraje, String tipoTraje, int tallaTraje, 
			String fechaAdquisicionTrajeCliente, int idClienteFK1)
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practica3trimestreprogramacion?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "UPDATE trajes SET tipoTraje = '"+tipoTraje+"', tallaTraje = "
				+ "'"+tallaTraje+"', fechaAdquisicionTrajeCliente = '"+fechaAdquisicionTrajeCliente+"', "
				+ "idClienteFK1 = '"+idClienteFK1+"' WHERE idTraje = "+idTraje;
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
			registrar(usuario, sentencia);

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
	public void registrar(String usuario, String mensaje)
	{
		Date fechaHora = new Date();
		DateFormat formatoEuropeo = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		try
		{
			FileWriter fw = new FileWriter("Log.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.print("[" + formatoEuropeo.format(fechaHora) + "] ");
			salida.print("[" + usuario + "] ");
			salida.print("[" + mensaje + "]\n");
			salida.close();
			bw.close();
			fw.close();
		}
		catch(Exception e){}
	}
}
