package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

public class ControladorModificacionCliente implements ActionListener, WindowListener
{
	VistaModificacionCliente vistaModificacionCliente = null;
	ModeloModificacionCliente modeloModificacionCliente = null;

	public ControladorModificacionCliente(ModeloModificacionCliente modelo, VistaModificacionCliente vista)
	{
		this.vistaModificacionCliente = vista;
		this.modeloModificacionCliente = modelo;
		vistaModificacionCliente.addWindowListener(this);
		vistaModificacionCliente.btnBorrar.addActionListener(this);
		vistaModificacionCliente.dlgConfirmar.addWindowListener(this);
		vistaModificacionCliente.btnAceptar.addActionListener(this);
		vistaModificacionCliente.btnLimpiar.addActionListener(this);
		vistaModificacionCliente.choBajaCliente = modeloModificacionCliente.RellenarModificacion();
		vistaModificacionCliente.add(vistaModificacionCliente.choBajaCliente);
		vistaModificacionCliente.add(vistaModificacionCliente.btnBorrar);
	}

	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaModificacionCliente.dlgConfirmar.isActive())
		{
			vistaModificacionCliente.dlgConfirmar.setVisible(false);
		}
		else if(vistaModificacionCliente.isActive())
		{
			vistaModificacionCliente.setVisible(false);
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
		if(objetoPulsado.equals(vistaModificacionCliente.btnBorrar))
		{
			Vector<String> v = new Vector<String>();
			v = modeloModificacionCliente.RellenarUpdate
			(Integer.parseInt(vistaModificacionCliente.choBajaCliente.getSelectedItem().split(" ")[0]));
			vistaModificacionCliente.txfNombreCliente.setText(v.get(0)+"");
			vistaModificacionCliente.txfApellidosCliente.setText(v.get(1)+"");
			vistaModificacionCliente.txfTelefonoCliente.setText(v.get(2)+"");
			vistaModificacionCliente.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaModificacionCliente.btnAceptar))
		{
			modeloModificacionCliente.ModificarCliente
			(Integer.parseInt(vistaModificacionCliente.choBajaCliente.getSelectedItem().split(" ")[0]), 
			vistaModificacionCliente.txfNombreCliente.getText(), vistaModificacionCliente.txfApellidosCliente.getText(), 
			Integer.parseInt(vistaModificacionCliente.txfTelefonoCliente.getText()));
			vistaModificacionCliente.setVisible(false);
		}
		else if(objetoPulsado.equals(vistaModificacionCliente.btnLimpiar))
		{
			vistaModificacionCliente.txfNombreCliente.selectAll();
			vistaModificacionCliente.txfNombreCliente.setText("");
			vistaModificacionCliente.txfApellidosCliente.selectAll();
			vistaModificacionCliente.txfApellidosCliente.setText("");
			vistaModificacionCliente.txfTelefonoCliente.selectAll();
			vistaModificacionCliente.txfTelefonoCliente.setText("");
			vistaModificacionCliente.txfNombreCliente.requestFocus();
		}
	}
}
