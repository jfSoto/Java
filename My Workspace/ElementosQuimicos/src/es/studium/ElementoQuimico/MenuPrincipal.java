package es.studium.ElementoQuimico;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MenuPrincipal extends Frame implements WindowListener, ActionListener
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final long serialVersionUID = 1L;
	MenuBar mnbMenu = new MenuBar();

	Menu mnArchivo = new Menu("Archivo");
	Menu mnOperaciones = new Menu("Operaciones");

	MenuItem mnCargar = new MenuItem("Cargar");
	MenuItem mnGuardar = new MenuItem("Guardar");
	MenuItem mnSalir = new MenuItem("Salir");

	MenuItem mnCapaValencia = new MenuItem("Capa de Valencia");
	MenuItem mnEnlace = new MenuItem("Enlace");
	
	Dialog dlgArchivo = new Dialog(this, "Diálogo con mensaje", true);

	Label lblElectrones = new Label();
	Label lblProtones = new Label();
	Label lblNeutrones = new Label();
	
	TextField cuadroTexto1 = new TextField();
	TextField cuadroTexto2 = new TextField();
	TextField cuadroTexto3 = new TextField();
	
	Button btnBotonAceptar = new Button("Aceptar");
	Button btnBotonLimpiar = new Button("Limpiar");
	
	public MenuPrincipal()
	{
		setLayout(new GridLayout(1,1));
		setTitle("Elementos Químicos");
		mnArchivo.add(mnCargar);
		mnArchivo.add(mnGuardar);
		mnArchivo.addSeparator();
		mnArchivo.add(mnSalir);
		mnOperaciones.add(mnCapaValencia);
		mnOperaciones.add(mnEnlace);
		mnCargar.addActionListener(this);
		mnGuardar.addActionListener(this);
		mnSalir.addActionListener(this);
		mnCapaValencia.addActionListener(this);
		mnEnlace.addActionListener(this);
		mnbMenu.add(mnArchivo);
		mnbMenu.add(mnOperaciones);
		setMenuBar(mnbMenu);
		setSize(250,150);
		addWindowListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		if(dlgArchivo.isActive())
		{
			dlgArchivo.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we){}
	public void actionPerformed(ActionEvent e)
	{
		Object a;
		a=e.getSource();
		if(a.equals(mnSalir))
		{
			System.exit(0);
		}
		else if(a.equals(mnGuardar))
		{
			dlgArchivo.setLayout(new GridLayout(4,2));
			dlgArchivo.setTitle("Guardar");
			dlgArchivo.addWindowListener(this);
			lblElectrones.setText("Electrones");
			dlgArchivo.add(lblElectrones);
			dlgArchivo.add(cuadroTexto1);
			lblProtones.setText("Protones");
			dlgArchivo.add(lblProtones);
			dlgArchivo.add(cuadroTexto2);
			lblNeutrones.setText("Neutrones");
			dlgArchivo.add(lblNeutrones);
			dlgArchivo.add(cuadroTexto3);
			dlgArchivo.add(btnBotonAceptar);
			dlgArchivo.add(btnBotonLimpiar);
			btnBotonAceptar.addActionListener(this);
			btnBotonLimpiar.addActionListener(this);
			dlgArchivo.setSize(300, 150);
			dlgArchivo.setLocationRelativeTo(null);
			dlgArchivo.setVisible(true);
		}
		else if(btnBotonAceptar.equals(e.getSource()))
		{
			if(dlgArchivo.isActive())
			{
				dlgArchivo.setVisible(false);
			}
			else
			{
				System.exit(0);
			}
		}
		else if(btnBotonLimpiar.equals(e.getSource()))
		{
			cuadroTexto1.selectAll();
			cuadroTexto1.setText("");
			cuadroTexto2.selectAll();
			cuadroTexto2.setText("");
			cuadroTexto3.selectAll();
			cuadroTexto3.setText("");
		}
	}
	
	public static void main(String[] args)
	{
		new MenuPrincipal();
	}

}
