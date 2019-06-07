package es.studium.Concatena;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatena
{

	public static void main(String[] args) throws IOException
	{
		String cadena1;
		String cadena2;
		String cadena3;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la primera cadena");
		cadena1 = (lectura.readLine());
		System.out.println("Introduzca la segunda cadena");
		cadena2 = (lectura.readLine());
		cadena3 = (cadena1 + " " + cadena2);
		System.out.println(cadena3);
	}

}
