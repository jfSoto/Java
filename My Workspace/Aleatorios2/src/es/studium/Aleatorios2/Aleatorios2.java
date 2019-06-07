package es.studium.Aleatorios2;

import java.util.Random;

public class Aleatorios2
{

	public static void main(String[] args)
	{
		Random rnd=new Random();
		int i,x;
		for(i=0;i<10;i++)
		{
			x=rnd.nextInt(1000);
			System.out.println(x);
		}

	}

}
