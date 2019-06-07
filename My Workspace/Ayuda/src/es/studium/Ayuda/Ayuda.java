package es.studium.Ayuda;
import java.io.IOException;
public class Ayuda
{
	public static void main(String[] args)
	{
		try
		{
			Runtime.getRuntime().exec("hh.exe segundo.chm");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
