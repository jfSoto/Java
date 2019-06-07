package es.studium.EventoBotonCerrar;
import java.awt.*;
import java.awt.event.*;
//Declaramos nuestra clase que hereda de Frame e implementa
//WindowListener y ActionListener para el bot�n
public class EventoBotonCerrar extends Frame implements
WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Button btnBoton = new Button("Cerrar");
	public EventoBotonCerrar()
	{
		setLayout(new FlowLayout());
		setTitle("Bot�n que cierra la ventana");
		add(btnBoton);
		addWindowListener(this);
		//A�adir el listener al bot�n
		btnBoton.addActionListener(this);
		setSize(100,100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoBotonCerrar();
	}
	//A continuaci�n debemos colocar el m�todo de la clase
	//abstracta ActionListener
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
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
//Fin de la clase EventoBotonCerrar