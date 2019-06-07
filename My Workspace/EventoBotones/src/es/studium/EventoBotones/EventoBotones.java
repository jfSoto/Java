package es.studium.EventoBotones;
import java.awt.*;
import java.awt.event.*;
public class EventoBotones extends Frame implements WindowListener,
ActionListener
{
	private static final long serialVersionUID = 1L;
	Button btnBoton1 = new Button("Uno");
	Button btnBoton2 = new Button("Dos");
	Label lblEtiqueta = new Label("    ");
	public EventoBotones()
	{
		setLayout(new FlowLayout());
		setTitle("Diferenciar botones");
		add(btnBoton1);
		add(btnBoton2);
		add(lblEtiqueta);
		addWindowListener(this);
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		setLocationRelativeTo(null);
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoBotones();
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Mediante la comparaci�n de cadenas con equals
		//comprobaremos qu� bot�n se puls� mediante el m�todo
		//getSource que al aplicarse sobre el objeto ae
		//nos dir� el nombre del bot�n que gener� el evento
		if(btnBoton1.equals(ae.getSource()))
		{
			lblEtiqueta.setText("Uno");
		}
		else
		{
			lblEtiqueta.setText("Dos");
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
//Fin de la clase EventoBotones
