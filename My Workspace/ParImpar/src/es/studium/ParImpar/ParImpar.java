package es.studium.ParImpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParImpar
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int numero;
		System.out.println("Ingrese n�mero: ");
		numero = Integer.parseInt(lectura.readLine());
		if(numero%2==0)
		{
			System.out.println("El n�mero es PAR");
		}
		else
		{
			System.out.println("El n�mero es IMPAR");
		}

	}

}
