package es.studium.ListaActividades;

public class Alumno implements Comparable<Alumno>
{
	
	private String codigo;
	private String nombre;
	private Integer edad;


	public Alumno(String codigo, String nombre, Integer edad) 
	{
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int compareTo(Alumno alumno)
	{

		if(this.codigo.compareToIgnoreCase(alumno.codigo) == 0)
		{
			if(this.nombre.compareToIgnoreCase(alumno.nombre) == 0)
			{
				return this.edad.compareTo(alumno.edad); 
			}
			else
			{
				return
				this.nombre.compareToIgnoreCase(alumno.nombre);
			}
		}
		else
		{
			return
			this.codigo.compareToIgnoreCase(alumno.codigo);
		}
	}
	public String toString()
	{
		return "codigo = " + codigo + ", nombre = " + nombre + ", edad = " + edad;
	}
}
