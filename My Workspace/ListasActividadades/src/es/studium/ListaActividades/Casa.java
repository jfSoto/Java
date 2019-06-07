package es.studium.ListaActividades;

public class Casa {
	
	private String calle;
	private Integer numero;
	
	
	public Casa(String calle, Integer numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}
		
	public String toString() {
		return "Casa [calle=" + calle + ", numero=" + numero + "]";
	}

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
