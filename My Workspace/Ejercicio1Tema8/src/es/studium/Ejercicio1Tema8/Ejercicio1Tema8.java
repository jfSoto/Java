package es.studium.Ejercicio1Tema8;
import java.io.*;
public class Ejercicio1Tema8
{
	public Ejercicio1Tema8()
	{
		//FileWriter también puede lanzar una excepción
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("Archivo.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			System.out.println("indtroduzca texto");
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
		new Ejercicio1Tema8();
	}
}