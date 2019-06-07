package es.studium.Provincias;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Provincias extends Frame implements WindowListener, ItemListener
{
	private static final long serialVersionUID = 1L;
	
	Choice LstProvincias = new Choice();
	
	Label lblGentilicio = new Label();
	
	public Provincias()
	{
		setLayout(new GridLayout(2,1));
		setResizable(false);
		setTitle("Provincias");
		LstProvincias.add("Sevilla");
		LstProvincias.add("M�laga");
		LstProvincias.add("C�rdoba");
		LstProvincias.add("C�diz");
		add(LstProvincias);
		add(lblGentilicio);
		LstProvincias.addItemListener(this);
		addWindowListener(this);
		setSize(150, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Provincias();
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
	public void itemStateChanged(ItemEvent ie)
	{
		if("Sevilla".equals(ie.getItem()))
		{
			lblGentilicio.setText("Sevillano, Sevillana");
			System.out.println("Sevillano, Sevillana");
		}
		else if("M�laga".equals(ie.getItem()))
		{
			lblGentilicio.setText("Malague�o, Malague�a");
			System.out.println("Malague�o, Malague�a");
		}
		else if("C�rdoba".equals(ie.getItem()))
		{
			lblGentilicio.setText("Cordob�s, Cordobesa");
			System.out.println("Cordob�s, Cordobesa");
		}
		else if("C�diz".equals(ie.getItem()))
		{
			lblGentilicio.setText("Gaditano, Gaditana");
			System.out.println("Gaditano, Gaditana");
		}
	}
}
