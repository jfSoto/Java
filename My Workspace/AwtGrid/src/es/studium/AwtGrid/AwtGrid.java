package es.studium.AwtGrid;
import java.awt.*;
public class AwtGrid extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnBoton1 = new Button("1");
	Button btnBoton2 = new Button("2");
	Button btnBoton3 = new Button("3");
	Button btnBoton4 = new Button("4");
	Button btnBoton5 = new Button("5");
	Button btnBoton6 = new Button("6");
	public AwtGrid()
	{
		//Establecer la distribución con 3 filas y 2 columnas
		setLayout( new GridLayout( 3,2 ) );
		add(btnBoton1);
		add(btnBoton2);
		add(btnBoton3);
		add(btnBoton4);
		add(btnBoton5);
		add(btnBoton6);
		setSize(200,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//Fin del Constructor
	public static void main(String[] args)
	{
		new AwtGrid();
	}
	//Fin del main
}
//Fin de la clase
