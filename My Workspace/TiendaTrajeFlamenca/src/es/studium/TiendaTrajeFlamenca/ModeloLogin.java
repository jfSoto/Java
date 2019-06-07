package es.studium.TiendaTrajeFlamenca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModeloLogin
{
	public boolean comprobarCredenciales(String usuario,String clave)
	{
		boolean accesoPermitido = false;
		// Conectar a la base de datos para comprobar credenciales
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practica3trimestreprogramacion?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM usuarios WHERE nombreUsuario = '" + usuario + "' AND claveUsuario = '" + convertirSHA256(clave) + "'";
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
			if(rs.getRow()==0)
			{
				accesoPermitido = false;
			}
			else
			{
				accesoPermitido = true;
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
		return (accesoPermitido);
	}
	public String convertirSHA256(String password) 
	{
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} 
		catch (NoSuchAlgorithmException e) {		
			e.printStackTrace();
			return null;
		}

		byte[] hash = md.digest(password.getBytes());
		StringBuffer sb = new StringBuffer();

		for(byte b : hash) {        
			sb.append(String.format("%02x", b));
		}

		return sb.toString();
	}
	public void registrar (String usuario, String mensaje)
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
