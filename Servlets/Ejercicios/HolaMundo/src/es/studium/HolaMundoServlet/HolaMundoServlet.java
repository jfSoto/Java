package es.studium.HolaMundoServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HolaMundoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException
	{
		// Establecer el tipo MIME del mensaje de respuesta
		response.setContentType("text/html");
		// Crear un flujo de salida para escribir la respuesta a la petici�n del cliente
		PrintWriter out = response.getWriter();
		// Escribir el mensaje de respuesta en formato HTML
		try
		{
			out.println("<html>");
			out.println("<head><title>Mi Primer Servlet</title></head>");
			out.println("<body>");
			out.println("<h1>Hola, mundo!</h1>");
			// Mostraremos informaci�n de la petici�n del cliente
			out.println("<p>Request UI: " + request.getRequestURI() + "</p>");
			out.println("<p>Protocolo: " + request.getProtocol() + "</p>");
			out.println("<p>Direcci�n remota: " + request.getRemoteAddr() + "</p>");
			// Generar un n�mero aleatorio para cada petici�n
			out.println("N�mero aleatorio: <strong>" + Math.random() + "</strong></p>");
			out.println("</body>");
			out.println("</html>");
		}
		finally
		{
			out.close();
		}
	}
}