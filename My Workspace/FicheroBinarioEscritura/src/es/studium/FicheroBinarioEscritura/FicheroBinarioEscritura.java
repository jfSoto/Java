package es.studium.FicheroBinarioEscritura;
import java.io.*;
public class FicheroBinarioEscritura
{
	public FicheroBinarioEscritura()
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("Datos.dat");
			BufferedOutputStream bos = new BufferedOutputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataOutputStream salidaB = new DataOutputStream(bos);
			//Meter un double en el archivo
			Double dato=7.345;
			salidaB.writeDouble(dato);
			salidaB.close();
			bos.close();
			fos.close();
			System.out.println("Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new FicheroBinarioEscritura();
	}
}