package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorAltaTraje implements ActionListener, WindowListener 
{
	VistaAltaTraje vistaAltaTraje = null;
	ModeloAltaTraje modeloAltaTraje = null;
	
	public ControladorAltaTraje(ModeloAltaTraje modelo, VistaAltaTraje vista)
	{
		this.vistaAltaTraje = vista;
		this.modeloAltaTraje = modelo;
		//Añadir los Listeners
		vista.addWindowListener(this);
		vista.btnAceptar.addActionListener(this);
		vista.btnLimpiar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaAltaTraje.btnAceptar))
		{
			modeloAltaTraje.InsertarTraje(vistaAltaTraje.txfTipoTraje.getText(), Integer.parseInt(vistaAltaTraje.txfTallaTraje.getText()), 
			vistaAltaTraje.txfFechaAdquisicionTrajeCliente.getText(), Integer.parseInt(vistaAltaTraje.txfIdClienteFK.getText()));
			vistaAltaTraje.setVisible(false);
		}
		else if(a.equals(vistaAltaTraje.btnLimpiar))
		{
			vistaAltaTraje.txfTipoTraje.selectAll();
			vistaAltaTraje.txfTipoTraje.setText("");
			vistaAltaTraje.txfTallaTraje.selectAll();
			vistaAltaTraje.txfTallaTraje.setText("");
			vistaAltaTraje.txfFechaAdquisicionTrajeCliente.selectAll();
			vistaAltaTraje.txfFechaAdquisicionTrajeCliente.setText("");
			vistaAltaTraje.txfIdClienteFK.selectAll();
			vistaAltaTraje.txfIdClienteFK.setText("");
			vistaAltaTraje.txfTipoTraje.requestFocus();
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		vistaAltaTraje.setVisible(false);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}

}


