package es.studium.Segun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Segun
{
	public static void main(String[] args) throws IOException
	{
		int a;
		int b;
		int resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un n�mero:");
		a = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro n�mero:");
		b = Integer.parseInt(lectura.readLine());
		if(a < b)
		{
			resultado = a + b;
			System.out.println("La suma del n�mero 1 y el n�mero 2 es: " + resultado);
		}
		else
		{
			resultado = a * b;
			System.out.println("El producto del n�mero 1 por el n�mero 2 es: " + resultado);
		}


	}

}
