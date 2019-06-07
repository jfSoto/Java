package es.studium.Nombre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nombres
{

	public static void main(String[] args) throws IOException
	{
		String nombre1;
		String nombre2;
		String nombre3;
		String nombre4;
		String nombre5;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el nombre 1");
		nombre1 = (lectura.readLine());
		System.out.println("Introduzca el nombre 2");
		nombre2 = (lectura.readLine());
		System.out.println("Introduzca el nombre 3");
		nombre3 = (lectura.readLine());
		System.out.println("Introduzca el nombre 4");
		nombre4 = (lectura.readLine());
		System.out.println("Introduzca el nombre 5");
		nombre5 = (lectura.readLine());
		System.out.println(nombre1);
		System.out.println(nombre2);
		System.out.println(nombre3);
		System.out.println(nombre4);
		System.out.println(nombre5);
		
		
		
	}

}
