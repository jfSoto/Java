package es.studium.Aleatorios4;

import java.util.Random;

public class Aleatorios4
{

	public static void main(String[] args)
	{
		Random rnd=new Random();
		int x;
		for (int i = 0; i < 10; i++)
		{
			x = (int)(rnd.nextDouble() * 10.0);
			System.out.println(x);
		}

	}

}
