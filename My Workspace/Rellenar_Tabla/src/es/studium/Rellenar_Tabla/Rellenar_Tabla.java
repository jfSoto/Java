package es.studium.Rellenar_Tabla;

import java.io.IOException;

public class Rellenar_Tabla
{

	public static void main(String[] args) throws IOException
	{
		int Pares[] = new int[20];
		for (int i = 0; i <= 19; i++)
		{
			Pares[i] = (i+1)*2;
		}
		for (int i = 0; i <= 19; i++)
		{
			System.out.println(Pares[i]);
		}

	}

}
