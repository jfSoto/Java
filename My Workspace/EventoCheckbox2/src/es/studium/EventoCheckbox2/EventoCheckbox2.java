package es.studium.EventoCheckbox2;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoCheckbox2 extends Frame implements WindowListener,
ItemListener
{
	private static final long serialVersionUID = 1L;
	//Definir el grupo
	CheckboxGroup grupo = new CheckboxGroup();
	//En este caso, sólo se puede tener activa una de las opciones
	//Las opciones se crean indicando su etiqueta, si están o no
	//seleccionadas y el grupo al que pertenecen
	Checkbox chkUno = new Checkbox("Uno", true, grupo);
	Checkbox chkDos = new Checkbox("Dos", false, grupo);
	Checkbox chkTres = new Checkbox("Tres", false, grupo);
	Label lblEtiqueta1 = new Label("Activado       ");
	Label lblEtiqueta2 = new Label("Desactivado");
	Label lblEtiqueta3 = new Label("Desactivado");
	public EventoCheckbox2()
	{
		setLayout(new FlowLayout());
		setTitle("Botones de Opción con sólo uno activo");
		add(chkUno);
		add(lblEtiqueta1);
		add(chkDos);
		add(lblEtiqueta2);
		add(chkTres);
		add(lblEtiqueta3);
		addWindowListener(this);
		chkUno.addItemListener(this);
		chkDos.addItemListener(this);
		chkTres.addItemListener(this);
		setSize(500, 100);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoCheckbox2();
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if("Uno".equals(ie.getItem()))
		{
			lblEtiqueta1.setText("Activado");
			lblEtiqueta2.setText("Desactivado");
			lblEtiqueta3.setText("Desactivado");
		}
		else if("Dos".equals(ie.getItem()))
		{
			lblEtiqueta1.setText("Desactivado");
			lblEtiqueta2.setText("Activado");
			lblEtiqueta3.setText("Desactivado");
		}
		else if("Tres".equals(ie.getItem()))
		{
			lblEtiqueta1.setText("Desactivado");
			lblEtiqueta2.setText("Desactivado");
			lblEtiqueta3.setText("Activado");
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
}
