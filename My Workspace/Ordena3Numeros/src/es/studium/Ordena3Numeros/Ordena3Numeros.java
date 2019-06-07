package es.studium.Ordena3Numeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ordena3Numeros
{

	public static void main(String[] args) throws IOException
	{
		int a;
		int b;
		int c;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un número:");
		a = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro número:");
		b = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro número");
		c = Integer.parseInt(lectura.readLine());
		if(a >= b && b >= c)
		{
			System.out.println("Los números ordenados de mayor a menor son: " + a + " " + b + " " + c + " ");
		}
		if(a >= c && c >= b)
		{
			System.out.println("Los números ordenados de mayor a menor son: " + a + " " + c + " " + b + " ");
		}
		if(b >= a && a >= c)
		{
			System.out.println("Los números ordenados de mayor a menor son: " + b + " " + a + " " + c +" ");
		}
		if(b >= c && c >= a)
		{
			System.out.println("Los números ordenados de mayor a menor son: " + b + " " + c + " " + a + " ");
		}
		if(c >= a && a >= b)
		{
			System.out.println("Los números ordenados de mayor a menor son: " + c + " " + a + " " + b + " ");
		}
		if(c >= b && b >= a)
		{
			System.out.println("Los números ordenados de mayor a menor son: " + c + " " + b + " " + a + " ");
		}
		
	}

}
