package es.studium.ConcatenarCaracteres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatenarCaracteres
{

	public static void main(String[] args) throws IOException
	{
		char a;
		char b;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un car�cter:");
		a = lectura.readLine().charAt(0);
		System.out.println("Dame otro car�cter:");
		b = lectura.readLine().charAt(0);
		System.out.println(a +""+ b);
			
	}

}
