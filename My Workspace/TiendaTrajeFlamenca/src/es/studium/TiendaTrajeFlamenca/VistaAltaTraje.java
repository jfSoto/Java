package es.studium.TiendaTrajeFlamenca;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class VistaAltaTraje extends Frame
{
	// Atributos
			private static final long serialVersionUID = 1L;
			// Los componentes 
			Label lblTipoTraje = new Label("Tipo:");
			Label lblTallaTraje = new Label("Talla:");
			Label lblFechaAdquisicionTrajeCliente = new Label("Fecha de Adquisición:");
			Label lblIdClienteFK = new Label("Número de Cliente:");
			TextField txfTipoTraje = new TextField(20);
			TextField txfTallaTraje = new TextField(20);
			TextField txfFechaAdquisicionTrajeCliente = new TextField(20);
			TextField txfIdClienteFK= new TextField(20);
			Button btnAceptar = new Button("Aceptar");
			Button btnLimpiar = new Button("Limpiar");

			// Construtores
			VistaAltaTraje()
			{
				// Montar el Frame
				setTitle("Alta Traje");
				setLayout(new GridLayout(5, 2));
				add(lblTipoTraje);
				add(txfTipoTraje);
				add(lblTallaTraje);
				add(txfTallaTraje);
				add(lblFechaAdquisicionTrajeCliente);
				add(txfFechaAdquisicionTrajeCliente);
				add(lblIdClienteFK);
				add(txfIdClienteFK);
				add(btnAceptar);
				add(btnLimpiar);
				setSize(260, 180);
				setResizable(false);
				setLocationRelativeTo(null);
				setVisible(true);
			}
			
}
