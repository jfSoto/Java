package es.studiumEjercicio5Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio5Examen
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int tabla[] = new int[20];
		int aux;
		int []contador = new int[2];
		int numero;
		for(int i=0;i<20;i++)
		{
			tabla[i] = (int) Math.floor(Math.random() * 2);
		}
		for(int i=0;i<20;i++)
		{
			for(int j=i+1; j <= 19;j++)
			{
				if((tabla[i]< tabla[j]))
				{
					aux = tabla[i];
					tabla[i]= tabla[j];
					tabla[j] = aux;
				}
			}
		}
		for(int i = 0; i < 20; i ++)
		{
			System.out.println(tabla[i]);
		}
		for (int i = 0; i < 2; i++)
		{
			contador[i] = 0;
		}
		do
		{
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
		
	}

}
