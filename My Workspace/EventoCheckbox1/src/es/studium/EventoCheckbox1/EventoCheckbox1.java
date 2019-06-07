package es.studium.EventoCheckbox1;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoCheckbox1 extends Frame implements WindowListener,
ItemListener
{
	private static final long serialVersionUID = 1L;
	//En este caso, se pueden elegir todas las opciones que queramos
	Checkbox chkUno = new Checkbox("Uno");
	Checkbox chkDos = new Checkbox("Dos");
	Checkbox chkTres = new Checkbox("Tres");
	Label lblEtiqueta1 = new Label("Desactivado");
	Label lblEtiqueta2 = new Label("Desactivado");
	Label lblEtiqueta3 = new Label("Desactivado");
	public EventoCheckbox1()
	{
		setLayout(new FlowLayout());
		setTitle("Botones de Opción");
		add(chkUno);
		add(lblEtiqueta1);
		add(chkDos);
		add(lblEtiqueta2);
		add(chkTres);
		add(lblEtiqueta3);
		addWindowListener(this);
		//Añadir los listeners a los botones de opción
		chkUno.addItemListener(this);
		chkDos.addItemListener(this);
		chkTres.addItemListener(this);
		setSize(500,100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoCheckbox1();
	}
	//Primero debemos averiguar qué opción produjo este evento
	//A continuación veremos su estado actual y actuaremos en
	//consecuencia
	public void itemStateChanged(ItemEvent ie)
	{
		//Comparamos mediante equals, una cadena con el elemento
		//que produjo el evento mediante getItem()
		if("Uno".equals(ie.getItem()))
		{
			//Comparamos el estado actual del checkbox mediante
			//getStateChange() con la constante SELECTED aplicada
			//al tipo de evento producido
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				lblEtiqueta1.setText("Activado");
			}
			else
			{
				lblEtiqueta1.setText("Desactivado");
			}
		}
		else if("Dos".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				lblEtiqueta2.setText("Activado");
			}
			else
			{
				lblEtiqueta2.setText("Desactivado");
			}
		}
		else if("Tres".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				lblEtiqueta3.setText("Activado");
			}
			else
			{
				lblEtiqueta3.setText("Desactivado");
			}
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