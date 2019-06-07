package es.studium.Distribucion;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;
public class Distribucion extends Frame
{
	private static final long serialVersionUID = 1L;
	public Distribucion()
	{
		setTitle("Ejemplo GridBagLayout");
		setLayout(new GridBagLayout());
		// Añadir componentes
		TextArea txtArea = new TextArea("Area texto");
		GridBagConstraints constraints = new GridBagConstraints();
		// El área de texto empieza en la columna cero
		constraints.gridx = 0;
		// El área de texto empieza en la fila cero
		constraints.gridy = 0;
		// El área de texto ocupa dos columnas
		constraints.gridwidth = 2;
		// El área de texto ocupa 2 filas
		constraints.gridheight = 2;
		constraints.fill = GridBagConstraints.BOTH;
		// La fila 0 debe estirarse, le ponemos un 1.0
		constraints.weighty = 1.0;
		add (txtArea, constraints);
		// Restauramos al valor por defecto, para no afectar a los siguientes componentes
		constraints.weighty = 1.0;

		Button btnBoton1 = new Button ("Boton 1");
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.NORTH;
		constraints.fill = GridBagConstraints.NONE;
		/* La fila 0 debe estirarse, le ponemos un 1.0. Ya lo
		hicimos en el área de texto, pero aquí debemos ser coherentes y poner
		lo mismo. */
		constraints.weighty = 0.0;
		add (btnBoton1, constraints);
		// Restauramos al valor por defecto, para no afectar a los siguientes componentes
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.CENTER; 
		Button btnBoton2 = new Button ("Boton 2");
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		// La fila 1 debe estirarse, le ponemos 1.0
		constraints.weighty = 1.0;
		add (btnBoton2, constraints);
		// Restauramos el valor por defecto
		constraints.weighty = 0.0;
		Button btnBoton3 = new Button ("Boton 3");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		add (btnBoton3, constraints);
		Button btnBoton4 = new Button ("Boton 4");
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		add (btnBoton4, constraints);
		TextField txtCampo = new TextField ("Campo texto");
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		// La columna 1 debe estirarse, ponemos el 1.0 en weigthx
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add (txtCampo, constraints);
		setLocationRelativeTo(null);
		setSize(550,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Distribucion();
	}
}
