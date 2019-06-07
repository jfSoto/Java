package es.studium.Factorial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Factorial
{
	public static void main(String[] args) throws IOException
	{
		int a, resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame el número n para calcular su factorial:");
		a = Integer.parseInt(lectura.readLine());
		resultado = fac(a);
		System.out.println("El factorial de "+a+" es:"+resultado);
	}
	public static int fac(int a)
	{
		int r;
		// CASO BASE
		if(a==0)
		{
			r = 1;
			System.out.println("Caso BASE");
		}
		else
		{
			System.out.println("Caso recursivo para a = "+a);
			r = a * fac(a-1);
			System.out.println("Resultado para a = "+a+" con valor parcial "+r);
		}
		return r;
	}
}
