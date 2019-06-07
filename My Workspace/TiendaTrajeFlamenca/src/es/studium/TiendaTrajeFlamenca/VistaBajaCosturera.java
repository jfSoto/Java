package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class VistaBajaCosturera extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblElegir = new Label("Elegir");
	Choice choBajaCosturera = new Choice();
	Button btnBorrar = new Button("Borrar");
	Dialog dlgConfirmar = new Dialog(this,"Confirmar", true);
	Label lblConfirmar = new Label("¿Estás seguro que deseas borrar esta costurera?");
	Button btnAceptar = new Button("Aceptar");
	
	VistaBajaCosturera()
	{
		dlgConfirmar.setTitle("Confirmar");
		dlgConfirmar.setLayout(new FlowLayout());
		dlgConfirmar.add(lblConfirmar);
		dlgConfirmar.add(btnAceptar);
		dlgConfirmar.setSize(300, 100);
		dlgConfirmar.setResizable(false);
		dlgConfirmar.setLocationRelativeTo(null);
		setTitle("Baja Costurera");
		setLayout(new GridLayout(3, 1));
		add(lblElegir);
		setSize(200, 160);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
