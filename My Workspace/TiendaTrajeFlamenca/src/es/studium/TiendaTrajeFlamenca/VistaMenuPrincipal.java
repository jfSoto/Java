package es.studium.TiendaTrajeFlamenca;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

public class VistaMenuPrincipal extends Frame 
{
	private static final long serialVersionUID = 1L;
	//Declarar la Barra de Menú
	MenuBar mnbMenu = new MenuBar();
	//Declarar las opciones de la Barra de Menú
	Menu clientes =  new Menu("Clientes");
	Menu costureras = new Menu("Costureras");
	Menu trajes =  new Menu("Trajes");
	Menu asignaciones =  new Menu("Asignaciones");
	//Declarar las opciones de Clientes
	MenuItem altaCli = new MenuItem("Alta");
	MenuItem bajaCli = new MenuItem("Baja");
	MenuItem modificacionCli = new MenuItem("Modificación");
	MenuItem consultaCli = new MenuItem("Consulta");
	//Declarar las opciones de Costureras
	MenuItem altaCos = new MenuItem("Alta");
	MenuItem bajaCos = new MenuItem("Baja");
	MenuItem modificacionCos = new MenuItem("Modificación");
	MenuItem consultaCos = new MenuItem("Consulta");
	//Declarar las opciones de Trajes
	MenuItem altaTra = new MenuItem("Alta");
	MenuItem bajaTra = new MenuItem("Baja");
	MenuItem modificacionTra = new MenuItem("Modificación");
	MenuItem consultaTra = new MenuItem("Consulta");
	//Declarar las opciones de Asignaciones
	MenuItem altaAsi = new MenuItem("Alta");
	MenuItem bajaAsi = new MenuItem("Baja");
	MenuItem modificacionAsi = new MenuItem("Modificación");
	MenuItem consultaAsi = new MenuItem("Consulta");
	Image imagen1;
	Toolkit herramienta;
	public VistaMenuPrincipal()
	{
		setLayout(new FlowLayout());
		setTitle("Pantalla Principal");
		//Crear el primer submenú añadiendo las opciones
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
		//Crear el tercer submenu
		asignaciones.add(altaAsi);
		asignaciones.add(bajaAsi);
		asignaciones.add(modificacionAsi);
		asignaciones.add(consultaAsi);
		
		//Añadir los submenús, a la barra de menú
		mnbMenu.add(clientes);
		mnbMenu.add(costureras);
		mnbMenu.add(trajes);
		mnbMenu.add(asignaciones);
		//Establecer la Barra de Menú como tal
		herramienta = getToolkit();
		imagen1 = herramienta.getImage("tiendaTrajeFlamenca.jpg");
		setMenuBar(mnbMenu);
		setSize(700,393);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public void paint(Graphics g)
	{
		// Dibujar la imagen
		g.drawImage(imagen1,4,23,this);
	}
}
	