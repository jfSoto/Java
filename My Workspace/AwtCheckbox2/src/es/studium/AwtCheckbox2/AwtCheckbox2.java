package es.studium.AwtCheckbox2;
import java.awt.*;
public class AwtCheckbox2 extends Frame
{
	private static final long serialVersionUID = 1L;
	//En este caso, primero se define un grupo
	CheckboxGroup chkgrGrupo = new CheckboxGroup();
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();
	//Al crear los checkboxes, se indica la etiqueta, si est� o no
	//activo y el grupo al que pertenece. En un grupo, solamente
	//podr� estar activo un checkbox
	Checkbox chkUno = new Checkbox("Opci�n Uno", false, chkgrGrupo);
	Checkbox chkDos = new Checkbox("Opci�n Dos", false, chkgrGrupo);
	Checkbox chkTres = new Checkbox("Opci�n Tres", false, chkgrGrupo);
	Checkbox chkCuatro = new Checkbox("Opci�n Cuatro", false, chkgrGrupo2);
	Checkbox chkCinco = new Checkbox("Opci�n Cinco", false, chkgrGrupo2);
	public AwtCheckbox2()
	{
		setLayout(new FlowLayout());
		setTitle("Botones de Opci�n excluyentes");
		add(chkUno);
		add(chkDos);
		add(chkTres);
		add(chkCuatro);
		add(chkCinco);
		setLocationRelativeTo(null);
		setSize(170,180);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtCheckbox2();
	}
}