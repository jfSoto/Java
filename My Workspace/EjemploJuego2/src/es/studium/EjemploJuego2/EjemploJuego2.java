package es.studium.EjemploJuego2;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;
public class EjemploJuego2 extends Frame implements WindowListener,
MouseListener
{
	private static final long serialVersionUID = 1L;
	// Las coordenadas del cuadrado
	int posX, posY;
	// Las coordenadas del lugar donde pulse
	int pulX, pulY;
	// Las vidas
	int vidas;
	//Los puntos
	int puntos;
	int tamanio;
	Random rnd = new Random();
	public EjemploJuego2()
	{
		vidas = 3;
		puntos = 0;
		tamanio = 20;
		// Obtener los valores iniciales del cuadrado
		obtenerPosicion();
		setLayout(new FlowLayout());
		setTitle("Moviendo...");
		addWindowListener(this);
		addMouseListener(this);
		setSize(220,220);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public void obtenerPosicion()
	{
		// Obtenemos los valores teniendo en cuenta los l�mites del escenario
		posX=rnd.nextInt(186)+8;
		posY=rnd.nextInt(120)+32;
	}
	public void paint(Graphics g)
	{
		g.drawRect(posX, posY, tamanio, tamanio);
		g.drawString("Vidas:" + vidas, 145, 200);
		g.drawString("Puntos:" + puntos, 145, 185);
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
		new EjemploJuego2();
	}
	public void mouseClicked(MouseEvent me)
	{
		// Obtenemos las coordenadas del lugar donde se ha pulsado con el rat�n
		pulX = me.getX();
		pulY = me.getY();
		// Comprobamos si las coordenadas del rat�n est�n entre las del cuadrado
		
		if((posX<=pulX)&&(pulX<=posX+ tamanio)&&(posY<=pulY)&&(pulY<=posY+tamanio))
		{
			if(tamanio>=1)
			{
				tamanio--;
			}
			puntos++;
			// Obtenemos una nueva posici�n del cuadrado
			obtenerPosicion();
			// Y lo dibujamos
			repaint();
		}
		else
		{
			vidas--;
			if(vidas==0)
			{
				System.out.println("Has acabado todas las vidas. FIN!");
						// Deshabilitamos el MouseListener pues se haacabado el juego
						this.removeMouseListener(this);
						
			}
			else
			{
				System.out.println("Has perdido una vida. Te quedan "+vidas+ " vidas.");
			}
			repaint();
		}
	}
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
}