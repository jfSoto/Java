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
		System.out.println("Dame un número:");
		a = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro número:");
		b = Integer.parseInt(lectura.readLine());
		if(a < b)
		{
			resultado = a + b;
			System.out.println("La suma del número 1 y el número 2 es: " + resultado);
		}
		else
		{
			resultado = a * b;
			System.out.println("El producto del número 1 por el número 2 es: " + resultado);
		}


	}

}
