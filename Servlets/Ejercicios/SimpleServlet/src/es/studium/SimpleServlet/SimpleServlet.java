package es.studium.SimpleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Establecer el tipo MIME del mensaje de respuesta
				response.setContentType("text/html");
				// Crear un flujo de salida para escribir la respuesta a la petici�n del cliente
				PrintWriter out = response.getWriter();
				// Escribir el mensaje de respuesta en formato HTML
				try
				{
					out.println("<html>");
					out.println("<head><title>SimpleServlet</title></head>");
					out.println("<body>");
					out.println("<h1>Ejercicio de repaso numero 1</h1>");
					out.println("</body>");
					out.println("</html>");
				}
				finally
				{
					out.close();
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
