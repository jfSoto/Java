package es.studium.Potencia1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Potencia1
{

	public static void main(String[] args) throws IOException
	{
		int base;
		int exp;
		int resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		resultado = 1;
		System.out.println("Dame un número para la base:");
		base = Integer.parseInt(lectura.readLine());
		System.out.println("Dame un número para el exponente:");
		exp = Integer.parseInt(lectura.readLine());
		for (int i=1; i<=exp; i++)
		{
			resultado = resultado * base;
		}
		System.out.println("el número " + base + " elevado a " + exp + " es " + resultado); 
	}

}
