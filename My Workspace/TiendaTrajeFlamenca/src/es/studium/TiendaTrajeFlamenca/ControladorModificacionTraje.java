package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

public class ControladorModificacionTraje implements ActionListener, WindowListener
{
	VistaModificacionTraje vistaModificacionTraje = null;
	ModeloModificacionTraje modeloModificacionTraje = null;
	public ControladorModificacionTraje(ModeloModificacionTraje modelo, VistaModificacionTraje vista)
	{
		this.vistaModificacionTraje = vista;
		this.modeloModificacionTraje = modelo;
		vistaModificacionTraje.addWindowListener(this);
		vistaModificacionTraje.btnBorrar.addActionListener(this);
		vistaModificacionTraje.dlgConfirmar.addWindowListener(this);
		vistaModificacionTraje.btnAceptar.addActionListener(this);
		vistaModificacionTraje.btnLimpiar.addActionListener(this);
		vistaModificacionTraje.choBajaCliente = modeloModificacionTraje.RellenarModificacion();
		vistaModificacionTraje.add(vistaModificacionTraje.choBajaCliente);
		vistaModificacionTraje.add(vistaModificacionTraje.btnBorrar);
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(vistaModificacionTraje.dlgConfirmar.isActive())
		{
			vistaModificacionTraje.dlgConfirmar.setVisible(false);
		}
		else if(vistaModificacionTraje.isActive())
		{
			vistaModificacionTraje.setVisible(false);
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
		if(objetoPulsado.equals(vistaModificacionTraje.btnBorrar))
		{
			Vector<String> v = new Vector<String>();
			v = modeloModificacionTraje.RellenarUpdate
			(Integer.parseInt(vistaModificacionTraje.choBajaCliente.getSelectedItem().split(" ")[0]));
			vistaModificacionTraje.txfTipoTraje.setText(v.get(0)+"");
			vistaModificacionTraje.txfTallaTraje.setText(v.get(1)+"");
			vistaModificacionTraje.txfFechaAdquisicionTrajeCliente.setText(v.get(2)+"");
			vistaModificacionTraje.txfIdClienteFK.setText(v.get(3)+"");
			vistaModificacionTraje.dlgConfirmar.setVisible(true);	
		}
		else if(objetoPulsado.equals(vistaModificacionTraje.btnAceptar))
		{
			modeloModificacionTraje.ModificarTraje
			(Integer.parseInt(vistaModificacionTraje.choBajaCliente.getSelectedItem().split(" ")[0]), 
			vistaModificacionTraje.txfTipoTraje.getText(), Integer.parseInt(vistaModificacionTraje.txfTallaTraje.getText()), 
			vistaModificacionTraje.txfFechaAdquisicionTrajeCliente.getText(), 
			Integer.parseInt(vistaModificacionTraje.txfIdClienteFK.getText()));
			vistaModificacionTraje.setVisible(false);
		}
		else if(objetoPulsado.equals(vistaModificacionTraje.btnLimpiar))
		{
			vistaModificacionTraje.txfTipoTraje.selectAll();
			vistaModificacionTraje.txfTipoTraje.setText("");
			vistaModificacionTraje.txfTallaTraje.selectAll();
			vistaModificacionTraje.txfTallaTraje.setText("");
			vistaModificacionTraje.txfFechaAdquisicionTrajeCliente.selectAll();
			vistaModificacionTraje.txfFechaAdquisicionTrajeCliente.setText("");
			vistaModificacionTraje.txfIdClienteFK.selectAll();
			vistaModificacionTraje.txfIdClienteFK.setText("");
			vistaModificacionTraje.txfTipoTraje.requestFocus();
		}
	}
}
