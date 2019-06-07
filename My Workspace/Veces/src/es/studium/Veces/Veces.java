package es.studium.Veces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Veces
{

	public static void main(String[] args) throws IOException
	{
		int numero;
		int veces;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("indicar un número:");
		veces = Integer.parseInt(lectura.readLine());
		System.out.println("indicar otro número:");
		numero = Integer.parseInt(lectura.readLine());
		for(int i=1; i<=veces; i++)
		{
			System.out.println(numero);
		}
		
	}

}
