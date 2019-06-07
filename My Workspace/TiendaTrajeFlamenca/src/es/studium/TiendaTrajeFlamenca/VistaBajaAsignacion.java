package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class VistaBajaAsignacion extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblElegir = new Label("Elegir");
	Choice choBajaCliente = new Choice();
	Button btnBorrar = new Button("Borrar");
	Dialog dlgConfirmar = new Dialog(this,"Confirmar", true);
	Label lblConfirmar = new Label("¿Estás seguro que deseas borrar este cliente?");
	Button btnAceptar = new Button("Aceptar");
	
	VistaBajaAsignacion()
	{
		dlgConfirmar.setTitle("Confirmar");
		dlgConfirmar.setLayout(new FlowLayout());
		dlgConfirmar.add(lblConfirmar);
		dlgConfirmar.add(btnAceptar);
		dlgConfirmar.setSize(300, 100);
		dlgConfirmar.setResizable(false);
		dlgConfirmar.setLocationRelativeTo(null);
		setTitle("Baja Asignacion");
		setLayout(new GridLayout(3, 1));
		add(lblElegir);
		setSize(200, 160);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
