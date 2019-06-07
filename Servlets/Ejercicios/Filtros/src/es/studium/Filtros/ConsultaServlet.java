package es.studium.Filtros;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
	private String userName;
	private String password;
	private String url;
	
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		// Se leen los parámetros de inicialización de Servlet y
		// se convierten en atributos del contexto para compartirlos con
		// cualquier Servlet y/o JSP del proyecto
		ServletContext context = config.getServletContext();
		context.setAttribute("URLBaseDatos",config.getInitParameter("URLBaseDatos"));
		context.setAttribute("usuario",config.getInitParameter("usuario"));
		context.setAttribute("clave",config.getInitParameter("clave"));
		// Se recuperan las variables de contexto de la aplicación
		userName = (String) context.getAttribute("usuario");
		password = (String) context.getAttribute("clave");
		url = (String) context.getAttribute("URLBaseDatos");
	}
	
	public ConsultaServlet()
	{
		super();
	}
	
	// El método doGet() se ejecuta una vez por cada petición HTTP GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		// Establecemos el tipo MIME del mensaje de respuesta
		response.setContentType("text/html");
		// Creamos un objeto para poder escribir la respuesta
		PrintWriter out = response.getWriter();
		// Creamos objetos para la conexión
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
			//String userName = "servletUser2";
			//String password = "Studium2018;";
			// URL de la base de datos
			//String url = "jdbc:mysql://localhost:3306/TiendaLibros";
			conn = DriverManager.getConnection(url, userName, password);
			// Paso 3: Crear las sentencias SQL utilizando objetos de la clase Statement
			stmt = conn.createStatement();
			// Paso 4: Ejecutar las sentencias
			String sqlStr = "SELECT * FROM libros WHERE idLibro=" +
					request.getParameter("idLibro");
			// Generar una página HTML como resultado de la consulta
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
			out.println("<a href=\"ConsultaLibros.html\">Volver</a>");
			out.println("</body>");
			out.println("</html>");

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
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException 
	{
		doGet(request, response);
	}
}