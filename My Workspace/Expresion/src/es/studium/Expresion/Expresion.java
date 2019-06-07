package es.studium.Expresion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expresion
{

	public static void main(String[] args) throws IOException
	{
		int a;
		int b;
		int c;
		double r;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame el número equivalente a la letra a:");
		a = Integer.parseInt(lectura.readLine());
		System.out.println("Dame el número equivalente a la letra b:");
		b = Integer.parseInt(lectura.readLine());
		System.out.println("Dame el número equivalente a la letra c:");
		c = Integer.parseInt(lectura.readLine());
		r = expresion(a, b, c);
		System.out.println("El resultado de aplicar la expresión los números dados es:" + r);
	}	

	public static double expresion(int x, int y, int z)
	{
		double resultado;
		resultado = ((y * y) - (4 * x * z)) / (2 * x);
		return resultado;
	}

}


