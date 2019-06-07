package es.studium.ListaPersona;
import java.util.Comparator;
public class NacimientoPersonaComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Persona persona1 = (Persona)o1;
		Persona persona2 = (Persona)o2;
		return
				persona1.getFechaNacimiento().compareTo(persona2.getFechaNacimiento())
				;
	}
}