package es.studium.FicheroTextoEscritura;
import java.io.*;
public class FicheroTextoEscritura2
{
	public FicheroTextoEscritura2()
	{
		//FileWriter tambi�n puede lanzar una excepci�n
		try
		{
			// Destino de los datos
			FileWriter fw = new FileWriter("Archivo.txt", true);
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);
			//A�adimos la segunda frase y un double
			salida.println("Segunda l�nea");
			double b=123.45;
			salida.println(b);
			salida.close();
			bw.close();
			fw.close();
			System.out.println("Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new FicheroTextoEscritura2();
	}
}