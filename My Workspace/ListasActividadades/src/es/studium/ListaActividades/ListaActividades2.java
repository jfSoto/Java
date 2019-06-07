package es.studium.ListaActividades;

import java.util.ArrayList;
import java.util.List;

public class ListaActividades2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add(0, "Pepe");
		lista.add(0, "Juan");
		lista.add(0, "Nando");

		for (String nombres : lista) 
		{
			System.out.println(nombres);
		}
		
	}
}