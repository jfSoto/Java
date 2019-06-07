package es.studium.Ejercicio4Examen2Trimestre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4Examen2Trimestre
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el valor de n: ");
		n = Integer.parseInt(lectura.readLine());
		mostrarSuc(n);
		
	}
	private static void mostrarSuc(int n)
	{
		if(n==0)
		{
			System.out.println("0");
		}
		else
		{
			mostrarSuc(n-1);
			System.out.println (n+1);
		}
	}

}
