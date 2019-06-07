package es.studium.PracticaVideojuego;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class VistaGameOver extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblGameOver = new Label("Game Over");
	Button btnContinuar = new Button("Aceptar");
	
	VistaGameOver()
	{
		setTitle("Game Over");
		setLayout(new FlowLayout());
		add(lblGameOver);
		add(btnContinuar);
		setSize(270, 170);
		setResizable(false);
		setLocationRelativeTo(null);
	}
}
