package es.studium.Rellenar_Tabla2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rellenar_Tabla2
{

	public static void main(String[] args) throws IOException
	{
		int Enteros[] = new int[4];
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i <= 3; i++)
		{
			System.out.println("Ingrese el valor de la posición:" + i);
			Enteros[i] = Integer.parseInt(lectura.readLine());
		}
		for(int i = 0; i <= 3; i++)
		{
			System.out.println("Tabla["+i+"]=" + Enteros[i]);
		}
	}

}
