package es.studium.ListaActividades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaActividades3 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("Pepe");
		lista.add("Juan");
		lista.add("Nando");

		Iterator<String> iter = lista.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}