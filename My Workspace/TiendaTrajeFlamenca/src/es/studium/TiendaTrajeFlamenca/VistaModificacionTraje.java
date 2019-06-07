package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaModificacionTraje extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblElegir = new Label("Elegir");
	Choice choBajaCliente = new Choice();
	Button btnBorrar = new Button("Aceptar");
	Dialog dlgConfirmar = new Dialog(this,"Confirmar", true);
	Label lblTipoTraje = new Label("Tipo:");
	Label lblTallaTraje = new Label("Talla:");
	Label lblFechaAdquisicionTrajeCliente = new Label("Fecha de Adquisición:");
	Label lblIdClienteFK = new Label("Número del Cliente:");
	TextField txfTipoTraje = new TextField(20);
	TextField txfTallaTraje = new TextField(20);
	TextField txfFechaAdquisicionTrajeCliente = new TextField(20);
	TextField txfIdClienteFK = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");
	
	VistaModificacionTraje()
	{
		dlgConfirmar.setTitle("Confirmar");
		dlgConfirmar.setLayout(new GridLayout(5, 2));
		dlgConfirmar.add(lblTipoTraje);
		dlgConfirmar.add(txfTipoTraje);
		dlgConfirmar.add(lblTallaTraje);
		dlgConfirmar.add(txfTallaTraje);
		dlgConfirmar.add(lblFechaAdquisicionTrajeCliente);
		dlgConfirmar.add(txfFechaAdquisicionTrajeCliente);
		dlgConfirmar.add(lblIdClienteFK);
		dlgConfirmar.add(txfIdClienteFK);
		dlgConfirmar.add(btnAceptar);
		dlgConfirmar.add(btnLimpiar);
		dlgConfirmar.setSize(260, 180);
		dlgConfirmar.setResizable(false);
		dlgConfirmar.setLocationRelativeTo(null);
		setTitle("Modificación Trajes");
		setLayout(new GridLayout(3, 1));
		add(lblElegir);
		setSize(200, 160);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
