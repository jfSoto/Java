package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaAltaAsignacion extends Frame 
{

	private static final long serialVersionUID = 1L;
	// Los componentes 
	Label lblIdTrajeFK = new Label("N�mero de Traje:");
	Label lblIdCostureraFK = new Label("N�mero de Costurera:");
	Label lblFechaInicioFabricacionTraje = new Label("Fecha de Inicio de Fabricaci�n:");
	Label lblFechaFinFabricacionTraje = new Label("Fecha de Fin de Fabricaci�n:");
	TextField txfIdTrajeFK = new TextField(20);
	TextField txfIdCostureraFK = new TextField(20);
	TextField txfFechaInicioFabricacionTraje = new TextField(20);
	TextField txfFechaFinFabricacionTraje = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnLimpiar = new Button("Limpiar");

	// Construtores
	VistaAltaAsignacion()
	{
		// Montar el Frame
		setTitle("Alta Asignaci�n");
		setLayout(new GridLayout(5, 2));
		add(lblIdTrajeFK);
		add(txfIdTrajeFK);
		add(lblIdCostureraFK);
		add(txfIdCostureraFK);
		add(lblFechaInicioFabricacionTraje);
		add(txfFechaInicioFabricacionTraje);
		add(lblFechaFinFabricacionTraje);
		add(txfFechaFinFabricacionTraje);
		add(btnAceptar);
		add(btnLimpiar);
		setSize(360, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
