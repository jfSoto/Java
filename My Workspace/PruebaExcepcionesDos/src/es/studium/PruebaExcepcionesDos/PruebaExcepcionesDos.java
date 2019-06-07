package es.studium.PruebaExcepcionesDos;

public class PruebaExcepcionesDos
{
	public static void main(String args[])
	{
		int valor=5, cero=0;
		int[] array = {1, 2, 3};
		try
		{
			try
			{
				valor = valor/cero; //divisi�n por cero
				array[4]= 5; //acceso a una posici�n no disponible
			}
			catch(ArithmeticException e)
			{
				System.out.println( "Divisi�n por cero" );
				throw e;
			}
			catch(Exception e)
			{
				System.out.println( "Se ha producido un error");
			}
		}
		catch(Exception e)
		{
			System.out.println( "Se ha producido otro error" );
		}
	}
}
