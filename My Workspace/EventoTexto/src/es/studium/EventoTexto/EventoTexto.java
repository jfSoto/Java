package es.studium.EventoTexto;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoTexto extends Frame implements WindowListener,
ActionListener, TextListener
{
	private static final long serialVersionUID = 1L;
	Label lblEtiqueta = new Label("Escribe un texto:");
	//Creamos el textfield con 20 caracteres de ancho
	TextField txtCampo1 = new TextField(20);
	//Creamos el textarea vacío, con 5 filas y 20 columnas
	TextArea txaCampo2 = new TextArea("",5,20);
	Button btnBoton = new Button ("Añadir texto");
	String cadena = "";
	int longitud=0;
	public EventoTexto()
	{
		setLayout(new FlowLayout());
		setTitle("TextField y TextArea");
		add(lblEtiqueta);
		add(txtCampo1);
		add(btnBoton);
		add(txaCampo2);
		btnBoton.addActionListener(this);
		//Añadir el listener al textfield para poder escribir en él
		txtCampo1.addTextListener(this);
		addWindowListener(this);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoTexto();
	}
	//Al cambiar el texto en el textfield, guardamos lo escrito en
	//la cadena ca
	public void textValueChanged(TextEvent te)
	{
		cadena = txtCampo1.getText();
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Calculamos la longitud de lo escrito
		longitud = longitud + cadena.length();
		//Si no supera los 20, lo metemos en el TextArea a
		//continuación de lo que ya haya
		if(longitud<=20)
		{
			txaCampo2.setText(txaCampo2.getText()+" "+cadena);
		}
		//Si no, lo pasamos a la línea siguiente
		else
		{
			txaCampo2.setText(txaCampo2.getText()+"\n"+cadena);
			longitud = cadena.length();
		}
		//Borramos lo que haya en el textfield
		txtCampo1.setText("");
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