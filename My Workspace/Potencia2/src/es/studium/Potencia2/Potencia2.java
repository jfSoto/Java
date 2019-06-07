package es.studium.Potencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Potencia2
{

	public static void main(String[] args) throws IOException
	{
		int a;
		int b;
		int r;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un número para la base:");
		a = Integer.parseInt(lectura.readLine());
		System.out.println("Dame un número para el exponente:");
		b = Integer.parseInt(lectura.readLine());
		r = potencia(a, b);
		System.out.println("el número " + a + " elevado a " + b + " es igual a:" + r);
	}
	
	public static int potencia(int base, int exponente)
	{
		int resultado = 1;
		for (int i=1; i<=exponente; i++)
		{
			resultado = resultado * base; 
		}
		return resultado;
	}

}
