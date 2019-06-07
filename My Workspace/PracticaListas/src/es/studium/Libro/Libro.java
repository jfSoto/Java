package es.studium.Libro;
public class Libro implements Comparable<Libro>
{
	private String ISBN;
	private String Titulo;
	private String Autor;
	private Integer NumeroPaginas;
	public Libro(String ISBN, String Titulo, String Autor, Integer NumeroPaginas)
	{
		super();
		this.ISBN = ISBN;
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.NumeroPaginas = NumeroPaginas;
	}
	public String getISBN()
	{
		return ISBN;
	}
	public void setISBN(String iSBN)
	{
		ISBN = iSBN;
	}
	public String getTitulo()
	{
		return Titulo;
	}
	public void setTitulo(String titulo)
	{
		Titulo = titulo;
	}
	public String getAutor()
	{
		return Autor;
	}
	public void setAutor(String autor)
	{
		Autor = autor;
	}
	public Integer getNumeroPaginas()
	{
		return NumeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas)
	{
		NumeroPaginas = numeroPaginas;
	}
	public String toString()
	{
		return "[ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroPaginas=" + NumeroPaginas + "]";
	}
	//Ejercicio 8
	public int compareTo(Libro o)
	{
		Libro libro = (Libro) o;
		if (this.Titulo.compareToIgnoreCase(libro.Titulo) == 0)
		{
			return this.ISBN.compareTo(libro.ISBN);
		}
		else
		{
			return this.Titulo.compareToIgnoreCase(libro.Titulo);
		}
	}
}