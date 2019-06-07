package es.studium.EjemploInstalador;

import java.awt.Button;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class EjemploInstalador extends Frame implements ActionListener, WindowListener, ComponentListener
{
	private static final long serialVersionUID = 1L;
	Image imagen1;
	Toolkit herramienta;
	Label label = new Label("Tipo:");
	TextField txfield = new TextField(20);
	Button boton= new Button("Botón");

	EjemploInstalador()
	{
		setTitle("Alta Cliente");
		setLayout(new FlowLayout());
		herramienta = getToolkit();
		imagen1 = herramienta.getImage("imagen.jpg");
		add(label);
		add(boton);
		setSize(800, 600);
		addWindowListener(this);
		addComponentListener(this);
		boton.addActionListener(this);
		setResizable(false);
		setLocationRelativeTo(null);
		txfield = conectar();
		add(txfield);
		setVisible(true);	
	}
	public void paint(Graphics g)
	{
		// Dibujar la imagen
		g.drawImage(imagen1,4,23,this);
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
	public void actionPerformed(ActionEvent evento)
	{
		Object objetoPulsado = evento.getSource();
		if(objetoPulsado.equals(boton))
		{
			// Se crea el documento
			Document documento = new Document();
			try
			{
				// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
				FileOutputStream ficheroPdf = new FileOutputStream("fichero.pdf");
				// Se asocia el documento al OutputStream y se indica que el espaciado entre
				// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
				PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
				// Se abre el documento.
				documento.open();
				Paragraph alinear = new Paragraph(txfield.getText());				
				alinear.setAlignment(Paragraph.ALIGN_CENTER);
				documento.add(alinear);
				documento.close();
				//Abrimos el archivo PDF recién creado
				try
				{
					File path = new File ("fichero.pdf");
					Desktop.getDesktop().open(path);
				}
				catch (IOException ex)
				{
					System.out.println("Se ha producido un error al abrir el archivo PDF");
				}
			}
			catch(Exception e) {}
		}
	}
	public void componentHidden(ComponentEvent e){}
	public void componentMoved(ComponentEvent e){}
	public void componentResized(ComponentEvent e)
	{
		boton.setLocation(50,550);
		label.setLocation(380,360);
		txfield.setLocation(340,400);
	}
	public void componentShown(ComponentEvent e){}
	public static void main(String[] args)
	{
		new EjemploInstalador();
	}
	public TextField conectar()
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM empleados ORDER BY salarioEmpleado";
		TextField lista = new TextField();
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

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
			while(rs.next())
			{
				lista.setText(rs.getString("nombreEmpleado"));
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
		return(lista);
	}
}



