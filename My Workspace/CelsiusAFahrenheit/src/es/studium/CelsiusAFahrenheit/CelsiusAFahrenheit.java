package es.studium.CelsiusAFahrenheit;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CelsiusAFahrenheit extends Frame implements WindowListener, ActionListener 
{
	private static final long serialVersionUID = 1L;
	
	Label lblEtiqueta1 = new Label("Celsius");
	Label lblEtiqueta2 = new Label("Fahrenheit");
	TextField Celsius = new TextField(20);
	TextField Fahrenheit = new TextField(20);
	Button btnCelFah = new Button("Cel a Fah");
	Button btnFahCel = new Button("Fah a Cel");
	
	public CelsiusAFahrenheit()
	{
		setLayout(new GridLayout(3,2));
		add(lblEtiqueta1);
		add(Celsius);
		add(lblEtiqueta2);
		add(Fahrenheit);
		add(btnCelFah);
		add(btnFahCel);
		setResizable (false);
		setSize(150,130);
		addWindowListener(this);
		btnCelFah.addActionListener(this);
		btnFahCel.addActionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new CelsiusAFahrenheit();
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
		Object a = e.getSource();
		if(a.equals(btnCelFah))
		{
			convertirCF();
		}
		else
		{
			convertirFC();
		}
	}
	public void convertirCF()
	{
		//Capturar
		Double c = Double.parseDouble(Celsius.getText());
		//Calcular
		Double resultado = (c*1.8)+(32.0);
		//Mostrar
		Fahrenheit.setText(resultado.toString());
	}
	public void convertirFC()
	{
		//Capturar
		Double f = Double.parseDouble(Fahrenheit.getText());
		//Calcular
		Double resultado = (f - 32)*1.8;
		//Mostrar
		Celsius.setText(resultado.toString());
	}

}
