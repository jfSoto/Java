package es.studium.RectanguloMovimiento;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class RectanguloMovimiento extends Frame implements WindowListener
{
	private static final long serialVersionUID = 1L;
	public RectanguloMovimiento()
	{
		setLayout(new FlowLayout());
		setTitle("Dibujando...");
		addWindowListener(this);
		setSize(220,100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		int i,j;
		// Posiciones iniciales
		i=30;
		j=30;
		while(i<100)
		{
			// Se dibuja un rectángulo de 25 pixeles de ancho x alto a partir de la posición i,j
			g.drawRect(i, j, 25, 25);
			// Esperamos 1 segundo
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e){}
			// Aumentamos sus posiciones
			i++;
			j++;
			// Hacemos el borrado del cuadro anterior
			g.setColor(Color.white);
			g.drawRect(i-1, j-1, 25, 25);
			g.setColor(Color.black);
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
	public static void main(String[] args)
	{
		new RectanguloMovimiento();
	}
}