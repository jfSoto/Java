package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorBajaAsignacion implements ActionListener, WindowListener
{
	VistaBajaAsignacion vistaBajaAsignacion = null;
	ModeloBajaAsignacion modeloBajaAsignacion = null;

	public ControladorBajaAsignacion(ModeloBajaAsignacion modelo, VistaBajaAsignacion vista)
	{
		this.vistaBajaAsignacion = vista;
		this.modeloBajaAsignacion = modelo;
		// Añadir los Listeners
		vistaBajaAsignacion.addWindowListener(this);
		vistaBajaAsignacion.btnBorrar.addActionListener(this);
		vistaBajaAsignacion.dlgConfirmar.addWindowListener(this);
		vistaBajaAsignacion.btnAceptar.addActionListener(this);
		vistaBajaAsignacion.choBajaCliente = modeloBajaAsignacion.RellenarBaja();
		vistaBajaAsignacion.add(vistaBajaAsignacion.choBajaCliente);
		vistaBajaAsignacion.add(vistaBajaAsignacion.btnBorrar);
	}

	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaBajaAsignacion.dlgConfirmar.isActive())
		{
			vistaBajaAsignacion.dlgConfirmar.setVisible(false);
		}
		else if(vistaBajaAsignacion.isActive())
		{
			vistaBajaAsignacion.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void actionPerformed(ActionEvent evento)
	{
		Object objetoPulsado = evento.getSource();
		if(objetoPulsado.equals(vistaBajaAsignacion.btnBorrar))
		{
			vistaBajaAsignacion.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaBajaAsignacion.btnAceptar))
		{
			modeloBajaAsignacion.BorrarAsignacion(Integer.parseInt(vistaBajaAsignacion.choBajaCliente.getSelectedItem().split(" ")[0]));
			vistaBajaAsignacion.dlgConfirmar.setVisible(false);
			vistaBajaAsignacion.setVisible(false);
		}
	}
	
}
