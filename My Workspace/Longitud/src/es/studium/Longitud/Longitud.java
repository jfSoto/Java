package es.studium.Longitud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Longitud
{

	public static void main(String[] args) throws IOException
	{
		String frase;
		int r;
		int t;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca una frase");
		frase = (lectura.readLine());
		r = longitud_fun1(frase);
		System.out.println("La longitud de la frase contando los espacios es: " + r);
		t = longitud_fun2(frase);
		System.out.println("La longitud de la frase sin contar los espacios es: " + t);
	}
	
	public static int longitud_fun1(String cadena)
	{
		return (cadena.length());
	}
	
	public static int longitud_fun2(String cadena)
	{
		int contadorEspacios = 0;
		for (int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) == ' ')
			{
				contadorEspacios++;
			}
		}
		return (cadena.length() - contadorEspacios);
	}
	
}
