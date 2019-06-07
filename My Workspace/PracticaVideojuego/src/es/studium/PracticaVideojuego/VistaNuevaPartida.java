package es.studium.PracticaVideojuego;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

public class VistaNuevaPartida extends Frame
{
	private static final long serialVersionUID = 1L;
	Image carretera;
	Image carta0;
	Image carta1;
	Image carta2;
	Image carta3;
	Image carta4;
	Image carta5;
	Image carta6;
	Image carta7;
	Image carta8;
	Image carta9;
	Image carta10;
	Image carta11;
	Image carta12;
	Image carta13;
	Image carta14;
	Image carta15;
	Image carta16;
	Image carta17;
	Image carta18;
	Image carta19;
	Image vista1;
	Image vista2;
	Image vista3;
	Image vista4;
	Image vista5;
	Toolkit herramienta;
	Label lblMisKM = new Label();
	Label lblPcKM = new Label();
	Font fuente = new Font("Arial", Font.BOLD, 24);
	int contador = 0;
	int contadorPC = 0;

	
	VistaNuevaPartida()
	{
		setTitle("Nueva Partida 1000 KM");
		setLayout(new FlowLayout());
		herramienta = getToolkit();
		carta0 = herramienta.getImage("0.jpg");
		carta1 = herramienta.getImage("1.jpg");
		carta2 = herramienta.getImage("2.jpg");
		carta3 = herramienta.getImage("3.jpg");
		carta4 = herramienta.getImage("4.jpg");
		carta5 = herramienta.getImage("5.jpg");
		carta6 = herramienta.getImage("6.jpg");
		carta7 = herramienta.getImage("7.jpg");
		carta8 = herramienta.getImage("8.jpg");
		carta9 = herramienta.getImage("9.jpg");
		carta10 = herramienta.getImage("10.jpg");
		carta11 = herramienta.getImage("11.jpg");
		carta12 = herramienta.getImage("12.jpg");
		carta13 = herramienta.getImage("13.jpg");
		carta14 = herramienta.getImage("14.jpg");
		carta15 = herramienta.getImage("15.jpg");
		carta16 = herramienta.getImage("16.jpg");
		carta17 = herramienta.getImage("17.jpg");
		carta18 = herramienta.getImage("18.jpg");
		carta19 = herramienta.getImage("19.jpg");
		carretera = herramienta.getImage("carretera.jpg");
		add(lblMisKM);
		add(lblPcKM);
		setSize(800, 705);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	public void paint(Graphics g)
	{
		// Dibujar la imagen
		g.drawImage(carretera,4,23,this);
		g.drawImage(carta0, 40, 40, this);
		g.drawImage(carta0, 180, 40, this);
		g.drawImage(carta0, 320, 40, this);
		g.drawImage(carta0, 460, 40, this);
		g.drawImage(carta0, 600, 40, this);
		g.drawImage(vista1, 40, 500, this);
		g.drawImage(vista2, 180, 500, this);
		g.drawImage(vista3, 320, 500, this);
		g.drawImage(vista4, 460, 500, this);
		g.drawImage(vista5, 600, 500, this);
		Color colorin = new Color(234,23,43);
		g.setColor(colorin);
		g.setFont(fuente);
		g.drawString("Mis KM:"+contador, 80,450);
		g.drawString("KM PC:"+contadorPC, 600,350);
		
	}
	public void mano(int tabla2[])
	{
		vista1 = herramienta.getImage(tabla2[0]+".jpg");
		vista2 = herramienta.getImage(tabla2[1]+".jpg");
		vista3 = herramienta.getImage(tabla2[2]+".jpg");
		vista4 = herramienta.getImage(tabla2[3]+".jpg");
		vista5 = herramienta.getImage(tabla2[4]+".jpg");
		repaint();
	}
	public void contar(int contador)
	{
		this.contador = contador;
		repaint();
	}
	public void contarPC(int contadorPC)
	{
		this.contadorPC = contadorPC;
		repaint();
	}
}
