package es.studium.Ejercicio6Tema8;

import java.io.*;

public class Ejercicio6Tema8
{
	
	public Ejercicio6Tema8() throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String archivo1;
		String archivo2;
		String respuesta;
		String s;
		File fr = null;
		try
		{
			System.out.println("Introduzca la dirección del primer archivo");
			archivo1=in.readLine();
			System.out.println("Introduzca la dirección del segundo archivo");
			archivo2=in.readLine();
			FileReader fr1 = new FileReader(archivo1);
			fr = new File(archivo2);
			FileWriter fw = null;
			if (fr.exists()) 
			{
				System.out.println("El archivo ya existe, ¿Quiere sobreescribir el archivo?");
				System.out.println("S/N");
				respuesta=in.readLine();
				if (respuesta.equals("S"))
				{
					fw = new FileWriter(archivo2, false);
				}
				else
				{
					fw = new FileWriter(archivo2, true);
				}
			}
			else
			{
				fw = new FileWriter(archivo2);
			}
			
			
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			BufferedReader entrada1 = new BufferedReader(fr1);

			while((s=entrada1.readLine())!=null)
			{
				salida.println(s);
			}
			System.out.println("El archivo se ha creado correctamente");
		
			salida.close();
			bw.close();
			fw.close();
			entrada1.close();
			fr1.close();
			in.close();

		}
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		new Ejercicio6Tema8();
	}

}
