package es.studium.Ejercicio10Tema8;

import java.io.*;

public class Ejercicio10Tema8
{
	
	public Ejercicio10Tema8() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String archivo1, palabra, s;
		String contenido = "";
		int contador = 0;
		
		
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
			
			while(contenido.indexOf(palabra) > -1)
			{
				contenido = contenido.substring(contenido.indexOf(palabra)+palabra.length(),contenido.length());
				contador++; 
			}

			if (contador == 0)
			{
				System.out.println("La palabra " + palabra + " no ha sido encontrada en el archivo");
			}
			else
			{
				System.out.println("La palabra " + palabra + " ha sido encontrada en el archivo " + contador + " veces");
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
		new Ejercicio10Tema8();
	}

}
