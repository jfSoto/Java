package es.studium.EventoChoice;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoChoice extends Frame implements WindowListener,
ItemListener
{
	private static final long serialVersionUID = 1L;
	//Creamos la lista
	Choice lista = new Choice();
	public EventoChoice()
	{
		setLayout(new FlowLayout());
		setTitle("Lista");
		//A�adimos a la lista los elementos que la componen
		lista.add("Blanco");
		lista.add("Rojo");
		lista.add("Azul");
		lista.add("Amarillo");
		lista.add("Negro");
		//A�adimos la lista
		add(lista);
		addWindowListener(this);
		//A�adimos el listener a la lista
		lista.addItemListener(this);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoChoice();
	}
	//Implementamos el m�todo del listener
	public void itemStateChanged(ItemEvent ie)
	{
		//El tratamiento se hace igual que para los checkboxes
		if("Blanco".equals(ie.getItem()))
		{
			//Con setBackground cambiamos el color del fondo
			//Color.white es la constante color para el blanco
			setBackground(Color.white);
		}
		else if("Rojo".equals(ie.getItem()))
		{
			setBackground(Color.red);
		}
		else if ("Azul".equals(ie.getItem()))
		{
			setBackground(Color.blue);
		}
		else if ("Amarillo".equals(ie.getItem()))
		{
			setBackground(Color.yellow);
		}
		else
		{
			setBackground(Color.black);
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
	public void windowOpened(WindowEvent we) {}
}