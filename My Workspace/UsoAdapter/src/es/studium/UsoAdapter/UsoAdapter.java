package es.studium.UsoAdapter;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//Ahora heredaremos, no implementaremos
//Esto tiene el inconveniente que no podremos heredar de Frame
//por lo que tendremos que crear el Frame dentro de nuestra clase
public class UsoAdapter extends WindowAdapter implements ActionListener
{
	Frame frm = new Frame("Ventana que se Cierra con Adapter");
	Button btnBoton = new Button("Cerrar");
	public UsoAdapter()
	{
		//Ahora hay que referirse a f
		frm.setLayout(new FlowLayout());
		frm.add(btnBoton);
		frm.addWindowListener(this);
		btnBoton.addActionListener(this);
		frm.setSize(200,200);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
	//Solamente definiremos el método de WindowListener que
	//necesitemos, en este caso windowClosing
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public static void main(String[] args)
	{
		new UsoAdapter();
	}
}