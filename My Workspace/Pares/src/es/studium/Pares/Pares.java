package es.studium.Pares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pares
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,i;
		System.out.println("Ingrese número: ");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Deme otro número: ");
		num2 = Integer.parseInt(lectura.readLine());
		for(i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}

		}

	}
}