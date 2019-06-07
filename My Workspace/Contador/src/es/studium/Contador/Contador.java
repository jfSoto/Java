package es.studium.Contador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contador
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int []contador = new int[2];
		int numero;
		for (int i = 0; i < 2; i++)
		{
			contador[i] = 0;
		}
		do
		{
			System.out.println("Indique un número:");
			numero = Integer.parseInt(lectura.readLine());
			if (numero > 0)
			{
				contador[0] = contador[0] + 1;
			}
			if (numero < 0)
			{
				contador[1] = contador [1] + 1;
			}
		}
		while(numero != 0);
		System.out.println("El número de valores positivos es: " + contador[0]);
		System.out.println("El número de valores negativos es: " + contador[1]);
	}

}
