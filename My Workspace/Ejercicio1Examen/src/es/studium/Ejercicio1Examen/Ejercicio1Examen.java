package es.studium.Ejercicio1Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1Examen
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String frase;
		int numero;
		int r;
		System.out.println("Escriba un texto:");
		frase =(lectura.readLine());
		System.out.println("Escriba el número del carácter buscado:");
		numero = Integer.parseInt(lectura.readLine());
		System.out.println (frase.charAt(numero));
		r = funcion(frase, numero);
		System.out.println("El carácter buscado es: "+r);
	}

	public static int funcion(String frase, int numero)
	{
	 return frase.charAt(numero);
	 
	}

}
