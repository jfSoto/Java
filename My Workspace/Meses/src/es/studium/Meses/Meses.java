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
		System.out.println("Introduzca el número del mes buscado:");
		a = Integer.parseInt(lectura.readLine());
		switch(a)
		{
		case 1:
			System.out.println("el mes equivalente al número " + a + " es: Enero");
			break;
		case 2:
			System.out.println("el mes equivalente al número " + a + " es: Febrero");
			break;
		case 3:
			System.out.println("el mes equivalente al número " + a + " es: Marzo");
			break;
		case 4:
			System.out.println("el mes equivalente al número " + a + " es: Abril");
			break;
		case 5:
			System.out.println("el mes equivalente al número " + a + " es: Mayo");
			break;
		case 6:
			System.out.println("el mes equivalente al número " + a + " es: Junio");
			break;
		case 7:
			System.out.println("el mes equivalente al número " + a + " es: Julio");
			break;
		case 8:
			System.out.println("el mes equivalente al número " + a + " es: Agosto");
			break;
		case 9:
			System.out.println("el mes equivalente al número " + a + " es: Septiembre");
			break;
		case 10:
			System.out.println("el mes equivalente al número " + a + " es: Octubre");
			break;	
		case 11:
			System.out.println("el mes equivalente al número " + a + " es: Noviembre");
			break;
		case 12:
			System.out.println("el mes equivalente al número " + a + " es: Diciembre");
			break;	
		default:
			System.out.println("el número " + a + " no pertenece a ningun mes");
			
			
		}
	}

}
