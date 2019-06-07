package es.studium.ConsultaServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ConsultaServlet
 */
@WebServlet("/ConsultaServlet")
public class ConsultaServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsultaServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// El m�todo doGet() se ejecuta una vez pro cada petici�n HTTP GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		// Establecemos el tipo MIME del mensaje de respuesta
		response.setContentType("text/html");
		// Creamos un objeto para poder escribir la respuesta
		PrintWriter out = response.getWriter();
		// Creamos objetos para la conexi�n
		Connection conn = null;
		Statement stmt = null;
		try
		{
			out.println("<html>");
			out.println("<head><title>Resultado</title></head>");
			out.println("<body>");
			out.println("<h3>Su consulta</h3>");
			
			// Paso 1: Cargamos el driver
			Class.forName("com.mysql.jdbc.Driver");
			// Paso 2: Conectarse a la base de datos utilizando un objeto de la clase Connection
			String userName = "servletUser2";
			String password = "Studium2018;";
			// URL de la base de datos
			String url = "jdbc:mysql://localhost:3306/TiendaLibros";
			conn = DriverManager.getConnection(url, userName, password);
			// Paso 3: Crear las sentencias SQL utilizando objetos de la clase Statement
			stmt = conn.createStatement();
			// Paso 4: Ejecutar las sentencias
			String sqlStr = "SELECT * FROM libros WHERE idLibro=" +
					request.getParameter("idLibro");
			// Generar una p�gina HTML como resultado de la consulta
			out.println("<p>Tu consulta es: " + sqlStr + "</p>");
			ResultSet rs = stmt.executeQuery(sqlStr);
			//Paso 5: Recoger los resultados y procesarlos
			int count = 0;
			while(rs.next())
			{
				out.println("<p>" + rs.getString("autorLibro") + "," );
				out.println(rs.getString("tituloLibro") + ",");
				out.println(rs.getString("precioLibro") + ",");
				out.println(rs.getString("cantidadLibro") + "</p>");
				count++;
			}
			out.println("<p>" + count + " registros encontrados.</p>");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}
		finally
		{
			//Cerramos el flujo de escritura
			out.close();
			try
			{
				//Cerramos el resto de recursos
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
			out.println("<a href=\"ConsultaLibros.html\">Volver</a>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}