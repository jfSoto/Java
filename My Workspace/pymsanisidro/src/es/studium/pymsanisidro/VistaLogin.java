package es.studium.pymsanisidro;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class VistaLogin extends Frame
{
	// Atributos
	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblUsuario = new Label("Usuario:");
	Label lblClave = new Label("Clave:");
	TextField txfUsuario = new TextField(20);
	TextField txfClave = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");
	// El Diálogo 
	Dialog dlgError = new Dialog(this,"Error", true);
	Label lblError = new Label("El usuario y/o la clave son incorrectos!");
	Button btnAceptarError = new Button("Aceptar");

	// Construtores
	VistaLogin()
	{
		// Montar el Dialog
		dlgError.setLayout(new FlowLayout());
		dlgError.add(lblError);
		dlgError.add(btnAceptarError);
		dlgError.setSize(230, 100);
		dlgError.setResizable(false);
		dlgError.setLocationRelativeTo(null);
		// Montar el Frame
		setLayout(new FlowLayout());
		add(lblUsuario);
		add(txfUsuario);
		add(lblClave);
		txfClave.setEchoChar('*');
		add(txfClave);
		add(btnAceptar);
		add(btnLimpiar);
		setSize(200, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	// Inspectores
}