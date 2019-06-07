package es.studium.Ordenacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ordenacion2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int array[] = new int[10];
		int aux;
		for(int i = 0;i <= 9; i++)
		{
			System.out.println("Dame un valor:");
			array[i] = Integer.parseInt(lectura.readLine());
		}
		for(int i = 0;i <= 8; i++)
		{
			int indice_menor = i;
			for(int j = i + 1; j <= 9; j++)
			{
				if(array[j] < array[indice_menor])
				{
					indice_menor = j;
				}
			}
			aux = array[i];
			array[i] = array[indice_menor];
			array[indice_menor] = aux;
		}
		for (int i = 0;i <= 9; i++)
		{
			System.out.println("los números se ordenan de la siguiente forma: " + array[i]);
		}
	}

}
