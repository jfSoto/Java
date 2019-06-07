package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorAltaCliente implements ActionListener, WindowListener 
{
	VistaAltaCliente vistaAltaCliente = null;
	ModeloAltaCliente modeloAltaCliente = null;
	
	public ControladorAltaCliente(ModeloAltaCliente modelo, VistaAltaCliente vista)
	{
		this.vistaAltaCliente = vista;
		this.modeloAltaCliente = modelo;
		//Añadir los Listeners
		vista.addWindowListener(this);
		vista.btnAceptar.addActionListener(this);
		vista.btnLimpiar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaAltaCliente.btnAceptar))
		{
			modeloAltaCliente.InsertarCliente(vistaAltaCliente.txfNombreCliente.getText(), vistaAltaCliente.txfApellidosCliente.getText(), 
					Integer.parseInt(vistaAltaCliente.txfTelefonoCliente.getText()));
			vistaAltaCliente.setVisible(false);
		}
		else if(a.equals(vistaAltaCliente.btnLimpiar))
		{
			vistaAltaCliente.txfNombreCliente.selectAll();
			vistaAltaCliente.txfNombreCliente.setText("");
			vistaAltaCliente.txfApellidosCliente.selectAll();
			vistaAltaCliente.txfApellidosCliente.setText("");
			vistaAltaCliente.txfTelefonoCliente.selectAll();
			vistaAltaCliente.txfTelefonoCliente.setText("");
			vistaAltaCliente.txfNombreCliente.requestFocus();
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		vistaAltaCliente.setVisible(false);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}

}


