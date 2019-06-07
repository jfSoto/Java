package es.studium.Aleatorios3;

import java.util.Random;

public class Aleatorios3
{

	public static void main(String[] args)
	{

		Random rnd=new Random();
		for (int i = 0; i < 10; i++)
		{
			System.out.println(rnd.nextDouble());
		}

	}

}
