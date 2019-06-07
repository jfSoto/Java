package es.studium.SessionServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// Establecemos el tipo MIME del mensaje de respuesta
		response.setContentType("text/html");
		// Creamos un objeto para poder escribir la respuesta
		PrintWriter out = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// Recoger la sesión actual si existe, en otro caso se crea una nueva
		HttpSession session = request.getSession();
		Integer contadorAccesos;
		synchronized(session)
		{
			contadorAccesos = (Integer) session.getAttribute("contadorAccesos");
			if(contadorAccesos == null)
			{
				contadorAccesos = 0;
			}
			else
			{
				contadorAccesos = new Integer(contadorAccesos + 1);
			}
			session.setAttribute("contadorAccesos", contadorAccesos);
		}
		// Escribir el mensaje de respuesta HTML
		try
		{
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head><title>Servlet de prueba de sesiones</title></head>");
			out.println("<body>");
			out.println("<h2>Accesos: "+ contadorAccesos + " en esta sesión.</h2>");
			out.println("<p>Identificador de sesión: " + session.getId() + "</p>");
			out.println("<p>Fecha de creación de la sesión: " + new
					Date(session.getCreationTime()) + "</p>" );
			out.println("<p>Fecha de último acceso a la sesión: " + new
					Date(session.getLastAccessedTime()) + "</p>" );
			out.println("<p>Máximo tiempo inactivo de la sesión: " +
					session.getMaxInactiveInterval() + " segundos.</p>");
			out.println("<p><a href='" + request.getRequestURI() +
					"'>Refrescar</a></p>");
			out.println("<p><a href='" +
					response.encodeURL(request.getRequestURI()) + "'>Refrescar con reescritura de URLs</a></p>");
					out.println("</body>");
					out.println("</html>");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			// Cerramos el flujo de escritura
			out.close();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
