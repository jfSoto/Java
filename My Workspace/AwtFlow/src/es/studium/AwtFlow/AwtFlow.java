package es.studium.AwtFlow;
//Sentencia import para importar las clases que vamos a necesitar
//En este caso necesitaremos las clases del AWT
import java.awt.*;
//Declaraci�n de la clase AwtFlow que hereda de la Clase Frame
//Nuestra clase ser� una Ventana (Frame)
public class AwtFlow extends Frame
{
	private static final long serialVersionUID = 1L;
	//Creamos los botones con sus correspondientes etiquetas
	Button btnBoton1 = new Button("Aceptar");
	Button btnBoton2 = new Button("Abrir");
	Button btnBoton3 = new Button("Cerrar");
	//Constructor de la clase con el mismo nombre que ella
	public AwtFlow()
	{
		//Establecer la distribuci�n del Frame
		setLayout(new FlowLayout());
		//Establecer el t�tulo de la aplicaci�n
		setTitle("FlowLayout");
		//A�adir los botones antes creados
		add(btnBoton1);
		add(btnBoton2);
		add(btnBoton3);
		//Establecer el tama�o del Frame
		setSize(200,200);
		// Centra la ventana en la pantalla
		setLocationRelativeTo(null);
		//Mostrar el Frame en pantalla
		setVisible(true);
	}
	//Fin del Constructor
	//M�todo Main. Es el m�todo que se ejecutar� en primer
	//lugar al ejecutarse la aplicaci�n
	public static void main(String[] args)
	{
		//Crear una instancia u objeto de nuestra Clase AwtFlow
		new AwtFlow();
	}
	//Fin del Main
}
//Fin de la Clase

