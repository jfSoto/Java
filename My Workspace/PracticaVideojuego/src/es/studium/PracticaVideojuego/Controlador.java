package es.studium.PracticaVideojuego;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Controlador implements ActionListener, WindowListener, ComponentListener, MouseListener
{
	VistaMenuPrincipal vistaMenuPrincipal = null;
	VistaTop10 vistaTop10 = null;
	VistaNuevaPartida vistaNuevaPartida;
	Modelo modelo = null;
	VistaNombreJugador vistaNombreJugador;
	VistaGameOver vistaGameOver;
	int tabla1[] = new int[5];
	int tabla2[] = new int[5];
	Random r = new Random();
	int contador;
	int contadorPC;
	int turnos;

	public Controlador(VistaGameOver vistaGameOver, VistaNuevaPartida vistaNuevaPartida, VistaNombreJugador vistaNombreJugador, VistaTop10 vistaTop10, Modelo modelo, VistaMenuPrincipal vistaMenuPrincipal)
	{
		this.vistaMenuPrincipal = vistaMenuPrincipal;
		this.vistaTop10 = vistaTop10;
		this.vistaNuevaPartida = vistaNuevaPartida;
		this.vistaNombreJugador = vistaNombreJugador;
		this.vistaGameOver = vistaGameOver;
		this.modelo = modelo;


		vistaMenuPrincipal.addComponentListener(this);
		vistaMenuPrincipal.btnNuevaPartida.setLocation(200,130);
		vistaMenuPrincipal.btnTop10.setLocation(220,160);
		vistaMenuPrincipal.addWindowListener(this);
		vistaMenuPrincipal.btnNuevaPartida.addActionListener(this);
		vistaMenuPrincipal.btnTop10.addActionListener(this);
		vistaNombreJugador.addComponentListener(this);
		vistaNombreJugador.btnAceptar.addActionListener(this);
		vistaNombreJugador.addWindowListener(this);
		vistaNuevaPartida.addWindowListener(this);
		vistaNuevaPartida.addMouseListener(this);
		vistaGameOver.addWindowListener(this);
		vistaGameOver.addComponentListener(this);
		vistaGameOver.btnContinuar.addActionListener(this);
	}

	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		if(vistaTop10!=null)
		{
			if(vistaTop10.isActive())
			{
				vistaTop10.setVisible(false);
			}
			else
			{
				System.exit(0);
			}
		}
		else if(vistaNombreJugador.isActive())
		{
			vistaNombreJugador.setVisible(false);
		}
		else if(vistaNuevaPartida.isActive())
		{
			vistaNuevaPartida.setVisible(false);
		}
		else if(vistaGameOver.isActive())
		{
			vistaGameOver.setVisible(false);
		}
		else
		{
			System.exit(0);
		}

	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
	public void actionPerformed(ActionEvent evento)
	{
		Object objetoPulsado = evento.getSource();

		if(objetoPulsado.equals(vistaMenuPrincipal.btnTop10))
		{
			vistaTop10 = new VistaTop10();
			vistaTop10.addWindowListener(this);
			vistaTop10.addComponentListener(this);
			String contenido[][] = modelo.Top10();
			Label top10 = new Label("*****Top 10*****");
			vistaTop10.add(top10);
			for(int i=0;i<10;i++)
			{
				vistaTop10.add(new Label(contenido[i][0]+"-->       "+contenido[i][1]));
			}
		}
		else if (objetoPulsado.equals(vistaMenuPrincipal.btnNuevaPartida))
		{
			for(int j = 0; j < 5; j++)
			{
				tabla1[j] = r.nextInt(19)+1;
			}
			for(int j = 0; j < 5; j++)
			{
				tabla2[j] = (r.nextInt(19)+1);
			}
			vistaNuevaPartida.mano(tabla2);
			vistaNuevaPartida.setVisible(true);
		}
		else if (objetoPulsado.equals(vistaNombreJugador.btnAceptar))
		{
			modelo.InsertarNombreJugador(vistaNombreJugador.txfNombreJugador.getText(), turnos);
			turnos = 0;
			vistaNombreJugador.setVisible(false);		
		}
		else if(objetoPulsado.equals(vistaGameOver.btnContinuar))
		{
			vistaGameOver.setVisible(false);
		}
	}
	public void componentHidden(ComponentEvent e){}
	public void componentMoved(ComponentEvent e){}
	public void componentResized(ComponentEvent e){}
	public void componentShown(ComponentEvent e)
	{
		vistaMenuPrincipal.btnNuevaPartida.setLocation(200,130);
		vistaMenuPrincipal.btnTop10.setLocation(220,160);
		vistaNombreJugador.lblNombreJugador.setLocation(80,50);
		vistaNombreJugador.txfNombreJugador.setLocation(58,80);
		vistaNombreJugador.btnAceptar.setLocation(110,130);
		vistaNombreJugador.lblHasGanado.setLocation(90,30);
		vistaNuevaPartida.lblMisKM.setLocation(300,300);
		vistaNuevaPartida.lblPcKM.setLocation(300,500);
		vistaGameOver.lblGameOver.setLocation(100,60);
		vistaGameOver.btnContinuar.setLocation(105,90);
		
	}
	public void mouseClicked(MouseEvent e)
	{
		int posX, posY;
		int pulX, pulY;
		pulX = e.getX();
		pulY = e.getY();
		// Carta 1
		posX = 40;
		posY = 500;
		if((posX<=pulX)&&(pulX<=posX+130)&&(posY<=pulY)&&(pulY<=posY+183))
		{

			// Posición 0 de tabla2
			// Sacar otra carta
			// tabla2[0] = ...
			// mano

			if(tabla2[0]==1)
			{
				contador = contador + 25;
			}
			if(tabla2[0]==2)
			{
				contador = contador + 50;
			}
			if(tabla2[0]==3)
			{
				contador = contador + 75;
			}
			if(tabla2[0]==4)
			{
				contador = contador + 100;
			}
			if(tabla2[0]==5)
			{
				contador = contador + 200;
			}
			tabla2[0] = r.nextInt(19)+1;
			vistaNuevaPartida.mano(tabla2);
			vistaNuevaPartida.contar(contador);
			vistaNuevaPartida.contarPC(contadorPC);
			if(contador>=1000)
			{
				vistaNuevaPartida.setVisible(false);
				vistaNombreJugador.setVisible(true);
				contador = 0;
				contadorPC = 0;
			}
			else
			{
				turnos++;
			}
			for(int i=0;i<5;i++)
			{
				if(tabla1[i] == 5)
				{
					contadorPC = contadorPC + 200;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 4)
				{
					contadorPC = contadorPC + 100;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 3)
				{
					contadorPC = contadorPC + 75;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 2)
				{
					contadorPC = contadorPC + 50;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 1)
				{
					contadorPC = contadorPC + 25;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else
				{
					tabla1[i] = r.nextInt(19)+1;
					i=5;
					// Echar carta aleatoria
					// Sacar nueva carta en esa misma posición
				}
				if(contadorPC>=1000)
				{
					vistaNuevaPartida.setVisible(false);
					vistaGameOver.setVisible(true);
					contador = 0;
					contadorPC = 0;
					turnos = 0;
				}
			}
			// Usar una carta
			// Actualizar su contador
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
		}
		// Carta 2
		posX = 180;
		posY = 500;
		if((posX<=pulX)&&(pulX<=posX+130)&&(posY<=pulY)&&(pulY<=posY+183))
		{
			if(tabla2[1]==1)
			{
				contador = contador + 25;
			}
			if(tabla2[1]==2)
			{
				contador = contador + 50;
			}
			if(tabla2[1]==3)
			{
				contador = contador + 75;
			}
			if(tabla2[1]==4)
			{
				contador = contador + 100;
			}
			if(tabla2[1]==5)
			{
				contador = contador + 200;
			}
			tabla2[1] = r.nextInt(19)+1;
			vistaNuevaPartida.mano(tabla2);
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
			if(contador>=1000)
			{
				vistaNuevaPartida.setVisible(false);
				vistaNombreJugador.setVisible(true);
				contador = 0;
				contadorPC = 0;
			}
			else
			{
				turnos++;
			}
			for(int i=0;i<5;i++)
			{
				if(tabla1[i] == 5)
				{
					contadorPC = contadorPC + 200;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 4)
				{
					contadorPC = contadorPC + 100;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 3)
				{
					contadorPC = contadorPC + 75;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 2)
				{
					contadorPC = contadorPC + 50;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 1)
				{
					contadorPC = contadorPC + 25;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else
				{
					tabla1[i] = r.nextInt(19)+1;
					i=5;
					// Echar carta aleatoria
					// Sacar nueva carta en esa misma posición
				}
				if(contadorPC>=1000)
				{
					vistaNuevaPartida.setVisible(false);
					vistaGameOver.setVisible(true);
					contador = 0;
					contadorPC = 0;
					turnos = 0;
				}
			}
			// Usar una carta
			// Actualizar su contador
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
		}
		//Carta 3
		posX = 320;
		posY = 500;
		if((posX<=pulX)&&(pulX<=posX+130)&&(posY<=pulY)&&(pulY<=posY+183))
		{
			if(tabla2[2]==1)
			{
				contador = contador + 25;
			}
			if(tabla2[2]==2)
			{
				contador = contador + 50;
			}
			if(tabla2[2]==3)
			{
				contador = contador + 75;
			}
			if(tabla2[2]==4)
			{
				contador = contador + 100;
			}
			if(tabla2[2]==5)
			{
				contador = contador + 200;
			}
			tabla2[2] = r.nextInt(19)+1;
			vistaNuevaPartida.mano(tabla2);
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
			if(contador>=1000)
			{
				vistaNuevaPartida.setVisible(false);
				vistaNombreJugador.setVisible(true);
				contador = 0;
				contadorPC = 0;
			}
			else
			{
				turnos++;
			}
			for(int i=0;i<5;i++)
			{
				if(tabla1[i] == 5)
				{
					contadorPC = contadorPC + 200;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 4)
				{
					contadorPC = contadorPC + 100;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 3)
				{
					contadorPC = contadorPC + 75;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 2)
				{
					contadorPC = contadorPC + 50;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 1)
				{
					contadorPC = contadorPC + 25;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else
				{
					tabla1[i] = r.nextInt(19)+1;
					i=5;
					// Echar carta aleatoria
					// Sacar nueva carta en esa misma posición
				}
				if(contadorPC>=1000)
				{
					vistaNuevaPartida.setVisible(false);
					vistaGameOver.setVisible(true);
					contador = 0;
					contadorPC = 0;
					turnos = 0;
				}
			}
			// Usar una carta
			// Actualizar su contador
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
		}
		//Carta 4
		posX = 460;
		posY = 500;
		if((posX<=pulX)&&(pulX<=posX+130)&&(posY<=pulY)&&(pulY<=posY+183))
		{
			if(tabla2[3]==1)
			{
				contador = contador + 25;
			}
			if(tabla2[3]==2)
			{
				contador = contador + 50;
			}
			if(tabla2[3]==3)
			{
				contador = contador + 75;
			}
			if(tabla2[3]==4)
			{
				contador = contador + 100;
			}
			if(tabla2[3]==5)
			{
				contador = contador + 200;
			}
			tabla2[3] = r.nextInt(19)+1;
			vistaNuevaPartida.mano(tabla2);
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
			if(contador>=1000)
			{
				vistaNuevaPartida.setVisible(false);
				vistaNombreJugador.setVisible(true);
				contador = 0;
				contadorPC = 0;
			}
			else
			{
				turnos++;
			}
			for(int i=0;i<5;i++)
			{
				if(tabla1[i] == 5)
				{
					contadorPC = contadorPC + 200;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 4)
				{
					contadorPC = contadorPC + 100;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 3)
				{
					contadorPC = contadorPC + 75;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 2)
				{
					contadorPC = contadorPC + 50;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 1)
				{
					contadorPC = contadorPC + 25;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else
				{
					tabla1[i] = r.nextInt(19)+1;
					i=5;
					// Echar carta aleatoria
					// Sacar nueva carta en esa misma posición
				}
				if(contadorPC>=1000)
				{
					vistaNuevaPartida.setVisible(false);
					vistaGameOver.setVisible(true);
					contador = 0;
					contadorPC = 0;
					turnos = 0;
				}
			}
			// Usar una carta
			// Actualizar su contador
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
		}
		//Carta 5
		posX = 600;
		posY = 500;
		if((posX<=pulX)&&(pulX<=posX+130)&&(posY<=pulY)&&(pulY<=posY+183))
		{
			if(tabla2[4]==1)
			{
				contador = contador + 25;
			}
			if(tabla2[4]==2)
			{
				contador = contador + 50;
			}
			if(tabla2[4]==3)
			{
				contador = contador + 75;
			}
			if(tabla2[4]==4)
			{
				contador = contador + 100;
			}
			if(tabla2[4]==5)
			{
				contador = contador + 200;
			}
			tabla2[4] = r.nextInt(19)+1;
			vistaNuevaPartida.mano(tabla2);
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
			if(contador>=1000)
			{
				vistaNuevaPartida.setVisible(false);
				vistaNombreJugador.setVisible(true);
				contador = 0;
				contadorPC = 0;
			}
			else
			{
				turnos++;
			}
			for(int i=0;i<5;i++)
			{
				if(tabla1[i] == 5)
				{
					contadorPC = contadorPC + 200;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 4)
				{
					contadorPC = contadorPC + 100;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 3)
				{
					contadorPC = contadorPC + 75;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 2)
				{
					contadorPC = contadorPC + 50;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else if(tabla1[i] == 1)
				{
					contadorPC = contadorPC + 25;
					tabla1[i] = r.nextInt(19)+1;
					i=5;
				}
				else
				{
					tabla1[i] = r.nextInt(19)+1;
					i=5;
					// Echar carta aleatoria
					// Sacar nueva carta en esa misma posición
				}
				if(contadorPC>=1000)
				{
					vistaNuevaPartida.setVisible(false);
					vistaGameOver.setVisible(true);
					contador = 0;
					contadorPC = 0;
					turnos = 0;
				}
			}
			// Usar una carta
			// Actualizar su contador
			vistaNuevaPartida.contarPC(contadorPC);
			vistaNuevaPartida.contar(contador);
		}		
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}
