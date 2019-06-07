package es.studium.Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Integer aciertos = 0;
		Integer fallos = 0;
		String[] parametro = {"P0","P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9"};
		String[] respuesta = {"B","A", "C", "A", "B", "A", "C", "B", "A", "C"};
		/*if(request.getParameter("P0").equals("B"))
		{
			aciertos ++;
		}*/
		for(Integer i=0; i < parametro.length; i++)
		{
			if(request.getParameter(parametro[i]).equals(respuesta[i]))
			{
				aciertos ++;
			}
			else
			{
				fallos ++;
			}	
		}
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Gracias!");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Nombre: "+ request.getParameter("nombre") +"</p>");
		out.println("<p>Apellidos: "+ request.getParameter("apellido1") +" " + request.getParameter("apellido2")+ "</p>");
		out.println("<h1>Aciertos: "+aciertos+"</h1>");
		out.println("<h1>Aciertos: "+fallos+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
