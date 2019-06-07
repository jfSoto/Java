package es.studium.PracticaVideojuego;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class VistaTop10 extends Frame
{
	private static final long serialVersionUID = 1L;
	
	Image imagen1;
	Toolkit herramienta;
	
	VistaTop10()
	{
		setTitle("TOP 10");
		setLayout(new FlowLayout());
		setSize(100, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
