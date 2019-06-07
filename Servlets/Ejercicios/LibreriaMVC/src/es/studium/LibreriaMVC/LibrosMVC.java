package es.studium.LibreriaMVC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Jorge
 * LibrosMVC
 * Encapsula la comunicaci�n con la base de datos
 * Almacena t�tulos, autores y precios en tres tablas
 *
 */
public class LibrosMVC
{
	private static final int MAX_SIZE = 5;
	private static String[] titulos = new String[MAX_SIZE];
	private static String[] autores = new String[MAX_SIZE];
	private static String[] precios = new String[MAX_SIZE];
	public static void cargarDatos()
	{
		// Creamos objetos para la conexi�n
		Connection conn = null;
		Statement stmt = null;
		try 
		{
			// Paso 1: Cargamos el driver
			Class.forName("com.mysql.jdbc.Driver");
			// Paso 2: Conectarse a la base de datos utilizando un objeto de la clase Connection
			String userName = "servletUser2";
			String password = "Studium2018;";
			// URL de la base de datos
			String url = "jdbc:mysql://localhost:3306/tiendalibros?useSSL=false";
			conn = DriverManager.getConnection(url, userName, password);
			// Paso 3: Crear las sentencias SQL utilizando objetos de la clase Statement
			stmt = conn.createStatement();
			// Paso 4: Ejecutar las sentencias
			String sqlStr = "SELECT * FROM libros";
			ResultSet rs = stmt.executeQuery(sqlStr);
			// Paso 5: Recoger los resultados y procesarlos
			int cont = 0;
			while(rs.next())
			{
				autores[cont] = rs.getString("autorLibro");
				titulos[cont] = rs.getString("tituloLibro");
				precios[cont] = rs.getString("precioLibro");
				cont++;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				// Cerramos el resto de recursos
				if(stmt != null)
				{
					stmt.close();
				}
				if(conn != null)
				{
					conn.close();
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	/**
	 * Devuelve el n�mero de libros obtenidos
	 */
	public static int tamano()
	{
		return titulos.length;
	}
	/**
	 * Devuelve el t�tulo del libro identificado con idLibro
	 */
	public static String getTitulo(int idLibro)
	{
		return titulos[idLibro];
	}
	/**
	 * Devuelve el autor del libro identificado con idLibro
	 */
	public static String getAutor(int idLibro)
	{
		return autores[idLibro];
	}
	/**
	 * Devuelve el precio del libro identificado con idLibro
	 */
	public static String getPrecio(int idLibro)
	{
		return precios[idLibro];
	}
}