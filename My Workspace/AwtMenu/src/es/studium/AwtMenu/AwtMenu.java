package es.studium.AwtMenu;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
public class AwtMenu extends Frame
{
	private static final long serialVersionUID = 1L;
	// En primer lugar creamos la barra de menú
	MenuBar barraMenu = new MenuBar();
	// Ahora creamos los elementos principales del menú
	Menu menuArchivo = new Menu("Archivo");
	Menu menuEdicion = new Menu("Edición");
	// Y Ahora los elementos de cada opción del menú principal
	// Primero los de Archivo
	// menuArchivoNuevo contendrá otros elementos, por lo que es tipo Menu
	Menu menuArchivoNuevo = new Menu("Nuevo");
	// Los siguientes son MenuItem pues dentro no tienen submenús
	MenuItem mniArchivoAbrir = new MenuItem("Abrir");
	MenuItem mniArchivoGuardar = new MenuItem("Guardar");
	MenuItem mniArchivoSalir = new MenuItem("Salir");
	// Luego los de Edición
	MenuItem mniEdicionCortar = new MenuItem("Cortar");
	MenuItem mniEdicionCopiar = new MenuItem("Copiar");
	MenuItem mniEdicionPegar = new MenuItem("Pegar");
	//Por último, creamos los elementos dentro de Nuevo
	MenuItem mniArchivoNuevoVentana = new MenuItem("Ventana");
	MenuItem mniArchivoNuevoDialogo = new MenuItem("Diálogo");
	public AwtMenu()
	{
		setLayout (new FlowLayout());
		setTitle ("Menú" );
		//Establecemos la barra de menú
		setMenuBar(barraMenu);
		//Empezamos a añadirle los elementos
		//Primero a menuArchivoNuevo, le añadimos su submenus
		menuArchivoNuevo.add(mniArchivoNuevoVentana);
		menuArchivoNuevo.add(mniArchivoNuevoDialogo);
		//Seguimos con los elementos de archivo
		menuArchivo.add(menuArchivoNuevo);
		menuArchivo.add(mniArchivoAbrir);
		menuArchivo.add(mniArchivoGuardar);
		//Añadimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(mniArchivoSalir);
		//Y ahora a edicion los suyos
		menuEdicion.add(mniEdicionCortar);
		menuEdicion.add(mniEdicionCopiar);
		menuEdicion.add(mniEdicionPegar);
		//Por último agregamos los elementos archivo y edicion a la barra
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);
		setLocationRelativeTo(null);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtMenu();
	}
}