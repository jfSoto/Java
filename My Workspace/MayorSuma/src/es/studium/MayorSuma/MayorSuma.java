package es.studium.MayorSuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MayorSuma
{

	public static void main(String[] args) throws IOException
	{
		int numero1;
		int numero2;
		int numero3;
		int suma;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame el número 1:");
		numero1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame el número 2:");
		numero2 = Integer.parseInt(lectura.readLine());
		suma = numero1 + numero2;
		do
		{
			System.out.println("Dame el número 3:");
			numero3 = Integer.parseInt(lectura.readLine());
			if(suma >= numero3)
			{
				suma = numero2 + numero3;
				numero2 = numero3;
			}
			
		}while(suma >= numero3);
		
		
	}

}
