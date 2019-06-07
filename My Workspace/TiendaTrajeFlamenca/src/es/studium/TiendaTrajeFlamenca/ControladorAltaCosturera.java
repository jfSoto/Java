package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorAltaCosturera implements ActionListener, WindowListener 
{
	VistaAltaCosturera vistaAltaCosturera= null;
	ModeloAltaCosturera modeloAltaCosturera = null;
	
	public ControladorAltaCosturera(ModeloAltaCosturera modelo, VistaAltaCosturera vista)
	{
		this.vistaAltaCosturera = vista;
		this.modeloAltaCosturera = modelo;
		//Añadir los Listeners
		vista.addWindowListener(this);
		vista.btnAceptar.addActionListener(this);
		vista.btnLimpiar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		if(a.equals(vistaAltaCosturera.btnAceptar))
		{
			modeloAltaCosturera.InsertarCosturera(vistaAltaCosturera.txfNombreCosturera.getText(), vistaAltaCosturera.txfApellidosCosturera.getText(), 
					Integer.parseInt(vistaAltaCosturera.txfTelefonoCosturera.getText()), vistaAltaCosturera.txfDniCosturera.getText(),
					vistaAltaCosturera.txfDireccionCosturera.getText());
			vistaAltaCosturera.setVisible(false);
		}
		else if(a.equals(vistaAltaCosturera.btnLimpiar))
		{
			vistaAltaCosturera.txfNombreCosturera.selectAll();
			vistaAltaCosturera.txfNombreCosturera.setText("");
			vistaAltaCosturera.txfApellidosCosturera.selectAll();
			vistaAltaCosturera.txfApellidosCosturera.setText("");
			vistaAltaCosturera.txfTelefonoCosturera.selectAll();
			vistaAltaCosturera.txfTelefonoCosturera.setText("");
			vistaAltaCosturera.txfDniCosturera.selectAll();
			vistaAltaCosturera.txfDniCosturera.setText("");
			vistaAltaCosturera.txfDireccionCosturera.selectAll();
			vistaAltaCosturera.txfDireccionCosturera.setText("");
			vistaAltaCosturera.txfNombreCosturera.requestFocus();
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		vistaAltaCosturera.setVisible(false);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}

}


