package es.studium.LibreriaMVC;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletControlador()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public void init(ServletConfig conf) throws ServletException
	{
		super.init(conf);
		LibrosMVC.cargarDatos();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException
	{
		// Recupera la sesi�n actual o crea una nueva si no existe
		HttpSession session = request.getSession(true);
		// Recupera el carrito de la sesi�n actual
		ArrayList<ElementoPedido> elCarrito = (ArrayList<ElementoPedido>) session.getAttribute("carrito");
		// Determina a qu� p�gina jsp se redirigir�
		String nextPage = "";
		String todo = request.getParameter("todo");
		if(todo==null)
		{
			// Primer acceso, redirigir a order.jsp
			nextPage = "/order.jsp";
		}
		else if(todo.equals("add"))
		{
			// Mandado por order.jsp con los par�metros idLibro y cantidad
			// Creamos un elementoPedido y lo a�adimos al carrito
			ElementoPedido nuevoElementoPedido = new ElementoPedido(
					Integer.parseInt(request.getParameter("idLibro")),
					Integer.parseInt(request.getParameter("cantidad")));
			if(elCarrito==null)
			{
				// El carrito est� vac�o
				elCarrito = new ArrayList<>();
				elCarrito.add(nuevoElementoPedido);
				// Enlazar el carrito con la sesi�n
				session.setAttribute("carrito", elCarrito);
			}
			else
			{
				// Comprueba si el libro est� ya en el carrito
				// Si lo est�, actualizamos la cantidad
				// Si no est�, lo a�adimos
				boolean encontrado = false;
				Iterator<ElementoPedido> iter = elCarrito.iterator();
				while(!encontrado&&iter.hasNext())
				{
					ElementoPedido unElementoPedido = (ElementoPedido)iter.next();
					if(unElementoPedido.getIdLibro() ==
							nuevoElementoPedido.getIdLibro())
					{
						unElementoPedido.setCantidad(unElementoPedido.getCantidad()
								+ nuevoElementoPedido.getCantidad());
						encontrado = true;
					}
				}
				if(!encontrado)
				{
					// Lo a�ade al carrito
					elCarrito.add(nuevoElementoPedido);
				}
			}
			// Volvemos a order.jps para seguir con la compra
			nextPage = "/order.jsp";
		}
		else if(todo.equals("remove"))
		{
			// Enviado por order.jsp con el par�metro indiceElemento
			// Borra el elemento indiceElemento del carrito
			int indiceCarrito = Integer.parseInt(request.getParameter("indiceElemento"));
			elCarrito.remove(indiceCarrito);
			// Vuelve a order.jsp para seguir con la compra
			nextPage = "/order.jsp";
		}
		else if (todo.equals("checkout"))
		{
			// Enviado por order.jsp
			// Calcula el precio total de todos los elementos del carrito
			float precioTotal = 0;
			int cantidadTotalOrdenada = 0;
			// Alta en pedidos
			Connection conn = null;
			Statement stmt = null;
			int idPedidoFK = 0;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String userName = "servletUser2";
				String password = "Studium2018;";
				String url = "jdbc:mysql://localhost:3306/TiendaLibros?useSSL=true";
				conn = DriverManager.getConnection(url, userName, password);
				stmt = conn.createStatement();
				LocalDate fecha = LocalDate.now();
				String sqlStr = "INSERT INTO pedidos (idPedido, fechaPedido, idUsuarioFK1, estadoPedido) VALUES(null,'"+fecha+"',1,0);";
				stmt.executeUpdate(sqlStr);
				// Sacar el id reci�n creado idPedido-->idPedidoFK
				String sacarIdPedido = "SELECT MAX(idPedido) AS idPedidoFK FROM pedidos;";
				ResultSet rs = stmt.executeQuery(sacarIdPedido);
				rs.next();
				idPedidoFK = rs.getInt("idPedidoFK");
			} 
			catch (ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			} 
			
			// Por cada elemento del carrito, hacer un  INSERT en pedidosLibros
			for(ElementoPedido item: elCarrito)
			{
				float precio = Float.parseFloat(item.getPrecio());
				int cantidadOrdenada = item.getCantidad();
				int idLibroFK2 = item.getIdLibro();
				idLibroFK2++;
				System.out.println(idLibroFK2);
				precioTotal += precio * cantidadOrdenada;
				cantidadTotalOrdenada += cantidadOrdenada;
				String insertPedidosLibros = "INSERT INTO pedidosLibros (idPedidoLibro, idLibroFK2, idPedidoFK3, cantidadPedidoLibro) VALUES(null,"+idLibroFK2+","
				+idPedidoFK+","+cantidadOrdenada+");";
				try
				{
					stmt.executeUpdate(insertPedidosLibros);
				} catch (SQLException e)
				{
					e.printStackTrace();
				}
				
			}
			// Da formato al precio con dos decimales
			StringBuilder sb = new StringBuilder();
			Formatter formatter = new Formatter(sb);
			formatter.format("%.2f", precioTotal);
			formatter.close();
			// Coloca el precioTotal y la cantidadtotal en el request
			request.setAttribute("precioTotal", sb.toString());
			request.setAttribute("cantidadTotal", cantidadTotalOrdenada+"");
			//Redirige a checkout.jsp
			nextPage = "/checkout.jsp";
		}
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(nextPage);
		requestDispatcher.forward(request, response);
	}
}
