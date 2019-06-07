package es.studium.PracticaVideojuego;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class VistaNombreJugador extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnAceptar = new Button("Aceptar");
	TextField txfNombreJugador = new TextField(20);
	Label lblNombreJugador = new Label("Nombre del Jugador");
	Label lblHasGanado = new Label("¡Has Ganado!");

	VistaNombreJugador()
	{
		setTitle("1000 KM");
		setLayout(new FlowLayout());
		add(lblHasGanado);
		add(lblNombreJugador);
		add(btnAceptar);
		add(txfNombreJugador);
		setSize(270, 170);
		setResizable(false);
		setLocationRelativeTo(null);
	}
}