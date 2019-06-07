package es.studium.EjemploImagen;
import java.awt.*;
import java.awt.event.*;
public class EjemploImagen extends Frame implements WindowListener
{
	private static final long serialVersionUID = 1L;
	// Declarar el objeto Image
	Image imagen1;
	Image imagen2;
	// Declarar el objeto Toolkit para manejo de imágenes
	Toolkit herramienta;
	public EjemploImagen()
	{
		setLayout(new FlowLayout());
		setTitle("Imágenes");
		setLocation(250,250);
		setSize(400,250);
		setResizable(false);
		addWindowListener(this);
		// Establecer el método de trabajo con imágenes
		herramienta = getToolkit();
		// Especificar la ruta de la imagen
		// Si ponemos ruta OJO con los \\
		imagen1 = herramienta.getImage("VolcanoRuiz.jpg");
		imagen2 = herramienta.getImage("alvaro.jpg");
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EjemploImagen();
	}
	public void paint(Graphics g)
	{
		// Dibujar la imagen
		
		g.drawImage(imagen1,4,23,this);
		g.drawImage(imagen2,4,23,this);
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