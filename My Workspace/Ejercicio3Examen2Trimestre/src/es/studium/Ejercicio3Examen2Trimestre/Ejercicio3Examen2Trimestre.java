package es.studium.Ejercicio3Examen2Trimestre;

import java.util.Random;

public class Ejercicio3Examen2Trimestre
{

	public static void main(String[] args)
	{
		Random rnd = new Random();
		int tabla[] = new int[5000];
		int aux;
		

		for(int i = 0; i < 5000; i++)
		{
			tabla[i] = rnd.nextInt(10000)+1;
		}

		//for (int i=0; i < tabla.length; i++) 
		//{
		//	media = media + tabla[i];
		//}
		//media = media / tabla.length;
		
		for(int i=0;i<5000;i++)
		{
			for(int j=i+1; j <= 4999;j++)
			{
				if((tabla[i]< tabla[j]))
				{
					aux = tabla[i];
					tabla[i]= tabla[j];
					tabla[j] = aux;
				}
			}
		}
		for(int i = 0; i < 5000; i ++)
		{
			System.out.println(tabla[i]);
		}
		
			Media(tabla);
			System.out.println("La media es: " + Media(tabla));

	}
	
	private static double Media(int tabla[])
	{
		int media = 0;
		for (int i=0; i < tabla.length; i++) 
		{
			media = media + tabla[i];
		}
		media = media / tabla.length;
		return media;
	}
	

}
