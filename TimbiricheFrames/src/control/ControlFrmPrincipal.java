/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Presentacion.FrmIconos;
import Presentacion.FrmPrincipal;
import SocketCliente.SocketCliente;
import dominio.Jugador;
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
    private ModeloFrmPrincipal modPrincipal = ModeloFrmPrincipal.getInstance();
    private ControlFrmCrearPartida ctlCrearPartida = ControlFrmCrearPartida.getInstance();
    private SocketCliente cliente;

    private ControlFrmPrincipal() {
        this.cliente = SocketCliente.getInstance();
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
    public void asignaNombre(String nombre, JFrame frame) {
        String padded = String.format("%-10s", nombre);
        nombre = (padded);
        modPrincipal.getJugador().setNombre(nombre);
        if (validaApodoIcono()) {
            try {
                cliente.enviarAlServidor(modPrincipal.getJugador());
            } catch (IOException ex) {
                Logger.getLogger(ControlFrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            crearFrmCrearPartida(frame);
        } else {
            modPrincipal.setMensaje("Tiene que agregar un nombre y un ícono");
        }
    }

    public void validaTamanio(java.awt.event.KeyEvent evt, String nombre) {
        if (nombre.length() == 10) {
            evt.consume();
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
     * Método que envía solicitud para ingresar a la partida
     */
    public void enviaSolicitud() {
        // i don't know
    }

    /**
     * Método que recupera la partida cuando se acepta la solicitud
     */
    public void recuperarPartida() {
        //Recuperar la clase de partida
    }

    /**
     * Método que despliega el frame de partida
     */
    public void despliegaPartida() {
        //llamr control de partida
    }

    /**
     * Método que despliega frame de Principal
     */
    public void despliegaPantallaPrincipal() {
        FrmPrincipal frmPrincipal = FrmPrincipal.getInstance();
//        modPrincipal.attach(prin);
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

    public void despliegaPantallaIconos() {
        FrmIconos fr = FrmIconos.getInstance();
        fr.setVisible(true);
    }

    /*
     * Método que valida para crear una partida
     */
    public void crearFrmCrearPartida(JFrame frame) {
        if (validaApodoIcono()) {
            ctlCrearPartida.despliegaPantallaCrearPartida();
            frame.dispose();
        } else {
            modPrincipal.setMensaje("Debe de poner su nombre y seleccionar un icono");
        }
    }

    public void añadirIcono(String icono) {
        modPrincipal.getJugador().setAvatar(icono);
    }
}
