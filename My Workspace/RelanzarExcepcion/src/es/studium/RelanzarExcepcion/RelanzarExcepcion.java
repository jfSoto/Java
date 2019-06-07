package es.studium.RelanzarExcepcion;
public class RelanzarExcepcion
{
	public static void main(String[] args)
	{
		try
		{
			metodo();
		}
		catch (Exception e1)
		{
			System.out.println("Excepción recogida en main");
		}
	}
	static void metodo() throws Exception
	{
		try
		{
			int a;
			a = 7/0;
			System.out.println(a);
		}
		catch (Exception e1)
		{
			//Se ocupa de Exception simplemente dando aviso
			System.out.println(e1.getMessage());
			// Relanzo excepción, probar a no lanzarla
			throw (e1);
		}
	} // Fin del metodo
}
