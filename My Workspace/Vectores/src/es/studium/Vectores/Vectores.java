package es.studium.Vectores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vectores
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String frase;
		int numero;
		int i=0;
		System.out.println("Escriba un texto:");
		frase=(lectura.readLine());
		System.out.println("Escriba el numero del carácter buscado:");
		numero = Integer.parseInt(lectura.readLine());
		frase.charAt(numero);
		System.out.println(frase.charAt(numero));
	}

}

