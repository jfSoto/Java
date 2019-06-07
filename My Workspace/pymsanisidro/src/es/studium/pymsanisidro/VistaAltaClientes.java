package es.studium.pymsanisidro;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class VistaAltaClientes extends Frame 
{
	// Atributos
	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblUsuario = new Label("Usuario:");
	Label lblPrecio = new Label("Precio:");
	TextField txfUsuario = new TextField(20);
	TextField txfPrecio = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");

	// Construtores
	VistaAltaClientes()
	{
		// Montar el Frame
		setLayout(new FlowLayout());
		add(lblUsuario);
		add(txfUsuario);
		add(lblPrecio);
		add(txfPrecio);
		add(btnAceptar);
		add(btnLimpiar);
		setSize(200, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	

}
