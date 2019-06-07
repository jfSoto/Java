package es.studium.Aficiones;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Aficiones extends Frame implements WindowListener, ActionListener 
{
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVideojuegos = new Checkbox("Videojuegos");
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAnimales = new Checkbox("Animales");
	Checkbox chkPeliculas = new Checkbox("Películas");
	Checkbox chkRopa = new Checkbox("Ropa");
	Checkbox chkSeries = new Checkbox("Series");
	Checkbox chkTeatro = new Checkbox("Teatro");
	
	Button btnMostrar = new Button("Mostrar");
	
	private static final long serialVersionUID = 1L;
	
	public Aficiones()
	{
		setLayout(new GridLayout(11,1));
		setResizable (false);
		add (chkFutbol);
		add (chkBaloncesto);
		add (chkVideojuegos);
		add (chkCorrer);
		add (chkNadar);
		add (chkAnimales);
		add (chkPeliculas);
		add (chkRopa);
		add (chkSeries);
		add (chkTeatro);
		add (btnMostrar);
		btnMostrar.addActionListener(this);
		addWindowListener(this);
		setSize(200,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Aficiones();
	}

	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent e)
	{
		String mensaje = "";
		if(chkFutbol.getState()==true)
		{
			mensaje += "Fútbol\n";
		}
		if(chkBaloncesto.getState()==true)
		{
			mensaje += "Baloncesto\n";
		}
		if(chkVideojuegos.getState()==true)
		{
			mensaje += "Videojuegos\n";
		}
		if(chkCorrer.getState()==true)
		{
			mensaje += "Correr\n";
		}
		if(chkNadar.getState()==true)
		{
			mensaje += "nadar\n";
		}
		if(chkAnimales.getState()==true)
		{
			mensaje += "Animales\n";
		}
		if(chkPeliculas.getState()==true)
		{
			mensaje += "Peliculas\n";
		}
		if(chkRopa.getState()==true)
		{
			mensaje += "Ropa\n";
		}
		if(chkSeries.getState()==true)
		{
			mensaje += "Series\n";
		}
		if(chkTeatro.getState()==true)
		{
			mensaje += "Teatro";
		}
		System.out.println(mensaje);
	}
}
