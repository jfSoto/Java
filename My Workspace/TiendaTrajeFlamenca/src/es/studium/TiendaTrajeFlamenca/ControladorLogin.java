package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

//En esta clase va el control de Eventos
public class ControladorLogin implements ActionListener, WindowListener
{
	// Atributos
	VistaLogin vistaLogin = null;
	ModeloLogin modeloLogin = null;
	// Construtores
	public ControladorLogin(ModeloLogin modelo, VistaLogin vista)
	{
		this.vistaLogin = vista;
		this.modeloLogin = modelo;
		// A�adir los Listeners
		vista.addWindowListener(this);
		vista.btnAceptar.addActionListener(this);
		vista.btnLimpiar.addActionListener(this);
		vista.btnAyuda.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento)
	{
		Object objetoPulsado = evento.getSource();
		if(objetoPulsado.equals(vistaLogin.btnAceptar))
		{
			if(modeloLogin.comprobarCredenciales(vistaLogin.txfUsuario.getText(),vistaLogin.txfClave.getText()))
			{
				modeloLogin.registrar(vistaLogin.txfUsuario.getText(), "Acceso permitido");
				vistaLogin.setVisible(false);
				VistaMenuPrincipal vistaMenuPrincipal = new VistaMenuPrincipal();
				@SuppressWarnings("unused")
				ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(vistaMenuPrincipal, vistaLogin.txfUsuario.getText());
				@SuppressWarnings("unused")
				ModeloMenuPrincipal modeloMenuPrincipal = new ModeloMenuPrincipal();
			}
			else
			{
				System.out.println("Acceso NO permitido");
				vistaLogin.dlgError.addWindowListener(this);
				vistaLogin.btnAceptarError.addActionListener(this);
				vistaLogin.dlgError.setVisible(true);
			}
		}
		else if(objetoPulsado.equals(vistaLogin.btnLimpiar))
		{
			vistaLogin.txfUsuario.selectAll();
			vistaLogin.txfUsuario.setText("");
			vistaLogin.txfClave.selectAll();
			vistaLogin.txfClave.setText("");
			vistaLogin.txfUsuario.requestFocus();
		}
		else if(objetoPulsado.equals(vistaLogin.btnAceptarError))
		{
			vistaLogin.dlgError.setVisible(false);
			vistaLogin.txfUsuario.requestFocus();
		}
		else if (objetoPulsado.equals(vistaLogin.btnAyuda))
		{
			try
			{
				Runtime.getRuntime().exec("hh.exe ayuda.chm");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		if(vistaLogin.dlgError.isActive())
		{
			vistaLogin.dlgError.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
}