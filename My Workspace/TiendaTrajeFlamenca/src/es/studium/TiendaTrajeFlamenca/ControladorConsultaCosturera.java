package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorConsultaCosturera implements ActionListener, WindowListener 
{
	VistaConsultaCosturera vistaConsultaCosturera = null;
	ModeloConsultaCosturera modeloConsultaCosturera = null;
	
	public ControladorConsultaCosturera(ModeloConsultaCosturera modelo, VistaConsultaCosturera vista)
	{
		this.vistaConsultaCosturera = vista;
		this.modeloConsultaCosturera = modelo;
		//Añadir los Listeners
		vista.addWindowListener(this);
		vista.btnPDF.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaConsultaCosturera.btnPDF))
		{
			modeloConsultaCosturera.Consulta();
			vistaConsultaCosturera.setVisible(false);
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		vistaConsultaCosturera.setVisible(false);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
}

