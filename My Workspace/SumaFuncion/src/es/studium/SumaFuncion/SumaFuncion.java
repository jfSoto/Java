package es.studium.SumaFuncion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaFuncion
{

	public static void main(String[] args) throws IOException
	{
		int numero1;
		int numero2;
		int r;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un número:");
		numero1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro número:");
		numero2 = Integer.parseInt(lectura.readLine());
		r = suma(numero1,numero2);
		System.out.println("La suma de los números es:" + r);
		
		
	}
	public static int suma(int a, int b)
	{
		return(a + b);
	}
}
