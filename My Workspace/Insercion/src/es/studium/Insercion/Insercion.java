package es.studium.Insercion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insercion
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int tabla[] = new int[10];
		
		int j, aux;
		for(int i = 0;i <= 9; i++)
		{
			System.out.println("Dame un valor:");
			tabla [i] = Integer.parseInt(lectura.readLine());
		}
		for (int i = 0; i <= 9; i++)
		{
			j = i;
			aux = tabla[i];
			while((j > 0) && (aux < tabla[j - 1]))
			{
				tabla[j] = tabla[j - 1];
				j = j - 1;
			}
			tabla [j] = aux;
		}
		for (int i = 0;i <= 9; i++)
		{
			System.out.println("los números se ordenan de la siguiente forma: " + tabla [i]);
		}
	}
}