package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorBajaCosturera implements ActionListener, WindowListener
{
	VistaBajaCosturera vistaBajaCosturera = null;
	ModeloBajaCosturera modeloBajaCosturera = null;

	public ControladorBajaCosturera(ModeloBajaCosturera modelo, VistaBajaCosturera vista)
	{
		this.vistaBajaCosturera = vista;
		this.modeloBajaCosturera = modelo;
		// Añadir los Listeners
		vistaBajaCosturera.addWindowListener(this);
		vistaBajaCosturera.btnBorrar.addActionListener(this);
		vistaBajaCosturera.dlgConfirmar.addWindowListener(this);
		vistaBajaCosturera.btnAceptar.addActionListener(this);
		vistaBajaCosturera.choBajaCosturera = modeloBajaCosturera.RellenarBaja();
		vistaBajaCosturera.add(vistaBajaCosturera.choBajaCosturera);
		vistaBajaCosturera.add(vistaBajaCosturera.btnBorrar);
	}

	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaBajaCosturera.dlgConfirmar.isActive())
		{
			vistaBajaCosturera.dlgConfirmar.setVisible(false);
		}
		else if(vistaBajaCosturera.isActive())
		{
			vistaBajaCosturera.setVisible(false);
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
		if(objetoPulsado.equals(vistaBajaCosturera.btnBorrar))
		{
			vistaBajaCosturera.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaBajaCosturera.btnAceptar))
		{
			modeloBajaCosturera.BorrarCosturera(Integer.parseInt(vistaBajaCosturera.choBajaCosturera.getSelectedItem().split(" ")[0]));
			vistaBajaCosturera.dlgConfirmar.setVisible(false);
			vistaBajaCosturera.setVisible(false);
		}
	}
	
}
