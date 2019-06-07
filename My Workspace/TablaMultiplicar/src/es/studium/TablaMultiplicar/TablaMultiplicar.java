package es.studium.TablaMultiplicar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaMultiplicar
{

	public static void main(String[] args) throws IOException
	{
		int numero;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un número:");
		numero = Integer.parseInt(lectura.readLine());
		System.out.println("la tabla de multiplicar del número: " + numero + "es ");
		for(int i=0; i<=10; i++)
		{
			System.out.println(numero + "x " + i + "= " + numero * i);
		}
		
	}

}
