package es.studium.FicheroTextoLectura;
//El paquete java.io posee las clases necesarias para los archivos
import java.io.*;
public class FicheroTextoLectura
{
	public FicheroTextoLectura()
	{
		//Como usaremos FileReader y puede lanzar una excepción
		//necesitaremos un bloque try – catch
		try
		{
			//Origen de los datos en el proyecto anterior
			FileReader fr = new FileReader("../FicheroTextoEscritura/Archivo.txt");
					//Buffer de lectura
					BufferedReader entrada = new BufferedReader(fr);
					String s;
					//Bucle para sacar la información del archivo
					while((s=entrada.readLine())!=null)
					{
						System.out.println(s);
					}
					//Cerrar el objeto entrada
					entrada.close();
					fr.close();
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
		new FicheroTextoLectura();
	}
}