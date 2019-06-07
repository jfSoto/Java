package es.studium.ListaActividades;

import java.util.ArrayList;
import java.util.List;

public class ListaActividades7
{

	
	public static void main(String[] args) 
	{
		List<String> lista = new ArrayList<String>();
		
		lista.add("casa1");
		lista.add("casa2");
		lista.add("casa3");
		lista.add("casa4");
		lista.add("casa5");
		lista.add("casa6");

		System.out.println(lista);
	
		int indice = lista.indexOf("casa1");
		if (indice >= 0)
		{
			lista.set(indice, "casa8");
		}
		System.out.println(lista);
		
		
		
	}

}
