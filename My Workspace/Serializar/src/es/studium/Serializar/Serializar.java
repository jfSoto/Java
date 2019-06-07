package es.studium.Serializar;
public class Serializar
{
	public static void main(String[] args)
	{
		// Primero serializa el fichero imagen.jpg en salida.txt
		// Y luego deserializa salida.txt en outputImage.jpg
		String entrada = "imagen.jpg";
		String salida = "salida.txt";
		try
		{
			// Serializar la imagen indicada
			String encoded = Base64.encodeFromFile(entrada);
			// Mostrar por consola el resultado
			System.out.println(encoded);

			// Serializar directamente a otro fichero
			Base64.encodeFileToFile(entrada,salida);

			// Deserializar directamente de fichero
			Base64.decodeFileToFile(salida,"outputImage.jpg");
		}
		catch( java.io.IOException e )
		{
			System.out.println(e);
		}
	}
}