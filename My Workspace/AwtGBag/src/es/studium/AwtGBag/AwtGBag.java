package es.studium.AwtGBag;
import java.awt.*;
public class AwtGBag extends Frame
{
	private static final long serialVersionUID = 1L;
	public AwtGBag()
	{
		//Crear la distribución
		GridBagLayout gridbag = new GridBagLayout();
		//Crear las restricciones
		GridBagConstraints gbc = new GridBagConstraints();
		//Establecer la distribución
		setLayout( gridbag );
		//Establecer restricciones
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		Button btnBoton0 = new Button("Botón 0");
		//Aplicar restricciones al botón
		gridbag.setConstraints(btnBoton0,gbc );
		add(btnBoton0);
		Button btnBoton1 = new Button( "Botón 1" );
		gridbag.setConstraints(btnBoton1,gbc );
		add(btnBoton1);
		Button btnBoton2 = new Button( "Botón 2" );
		gridbag.setConstraints(btnBoton2,gbc );
		add(btnBoton2);
		//Establecer restricciones
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		Button btnBoton3 = new Button( "Botón 3" );
		gridbag.setConstraints(btnBoton3,gbc );
		add(btnBoton3);
		//Establecer restricciones
		gbc.weightx = 0.0;
		Button btnBoton4 = new Button( "Botón 4" );
		gridbag.setConstraints(btnBoton4,gbc );
		add(btnBoton4);
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		Button btnBoton5 = new Button( "Botón 5" );
		gridbag.setConstraints(btnBoton5,gbc );
		add(btnBoton5);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		Button btnBoton6 = new Button( "Botón 6" );
		gridbag.setConstraints(btnBoton6,gbc );
		add(btnBoton6);
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.weighty = 1.0;
		Button btnBoton7 = new Button( "Botón 7" );
		gridbag.setConstraints(btnBoton7,gbc );
		add(btnBoton7);
		gbc.weighty = 0.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		Button btnBoton8 = new Button( "Botón 8" );
		gridbag.setConstraints(btnBoton8,gbc );
		add(btnBoton8);
		Button btnBoton9 = new Button( "Botón 9" );
		gridbag.setConstraints(btnBoton9,gbc );
		add(btnBoton9);
		setSize(200,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//Fin del constructor
	public static void main(String[] args)
	{
		new AwtGBag();
	}
	//Fin del main
}
//Fin de la clase