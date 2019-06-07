package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorBajaCliente implements ActionListener, WindowListener
{
	VistaBajaCliente vistaBajaCliente = null;
	ModeloBajaCliente modeloBajaCliente = null;

	public ControladorBajaCliente(ModeloBajaCliente modelo, VistaBajaCliente vista)
	{
		this.vistaBajaCliente = vista;
		this.modeloBajaCliente = modelo;
		// Añadir los Listeners
		vistaBajaCliente.addWindowListener(this);
		vistaBajaCliente.btnBorrar.addActionListener(this);
		vistaBajaCliente.dlgConfirmar.addWindowListener(this);
		vistaBajaCliente.btnAceptar.addActionListener(this);
		vistaBajaCliente.choBajaCliente = modeloBajaCliente.RellenarBaja();
		vistaBajaCliente.add(vistaBajaCliente.choBajaCliente);
		vistaBajaCliente.add(vistaBajaCliente.btnBorrar);
	}

	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaBajaCliente.dlgConfirmar.isActive())
		{
			vistaBajaCliente.dlgConfirmar.setVisible(false);
		}
		else if(vistaBajaCliente.isActive())
		{
			vistaBajaCliente.setVisible(false);
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
		if(objetoPulsado.equals(vistaBajaCliente.btnBorrar))
		{
			vistaBajaCliente.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaBajaCliente.btnAceptar))
		{
			modeloBajaCliente.BorrarCliente(Integer.parseInt(vistaBajaCliente.choBajaCliente.getSelectedItem().split(" ")[0]));
			vistaBajaCliente.dlgConfirmar.setVisible(false);
			vistaBajaCliente.setVisible(false);
		}
	}
	
}
