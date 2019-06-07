package es.studium.Persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persona {
	
	String nombre,apellidos,dni,domicilio;
	int telefono;
	
	public Persona ()
	{
		nombre = "vacio";
		apellidos = "vacio";
		dni = "vacio";
		domicilio = "vacio";
		telefono = 0;
	}
	public Persona(String n,String a,String d,String dom,int t){
		nombre = n;
		apellidos = a;
		dni = d;
		domicilio = dom;
		telefono = t;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public boolean compararDni (Persona a)
	{
		 
        if(a.getDni().equals(dni))
        {
            return true;
        }else
        {
            return false;
        }
	}

}
