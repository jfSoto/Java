package es.studium.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class PruebaLibro
{
	public static void main(String[] args)
	{
		//Ejercicio 2
		List<Libro> lista = new ArrayList<Libro>();
		Libro libro1 = new Libro("1111111111111", "El nombre del viento", "Patrick Rothfuss", 873);
		Libro libro2 = new Libro("2222222222222", "El temor de un hombre sabio", "Patrick Rothfuss", 1008);
		Libro libro3 = new Libro("3333333333333", "Percy Jackson: El ladrón del rayo","Rick Riordan", 285);
		Libro libro4 = new Libro("4444444444444", "Percy Jackson: El mar de los monstruos","Rick Riordan", 256);
		Libro libro5 = new Libro("5555555555555", "Juego de tronos", "George R. R. Martin", 835);
		lista.add(libro1);
		lista.add(libro2);
		lista.add(libro3);
		lista.add(libro4);
		lista.add(libro5);
		//Ejercicio 3
		System.out.println("---Recorrer la lista con ITERADOR--- \n");
		Iterator<Libro> iterador1 = lista.iterator();
		while (iterador1.hasNext())
		{
			System.out.println(iterador1.next());
		}
		//Ejercicio 4
		System.out.println("\n ---Recorrer la lista con FOR EACH--- \n");
		for (Libro elementoLibro : lista)
		{
			System.out.println(elementoLibro);
		}
		System.out.println("\n");
		//Ejercicio 5
		lista.set(0, new Libro("9788498382662", "Harry Potter y la piedra filosofal", "J.K. Rowling", 256));
		System.out.println("---Recorrer la lista con ITERADOR para comprobar el cambio--- \n");
		Iterator<Libro> iterador2 = lista.iterator();
		while (iterador2.hasNext())
		{
			System.out.println(iterador2.next());
		}
		System.out.println("\n");
		//Ejercicio 6
		lista.add(0, new Libro("1111111111111", "Harry Potter y las reliquias de la muerte", "J.K. Rowling", 640));
		System.out.println("---Recorrer la lista con ITERADOR para comprobar el nuevo libro añadido--- \n");
		Iterator<Libro> iterador3 = lista.iterator();
		while (iterador3.hasNext())
		{
			System.out.println(iterador3.next());
		}
		System.out.println("\n");
		//Ejercicio 7
		List<Libro> lista3 = new ArrayList<Libro>();
		lista3 = librosPaginasMaximas(lista, 700);
		{
			System.out.println("---Recorrer la lista con ITERADOR para comprobar los libros añadidos a la nueva lista--- \n");
			Iterator<Libro> iterador4 = lista3.iterator();
			while (iterador4.hasNext())
			{
				System.out.println(iterador4.next());
			}
		}
		System.out.println("\n");
		//Ejercicio 9
		Collections.sort(lista);
		System.out.println("---Recorrer la lista con ITERADOR para comprobar la ordenación- -- \n");
		Iterator<Libro> iterador5 = lista.iterator();
		while (iterador5.hasNext())
		{
			System.out.println(iterador5.next());
		}
		System.out.println("\n");
		//Ejercicio 10
		Collections.reverse(lista);
		System.out.println("---Recorrer la lista con ITERADOR para comprobar la ordenación inversa--- \n");
		Iterator<Libro> iterador6 = lista.iterator();
		while (iterador6.hasNext())
		{
			System.out.println(iterador6.next());
		}
	}
	//Metodo del ejercicio 7
	public static List<Libro> librosPaginasMaximas(List<Libro> lista, int paginas)
	{
		List<Libro> lista2 = new ArrayList<Libro>();
		for (int i = 0; i<lista.size();i++)
		{
			if(lista.get(i).getNumeroPaginas()<=paginas)
			{
				lista2.add(0, lista.get(i));
			}
		}
		return lista2;
	}
}