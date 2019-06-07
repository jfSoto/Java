package es.studium.Ejercicio5Tema8;

import java.io.*;

public class Ejercicio5Tema8
{

	public Ejercicio5Tema8() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String archivo1;
		String archivo2;
		System.out.println("Introduzca la dirección del primer archivo");
		archivo1=in.readLine();
		FileReader fr1 = new FileReader(archivo1);
		System.out.println("Introduzca la dirección del segundo archivo");
		archivo2=in.readLine();
		FileReader fr2 = new FileReader(archivo2);
		BufferedReader entrada1 = new BufferedReader(fr1);
		BufferedReader entrada2 = new BufferedReader(fr2);
		String a;
		String s;
		String contenido1="", contenido2="";
		while((s=entrada1.readLine())!=null)
		{
			contenido1 += s;
		}
		while((a=entrada2.readLine())!=null)
		{
			contenido2 += a;
		}
		
		if (contenido1.equals(contenido2))
		{
			System.out.println("El contenido de los archivos son iguales");
		}
		else
		{
			System.out.println("El contenido de los archivos no son iguales");
		}
		entrada1.close();
		fr1.close();
		entrada2.close();
		fr2.close();
		in.close();
	}
	public static void main(String[] args) throws IOException
	{
		new Ejercicio5Tema8();
	}

}
