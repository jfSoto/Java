package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaModificacionCliente extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblElegir = new Label("Elegir");
	Choice choBajaCliente = new Choice();
	Button btnBorrar = new Button("Aceptar");
	Dialog dlgConfirmar = new Dialog(this,"Confirmar", true);
	Label lblNombreCliente = new Label("Nombre:");
	Label lblApellidosCliente = new Label("Apellidos:");
	Label lblTelefonoCliente = new Label("Teléfono:");
	TextField txfNombreCliente = new TextField(20);
	TextField txfApellidosCliente = new TextField(20);
	TextField txfTelefonoCliente = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");
	
	VistaModificacionCliente()
	{
		dlgConfirmar.setTitle("Confirmar");
		dlgConfirmar.setLayout(new GridLayout(4, 2));
		dlgConfirmar.add(lblNombreCliente);
		dlgConfirmar.add(txfNombreCliente);
		dlgConfirmar.add(lblApellidosCliente);
		dlgConfirmar.add(txfApellidosCliente);
		dlgConfirmar.add(lblTelefonoCliente);
		dlgConfirmar.add(txfTelefonoCliente);
		dlgConfirmar.add(btnAceptar);
		dlgConfirmar.add(btnLimpiar);
		dlgConfirmar.setSize(200, 160);
		dlgConfirmar.setResizable(false);
		dlgConfirmar.setLocationRelativeTo(null);
		setTitle("Modificación Cliente");
		setLayout(new GridLayout(3, 1));
		add(lblElegir);
		setSize(200, 160);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
