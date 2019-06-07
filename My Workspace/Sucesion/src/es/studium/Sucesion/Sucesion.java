package es.studium.Sucesion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sucesion
{

	public static void main(String[] args) throws IOException
	{
		int n;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame el valor de n:");
		n = Integer.parseInt(lectura.readLine());
		suc(n-1);
	}
	
	public static double suc(double n)
	{
		if(n == 0)
		{
			System.out.println(3.0/2.0);
		}
		else
		{
			suc(n - 1);
			System.out.println((n + 3)/2);
		}
		return n;
	}
}
