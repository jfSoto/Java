package es.studiun.Inicializar;

import java.io.IOException;

public class Inicializar
{

	public static void main(String[] args) throws IOException
	{
		final int tam = 2;
		int tabla[] = new int [tam];
		for (int i = 0; i < tabla.length; i++)
		{
			tabla[i] = 0;
		}
		for (int i = 0; i < tabla.length; i++)
		{
			System.out.print(tabla[i] + " ");
		}
	}

}
