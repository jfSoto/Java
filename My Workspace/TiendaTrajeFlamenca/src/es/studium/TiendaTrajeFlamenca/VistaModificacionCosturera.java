package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaModificacionCosturera extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblElegir = new Label("Elegir");
	Choice choBajaCosturera = new Choice();
	Button btnBorrar = new Button("Aceptar");
	Dialog dlgConfirmar = new Dialog(this,"Confirmar", true);
	Label lblNombreCosturera = new Label("Nombre:");
	Label lblApellidosCosturera = new Label("Apellidos:");
	Label lblTelefonoCosturera = new Label("Teléfono:");
	Label lblDniCosturera = new Label("Apellidos:");
	Label lblDireccionCosturera = new Label("Teléfono:");
	TextField txfNombreCosturera = new TextField(20);
	TextField txfApellidosCosturera = new TextField(20);
	TextField txfTelefonoCosturera = new TextField(20);
	TextField txfDniCosturera = new TextField(20);
	TextField txfDireccionCosturera = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");
	
	VistaModificacionCosturera()
	{
		dlgConfirmar.setTitle("Confirmar");
		dlgConfirmar.setLayout(new GridLayout(6, 2));
		dlgConfirmar.add(lblNombreCosturera);
		dlgConfirmar.add(txfNombreCosturera);
		dlgConfirmar.add(lblApellidosCosturera);
		dlgConfirmar.add(txfApellidosCosturera);
		dlgConfirmar.add(lblTelefonoCosturera);
		dlgConfirmar.add(txfTelefonoCosturera);
		dlgConfirmar.add(lblDniCosturera);
		dlgConfirmar.add(txfDniCosturera);
		dlgConfirmar.add(lblDireccionCosturera);
		dlgConfirmar.add(txfDireccionCosturera);
		dlgConfirmar.add(btnAceptar);
		dlgConfirmar.add(btnLimpiar);
		dlgConfirmar.setSize(270, 270);
		dlgConfirmar.setResizable(false);
		dlgConfirmar.setLocationRelativeTo(null);
		setTitle("Modificación Costurera");
		setLayout(new GridLayout(3, 1));
		add(lblElegir);
		setSize(200, 160);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
