package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaAltaCliente extends Frame 
{
	// Atributos
	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblNombreCliente = new Label("Nombre:");
	Label lblApellidosCliente = new Label("Apellidos:");
	Label lblTelefonoCliente = new Label("Teléfono:");
	TextField txfNombreCliente = new TextField(20);
	TextField txfApellidosCliente = new TextField(20);
	TextField txfTelefonoCliente = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");

	// Construtores
	VistaAltaCliente()
	{
		// Montar el Frame
		setTitle("Alta Cliente");
		setLayout(new GridLayout(4, 2));
		add(lblNombreCliente);
		add(txfNombreCliente);
		add(lblApellidosCliente);
		add(txfApellidosCliente);
		add(lblTelefonoCliente);
		add(txfTelefonoCliente);
		add(btnAceptar);
		add(btnLimpiar);
		setSize(200, 160);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	

}
