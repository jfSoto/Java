package es.studium.Cuadrados_Forma2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuadrados_Forma2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int []tabla1=new int[10];
		int numero;
		System.out.println("Indique un número");
		numero = Integer.parseInt(lectura.readLine());
		for (int i = 0; i <10; i++)
		{
			tabla1[i] = i + (numero + 1);
		}
		for (int i = 0; i < 10; i++)
		{
			tabla1[i] = (int) Math.pow(tabla1[i],2);
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println(tabla1[i]);
		}
	}

}
