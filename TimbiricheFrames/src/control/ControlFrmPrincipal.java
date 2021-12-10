/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Presentacion.FrmPrincipal;
import SocketCliente.SocketCliente;
import dominio.Jugador;
import dominio.Partida;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import modelo.ModeloFrmPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmPrincipal {

    private static ControlFrmPrincipal instance;
    private ModeloFrmPrincipal modPrincipal;
    private ControlFrmCrearPartida ctlCrearPartida;
    private ControlFrmPartida ctlPartida;
    private Partida partida;
    private SocketCliente cliente;

    private ControlFrmPrincipal() {
        this.cliente = SocketCliente.getInstance();
        try {
            cliente.enviarAlServidor(new Jugador());
        } catch (IOException ex) {
            Logger.getLogger(ControlFrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ControlFrmPrincipal getInstance() {
        if (instance == null) {
            instance = new ControlFrmPrincipal();
        }
        return instance;
    }

    /**
     * Método que asigna nombre al jugador
     *
     * @param nombre
     * @param frame
     */
    public synchronized void asignaNombre(String nombre, JFrame frame) {
        
        String padded = String.format("%-10s", nombre);
        nombre = (padded);
        modPrincipal = ModeloFrmPrincipal.getInstance();
        modPrincipal.getJugador().setNombre(nombre);
        modPrincipal.getJugador().setColor(Color.BLACK);
        ctlPartida = ControlFrmPartida.getInstance(); 
        if (validaApodoIcono() && !(nombre.length() > 10)) {
            try {
                cliente.enviarAlServidor(modPrincipal.getJugador()); 
                if (this.partida != null) {   
                    recuperarPartida();
                    ctlPartida.despliegaPantallaPartida();
                    frame.setVisible(false);
                } else {
                    crearFrmCrearPartida(frame);
                }
            } catch (IOException ex) {
                Logger.getLogger(ControlFrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            modPrincipal.setMensaje("Tiene que agregar un nombre y un ícono");
        }
    }

    public void validaTamanio(java.awt.event.KeyEvent evt, String nombre) {
        if (nombre.length() == 10) {
            evt.consume();
            modPrincipal = ModeloFrmPrincipal.getInstance();
            modPrincipal.setMensaje("Solo se permiten 10 caracteres");
        }
    }

    /**
     * Método que valida que el jugador haya seleccionado un ícono
     *
     * @return true si eligió ícono y nombre, false en caso contrario
     */
    public boolean validaApodoIcono() {
        return !(modPrincipal.getJugador().getAvatar() == null
                || modPrincipal.getJugador().getNombre() == null
                || modPrincipal.getJugador().getNombre().equalsIgnoreCase(""));
    }

    /**
     * Método que recupera la partida cuando se acepta la solicitud
     * @throws java.io.IOException
     */
    public synchronized void recuperarPartida() throws IOException {
        this.partida.setJugador(modPrincipal.getJugador());
        cliente.enviarAlServidor(partida);
    }
    
    /**
     * Método que despliega el frame de partida
     */
    public void despliegaPantallaPartida() {
        //llamr control de partida
    }

    /**
     * Método que despliega frame de Principal
     */
    public void despliegaPantallaPrincipal() {
        FrmPrincipal frmPrincipal = FrmPrincipal.getInstance();
        frmPrincipal.setVisible(true);
    }

    /**
     * Método que muestra mensaje cuando haya algún error
     *
     * @param mensaje Mensaje que será desplegado
     */
    public void muestraMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, mensaje,
//                "", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método que regresa al jugador del modelo de principal
     *
     * @return jugador Jugador del modelo.
     */
    public Jugador getJugador() {
        return modPrincipal.getJugador();
    }

    /*
     * Método que valida para crear una partida
     */
    public void crearFrmCrearPartida(JFrame frame) {
        if (validaApodoIcono()) {
            ctlCrearPartida = ControlFrmCrearPartida.getInstance();
            ctlCrearPartida.despliegaPantallaCrearPartida();
            frame.setVisible(false);
        } else {
            modPrincipal.setMensaje("Debe de poner su nombre y seleccionar un icono");
        }
    }

    public void añadirIcono(String icono) {
        modPrincipal = ModeloFrmPrincipal.getInstance();
        modPrincipal.getJugador().setAvatar(icono);
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
}
