package es.studium.ListaActividades;

import java.util.ArrayList;
import java.util.List;

public class ListaActividades4 
{


	public static void main(String[] args) 
	{
		List<Casa> lista = new ArrayList<Casa>();

		Casa casa1 = new Casa("Pato", 1);
		Casa casa2 = new Casa("Gato", 2);

		lista.add(casa1);
		lista.add(casa2);

		System.out.println(lista);
	
		new ListaActividades4 (lista);
	}
	public ListaActividades4(List<Casa> lista)
	{
		if(lista != null && !lista.isEmpty()) 
		{
			lista.remove(0);
		}
		for(Casa elementoCasa: lista) {
			System.out.println(elementoCasa);
		}

	}
	
}
		
	