package es.studium.pymsanisidro;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class VistaPrincipal extends Frame 
{
	private static final long serialVersionUID = 1L;
	//Declarar la Barra de Men�
	MenuBar mnbMenu = new MenuBar();
	//Declarar las opciones de la Barra de Men�
	Menu clientes =  new Menu("Clientes");
	Menu costureras = new Menu("Costureras");
	Menu trajes =  new Menu("Trajes");
	Menu asignaciones =  new Menu("Asignaciones");
	//Declarar las opciones de Clientes
	MenuItem altaCli = new MenuItem("Alta");
	MenuItem bajaCli = new MenuItem("Baja");
	MenuItem modificacionCli = new MenuItem("Modificaci�n");
	MenuItem consultaCli = new MenuItem("Consulta");
	//Declarar las opciones de Costureras
	MenuItem altaCos = new MenuItem("Alta");
	MenuItem bajaCos = new MenuItem("Baja");
	MenuItem modificacionCos = new MenuItem("Modificaci�n");
	MenuItem consultaCos = new MenuItem("Consulta");
	//Declarar las opciones de Trajes
	MenuItem altaTra = new MenuItem("Alta");
	MenuItem bajaTra = new MenuItem("Baja");
	MenuItem modificacionTra = new MenuItem("Modificaci�n");
	MenuItem consultaTra = new MenuItem("Consulta");
	//Declarar las opciones de Asignaciones
	MenuItem altaAsi = new MenuItem("Alta");
	MenuItem bajaAsi = new MenuItem("Baja");
	MenuItem modificacionAsi = new MenuItem("Modificaci�n");
	MenuItem consultaAsi = new MenuItem("Consulta");
	public VistaPrincipal()
	{
		setLayout(new FlowLayout());
		setTitle("Pantalla Principal");
		//Crear el primer submen� a�adiendo las opciones
		clientes.add(altaCli);
		clientes.add(bajaCli);
		clientes.add(modificacionCli);
		clientes.add(consultaCli);
		//Crear el segundo submenu
		costureras.add(altaCos);
		costureras.add(bajaCos);
		costureras.add(modificacionCos);
		costureras.add(consultaCos);
		//Crear el tercer submenu
		trajes.add(altaTra);
		trajes.add(bajaTra);
		trajes.add(modificacionTra);
		trajes.add(consultaTra);
		//Crear el cuarto submenu
		asignaciones.add(altaAsi);
		asignaciones.add(bajaAsi);
		asignaciones.add(modificacionAsi);
		asignaciones.add(consultaAsi);
		
		//A�adir los submen�s, a la barra de men�
		mnbMenu.add(clientes);
		mnbMenu.add(costureras);
		mnbMenu.add(trajes);
		mnbMenu.add(asignaciones);
		//Establecer la Barra de Men� como tal
		setMenuBar(mnbMenu);
		setSize(250,150);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
}
	