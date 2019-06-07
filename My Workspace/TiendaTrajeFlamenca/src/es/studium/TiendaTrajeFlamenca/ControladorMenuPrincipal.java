package es.studium.TiendaTrajeFlamenca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorMenuPrincipal implements ActionListener, WindowListener 
{
	//Atributos
	VistaMenuPrincipal vistaMenuPrincipal = null;
	String usuario = null;

	//Construtores
	public ControladorMenuPrincipal( VistaMenuPrincipal vista, String usuario)
	{
		this.vistaMenuPrincipal = vista;
		this.usuario = usuario;

		//Añadir los Listeners
		vistaMenuPrincipal.addWindowListener(this);
		vistaMenuPrincipal.altaCli.addActionListener(this);
		vistaMenuPrincipal.bajaCli.addActionListener(this);
		vistaMenuPrincipal.modificacionCli.addActionListener(this);
		vistaMenuPrincipal.consultaCli.addActionListener(this);
		vistaMenuPrincipal.altaCos.addActionListener(this);
		vistaMenuPrincipal.bajaCos.addActionListener(this);
		vistaMenuPrincipal.modificacionCos.addActionListener(this);
		vistaMenuPrincipal.consultaCos.addActionListener(this);
		vistaMenuPrincipal.altaTra.addActionListener(this);
		vistaMenuPrincipal.bajaTra.addActionListener(this);
		vistaMenuPrincipal.modificacionTra.addActionListener(this);
		vistaMenuPrincipal.consultaTra.addActionListener(this);
		vistaMenuPrincipal.altaAsi.addActionListener(this);
		vistaMenuPrincipal.bajaAsi.addActionListener(this);
		vistaMenuPrincipal.modificacionAsi.addActionListener(this);
		vistaMenuPrincipal.consultaAsi.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento)
	{
		Object a;
		a=evento.getSource();
		//Clientes
		if(a.equals(vistaMenuPrincipal.altaCli))
		{
			VistaAltaCliente vistaAltaCliente = new VistaAltaCliente();
			ModeloAltaCliente modeloCliente = new ModeloAltaCliente(usuario);
			new ControladorAltaCliente(modeloCliente, vistaAltaCliente);
		}
		if(a.equals(vistaMenuPrincipal.bajaCli))
		{
			VistaBajaCliente vistaBajaCliente = new VistaBajaCliente();
			ModeloBajaCliente modeloBajaCliente = new ModeloBajaCliente(usuario);
			new ControladorBajaCliente(modeloBajaCliente, vistaBajaCliente);
		}
		if(a.equals(vistaMenuPrincipal.modificacionCli))
		{
			VistaModificacionCliente vistaModificacionCliente = new VistaModificacionCliente();
			ModeloModificacionCliente modeloModificacionCliente = new ModeloModificacionCliente(usuario);
			new ControladorModificacionCliente(modeloModificacionCliente, vistaModificacionCliente);
		}
		if(a.equals(vistaMenuPrincipal.consultaCli))
		{
			VistaConsultaCliente vistaConsultaCliente = new VistaConsultaCliente();
			ModeloConsultaCliente modeloConsultaCliente = new ModeloConsultaCliente(usuario);
			new ControladorConsultaCliente(modeloConsultaCliente, vistaConsultaCliente);
		}
		//Costureras
		if(a.equals(vistaMenuPrincipal.altaCos))
		{
			VistaAltaCosturera vistaAltaCosturera = new VistaAltaCosturera();
			ModeloAltaCosturera modeloAltaCosturera = new ModeloAltaCosturera(usuario);
			new ControladorAltaCosturera(modeloAltaCosturera, vistaAltaCosturera);
		}
		if(a.equals(vistaMenuPrincipal.bajaCos))
		{
			VistaBajaCosturera vistaBajaCosturera = new VistaBajaCosturera();
			ModeloBajaCosturera modeloBajaCosturera = new ModeloBajaCosturera(usuario);
			new ControladorBajaCosturera(modeloBajaCosturera, vistaBajaCosturera);
		}
		if(a.equals(vistaMenuPrincipal.modificacionCos))
		{
			VistaModificacionCosturera vistaModificacionCosturera = new VistaModificacionCosturera();
			ModeloModificacionCosturera modeloModificacionCosturera = new ModeloModificacionCosturera(usuario);
			new ControladorModificacionCosturera(modeloModificacionCosturera, vistaModificacionCosturera);
		}
		if(a.equals(vistaMenuPrincipal.consultaCos))
		{
			VistaConsultaCosturera vistaConsultaCosturera = new VistaConsultaCosturera();
			ModeloConsultaCosturera modeloConsultaCosturera = new ModeloConsultaCosturera(usuario);
			new ControladorConsultaCosturera(modeloConsultaCosturera, vistaConsultaCosturera);
		}
		//Trajes
		if(a.equals(vistaMenuPrincipal.altaTra))
		{
			VistaAltaTraje vistaAltaTraje  = new VistaAltaTraje ();
			ModeloAltaTraje  modeloAltaTraje  = new ModeloAltaTraje (usuario);
			new ControladorAltaTraje (modeloAltaTraje , vistaAltaTraje );
		}
		if(a.equals(vistaMenuPrincipal.bajaTra))
		{
			VistaBajaTraje vistaBajaTraje = new VistaBajaTraje();
			ModeloBajaTraje modeloBajaTraje = new ModeloBajaTraje(usuario);
			new ControladorBajaTraje(modeloBajaTraje, vistaBajaTraje);
		}
		if(a.equals(vistaMenuPrincipal.modificacionTra))
		{
			VistaModificacionTraje vistaModificacionTraje = new VistaModificacionTraje();
			ModeloModificacionTraje modeloModificacionTraje = new ModeloModificacionTraje(usuario);
			new ControladorModificacionTraje(modeloModificacionTraje, vistaModificacionTraje);
		}
		if(a.equals(vistaMenuPrincipal.consultaTra))
		{
			VistaConsultaTraje vistaConsultaTraje = new VistaConsultaTraje();
			ModeloConsultaTraje modeloConsultaTraje = new ModeloConsultaTraje(usuario);
			new ControladorConsultaTraje(modeloConsultaTraje, vistaConsultaTraje);
		}
		//Asignaciones
		if(a.equals(vistaMenuPrincipal.altaAsi))
		{
			VistaAltaAsignacion vistaAltaAsignacion = new VistaAltaAsignacion();
			ModeloAltaAsignacion modeloAltaAsignacion = new ModeloAltaAsignacion(usuario);
			new ControladorAltaAsignacion(modeloAltaAsignacion, vistaAltaAsignacion);
		}
		if(a.equals(vistaMenuPrincipal.bajaAsi))
		{
			VistaBajaAsignacion vistaBajaAsignacion = new VistaBajaAsignacion();
			ModeloBajaAsignacion modeloBajaAsignacion = new ModeloBajaAsignacion(usuario);
			new ControladorBajaAsignacion(modeloBajaAsignacion, vistaBajaAsignacion);
		}
		if(a.equals(vistaMenuPrincipal.modificacionAsi))
		{
			VistaModificacionAsignacion vistaModificacionAsignacion = new VistaModificacionAsignacion();
			ModeloModificacionAsignacion modeloModificacionAsignacion = new ModeloModificacionAsignacion(usuario);
			new ControladorModificacionAsignacion(modeloModificacionAsignacion, vistaModificacionAsignacion);
		}
		if(a.equals(vistaMenuPrincipal.consultaAsi))
		{
			VistaConsultaAsignacion vistaConsultaAsignacion = new VistaConsultaAsignacion();
			ModeloConsultaAsignacion modeloConsultaAsignacion = new ModeloConsultaAsignacion(usuario);
			new ControladorConsultaAsignacion(modeloConsultaAsignacion, vistaConsultaAsignacion);
		}
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}

}
