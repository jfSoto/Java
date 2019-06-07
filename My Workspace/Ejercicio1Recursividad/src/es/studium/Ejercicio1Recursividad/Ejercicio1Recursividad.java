package es.studium.Ejercicio1Recursividad;

import java.io.IOException;

public class Ejercicio1Recursividad
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("La suma de los 100 primeros números vale: " + suc(100));
	}

	public static int suc(int n)
	{
		int r;
		if(n == 1)
		{
			r = 1; //CASO BASE
		}
		else
		{
			r = n + suc(n-1);
		}
		return(r);
	}
}
