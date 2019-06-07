package es.studium.Ejercicio1SinRecursividad;

import java.io.IOException;

public class Ejercicio1SinRecursividad 
{

	public static void main(String[] args) throws IOException
	{
		int suma = 0;
		for(int i = 1; i <= 100; i++)
		{
			suma += i;
		}
		System.out.println(suma);
	}

}
