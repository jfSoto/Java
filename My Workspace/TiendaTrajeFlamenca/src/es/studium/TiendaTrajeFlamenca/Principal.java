package es.studium.TiendaTrajeFlamenca;

public class Principal
{

	public static void main(String[] args)
	{
		// Crear la vista inicial, la de Login
		VistaLogin vistaLogin = new VistaLogin();
		// Crear el modelo de Login
		ModeloLogin modeloLogin = new ModeloLogin();
		// Crear el controlador de Login
		new ControladorLogin(modeloLogin, vistaLogin);
	}
}
