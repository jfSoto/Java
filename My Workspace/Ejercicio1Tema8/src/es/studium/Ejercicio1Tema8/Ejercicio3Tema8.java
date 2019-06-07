package es.studium.Ejercicio1Tema8;
import java.io.*;
public class Ejercicio3Tema8
{
	public Ejercicio3Tema8()
	{
		//FileWriter también puede lanzar una excepción
		try
		{
			FileWriter fw = new FileWriter("Archivo.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduzca más texto");
			String cadena = in.readLine();
			salida.println(cadena);
			salida.close();
			bw.close();
			fw.close();
			System.out.println("Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new Ejercicio3Tema8();
	}
}