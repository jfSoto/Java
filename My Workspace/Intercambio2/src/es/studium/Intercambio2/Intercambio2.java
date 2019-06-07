package es.studium.Intercambio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intercambio2
{

	public static void main(String[] args) throws IOException
	{
		int numero1;
		int numero2;
		int comodin1;
		int comodin2;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame el número 1:");
		numero1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame el número 2:");
		numero2 = Integer.parseInt(lectura.readLine());
		comodin1 = numero1;
		comodin2 = numero2;
		numero1 = comodin2;
		numero2 = comodin1 ;
		System.out.print(numero1+" ");
		System.out.println(numero2);
	}

}
