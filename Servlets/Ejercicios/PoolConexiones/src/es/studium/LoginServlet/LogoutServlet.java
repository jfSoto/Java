package es.studium.LoginServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet(
		name = "LogoutServlet",
		urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogoutServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try
		{
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Logout</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>Logout</h2>");
			HttpSession session = request.getSession(false);
			if(session == null)
			{
				out.println("<h3>No has iniciado sesión</h3>");
			}
			else
			{
				session.invalidate();
				out.println("<p>Adiós</p>");
				out.println("<p><a href='index.html'>Login</a></p>");
			}
			out.println("</body>");
			out.println("</html>");
		}
		finally
		{
			// Cerramos objetos
			out.close();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
