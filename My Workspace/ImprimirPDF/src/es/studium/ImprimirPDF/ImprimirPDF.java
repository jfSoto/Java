package es.studium.ImprimirPDF;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
public class ImprimirPDF
{
	public static void main(String[] args)
	{
		// Se crea el documento
		Document documento = new Document();
		try
		{
			// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
			FileOutputStream ficheroPdf = new FileOutputStream("fichero.pdf");
			// Se asocia el documento al OutputStream y se indica que el espaciado entre
			// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
			PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
			// Se abre el documento.
			documento.open();
			documento.add(new Paragraph("Esto es el primer p�rrafo, normalito"));
			documento.add(new Paragraph("Este es el segundo y tieneuna fuente rara", FontFactory.getFont(
			"arial", // fuente 
			22, // tama�o
			Font.ITALIC, // estilo
			BaseColor.CYAN))); // color
			Image foto = Image.getInstance("pingu.png");
			foto.scaleToFit(100, 100);
			foto.setAlignment(Chunk.ALIGN_MIDDLE);
			documento.add(foto);
			PdfPTable tabla = new PdfPTable(3);
			for (int i = 0; i < 15; i++)
			{
				tabla.addCell("celda " + i);
			}
			documento.add(tabla);
			documento.close();
			//Abrimos el archivo PDF reci�n creado
			try
			{
				File path = new File ("fichero.pdf");
				Desktop.getDesktop().open(path);
			}
			catch (IOException ex)
			{
				System.out.println("Se ha producido un error al abrir el archivo PDF");
			}
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
}