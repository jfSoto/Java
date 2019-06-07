package es.studium.Centrado;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Centrado extends Frame implements WindowListener,
ComponentListener
{
	private static final long serialVersionUID = 1L;
	Button boton1 = new Button("Aceptar");
	public Centrado()
	{
		setLayout(new FlowLayout());
		setSize(500, 600);
		addWindowListener(this);
		add(boton1);
		addComponentListener(this);
		boton1.setLocation((getWidth()/2)-(boton1.getWidth()/2),(getHeight()/2)-(boton1.getHeight()/2));
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Centrado();
	}
	public void componentHidden(ComponentEvent arg0) {}
	public void componentMoved(ComponentEvent arg0) {}
	public void componentResized(ComponentEvent arg0)
	{
		boton1.setLocation((getWidth()/2)-(boton1.getWidth()/2),(getHeight()/2)-(boton1.getHeight()/2));
	}
	public void componentShown(ComponentEvent arg0) {}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
}