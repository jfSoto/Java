package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class VistaConsultaCliente extends Frame
{
	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblConsultaClientes = new Label("Consulta de los Clientes");
	Button btnPDF = new Button("Generar PDF");
	
	VistaConsultaCliente()
	{
		setTitle("Consulta Cliente");
		setLayout(new GridLayout(2, 1));
		add(lblConsultaClientes);
		add(btnPDF);
		setSize(360, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
