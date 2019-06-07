package es.studium.TiendaTrajeFlamenca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModeloAltaAsignacion
{	
	String usuario = null;
	ModeloAltaAsignacion(String usuario)
	{
		this.usuario = usuario;
	}
	public void InsertarAsignacion(int idTrajeFK2, int idCostureraFK3, String fechaInicioFabricacionTraje, String fechaFinFabricacionTraje)
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practica3trimestreprogramacion?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "INSERT INTO Asignaciones(idTrajeFK2, idCostureraFK3, fechaInicioFabricacionTraje, fechaFinFabricacionTraje) VALUES('"+idTrajeFK2+"','"+idCostureraFK3+"','"+fechaInicioFabricacionTraje+"','"+fechaFinFabricacionTraje+"' )";
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
