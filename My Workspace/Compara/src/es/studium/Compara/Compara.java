package es.studium.Compara;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compara
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		//Variables
		int numero1;
		int numero2;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		//Instrucciones
		System.out.println("Dame un n�mero entero");
		numero1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro n�mero entero");
		numero2 = Integer.parseInt(lectura.readLine());
		if(numero1 == numero2)
		{
			System.out.println("Los n�meros son iguales");
		}
		else
		{
			if(numero1 > numero2)
			{
				System.out.println("El n�mero 1 es mayor que el n�mero 2");
			}
			else
			{
				System.out.println("El n�mero 2 es mayor que el n�mero 1");
			}
		}

	}

}
