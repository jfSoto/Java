package es.studium.pymsanisidro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorAltaClientes implements ActionListener, WindowListener 
{
	VistaAltaClientes vistaAltaServicio = null;
	ModeloServicio modeloServicio = null;
	
	public ControladorAltaClientes(ModeloServicio modelo, VistaAltaClientes vista)
	{
		this.vistaAltaServicio = vista;
		this.modeloServicio = modelo;
		//Añadir los Listeners
		vista.addWindowListener(this);
		vista.btnAceptar.addActionListener(this);
		vista.btnLimpiar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaAltaServicio.btnAceptar))
		{
			//if(modeloServicio.(vistaAltaServicio.txfUsuario.getText(),vistaAltaServicio.txfPrecio.getText()))
			{
				System.out.println("Acceso permitido");
			}
			
		}
		else if(a.equals(vistaAltaServicio.btnLimpiar))
		{
			vistaAltaServicio.txfUsuario.selectAll();
			vistaAltaServicio.txfUsuario.setText("");
			vistaAltaServicio.txfPrecio.selectAll();
			vistaAltaServicio.txfPrecio.setText("");
			vistaAltaServicio.txfUsuario.requestFocus();
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		vistaAltaServicio.setVisible(false);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}

}


