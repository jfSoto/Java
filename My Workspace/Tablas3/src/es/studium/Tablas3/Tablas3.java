package es.studium.Tablas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tablas3
{

	public static void main(String[] args) throws IOException
	{
		int tabla[][] = new int[5][5];
		int i,j;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		// Recorrido para rellenar la tabla
		for(i = 0; i < 5; i ++)
		{
			for(j = 0; j < 5; j ++)
			{
				System.out.println("Ingrese el valor de la posici�n: (" + i + "," + j + ") ");
				tabla[i][j] = Integer.parseInt(lectura.readLine());
			}
		}
		// Recorrido para mostrar los valores de la tabla
		for(i = 0; i < 5; i ++)
		{
			for(j = 0; j < 5; j ++)
			{
				System.out.println("Tabla[" + i + "][" + j + "] = " + tabla[i][j]);
			}
		}
	}

}
