package es.studium.Ejercicio5Examen2Trimestre;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio5Examen2Trimestre extends Frame implements WindowListener, ActionListener
{

	private static final long serialVersionUID = 1L;
	Button btnCargar = new Button("Cargar");
	Dialog dlgSuma = new Dialog(this, "Suma", true);
	Label lblSuma = new Label("        ");
	
	public Ejercicio5Examen2Trimestre()
	{
		setLayout(new FlowLayout());
		setTitle("Ejercicio 5");
		setSize(300, 100);
		add(btnCargar);
		addWindowListener(this);
		btnCargar.addActionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio5Examen2Trimestre();
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		dlgSuma.setLayout(new FlowLayout());
		dlgSuma.setTitle("Resultado");
		dlgSuma.setSize(100, 100);
		dlgSuma.setLocationRelativeTo(null);
		dlgSuma.addWindowListener(this);
		try
		{
			double numero1, numero2;
			double suma;
			FileInputStream fis = new FileInputStream("examen.dat");
			BufferedInputStream bis = new BufferedInputStream (fis);
			DataInputStream entradaB = new DataInputStream(bis);
			numero1 = entradaB.readDouble();
			numero2 = entradaB.readDouble();
			suma = numero1 + numero2;
			lblSuma.setText(suma + "");
			dlgSuma.add(lblSuma);
			dlgSuma.setVisible(true);
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch (IOException i)
		{
			System.out.println("Ha ocurrido un error");
		}
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		if(dlgSuma.isActive())
		{
			dlgSuma.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
	

}
