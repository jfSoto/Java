package es.studium.Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("Andrea");
		lista.add("Amaya");
		lista.add("Julio");

		System.out.println("Lista: " + lista);

		int indiceELmento = lista.indexOf("Amaya2");

		System.out.println("inidiceElemento: " + indiceELmento);

		System.out.println("Lista: " + lista);

		// Opcion 1 para recorrer la lista
		Iterator<String> iter = lista.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// Opcion 2
		
		System.out.println("Opcioón 2 For tradicional");

		for(int i = 0; i < lista.size(); i++)
		{
			System.out.println(lista.get(i));
		}
		
		//Opcion 3
		
		for(String elemento:lista)
		{
		System.out.println(elemento);
		}

	}
}