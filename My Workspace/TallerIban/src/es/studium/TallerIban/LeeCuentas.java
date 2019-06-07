package es.studium.TallerIban;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeeCuentas
{
	public LeeCuentas()
	{
		// Leer cuentas.txt
				try
				{
					FileReader fr = new FileReader("cuentas.txt");
					BufferedReader entrada = new BufferedReader(fr);
					String s;
					while((s=entrada.readLine())!=null)
					{
						System.out.println(s);
						// Por cadea línea:
						// 1º Comprobar si es una cuenta correcta o no
						// 2º Si es correcta, calcular su iban y guardar en iban.txt
						// 3º Si no es correcto, guardar error en iba.txt
					}
					entrada.close();
					fr.close();
				}
				catch(FileNotFoundException e)
				{
					System.out.println("Archivo NO encontrado");
				}
				catch(IOException i)
				{
					System.out.println("Se produjo un error de Archivo");
				}
	}
	public static void main(String[] args)
	{
		new LeeCuentas();
	}

}
