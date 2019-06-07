package es.studium.ImprimirTextAreaPDF;

import java.awt.Button;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ImprimirTextAreaPDF extends Frame implements WindowListener,ActionListener
{
	private static final long serialVersionUID = 1L;
	TextArea campo2 = new TextArea("",5,20);
	Button b = new Button ("Imprimir texto");
	// Se crea el documento
	Document documento = new Document();
	File path = new File ("fichero.pdf");
	public ImprimirTextAreaPDF()
	{
		setLayout(new FlowLayout());
		setTitle("Imprimir TextArea");
		add(campo2);
		add(b);
		b.addActionListener(this);
		addWindowListener(this);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new ImprimirTextAreaPDF();
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
			FileOutputStream ficheroPdf = new FileOutputStream("fichero.pdf");
			// Se asocia el documento al OutputStream y se indica que el espaciado entre
			// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento 
			PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
			//Se abre el documento.
			documento.open();
			documento.add(new Paragraph(campo2.getText()));
			documento.close();
			//Y ahora abrimos el fichero para mostrarlo
			Desktop.getDesktop().open(path);
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}