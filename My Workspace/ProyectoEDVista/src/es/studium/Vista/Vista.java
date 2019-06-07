package es.studium.Vista;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Vista extends Frame
{
	TextField textoYear = new TextField(10);
	TextField textoResultado = new TextField(10);
	Button btnBoton = new Button("Comprobar");
	
	public Vista()
	{
		setLayout(new FlowLayout());
		setTitle("Bisiesto");
		add(textoYear);
		add(textoResultado);
		add(btnBoton);
		setSize(270,130);
		setLocationRelativeTo(null);
		textoResultado.setEditable(false);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Vista();
	}
	
	
	

}
