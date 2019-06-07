package es.studium.HTMLServlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ejemplo1")
public class HTMLServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
			throws ServletException, IOException
	{
		respuesta.setContentType("text/html");
		PrintWriter salida = respuesta.getWriter();
		salida.println("<html>\n" +
				"<head><title>Hola Mundo!</title></head>\n" +
				"<body>\n" +
				"<h1>Hola Mundo!</h1>\n" +
				"</body></html>");
	} 
}