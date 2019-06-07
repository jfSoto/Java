package es.studium.FicheroBinarioLectura;
import java.io.*;
public class FicheroBinarioLectura
{
	public FicheroBinarioLectura()
	{
		double d;
		try
		{
			FileInputStream fis = new FileInputStream
					("../FicheroBinarioEscritura/Datos.dat");
			BufferedInputStream bis = new BufferedInputStream (fis);
			//Necesitamos un objeto de la clase DataInputStream
			DataInputStream entradaB = new DataInputStream(bis);
			//Sacar un double del archivo.
			d=entradaB.readDouble();
			entradaB.close();
			bis.close();
			fis.close();
			System.out.println(Double.toString(d));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new FicheroBinarioLectura();
	}
}