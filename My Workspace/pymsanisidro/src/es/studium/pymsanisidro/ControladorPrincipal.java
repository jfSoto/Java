package es.studium.pymsanisidro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPrincipal implements ActionListener, WindowListener 
{
	//Atributos
	VistaPrincipal vistaPrincipal = null;

	//Construtores
	public ControladorPrincipal( VistaPrincipal vista)
	{
		this.vistaPrincipal = vista;

		//Añadir los Listeners
		vistaPrincipal.addWindowListener(this);
		vistaPrincipal.altaSer.addActionListener(this);
		vistaPrincipal.bajaSer.addActionListener(this);
		vistaPrincipal.modificacionSer.addActionListener(this);
		vistaPrincipal.consultaSer.addActionListener(this);
		vistaPrincipal.altaPro.addActionListener(this);
		vistaPrincipal.bajaPro.addActionListener(this);
		vistaPrincipal.modificacionPro.addActionListener(this);
		vistaPrincipal.consultaPro.addActionListener(this);
		vistaPrincipal.altaCli.addActionListener(this);
		vistaPrincipal.bajaCli.addActionListener(this);
		vistaPrincipal.modificacionCli.addActionListener(this);
		vistaPrincipal.consultaCli.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaPrincipal.altaSer))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.bajaSer))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.modificacionSer))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.consultaSer))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		//PRODUCTO
		if(a.equals(vistaPrincipal.altaPro))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.bajaPro))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.modificacionPro))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.consultaPro))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		//CLIENTES
		if(a.equals(vistaPrincipal.altaCli))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.bajaCli))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.modificacionCli))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
		if(a.equals(vistaPrincipal.consultaCli))
		{
			VistaAltaServicio vistaAltaServicio = new VistaAltaServicio();
			ModeloServicio modeloServicio = new ModeloServicio();
			new ControladorAltaServicio(modeloServicio, vistaAltaServicio);
		}
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

}
