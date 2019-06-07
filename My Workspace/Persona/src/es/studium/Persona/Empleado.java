package es.studium.Persona;

public class Empleado extends Persona {

	String puesto;
	int salario;

	
	public Empleado ()
	{
		super();

		
		puesto="vacio";

	}
	public Empleado(String n,String a,String d,String dom,String pu,int t){
		
		super(n,a,d,dom,t);
		puesto = pu;
		
	}
	
	public Empleado (String pu){
		super();
		puesto = pu;
	}
	

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
}
