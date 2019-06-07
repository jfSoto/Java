package es.studium.Ejercicio9Tema8;

import java.io.*;

public class Ejercicio9Tema8
{
	
	public Ejercicio9Tema8() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String archivo1, palabra, s;
		String contenido = "";
		
		
		try
		{
			System.out.println("Introduzca el nombre del primer archivo");
			archivo1=in.readLine();
			System.out.println("Introduzca la palabra que desea comprobar");
			palabra=in.readLine();
			FileReader fr1 = new FileReader(archivo1);
			BufferedReader entrada1 = new BufferedReader(fr1);
			
			
			while((s=entrada1.readLine())!=null)
			{
				contenido += s;
			}
			entrada1.close();
			in.close();
			fr1.close();
			
			int encontrado = contenido.indexOf(palabra);
			if(encontrado!=-1)
			{
				System.out.println("La palabra '" + palabra + "' está en el fichero " + archivo1 + " en la posición "+encontrado);
			}
			else
			{
				System.out.println("La palabra '" + palabra + "' NO está en el fichero " + archivo1);
			}
			
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

	public static void main(String[] args) throws IOException
	{
		new Ejercicio9Tema8();
	}

}
