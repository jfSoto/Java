package es.studium.Preguntas;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Preguntas extends Frame implements WindowListener, ActionListener 
{
	private static final long serialVersionUID = 1L;
	
	CheckboxGroup grpMotor = new CheckboxGroup();
	CheckboxGroup grpPuertas = new CheckboxGroup();
	CheckboxGroup grpMetalizado = new CheckboxGroup();
	
	Checkbox chkDiesel = new Checkbox("Diesel", false, grpMotor);
	Checkbox chkGasolina = new Checkbox("Gasolina", false, grpMotor);
	Checkbox chkHibrido = new Checkbox("Hibrido", false, grpMotor);
	Checkbox chkElectrico = new Checkbox("Electrico", false, grpMotor);
	
	Checkbox chk3Puertas = new Checkbox("3 Puertas", false, grpPuertas);
	Checkbox chk4Puertas = new Checkbox("4 Puertas", false, grpPuertas);
	Checkbox chk5Puertas = new Checkbox("5 Puertas", false, grpPuertas);
	
	Checkbox chkMetalizado = new Checkbox("Sí", false, grpMetalizado);
	Checkbox chkNoMetalizado = new Checkbox("No", false, grpMetalizado);
	
	Label lblPregunta1 = new Label("Tipo de motorización del Vehículo");
	Label lblPregunta2 = new Label("Número de puertas");
	Label lblPregunta3 = new Label("Metalizado o no");
	
	Button btnPrecio = new Button("Precio");
	public Preguntas()
	{
		setLayout(new GridLayout(13,1));
		setResizable (false);
		add (lblPregunta1);
		add (chkDiesel);
		add (chkGasolina);
		add (chkHibrido);
		add (chkElectrico);
		add (lblPregunta2);
		add (chk3Puertas);
		add (chk4Puertas);
		add (chk5Puertas);
		add (lblPregunta3);
		add (chkMetalizado);
		add (chkNoMetalizado);
		add (btnPrecio);
		btnPrecio.addActionListener(this);
		addWindowListener(this);
		setSize(200,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Preguntas();
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
	public void actionPerformed(ActionEvent e)
	{
		int presupuesto = 0;
		if (chkDiesel.getState()==true)
		{
			presupuesto += 8000;
		}
		else if (chkGasolina.getState()==true)
		{
			presupuesto += 7000;
		}
		else if (chkHibrido.getState()==true)
		{
			presupuesto += 9000;
		}
		else if (chkElectrico.getState()==true)
		{
			presupuesto += 8500;
		}
		
		if (chk3Puertas.getState()==true)
		{
			presupuesto += 2000;
		}
		else if (chk4Puertas.getState()==true)
		{
			presupuesto += 3000;
		}
		else if (chk5Puertas.getState()==true)
		{
			presupuesto += 2500;
		}
		if (chkMetalizado.getState()==true)
		{
			presupuesto += 1500;
		}
		else if(chkNoMetalizado.getState()==true)
		{
			presupuesto += 0;
		}
		System.out.println(presupuesto);
	}
}
