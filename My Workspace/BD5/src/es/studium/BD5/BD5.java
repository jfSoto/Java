package es.studium.BD5;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BD5 extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	TextField direccionCentroTrabajo = new TextField(20);
	TextField nombreCentroTrabajo = new TextField(20);
	Button insertar = new Button("Insertar");
	Button cancelar = new Button("Borrar");
	Dialog d = new Dialog(this, "Operación Inserción", true);
	Label f = new Label ("Nombre Centro de trabajo");
	Label r = new Label ("Dirección Centro de trabajo");
	Label e = new Label ("Operación realizada correctamente!");
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/Empresa";
	String login = "root";
	String password = "Studium2018;";
	Connection connection = null;
	Statement statement = null;

	public BD5()
	{
		setLayout(new GridLayout(3,2));
		setSize(400,200);
		setResizable(false);
		add(f);
		add(nombreCentroTrabajo);
		add(r);
		add(direccionCentroTrabajo);
		add(insertar);
		add(cancelar);
		setLocationRelativeTo(null);
		insertar.addActionListener(this);
		cancelar.addActionListener(this);
		addWindowListener(this);
		// Diálogo
		d.setLayout(new FlowLayout());
		d.add(e);
		d.setSize(250,150);
		//Para poder cerrar el Diálogo
		d.addWindowListener(this);
		//Cargar el Driver
		try
		{
			Class.forName(driver);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Se ha producido un error al cargar el Driver");
		}
		//Establecer la conexión con la base de datos
		try
		{
			connection = DriverManager.getConnection(url, login, password);
		}
		catch(SQLException e)
		{
			System.out.println("Se produjo un error al conectar a la Base de Datos");
		}
		//Preparar el statement
		try
		{
			statement =
					connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		}
		catch(SQLException e)
		{
			System.out.println("Error en la sentencia SQL");
		}
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new BD5();
	}
	public void windowActivated(WindowEvent windowEvent){}
	public void windowClosed(WindowEvent windowEvent) {}
	public void windowClosing(WindowEvent windowEvent)
	{
		// Si es el Cerrar del diálogo
		if(d.hasFocus())
		{
			d.setVisible(false);
		}
		else
		{
			//Cerrar los elementos de la base de datos
			try
			{
				statement.close();
				connection.close();
			}
			catch(SQLException e)
			{
				System.out.println("Error al cerrar "+e.toString());
			}
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent windowEvent) {}
	public void windowDeiconified(WindowEvent windowEvent) {}
	public void windowIconified(WindowEvent windowEvent) {}
	public void windowOpened(WindowEvent windowEvent) {}
	public void actionPerformed(ActionEvent actionEvent)
	{
		// Hemos pulsado Insertar
		if(insertar.equals(actionEvent.getSource()))
		{
			try
			{
				statement.executeUpdate("INSERT INTO centrosTrabajo(nombreCentroTrabajo, direccionCentroTrabajo) VALUES('"+nombreCentroTrabajo.getText()+"','"+direccionCentroTrabajo.getText()+"' )");
				nombreCentroTrabajo.setText("");
				direccionCentroTrabajo.setText("");
				d.setLocationRelativeTo(null);
				d.setVisible(true);
			}
			catch(SQLException se)
			{
				System.out.println("Error en la sentencia SQL"+se.toString());
			}
		}
		else
		{
			nombreCentroTrabajo.getText();
			nombreCentroTrabajo.setText("");
			direccionCentroTrabajo.getText();
			direccionCentroTrabajo.setText("");
		}
	}
}
