package es.studium.Ejercicio2Recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2Recursividad
{

	public static void main(String[] args) throws IOException
	{
		int n, resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame el número:");
		n = Integer.parseInt(lectura.readLine());
		resultado = suma(n);
		System.out.println("el resultado es:" + resultado);
		
	}

	public static int suma(int n)
	{
		int r;
		if(n == 1)
		{
			r = 1;
		}
		else
		{
			r = n * n + suma(n - 1);
		}
		return(r);
	}
}
