package es.studium.Operaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones
{

	public static void main(String[] args) throws IOException
	{
		int num1;
		int num2;
		int suma;
		int resta;
		int producto;
		double cociente;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un n�mero:");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro n�mero:");
		num2 = Integer.parseInt(lectura.readLine());
		suma = num1 + num2;
		resta = num1 - num2;
		producto = num1 * num2;
		if(num2 != 0)
		{
			cociente = num1 / num2;
			System.out.println("La suma de los n�meros es: " + suma);
			System.out.println("La resta de los n�meros es: " + resta);
			System.out.println("El producto de los n�meros es: " + producto);
			System.out.println("El cociente del n�mero 1 dividido por el n�mero 2 es: " + cociente);
		}
		else
		{
			System.out.println("La suma de los n�meros es: " + suma);
			System.out.println("La resta de los n�meros es: " + resta);
			System.out.println("El producto de los n�meros es: " + producto);
			System.out.println("La divisi�n no es posible. El n�mero 2 no puede tener valor cero");
		}
		
	}

}
