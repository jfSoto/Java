package es.studium.Compara2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compara2
{

	public static void main(String[] args) throws IOException
	{
		String cadena1;
		String cadena2;
		int longitud1;
		int longitud2;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la primera cadena");
		cadena1 = (lectura.readLine());
		System.out.println("Introduzca la segunda cadena");
		cadena2 = (lectura.readLine());
		longitud1 = cadena1.length();
		longitud2 = cadena2.length();
		
		if (longitud1 == longitud2)
		{
			System.out.println("La primera cadena y la segunda tienen el mismo número de caracteres");
		}
		else
		{
			if (longitud1 < longitud2)
			{
				System.out.println("La primera cadena tiene menor número de caracteres que la segunda");
			}
			else
			{
				System.out.println("La primera cadena tiene mayor número de caracteres que la segunda");
			}
		}
	}

}
