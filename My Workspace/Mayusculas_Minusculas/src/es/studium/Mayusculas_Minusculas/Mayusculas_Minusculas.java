package es.studium.Mayusculas_Minusculas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mayusculas_Minusculas
{

	public static void main(String[] args) throws IOException
	{
		String cadena1;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca una frase");
		cadena1 = (lectura.readLine());
		System.out.println(cadena1.toUpperCase());
		System.out.println(cadena1.toLowerCase());
			
	}

}
