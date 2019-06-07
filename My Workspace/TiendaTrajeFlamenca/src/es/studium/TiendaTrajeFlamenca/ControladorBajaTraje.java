package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorBajaTraje implements ActionListener, WindowListener
{
	VistaBajaTraje vistaBajaTraje = null;
	ModeloBajaTraje modeloBajaTraje = null;

	public ControladorBajaTraje(ModeloBajaTraje modelo, VistaBajaTraje vista)
	{
		this.vistaBajaTraje = vista;
		this.modeloBajaTraje = modelo;
		// Añadir los Listeners
		vistaBajaTraje.addWindowListener(this);
		vistaBajaTraje.btnBorrar.addActionListener(this);
		vistaBajaTraje.dlgConfirmar.addWindowListener(this);
		vistaBajaTraje.btnAceptar.addActionListener(this);
		vistaBajaTraje.choBajaCliente = modeloBajaTraje.RellenarBaja();
		vistaBajaTraje.add(vistaBajaTraje.choBajaCliente);
		vistaBajaTraje.add(vistaBajaTraje.btnBorrar);
	}

	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaBajaTraje.dlgConfirmar.isActive())
		{
			vistaBajaTraje.dlgConfirmar.setVisible(false);
		}
		else if(vistaBajaTraje.isActive())
		{
			vistaBajaTraje.setVisible(false);
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
		if(objetoPulsado.equals(vistaBajaTraje.btnBorrar))
		{
			vistaBajaTraje.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaBajaTraje.btnAceptar))
		{
			modeloBajaTraje.BorrarTraje(Integer.parseInt(vistaBajaTraje.choBajaCliente.getSelectedItem().split(" ")[0]));
			vistaBajaTraje.dlgConfirmar.setVisible(false);
			vistaBajaTraje.setVisible(false);
		}
	}
	
}
