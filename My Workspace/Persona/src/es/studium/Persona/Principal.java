package es.studium.Persona;

public class Principal
{

	public static void main(String[] args)
	{
		Persona persona1 = new Persona("Pepe", "P�rez Garc�a", "29111111", "Su casa", 954111111);
		Persona persona2 = new Persona("Pepa", "P�rez Garc�a", "29111111", "Su otra casa", 954222222);
		
		if (persona1.compararDni(persona2))
		{
            System.out.println("Los dni son iguales");
        }else
        {
            System.out.println("Los dni no son iguales");
        }
	    
	}

}
