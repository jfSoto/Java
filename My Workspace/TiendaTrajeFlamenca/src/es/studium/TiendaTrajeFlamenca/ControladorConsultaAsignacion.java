package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorConsultaAsignacion implements ActionListener, WindowListener
{
	VistaConsultaAsignacion vistaConsultaAsignacion = null;
	ModeloConsultaAsignacion modeloConsultaAsignacion = null;
	
	public ControladorConsultaAsignacion(ModeloConsultaAsignacion modelo, VistaConsultaAsignacion vista)
	{
		this.vistaConsultaAsignacion = vista;
		this.modeloConsultaAsignacion = modelo;
		//A�adir los Listeners
		vista.addWindowListener(this);
		vista.btnPDF.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaConsultaAsignacion.btnPDF))
		{
			modeloConsultaAsignacion.Consulta();
			vistaConsultaAsignacion.setVisible(false);
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		vistaConsultaAsignacion.setVisible(false);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
}
