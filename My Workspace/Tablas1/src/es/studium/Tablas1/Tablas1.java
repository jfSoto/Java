package es.studium.Tablas1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tablas1
{

	public static void main(String[] args) throws IOException
	{
		int tabla[] = new int[5];
		int i;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		// Recorrido para rellenar la tabla
		for(i = 0; i < 5; i ++)
		{
		System.out.println("Ingrese el valor de la posición:" + i);
		tabla[i] = Integer.parseInt(lectura.readLine());
		}
		// Recorrido para mostrar los valores de la tabla
		for(i = 0; i < 5; i ++)
		{
		System.out.println("Tabla[" + i + "] = " + tabla[i]);
		}
	}

}
