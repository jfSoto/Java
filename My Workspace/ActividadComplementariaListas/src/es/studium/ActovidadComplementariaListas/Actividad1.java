package es.studium.ActovidadComplementariaListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Actividad1
{

	public static void main(String[] args)
	{
		List<Persona> lista = new ArrayList<Persona>();

		Persona persona1 = new Persona("Rosa", 20);
		Persona persona2 = new Persona("Carlos", 31);
		Persona persona3 = new Persona("David", 25);
		Persona persona4 = new Persona("Ana", 26);
		Persona persona5 = new Persona("Ricardo", 28);
		
		lista.add(persona1);
		lista.add(persona2);
		lista.add(persona3);
		lista.add(persona4);
		lista.add(persona5);
		
		System.out.println("---Recorrer la lista con ITERADOR--- \n");
		Iterator<Persona> iterador = lista.iterator();
		while (iterador.hasNext()) 
		{
			System.out.println(iterador.next());
		}
		
		System.out.println("\n ---Recorrer la lista con FOR tradicional--- \n");
		for(int indice = 0;indice<lista.size();indice++)
		{
		    System.out.println(lista.get(indice));
		}
		
		System.out.println("\n ---Recorrer la lista con FOR EACH--- \n");
		for (Persona elementoPersona : lista) 
		{
			System.out.println(elementoPersona);
		}

		
	}

}
