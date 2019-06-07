package es.studium.TiendaTrajeFlamenca;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ModeloConsultaTraje
{
	String usuario = null;
	ModeloConsultaTraje(String usuario)
	{
		this.usuario = usuario;
	}
	public void Consulta() 
	{
		String consulta = "";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/practica3trimestreprogramacion?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM trajes";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		Document documento = new Document();

		try
		{
			//Cargar los controladores para el acceso a la BD
			Class.forName(driver);
			//Establecer la conexión con la BD 
			connection = DriverManager.getConnection(url, login, password);
			//Crear una sentencia
			statement = connection.createStatement();
			//Crear un objeto ResultSet para guardar lo obtenido
			//y ejecutar la sentencia SQL
			rs = statement.executeQuery(sentencia);
			registrar(usuario, sentencia);
			FileOutputStream ficheroPdf = new FileOutputStream("consulta.pdf");
			PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);
			documento.open();
			PdfPTable consultaClientes = new PdfPTable(5);
			consultaClientes.addCell("Número del Traje");
			consultaClientes.addCell("Tipo de Traje");
			consultaClientes.addCell("Talla del Traje");
			consultaClientes.addCell("Fecha de adquisición");
			consultaClientes.addCell("Número del Cliente");
			while(rs.next())
			{
				consulta = Integer.toString(rs.getInt("idTraje"));
				consulta = consulta + "/" + rs.getString("tipoTraje");
				consulta = consulta + "/" + Integer.toString(rs.getInt("tallaTraje"));
				consulta = consulta + "/" + rs.getString("fechaAdquisicionTrajeCliente");
				consulta = consulta + "/" + Integer.toString(rs.getInt("idClienteFK1"));

				String [] ClientesTienda = consulta.split("/");
				String  ClientesTienda1 = ClientesTienda[0];
				String  ClientesTienda2 = ClientesTienda[1];
				String  ClientesTienda3 = ClientesTienda[2];
				String  ClientesTienda4 = ClientesTienda[3];
				String  ClientesTienda5 = ClientesTienda[4];

				consultaClientes.addCell(ClientesTienda1);
				consultaClientes.addCell(ClientesTienda2);
				consultaClientes.addCell(ClientesTienda3);
				consultaClientes.addCell(ClientesTienda4);
				consultaClientes.addCell(ClientesTienda5);
			}
			documento.add(consultaClientes);
			documento.close();
			// Abrimos el archivo PDF recién creado	
			try 
			{
				File path = new File("consulta.pdf");
				Desktop.getDesktop().open(path);
			} catch (IOException ex) {
				System.out.println("Se ha producido un error al abrir el archivo PDF");
			}

		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		} 
		catch (FileNotFoundException e){} 
		catch (DocumentException e){}

		finally
		{
			try
			{
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch (SQLException e)
			{
				System.out.println("Error 3-"+e.getMessage());
			}
		}
	}
	public void registrar(String usuario, String mensaje)
	{
		Date fechaHora = new Date();
		DateFormat formatoEuropeo = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		try
		{
			FileWriter fw = new FileWriter("Log.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.print("[" + formatoEuropeo.format(fechaHora) + "] ");
			salida.print("[" + usuario + "] ");
			salida.print("[" + mensaje + "]\n");
			salida.close();
			bw.close();
			fw.close();
		}
		catch(Exception e){}
	}
}

