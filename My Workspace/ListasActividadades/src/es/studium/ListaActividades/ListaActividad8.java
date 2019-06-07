package es.studium.ListaActividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListaActividad8 
{

	public static void main(String[] args)
	{
		List<Alumno> lista = new ArrayList<Alumno>();

		Alumno alumno1 = new Alumno("4", "Pepe", 18);
		Alumno alumno2 = new Alumno("2", "Pepa", 20);
		
		lista.add(alumno1);
		lista.add(alumno2);
		
		System.out.println("Lista normal: " + lista);
		Collections.sort(lista);
		System.out.println("Lista orden natural: " + lista);
	}

}
