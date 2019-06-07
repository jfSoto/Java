package es.studium.TallerTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TallerTema3
{

	public static void main(String[] args) throws IOException
	{	
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int tabla[] = new int[1000];
		int tabla2[] = new int[1000];
		int tabla3[] = new int[1000];
		int tabla4[] = new int[1000];
		int tabla5[] = new int[1000];
		int i;
		int j;
		int aux;
		int numero;
		boolean encontrado;
		Random rnd = new Random();
		for(i = 0; i < 1000; i++)
		{
			tabla[i] = rnd.nextInt(10000)-5000;
		}
		for(i = 0; i < 1000; i++)
		{
			System.out.println(tabla[i]);
		}
		System.out.println("Dame un número entero entre el -5000 y 4999");
		numero = Integer.parseInt(lectura.readLine());
		encontrado = false;
		for(i = 0; i < 1000; i++)
		{
			if(numero == tabla[i])
			{
				System.out.println("El elemento se ha encontrado en " + i);
				encontrado = true;
			}
			
		}
		if(!encontrado)
		{
			System.out.println("El elemento no se ha encontrado ");
		}
		for(i = 0; i < 1000; i++)
		{
			tabla2[i] = tabla[i];
			tabla3[i] = tabla[i];
			tabla4[i] = tabla[i];
			tabla5[i] = tabla[i];
		}
		// Ordenar tabla2 por el método de intercambio
		
		for(i = 0;i <= 999; i++)
		{
			
			for(j = i + 1; j <= 999; j++)
			{
				if(tabla2[i] > tabla2[j])
				{
					aux = tabla2[i];
					tabla2[i] = tabla2[j];
					tabla2[j] = aux;
				}
			}
			
		}
		for(i = 0; i < 1000; i++)
		{
			System.out.println(tabla2[i]);
		}

	}

}
