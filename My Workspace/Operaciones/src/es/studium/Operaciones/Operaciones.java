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
		System.out.println("Dame un número:");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame otro número:");
		num2 = Integer.parseInt(lectura.readLine());
		suma = num1 + num2;
		resta = num1 - num2;
		producto = num1 * num2;
		if(num2 != 0)
		{
			cociente = num1 / num2;
			System.out.println("La suma de los números es: " + suma);
			System.out.println("La resta de los números es: " + resta);
			System.out.println("El producto de los números es: " + producto);
			System.out.println("El cociente del número 1 dividido por el número 2 es: " + cociente);
		}
		else
		{
			System.out.println("La suma de los números es: " + suma);
			System.out.println("La resta de los números es: " + resta);
			System.out.println("El producto de los números es: " + producto);
			System.out.println("La división no es posible. El número 2 no puede tener valor cero");
		}
		
	}

}
