// Versión 1.0
package es.studium.TallerIban;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Pantalla extends Frame implements WindowListener, ActionListener, TextListener
{
	private static final long serialVersionUID = 1L;
	Label lbEntidad = new Label("Entidad");
	Label lbSucursal = new Label("Sucursal");
	Label lbDc = new Label("DC ");
	Label lbNCuenta = new Label("Nº Cuenta ");
	Label lbMensaje = new Label("Error: La cuenta no es correcta");
	Button btCalcularIban = new Button("Calcular IBAN");
	Button btAceptar = new Button("Aceptar");
	TextField txEntidad = new TextField("",4);
	TextField txSucursal = new TextField("",4);
	TextField txDc = new TextField("",2);
	TextField txNCuenta = new TextField("",10);
	TextField txIban = new TextField("",24);
	Dialog d = new Dialog(this, "Error", true);
	Pantalla()
	{
		setLayout(new FlowLayout());
		add(lbEntidad);
		add(lbSucursal);
		add(lbDc);
		add(lbNCuenta);
		txEntidad.addTextListener(this);
		txSucursal.addTextListener(this);
		txDc.addTextListener(this);
		txNCuenta.addTextListener(this);
		add(txEntidad);
		add(txSucursal);
		add(txDc);
		add(txNCuenta);
		add(btCalcularIban);
		txIban.setEditable(false);
		add(txIban);
		addWindowListener(this);
		btCalcularIban.addActionListener(this);
		setTitle("Calcular IBAN");
		setSize(300,150);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		d.setLocationRelativeTo(null);
		d.setLayout(new FlowLayout());
		d.setSize(200,120);
		d.add(lbMensaje);
		d.add(btAceptar);
		d.addWindowListener(this);
		btAceptar.addActionListener(this);
	}
	public static void main(String[] args)
	{
		new Pantalla();
	}
	public void actionPerformed(ActionEvent arg0)
	{
		Object a = new Object();
		a = arg0.getSource();
		if(a.equals(btAceptar))
		{
			d.setVisible(false);
		}
		else
		{
			String ent = txEntidad.getText();
			String suc = txSucursal.getText();
			String ddc = txDc.getText();
			String ncu = txNCuenta.getText();
			Cuenta ccc = new Cuenta(ent,suc,ddc,ncu,"");
			if(ccc.CuentaCorrecta()==false)
			{
				d.setVisible(true);
			}
			else
			{
				txIban.setText(ccc.CalcularIban());
			}
		}
	}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0)
	{
		if(d.isActive())
		{
			d.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
	public void textValueChanged(TextEvent arg0)
	{
		Object a = arg0.getSource();
		if(a.equals(txEntidad))
		{
			if(txEntidad.getText().length()==4)
			{
				txSucursal.requestFocus();
			}
			else if(txEntidad.getText().length()>4)
			{
				txEntidad.setText(txEntidad.getText().substring(0, 4));
				txSucursal.requestFocus();
			}
		}
		else if(a.equals(txSucursal))
		{
			if(txSucursal.getText().length()==4)
			{
				txDc.requestFocus();
			}
			else if(txSucursal.getText().length()>4)
			{
				txSucursal.setText(txSucursal.getText().substring(0, 4));
				txDc.requestFocus();
			}
		}
		else if(a.equals(txDc))
		{
			if(txDc.getText().length()==2)
			{
				txNCuenta.requestFocus();
			}
			else if(txDc.getText().length()>2)
			{
				txDc.setText(txDc.getText().substring(0, 2));
				txNCuenta.requestFocus();
			}
		}
		else
		{
			if(txNCuenta.getText().length()==10)
			{
				txIban.requestFocus();
			}
			else if(txNCuenta.getText().length()>10)
			{
				txNCuenta.setText(txNCuenta.getText().substring(0, 10));
				txIban.requestFocus();
			}
		}
	}

}