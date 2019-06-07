package es.studium.Igualdad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Igualdad
{

	public static void main(String[] args) throws IOException
	{
		String cadena1;
		String cadena2;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la primera cadena");
		cadena1 = (lectura.readLine());
		System.out.println("Introduzca la segunda cadena");
		cadena2 = (lectura.readLine());
		if (cadena1.equals(cadena2))
		{
			System.out.println("Ambas cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas son distintas");
		}
	}

}
