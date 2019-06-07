package es.studium.SurveyServlet;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	String resultsDir="C:\\Users\\pc\\eclipse-workspace\\SurveyServlet";
	public SurveyServlet()
	{
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException
	{
		response.getWriter().append("Sirviendo en...").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter toClient = response.getWriter();
		try
		{
			// Abrir el fichero para escribir en él los resultados
			String surveyName = request.getParameterValues("nombreEncuesta")[0];
			FileWriter resultsFile = new FileWriter(resultsDir +
					System.getProperty("file.separator")+surveyName+".txt",true);
			PrintWriter toFile = new PrintWriter(resultsFile);
			// Obtener los datos del formulario del cliente
			// Guardar los datos en el fichero con un formato
			toFile.println("<BEGIN>");
			Enumeration<String> values = request.getParameterNames();
			while(values.hasMoreElements())
			{
				String name = (String) values.nextElement();
				String value = request.getParameterValues(name)[0];
				if(!name.equals("Submit"))
				{
					toFile.println(name+":"+value);
				}
			}
			toFile.println("<END>");
			// Cerrar el fichero
			toFile.close();
			// Responder al cliente
			toClient.println("<html>");
			toClient.println("<head>");
			toClient.println("<title>");
			toClient.println("Gracias!");
			toClient.println("</title>");
			toClient.println("</head>");
			toClient.println("<body>");
			toClient.println("<h1>¡Gracias por su colaboración!</h1>");
			toClient.println("</body>");
			toClient.println("</html>");
		}
		catch(IOException e)
		{
			e.printStackTrace();
			toClient.println("Ocurrió un error al guardar. Intentar de nuevo...");
		}
		// Cerrar la respuesta
		toClient.close();
	}
}