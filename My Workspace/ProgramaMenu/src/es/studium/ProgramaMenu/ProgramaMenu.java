package es.studium.ProgramaMenu;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ProgramaMenu extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	
	MenuBar mnbMenu = new MenuBar();
	
	Menu mnArticulos = new Menu("Artículos");
	Menu mnClientes = new Menu("Clientes");
	Menu mnFacturas = new Menu("Facturas");
	
	MenuItem mnNuevoArticulo = new MenuItem("Nuevo Artículo");
	MenuItem mnEliminarArticulo = new MenuItem("Eliminar Artículo");
	MenuItem mnConsultarArticulo = new MenuItem("Consultar Artículo");
	
	MenuItem mnNuevoCliente = new MenuItem("Nuevo Cliente");
	MenuItem mnEliminarCliente = new MenuItem("Eliminar Cliente");
	MenuItem mnConsultarCliente = new MenuItem("Consultar Cliente");
	
	MenuItem mnNuevaFactura = new MenuItem("Nueva Factura");
	MenuItem mnEliminarFactura = new MenuItem("Eliminar Factura");
	
	Dialog dlgProgramaMenu = new Dialog(this, "Diálogo con mensaje", true);
	
	Label lblEtiqueta = new Label();
	
	public ProgramaMenu()
	{
		setLayout(new FlowLayout());
		setTitle("Programa con barra de menú");
		mnArticulos.add(mnNuevoArticulo);
		mnArticulos.add(mnEliminarArticulo);
		mnArticulos.add(mnConsultarArticulo);
		mnClientes.add(mnNuevoCliente);
		mnClientes.add(mnEliminarCliente);
		mnClientes.add(mnConsultarCliente);
		mnFacturas.add(mnNuevaFactura);
		mnFacturas.add(mnEliminarFactura);
		mnNuevoArticulo.addActionListener(this);
		mnEliminarArticulo.addActionListener(this);
		mnConsultarArticulo.addActionListener(this);
		mnNuevoCliente.addActionListener(this);
		mnEliminarCliente.addActionListener(this);
		mnConsultarCliente.addActionListener(this);
		mnNuevaFactura.addActionListener(this);
		mnEliminarFactura.addActionListener(this);
		mnbMenu.add(mnArticulos);
		mnbMenu.add(mnClientes);
		mnbMenu.add(mnFacturas);
		setMenuBar(mnbMenu);
		setSize(250,150);
		addWindowListener(this);
		dlgProgramaMenu.setLayout(new FlowLayout());
		dlgProgramaMenu.setSize(200,150);
		dlgProgramaMenu.addWindowListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		
	public static void main(String[] args)
	{
		new ProgramaMenu();
	}

	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		if(dlgProgramaMenu.isActive())
		{
			dlgProgramaMenu.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent ae)
	{
		Object a;
		a=ae.getSource();
		if(a.equals(mnNuevoArticulo))
		{
			lblEtiqueta.setText("Dialog de Nuevo Artículo");
		}
		else if(a.equals(mnEliminarArticulo))
		{
			lblEtiqueta.setText("Dialog de Eliminar Artículo");
		}
		else if(a.equals(mnConsultarArticulo))
		{
			lblEtiqueta.setText("Dialog de Consultar Artículo");
		}
		else if(a.equals(mnNuevoCliente))
		{
			lblEtiqueta.setText("Dialog de Nuevo Cliente");
		}
		else if(a.equals(mnEliminarCliente))
		{
			lblEtiqueta.setText("Dialog de Eliminar Cliente");
		}
		else if(a.equals(mnConsultarCliente))
		{
			lblEtiqueta.setText("Dialog de Consultar Cliente");
		}
		else if(a.equals(mnNuevaFactura))
		{
			lblEtiqueta.setText("Dialog de Nueva Factura");
		}
		else if(a.equals(mnEliminarFactura))
		{	
			lblEtiqueta.setText("Dialog de Eliminar Factura");
		}
		dlgProgramaMenu.add(lblEtiqueta);
		dlgProgramaMenu.setLocationRelativeTo(null);
		dlgProgramaMenu.setVisible(true);
	}
}
