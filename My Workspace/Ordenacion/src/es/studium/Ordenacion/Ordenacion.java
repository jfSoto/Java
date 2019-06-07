package es.studium.Ordenacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ordenacion
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
			for(int j = i + 1; j <= 9; j++)
			{
				if(array[i] > array[j])
				{
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		for (int i = 0;i <= 9; i++)
		{
			System.out.println("los números se ordenan de la siguiente forma: " + array[i]);
		}
		
	}

}
