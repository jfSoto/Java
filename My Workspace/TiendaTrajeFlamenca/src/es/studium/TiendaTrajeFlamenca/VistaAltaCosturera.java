package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaAltaCosturera extends Frame 
{
	// Atributos
		private static final long serialVersionUID = 1L;
		// Los componentes 
		Label lblNombreCosturera = new Label("Nombre:");
		Label lblApellidosCosturera = new Label("Apellidos:");
		Label lblTelefonoCosturera = new Label("Teléfono:");
		Label lblDniCosturera = new Label("DNI:");
		Label lblDireccionCosturera = new Label("Dirección:");
		TextField txfNombreCosturera = new TextField(20);
		TextField txfApellidosCosturera = new TextField(20);
		TextField txfTelefonoCosturera = new TextField(20);
		TextField txfDniCosturera= new TextField(20);
		TextField txfDireccionCosturera = new TextField(20);
		Button btnAceptar = new Button("Aceptar");
		Button btnLimpiar = new Button("Limpiar");

		// Construtores
		VistaAltaCosturera()
		{
			// Montar el Frame
			setTitle("Alta Costurera");
			setLayout(new GridLayout(6, 2));
			add(lblNombreCosturera);
			add(txfNombreCosturera);
			add(lblApellidosCosturera);
			add(txfApellidosCosturera);
			add(lblTelefonoCosturera);
			add(txfTelefonoCosturera);
			add(lblDniCosturera);
			add(txfDniCosturera);
			add(lblDireccionCosturera);
			add(txfDireccionCosturera);
			add(btnAceptar);
			add(btnLimpiar);
			setSize(270, 270);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
		}
		
		
}
