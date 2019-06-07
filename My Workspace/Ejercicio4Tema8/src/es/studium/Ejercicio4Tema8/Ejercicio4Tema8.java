package es.studium.Ejercicio4Tema8;

import java.io.*;

public class Ejercicio4Tema8
{

	public Ejercicio4Tema8() throws IOException
	{
		FileWriter fw = new FileWriter("Archivo.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca caracteres");
		String cadena = in.readLine();
		do 
		{
			salida.print(cadena);
			System.out.println("Introduzca otro carácteres");
			cadena = in.readLine();
				
		}
		while (!cadena.equals("*"));
		salida.close();
		bw.close();
		fw.close();
		System.out.println("Archivo creado correctamente!");
	}
	
	

	public static void main(String[] args) throws IOException
	{
		new Ejercicio4Tema8();
	}

}
