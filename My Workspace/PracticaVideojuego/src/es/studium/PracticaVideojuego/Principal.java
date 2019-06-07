package es.studium.PracticaVideojuego;

public class Principal
{

	public static void main(String[] args)
	{
		// Crear la vista inicial, la de Login
				VistaMenuPrincipal vistaMenuPrincipal = new VistaMenuPrincipal();
				VistaTop10 vistaTop10 = null;
				VistaNombreJugador vistaNombreJugador = new VistaNombreJugador();
				VistaNuevaPartida vistaNuevaPartida = new VistaNuevaPartida();
				VistaGameOver vistaGameOver = new VistaGameOver();
				// Crear el modelo de Login
				Modelo modelo = new Modelo();
				// Crear el controlador de Login
				new Controlador(vistaGameOver, vistaNuevaPartida, vistaNombreJugador, vistaTop10, modelo, vistaMenuPrincipal);
	}
}
