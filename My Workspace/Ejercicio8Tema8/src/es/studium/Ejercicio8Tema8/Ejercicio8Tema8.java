package es.studium.Ejercicio8Tema8;

import java.io.*;

public class Ejercicio8Tema8
{

	public Ejercicio8Tema8() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String archivo1;
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		int contadorSignos = 0;
		String contenido = "";
		String s;
		try
		{
			System.out.println("Introduzca el nombre del primer archivo");
			archivo1=in.readLine();
			FileReader fr1 = new FileReader(archivo1);
			BufferedReader entrada1 = new BufferedReader(fr1);
			
			while((s=entrada1.readLine())!=null)
			{
				contenido += s;
			}
			entrada1.close();
			in.close();
			fr1.close();
			for(int i=0; i<contenido.length();i++)
			{
				switch(contenido.charAt(i))
				{
				case 'a': case 'e': case 'i': case 'o': case 'u':
				case 'A': case 'E': case 'I': case 'O': case 'U':
				case 'á': case 'é': case 'í': case 'ó': case 'ú':
				case 'Á': case 'É': case 'Í': case 'Ó': case 'Ú':
					contadorVocales++;
					break;
				case ' ': case ',': case ':': case ';':
					contadorSignos++;
					break;
				case '0': case '1': case '2': case '3': case '4':
				case '5': case '6': case '7': case '8': case '9':
					break;
				default:
					contadorConsonantes++;
				}
			}
			System.out.println("En el archivo hay "+ contadorVocales + " vocales, " + contadorConsonantes + 
			" consonantes y " + contadorSignos + " signos.");
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
		new Ejercicio8Tema8();

	}

}
