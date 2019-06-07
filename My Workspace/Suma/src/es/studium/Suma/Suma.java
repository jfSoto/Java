package es.studium.Suma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma
{

	public static void main(String[] args) throws IOException

	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2, suma;
		System.out.println("Ingrese número: ");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Deme otro número: ");
		num2 = Integer.parseInt(lectura.readLine());
		suma = num1 + num2;
		System.out.println("La suma es "+suma);

	}

}
