package es.studium.AwtCard;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class AwtCard extends Frame implements WindowListener,
ItemListener
{
	private static final long serialVersionUID = 1L;
	//Creamos un par de paneles
	Panel card = new Panel();
	Panel ac = new Panel();
	//Creamos un Choice o Lista de Selección
	Choice c = new Choice();
	//Cadenas constantes (final) que insertaremos en el Choice
	final static String PanelBoton = "Panel con Botones";
	final static String PanelTexto = "Panel con Campo de Texto";
	//Creamos otros dos panels que irán dentro del Panel card
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Button b1 = new Button ("Botón 1");
	Button b2 = new Button ("Botón 2");
	Button b3 = new Button ("Botón 3");
	//Creamos un TextField o Campo de Texto de tamaño 20
	TextField t = new TextField( "Texto",20 );
	public AwtCard()
	{
		//Establecer distribución del Frame
		setLayout( new BorderLayout() );
		//Añadir elementos al Choice
		c.addItem( PanelBoton );
		c.addItem( PanelTexto );
		//Añadir el Choice al panel ac
		ac.add( c );
		//Añadir el panel ac al Frame en la parte superior
		add( "North",ac );
		//Establecer distribución del panel card
		card.setLayout( new CardLayout() );
		//Añadir botones al panel p1
		p1.add( b1 );
		p1.add( b2 );
		p1.add( b3 );
		//Añadir TextField al panel p2
		p2.add( t );
		//Añadir los panels p1 y p2 al panel card
		card.add( PanelBoton, p1 );
		//card.add( PanelTexto, p2 );
		//Añadir el panel card al Frame en el centro
		add( "Center",card );
		//Establecer el tamaño del Frame
		setSize(200,200);
		//Añadir los Listeners
		addWindowListener(this);
		setLocationRelativeTo(null);
		c.addItemListener(this);
		//Mostrar el Frame en pantalla
		setVisible(true);
	}
	//Fin del Constructor
	public static void main(String[] args)
	{
		new AwtCard();
	}
	//Fin del main
	//Gestión de Eventos
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
	public void itemStateChanged(ItemEvent ie)
	{
		//El tratamiento se hace igual que para los checkboxes
		if(PanelBoton.equals(ie.getItem()))
		{
			card.add( PanelBoton, p1 );
			card.add( PanelTexto, p2 );
		}
		else
		{
			card.add( PanelTexto, p2 );
			card.add( PanelBoton, p1 );
		}
	}
}
//Fin de la clase