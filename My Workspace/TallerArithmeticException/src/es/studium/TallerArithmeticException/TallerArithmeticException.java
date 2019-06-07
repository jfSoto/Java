package es.studium.TallerArithmeticException;

public class TallerArithmeticException
{

	public static void main(String[] args)
	{
		
		try
		{
			int numero1, numero2;
			numero1 = 2;
			numero2 = 3;
			equals(numero1, numero2);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println( "División por cero" );
		}
	}

}
