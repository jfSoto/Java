package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

public class ControladorModificacionCosturera implements ActionListener, WindowListener
{
	VistaModificacionCosturera vistaModificacionCosturera = null;
	ModeloModificacionCosturera modeloModificacionCosturera = null;
	
	public ControladorModificacionCosturera(ModeloModificacionCosturera modelo, VistaModificacionCosturera vista)
	{
		this.vistaModificacionCosturera = vista;
		this.modeloModificacionCosturera = modelo;
		vistaModificacionCosturera.addWindowListener(this);
		vistaModificacionCosturera.btnBorrar.addActionListener(this);
		vistaModificacionCosturera.dlgConfirmar.addWindowListener(this);
		vistaModificacionCosturera.btnAceptar.addActionListener(this);
		vistaModificacionCosturera.btnLimpiar.addActionListener(this);
		vistaModificacionCosturera.choBajaCosturera = modeloModificacionCosturera.RellenarModificacion();
		vistaModificacionCosturera.add(vistaModificacionCosturera.choBajaCosturera);
		vistaModificacionCosturera.add(vistaModificacionCosturera.btnBorrar);
	}
	
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaModificacionCosturera.dlgConfirmar.isActive())
		{
			vistaModificacionCosturera.dlgConfirmar.setVisible(false);
		}
		else if(vistaModificacionCosturera.isActive())
		{
			vistaModificacionCosturera.setVisible(false);
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
	@SuppressWarnings("unchecked")
	public void actionPerformed(ActionEvent evento)
	{
		Object objetoPulsado = evento.getSource();
		if(objetoPulsado.equals(vistaModificacionCosturera.btnBorrar))
		{
			Vector<String> v = new Vector<String>();
			v = modeloModificacionCosturera.RellenarUpdate
			(Integer.parseInt(vistaModificacionCosturera.choBajaCosturera.getSelectedItem().split(" ")[0]));
			vistaModificacionCosturera.txfNombreCosturera.setText(v.get(0)+"");
			vistaModificacionCosturera.txfApellidosCosturera.setText(v.get(1)+"");
			vistaModificacionCosturera.txfTelefonoCosturera.setText(v.get(2)+"");
			vistaModificacionCosturera.txfDniCosturera.setText(v.get(3)+"");
			vistaModificacionCosturera.txfDireccionCosturera.setText(v.get(4)+"");
			vistaModificacionCosturera.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaModificacionCosturera.btnAceptar))
		{
			modeloModificacionCosturera.ModificarCosturera
			(Integer.parseInt(vistaModificacionCosturera.choBajaCosturera.getSelectedItem().split(" ")[0]), 
			vistaModificacionCosturera.txfNombreCosturera.getText(), vistaModificacionCosturera.txfApellidosCosturera.getText(), 
			Integer.parseInt(vistaModificacionCosturera.txfTelefonoCosturera.getText()), vistaModificacionCosturera.txfDniCosturera.getText(),
			vistaModificacionCosturera.txfDireccionCosturera.getText());
			vistaModificacionCosturera.setVisible(false);
		}
		else if(objetoPulsado.equals(vistaModificacionCosturera.btnLimpiar))
		{
			vistaModificacionCosturera.txfNombreCosturera.selectAll();
			vistaModificacionCosturera.txfNombreCosturera.setText("");
			vistaModificacionCosturera.txfApellidosCosturera.selectAll();
			vistaModificacionCosturera.txfApellidosCosturera.setText("");
			vistaModificacionCosturera.txfTelefonoCosturera.selectAll();
			vistaModificacionCosturera.txfTelefonoCosturera.setText("");
			vistaModificacionCosturera.txfDniCosturera.selectAll();
			vistaModificacionCosturera.txfDniCosturera.setText("");
			vistaModificacionCosturera.txfDireccionCosturera.selectAll();
			vistaModificacionCosturera.txfDireccionCosturera.setText("");
			vistaModificacionCosturera.txfNombreCosturera.requestFocus();
		}
	}
}
