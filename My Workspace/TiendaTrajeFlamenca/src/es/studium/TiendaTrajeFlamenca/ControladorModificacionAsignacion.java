package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

public class ControladorModificacionAsignacion implements ActionListener, WindowListener
{
	VistaModificacionAsignacion vistaModificacionAsignacion = null;
	ModeloModificacionAsignacion modeloModificacionAsignacion = null;
	
	public ControladorModificacionAsignacion(ModeloModificacionAsignacion modelo, VistaModificacionAsignacion vista)
	{
		this.vistaModificacionAsignacion = vista;
		this.modeloModificacionAsignacion = modelo;
		vistaModificacionAsignacion.addWindowListener(this);
		vistaModificacionAsignacion.btnBorrar.addActionListener(this);
		vistaModificacionAsignacion.dlgConfirmar.addWindowListener(this);
		vistaModificacionAsignacion.btnAceptar.addActionListener(this);
		vistaModificacionAsignacion.btnLimpiar.addActionListener(this);
		vistaModificacionAsignacion.choBajaCliente = modeloModificacionAsignacion.RellenarModificacion();
		vistaModificacionAsignacion.add(vistaModificacionAsignacion.choBajaCliente);
		vistaModificacionAsignacion.add(vistaModificacionAsignacion.btnBorrar);
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaModificacionAsignacion.dlgConfirmar.isActive())
		{
			vistaModificacionAsignacion.dlgConfirmar.setVisible(false);
		}
		else if(vistaModificacionAsignacion.isActive())
		{
			vistaModificacionAsignacion.setVisible(false);
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
		if(objetoPulsado.equals(vistaModificacionAsignacion.btnBorrar))
		{
			Vector<String> v = new Vector<String>();
			v = modeloModificacionAsignacion.RellenarUpdate
			(Integer.parseInt(vistaModificacionAsignacion.choBajaCliente.getSelectedItem().split(" ")[0]));
			vistaModificacionAsignacion.txfIdTrajeFK.setText(v.get(0)+"");
			vistaModificacionAsignacion.txfIdCostureraFK.setText(v.get(1)+"");
			vistaModificacionAsignacion.txfFechaInicioFabricacionTraje.setText(v.get(2)+"");
			vistaModificacionAsignacion.txfFechaFinFabricacionTraje.setText(v.get(3)+"");
			vistaModificacionAsignacion.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaModificacionAsignacion.btnAceptar))
		{
			modeloModificacionAsignacion.ModificarCliente
			(Integer.parseInt(vistaModificacionAsignacion.choBajaCliente.getSelectedItem().split(" ")[0]), 
			Integer.parseInt(vistaModificacionAsignacion.txfIdTrajeFK.getText()), 
			Integer.parseInt(vistaModificacionAsignacion.txfIdCostureraFK.getText()), 
			vistaModificacionAsignacion.txfFechaInicioFabricacionTraje.getText(),
			vistaModificacionAsignacion.txfFechaFinFabricacionTraje.getText());
			vistaModificacionAsignacion.setVisible(false);
		}
		else if(objetoPulsado.equals(vistaModificacionAsignacion.btnLimpiar))
		{
			vistaModificacionAsignacion.txfIdTrajeFK.selectAll();
			vistaModificacionAsignacion.txfIdTrajeFK.setText("");
			vistaModificacionAsignacion.txfIdCostureraFK.selectAll();
			vistaModificacionAsignacion.txfIdCostureraFK.setText("");
			vistaModificacionAsignacion.txfFechaInicioFabricacionTraje.selectAll();
			vistaModificacionAsignacion.txfFechaInicioFabricacionTraje.setText("");
			vistaModificacionAsignacion.txfFechaFinFabricacionTraje.selectAll();
			vistaModificacionAsignacion.txfFechaFinFabricacionTraje.setText("");
			vistaModificacionAsignacion.txfIdTrajeFK.requestFocus();
		}
	}
}
