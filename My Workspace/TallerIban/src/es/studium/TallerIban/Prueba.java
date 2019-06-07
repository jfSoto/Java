package es.studium.TallerIban;

public class Prueba
{

	public static void main(String[] args)
	{
		Cuenta cuenta1 = new Cuenta("2085", "2085", "67", "1234567890", "ES64");
		Cuenta cuenta2 = new Cuenta("2085", "8199", "67", "0330104340", "ES64");
		if(cuenta2.CuentaCorrecta())
		{
			System.out.println("La cuenta es correcta");
		}
		else
		{
			System.out.println("La cuenta NO es correcta");
		}
	}

}
