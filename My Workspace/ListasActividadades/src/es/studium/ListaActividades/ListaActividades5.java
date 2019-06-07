package es.studium.ListaActividades;

import java.util.ArrayList;
import java.util.List;

public class ListaActividades5
{

	public static void main(String[] args) 
	{
		List<Casa> lista = new ArrayList<Casa>();

		Casa casa1 = new Casa("Pato", 1);
		Casa casa2 = new Casa("Gato", 2);
		Casa casa3 = new Casa("Paco", 3);
		Casa casa4 = new Casa("Pepe", 4);
		Casa casa5 = new Casa("Pico", 5);
		Casa casa6 = new Casa("Jaja", 6);
		
		lista.add(casa1);
		lista.add(casa2);
		lista.add(casa3);
		lista.add(casa4);
		lista.add(casa5);
		lista.add(casa6);

		System.out.println(lista);
	
		new ListaActividades4 (lista);
	}
	
	public ListaActividades5(List<Casa> listaCasas, int posicion)
	{
		try
		{
			listaCasas.remove(posicion);
		}
		catch(Exception e)
		{
			System.out.println("Se ha producido un error");
		}
	}

}
