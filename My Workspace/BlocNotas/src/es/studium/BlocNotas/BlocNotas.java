package es.studium.BlocNotas;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class BlocNotas extends Frame implements WindowListener, ActionListener
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final long serialVersionUID = 1L;
	MenuBar mnbMenu = new MenuBar();

	Menu mnArchivo = new Menu("Archivo");
	Menu mnGestion = new Menu("Gestión");

	MenuItem mnNuevo = new MenuItem("Nuevo");
	MenuItem mnAbrir = new MenuItem("Abrir");
	MenuItem mnGuardar = new MenuItem("Guardar");
	MenuItem mnSalir = new MenuItem("Salir");

	MenuItem mnContarPalabras = new MenuItem("Contar palabras");
	MenuItem mnContarLetras= new MenuItem("Contar letras");
	MenuItem mnContarVocales = new MenuItem("Contar vocales");

	TextArea areaTexto = new TextArea();

	Dialog dlgArchivo = new Dialog(this, "Diálogo con mensaje", true);

	Label lblEtiqueta = new Label();

	public BlocNotas()
	{
		setLayout(new GridLayout(1,1));
		setTitle("Bloc de Notas");
		mnArchivo.add(mnNuevo);
		mnArchivo.add(mnAbrir);
		mnArchivo.add(mnGuardar);
		mnArchivo.add(mnSalir);
		mnGestion.add(mnContarPalabras);
		mnGestion.add(mnContarLetras);
		mnGestion.add(mnContarVocales);
		mnNuevo.addActionListener(this);
		mnAbrir.addActionListener(this);
		mnGuardar.addActionListener(this);
		mnSalir.addActionListener(this);
		mnContarPalabras.addActionListener(this);
		mnContarLetras.addActionListener(this);
		mnContarVocales.addActionListener(this);
		mnbMenu.add(mnArchivo);
		mnbMenu.add(mnGestion);
		setMenuBar(mnbMenu);
		add(areaTexto);
		setSize(250,150);
		addWindowListener(this);
		setLocationRelativeTo(null);
		setVisible(true);


	}

	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		if(dlgArchivo.isActive())
		{
			dlgArchivo.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent e)
	{
		Object a;
		a=e.getSource();
		if(a.equals(mnSalir))
		{
			System.exit(0);
		}
		else if(a.equals(mnNuevo))
		{
			areaTexto.selectAll();
			areaTexto.setText("");	
		}
		else if(a.equals(mnAbrir))
		{
			FileDialog fd = new FileDialog(this, "Elige un archivo", FileDialog.LOAD);
			fd.setDirectory("C:\\");
			fd.setFile("*.txt");
			fd.setVisible(true);
			String archivo = fd.getDirectory() + fd.getFile();
			FileReader fr = null;
			if (archivo == "")
			{
				dlgArchivo.setLayout(new FlowLayout());
				dlgArchivo.setTitle("Archivo no encontrado");
				dlgArchivo.addWindowListener(this);
				lblEtiqueta.setText("Archivo no encontrado");
				dlgArchivo.add(lblEtiqueta);
				dlgArchivo.setSize(200, 150);
				dlgArchivo.setLocationRelativeTo(null);
				dlgArchivo.setVisible(true);
			}
			else
			{
				try
				{
					fr = new FileReader(archivo);
					BufferedReader entrada = new BufferedReader(fr);
					String s;
					areaTexto.selectAll();
					areaTexto.setText("");
					while((s=entrada.readLine())!=null)
					{
						areaTexto.setText(areaTexto.getText()+s+"\n");
					}
					entrada.close();
					fr.close();
				} 
				catch (IOException e1)
				{
					dlgArchivo.setLayout(new FlowLayout());
					dlgArchivo.setTitle("Archivo no encontrado");
					dlgArchivo.addWindowListener(this);
					lblEtiqueta.setText("Archivo no encontrado");
					dlgArchivo.add(lblEtiqueta);
					dlgArchivo.setSize(200, 150);
					dlgArchivo.setLocationRelativeTo(null);
					dlgArchivo.setVisible(true);
				}
			}

		}
		else if(a.equals(mnGuardar))
		{
			FileDialog fd = new FileDialog(this, "Indicar nombre y ubicación del archivo", FileDialog.SAVE);
			fd.setFile("*.txt");
			fd.setVisible(true);
			String archivo = fd.getDirectory() + fd.getFile();
			FileWriter fw = null;
			if (archivo == "")
			{
				dlgArchivo.setLayout(new FlowLayout());
				dlgArchivo.setTitle("Archivo no encontrado");
				dlgArchivo.addWindowListener(this);
				lblEtiqueta.setText("Archivo no encontrado");
				dlgArchivo.add(lblEtiqueta);
				dlgArchivo.setSize(200, 150);
				dlgArchivo.setLocationRelativeTo(null);
				dlgArchivo.setVisible(true);
			}
			else
			{
				try
				{
					fw = new FileWriter(archivo);
					fw.write(areaTexto.getText());
					fw.close();
				}
				catch (IOException e1)
				{
					dlgArchivo.setLayout(new FlowLayout());
					dlgArchivo.setTitle("Archivo no encontrado");
					dlgArchivo.addWindowListener(this);
					lblEtiqueta.setText("Archivo no encontrado");
					dlgArchivo.add(lblEtiqueta);
					dlgArchivo.setSize(200, 150);
					dlgArchivo.setLocationRelativeTo(null);
					dlgArchivo.setVisible(true);
				}
			}
			
		}
		else if(a.equals(mnContarPalabras))
		{
			String text = areaTexto.getText();
			dlgArchivo.setLayout(new FlowLayout());
			dlgArchivo.setTitle("Contador de palabras");
			dlgArchivo.addWindowListener(this);
			//explicación del "\\s+|n"
			lblEtiqueta.setText("Este texto contiene "+text.split("\\s+|\n").length+" palabras");
			dlgArchivo.add(lblEtiqueta);
			dlgArchivo.setSize(200, 150);
			dlgArchivo.setLocationRelativeTo(null);
			dlgArchivo.setVisible(true);
		}
		else if(a.equals(mnContarLetras))
		{
			int text = areaTexto.getText().length();
			dlgArchivo.setLayout(new FlowLayout());
			dlgArchivo.setTitle("Contador de letras");
			dlgArchivo.addWindowListener(this);
			lblEtiqueta.setText("Este texto contiene "+text+" letras");
			dlgArchivo.add(lblEtiqueta);
			dlgArchivo.setSize(200, 150);
			dlgArchivo.setLocationRelativeTo(null);
			dlgArchivo.setVisible(true);
			
		}
		else if(a.equals(mnContarVocales))
		{
			int contadorVocales = 0;
			String text = areaTexto.getText();
			for(int i=0; i<text.length();i++)
			{
				switch(text.charAt(i))
				{
				case 'a': case 'e': case 'i': case 'o': case 'u':
				case 'A': case 'E': case 'I': case 'O': case 'U':
				case 'á': case 'é': case 'í': case 'ó': case 'ú':
				case 'Á': case 'É': case 'Í': case 'Ó': case 'Ú':
					contadorVocales++;
				}

			}
			dlgArchivo.setLayout(new FlowLayout());
			dlgArchivo.setTitle("Contador de vocales");
			dlgArchivo.addWindowListener(this);
			lblEtiqueta.setText("Este texto contiene "+contadorVocales+" vocales");
			dlgArchivo.add(lblEtiqueta);
			dlgArchivo.setSize(200, 150);
			dlgArchivo.setLocationRelativeTo(null);
			dlgArchivo.setVisible(true);
		}
	}
	public static void main(String[] args)
	{
		new BlocNotas();
	}

}
