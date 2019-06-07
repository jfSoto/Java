package es.studium.Ejercicio11Tema8;

import java.io.*;

public class Ejercicio11Tema8
{
	
	public Ejercicio11Tema8() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String archivo1;
		String archivo2;
		String s;
		
		
		try
		{
			System.out.println("Introduzca el nombre del primer archivo");
			archivo1=in.readLine();
			System.out.println("Introduzca el nombre del segundo archivo");
			archivo2=in.readLine();
			FileWriter fw1 = new FileWriter(archivo1, true);
			BufferedWriter bw = new BufferedWriter(fw1);
			PrintWriter destino = new PrintWriter(bw);
			FileReader fr2 = new FileReader(archivo2);
			BufferedReader origen = new BufferedReader(fr2);
			destino.println("");
			while((s=origen.readLine())!=null)
			{
				destino.println(s);
			}
			in.close();
			bw.close();
			fw1.close();
			fr2.close();
			destino.close();
			origen.close();
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
		new Ejercicio11Tema8();
	}

}
