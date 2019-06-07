package es.studium.EquiposBaloncesto;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EquiposBaloncesto extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	
	List lstEquipos = new List ( 4, false );
	
	public EquiposBaloncesto()
	{
		setLayout(new FlowLayout());
		setTitle("Equipos de baloncesto");
		lstEquipos.add("Barcelona");
		lstEquipos.add("Real Madrid");
		lstEquipos.add("Unicaja");
		lstEquipos.add("Real Betis");
		add(lstEquipos);
		addWindowListener(this);
		lstEquipos.addActionListener(this);
		setSize(250, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new EquiposBaloncesto();
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
	public void actionPerformed(ActionEvent ae)
	{
		if("Barcelona".equals(lstEquipos.getSelectedItem()))
		{
			System.out.println("Barcelona");
		}
		else if("Real Madrid".equals(lstEquipos.getSelectedItem()))
		{
			System.out.println("Madrid");
		}
		else if("Unicaja".equals(lstEquipos.getSelectedItem()))
		{
			System.out.println("Málaga");
		}
		else if("Real Betis".equals(lstEquipos.getSelectedItem()))
		{
			System.out.println("Sevilla");
		}
	}

}
