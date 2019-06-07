package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class VistaConsultaTraje extends Frame
{
	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblConsultaTrajes = new Label("Consulta de los Trajes");
	Button btnPDF = new Button("Generar PDF");
	
	VistaConsultaTraje()
	{
		setTitle("Consulta Cliente");
		setLayout(new GridLayout(2, 1));
		add(lblConsultaTrajes);
		add(btnPDF);
		setSize(360, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
