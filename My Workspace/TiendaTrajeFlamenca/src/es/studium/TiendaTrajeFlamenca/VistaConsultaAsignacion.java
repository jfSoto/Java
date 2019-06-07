package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class VistaConsultaAsignacion extends Frame
{
	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblConsultaAsignaciones = new Label("Consulta de las Asignaciones");
	Button btnPDF = new Button("Generar PDF");
	
	VistaConsultaAsignacion()
	{
		setTitle("Consulta Cliente");
		setLayout(new GridLayout(2, 1));
		add(lblConsultaAsignaciones);
		add(btnPDF);
		setSize(360, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
