package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorAltaAsignacion implements ActionListener, WindowListener 
{
	VistaAltaAsignacion vistaAltaAsignacion = null;
	ModeloAltaAsignacion modeloAltaAsignacion = null;

	public ControladorAltaAsignacion(ModeloAltaAsignacion modelo, VistaAltaAsignacion vista)
	{
		this.vistaAltaAsignacion = vista;
		this.modeloAltaAsignacion = modelo;
		//Añadir los Listeners
		vista.addWindowListener(this);
		vista.btnAceptar.addActionListener(this);
		vista.btnLimpiar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaAltaAsignacion.btnAceptar))
		{
			modeloAltaAsignacion.InsertarAsignacion(Integer.parseInt(vistaAltaAsignacion.txfIdTrajeFK.getText()), 
			Integer.parseInt(vistaAltaAsignacion.txfIdCostureraFK.getText()), 
			vistaAltaAsignacion.txfFechaInicioFabricacionTraje.getText(), 
			vistaAltaAsignacion.txfFechaFinFabricacionTraje.getText());
			vistaAltaAsignacion.setVisible(false);
		}
		else if(a.equals(vistaAltaAsignacion.btnLimpiar))
		{
			vistaAltaAsignacion.txfIdTrajeFK.selectAll();
			vistaAltaAsignacion.txfIdTrajeFK.setText("");
			vistaAltaAsignacion.txfIdCostureraFK.selectAll();
			vistaAltaAsignacion.txfIdCostureraFK.setText("");
			vistaAltaAsignacion.txfFechaInicioFabricacionTraje.selectAll();
			vistaAltaAsignacion.txfFechaInicioFabricacionTraje.setText("");
			vistaAltaAsignacion.txfFechaFinFabricacionTraje.selectAll();
			vistaAltaAsignacion.txfFechaFinFabricacionTraje.setText("");
			vistaAltaAsignacion.txfIdTrajeFK.requestFocus();
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		vistaAltaAsignacion.setVisible(false);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}

}


