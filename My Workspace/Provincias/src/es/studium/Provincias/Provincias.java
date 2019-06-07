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
		LstProvincias.add("Málaga");
		LstProvincias.add("Córdoba");
		LstProvincias.add("Cádiz");
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
		else if("Málaga".equals(ie.getItem()))
		{
			lblGentilicio.setText("Malagueño, Malagueña");
			System.out.println("Malagueño, Malagueña");
		}
		else if("Córdoba".equals(ie.getItem()))
		{
			lblGentilicio.setText("Cordobés, Cordobesa");
			System.out.println("Cordobés, Cordobesa");
		}
		else if("Cádiz".equals(ie.getItem()))
		{
			lblGentilicio.setText("Gaditano, Gaditana");
			System.out.println("Gaditano, Gaditana");
		}
	}
}
