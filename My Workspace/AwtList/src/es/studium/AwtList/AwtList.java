package es.studium.AwtList;
import java.awt.*;
public class AwtList extends Frame
{
	private static final long serialVersionUID = 1L;
	//Creación de una lista con 4 elementos visibles y que no
	//permite multiselección
	List choLista = new List(4, true);
	public AwtList()
	{
		setLayout(new FlowLayout());
		setTitle("Lista");
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
		choLista.add("Verde");
		choLista.add("Amarillo");
		choLista.add("Naranja");
		add(choLista);
		setLocationRelativeTo(null);
		setSize(150,150);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtList();
	}
}