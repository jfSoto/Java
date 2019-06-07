package es.studium.TiendaTrajeFlamenca;

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
	Button btnAyuda = new Button("Ayuda");
	// El Diálogo
	Dialog dlgError = new Dialog(this,"Error", true);
	Label lblError = new Label("El usuario y/o la clave son incorrectos!");
	Button btnAceptarError = new Button("Aceptar");
	//Construtores
	VistaLogin()
	{
		txfUsuario.setText("Administrador");
		txfClave.setText("Studium2018;");
		//Montar el Dialog
		dlgError.setTitle("Error");
		dlgError.setLayout(new FlowLayout());
		dlgError.add(lblError);
		dlgError.add(btnAceptarError);
		dlgError.setSize(230, 100);
		dlgError.setResizable(false);
		dlgError.setLocationRelativeTo(null);
		//Montar el Frame
		setLayout(new FlowLayout());
		setTitle("Login");
		add(lblUsuario);
		add(txfUsuario);
		add(lblClave);
		add(txfClave);
		add(btnAceptar);
		add(btnLimpiar);
		add(btnAyuda);
		txfClave.setEchoChar('*');
		setSize(200, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//Inspectores
}