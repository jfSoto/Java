package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaModificacionAsignacion extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblElegir = new Label("Elegir");
	Choice choBajaCliente = new Choice();
	Button btnBorrar = new Button("Aceptar");
	Dialog dlgConfirmar = new Dialog(this,"Confirmar", true);
	Label lblIdTrajeFK = new Label("Número del Traje:");
	Label lblIdCostureraFK = new Label("Número de la Costurera:");
	Label lblFechaInicioFabricacionTraje = new Label("Fecha Inicio Fabricación:");
	Label lblFechaFinFabricacionTraje = new Label("Fecha Fin Fabricación:");
	TextField txfIdTrajeFK = new TextField(20);
	TextField txfIdCostureraFK = new TextField(20);
	TextField txfFechaInicioFabricacionTraje = new TextField(20);
	TextField txfFechaFinFabricacionTraje = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");
	
	VistaModificacionAsignacion()
	{
		dlgConfirmar.setTitle("Confirmar");
		dlgConfirmar.setLayout(new GridLayout(5, 2));
		dlgConfirmar.add(lblIdTrajeFK);
		dlgConfirmar.add(txfIdTrajeFK);
		dlgConfirmar.add(lblIdCostureraFK);
		dlgConfirmar.add(txfIdCostureraFK);
		dlgConfirmar.add(lblFechaInicioFabricacionTraje);
		dlgConfirmar.add(txfFechaInicioFabricacionTraje);
		dlgConfirmar.add(lblFechaFinFabricacionTraje);
		dlgConfirmar.add(txfFechaFinFabricacionTraje);
		dlgConfirmar.add(btnAceptar);
		dlgConfirmar.add(btnLimpiar);
		dlgConfirmar.setSize(360, 180);
		dlgConfirmar.setResizable(false);
		dlgConfirmar.setLocationRelativeTo(null);
		setTitle("Modificación Cliente");
		setLayout(new GridLayout(3, 1));
		add(lblElegir);
		setSize(200, 160);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}


