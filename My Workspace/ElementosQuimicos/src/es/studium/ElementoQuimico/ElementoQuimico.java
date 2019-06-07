package es.studium.ElementoQuimico;

public class ElementoQuimico
{
	int numeroElectrones;
	int numeroProtones;
	int numeroNeutrones;

	ElementoQuimico(int e, int p, int n)
	{
		numeroElectrones = e;
		numeroProtones = p;
		numeroNeutrones = n;
	}

	int capaValencia()
	{
		int n, resultado = 0;
		n = this.getNumeroElectrones();
		if((n==1)||(n==2))
		{
			resultado = n;
		}
		if((n>=3)&&(n<=10))
		{
			resultado = n - 2;
		}
		if((n>=11)&&(n<=28))
		{
			resultado = n - 10;
		}
		if(n>=29)
		{
			resultado = n - 28;
		}
		return(resultado);
	}

	// Se aplica eq1.enlace(eq1, eq2)
	String enlace(ElementoQuimico e, ElementoQuimico f)
	{
		String resultado = "";
		int numeroCapaValenciaE, numeroCapaValenciaF;
		numeroCapaValenciaE = e.capaValencia();
		numeroCapaValenciaF = f.capaValencia();
		if((numeroCapaValenciaE - numeroCapaValenciaF <=2)&&(numeroCapaValenciaE - numeroCapaValenciaF >= -2))
		{
			resultado = "Covalente";
		}
		else
		{
			resultado = "Iónico";
		}
		return(resultado);
	}
	// Se aplica eq1.enlace(eq2)
	String enlace(ElementoQuimico e)
	{
		String resultado = "";
		int numeroCapaValenciaE, numeroCapaValenciaF;
		numeroCapaValenciaE = e.capaValencia();
		numeroCapaValenciaF = this.capaValencia();
		if((numeroCapaValenciaE - numeroCapaValenciaF <=2)&&(numeroCapaValenciaE - numeroCapaValenciaF >= -2))
		{
			resultado = "Covalente";
		}
		else
		{
			resultado = "Iónico";
		}
		return(resultado);
	}


public int getNumeroElectrones()
{
	return numeroElectrones;
}
public void setNumeroElectrones(int e)
{
	e = numeroElectrones;
}
public int getNumeroProtones()
{
	return numeroProtones;
}
public void setNumeroProtones(int p)
{
	p = numeroProtones;
}
public int getNumeroNeutrones()
{
	return numeroNeutrones;
}
public void setNumeroNeutrones(int n)
{
	n = numeroNeutrones;
}
public static void main(String[] args)
{

}

}
