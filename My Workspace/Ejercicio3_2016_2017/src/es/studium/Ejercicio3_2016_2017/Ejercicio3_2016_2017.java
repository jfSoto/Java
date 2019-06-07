package es.studium.Ejercicio3_2016_2017;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3_2016_2017 extends Frame implements WindowListener, ActionListener
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final long serialVersionUID = 1L;
	Dialog dlgResultado = new Dialog(this, "Diálogo con mensaje", true);
	TextArea areaTexto = new TextArea();
	
	
	public Ejercicio3_2016_2017()
	{
		dlgResultado.setLayout(new GridLayout(4,2));
		dlgResultado.setTitle("Guardar");
		dlgResultado.addWindowListener(this);
		dlgResultado.add(areaTexto);
		areaTexto.setText("Media: ");
		dlgResultado.setSize(250,150);
		addWindowListener(this);
		setLocationRelativeTo(null);
		dlgResultado.setVisible(true);
		
		try
		{
			FileReader fr = new FileReader("../Ejercicio3_2016_2017/datos.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			//Bucle para sacar la información del archivo
			while((s=entrada.readLine())!=null)
			{
				System.out.println(s);
			}
			//Cerrar el objeto entrada		
			entrada.close();
			fr.close();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
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
	public void windowOpened(WindowEvent we){}
	public void actionPerformed(ActionEvent e)
	{
		
	}
	public static void main(String[] args)
	{
		new Ejercicio3_2016_2017();
	}

}
