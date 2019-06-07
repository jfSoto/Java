package es.studium.PracticaVideojuego;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class VistaMenuPrincipal extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnNuevaPartida = new Button("Nueva Partida");
	Button btnTop10 = new Button("Top 10");
	Image imagen1;
	Toolkit herramienta;
	VistaMenuPrincipal()
	{
		setTitle("1000 KM");
		setLayout(new FlowLayout());
		add(btnNuevaPartida);
		add(btnTop10);
		herramienta = getToolkit();
		imagen1 = herramienta.getImage("1000km.jpg");
		setSize(500, 360);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		// Dibujar la imagen
		g.drawImage(imagen1,4,23,this);
	}
	
}
