package es.studium.Cuadrados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuadrados
{

	public static void main(String[] args) throws IOException
	{
		int numero;
		int Enteros[] = new int[10];
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese un entero");
		numero = Integer.parseInt(lectura.readLine());
		for (int i = 0; i <= 9; i++)
		{
			Enteros[i] = (numero+1)*(numero+1);
			numero++;
		}
		for(int i = 0; i <= 9; i++)
		{
			System.out.println("Tabla["+i+"]=" + Enteros[i]);
		}
	}

}
