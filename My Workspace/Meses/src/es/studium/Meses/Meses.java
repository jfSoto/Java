package es.studium.Meses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Meses
{

	public static void main(String[] args) throws IOException
	{
		int a;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el n�mero del mes buscado:");
		a = Integer.parseInt(lectura.readLine());
		switch(a)
		{
		case 1:
			System.out.println("el mes equivalente al n�mero " + a + " es: Enero");
			break;
		case 2:
			System.out.println("el mes equivalente al n�mero " + a + " es: Febrero");
			break;
		case 3:
			System.out.println("el mes equivalente al n�mero " + a + " es: Marzo");
			break;
		case 4:
			System.out.println("el mes equivalente al n�mero " + a + " es: Abril");
			break;
		case 5:
			System.out.println("el mes equivalente al n�mero " + a + " es: Mayo");
			break;
		case 6:
			System.out.println("el mes equivalente al n�mero " + a + " es: Junio");
			break;
		case 7:
			System.out.println("el mes equivalente al n�mero " + a + " es: Julio");
			break;
		case 8:
			System.out.println("el mes equivalente al n�mero " + a + " es: Agosto");
			break;
		case 9:
			System.out.println("el mes equivalente al n�mero " + a + " es: Septiembre");
			break;
		case 10:
			System.out.println("el mes equivalente al n�mero " + a + " es: Octubre");
			break;	
		case 11:
			System.out.println("el mes equivalente al n�mero " + a + " es: Noviembre");
			break;
		case 12:
			System.out.println("el mes equivalente al n�mero " + a + " es: Diciembre");
			break;	
		default:
			System.out.println("el n�mero " + a + " no pertenece a ningun mes");
			
			
		}
	}

}
