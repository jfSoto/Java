package es.studium.Aleatorios5;

import java.util.Random;

public class Aleatorios5
{

	public static void main(String[] args)
	{
		Random rnd=new Random();
		System.out.println("Primera secuencia");
		for (int i = 0; i < 5; i++)
		{
			System.out.print("\t"+rnd.nextDouble());
		}
		System.out.println("");
		System.out.println("Segunda secuencia");
		for (int i = 0; i < 5; i++)
		{
			System.out.print("\t"+rnd.nextDouble());
		}
		System.out.println("");


	}

}
