package es.studium.Busqueda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Busqueda
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int Enteros[] = new int[10];
		boolean encontrado;
		int elemento;
		for (int i = 0; i <10; i++)
		{
			System.out.println("Dame un valor:");
			Enteros[i] = Integer.parseInt(lectura.readLine());
		}
		System.out.println("Ahora dame el valor a buscar:");
		elemento = Integer.parseInt(lectura.readLine());
		encontrado = false;
		int i = 0;
		while((!encontrado)&&(i < 10))
		{
			if(Enteros[i] == elemento)
			{
				encontrado = true;
			}
			else
			{
				i++;
			}
		}
		if(encontrado)
		{
			System.out.println("El elemento se encontró en la posición: " + i);
		}
		else
		{
			System.out.println("El elemento no se ha encontrado");
		}
	}

}
