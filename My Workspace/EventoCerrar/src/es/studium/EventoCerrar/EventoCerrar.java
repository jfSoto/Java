package es.studium.EventoCerrar;
import java.awt.*;
//Tenemos que importar la clase event que contiene a los Listeners
import java.awt.event.*;
//Declaramos nuestra clase que hereda de Frame e implementa
//WindowListener
public class EventoCerrar extends Frame implements WindowListener
{
	private static final long serialVersionUID = 1L;
	public EventoCerrar()
	{
		setTitle("Ventana que se cierra");
		setSize(300,100);
		//Añadir el Listener a la ventana
		addWindowListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new EventoCerrar();
	}
	//A continuación debemos colocar TODOS los métodos de la clase
	//abstracta WindowListener, aunque solamente vayamos a trabajar
	//con el método windowClosing()
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		//Llamamos al método exit de la clase System,
		//devolviendo como código de salida un 0
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}
//Fin de la clase EventoCerrar