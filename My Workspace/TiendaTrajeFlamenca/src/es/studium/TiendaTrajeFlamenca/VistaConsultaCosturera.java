package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class VistaConsultaCosturera extends Frame
{
	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblConsultaCostureras = new Label("Consulta de las Costureras");
	Button btnPDF = new Button("Generar PDF");
	
	VistaConsultaCosturera()
	{
		setTitle("Consulta Costurera");
		setLayout(new GridLayout(2, 1));
		add(lblConsultaCostureras);
		add(btnPDF);
		setSize(360, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
