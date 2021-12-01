/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Presentacion.FrmPrincipal;
import dominio.Jugador;
import modelo.ModeloFrmPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmPrincipal {

    private static ControlFrmPrincipal instance;
    private ModeloFrmPrincipal modPrincipal = ModeloFrmPrincipal.getInstance();

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
     */
    public void asignaNombre(String nombre) {
        
        if (!nombre.isEmpty()) {
            String padded = String.format("%-10s", nombre);
            nombre = (padded);
            modPrincipal.getJugador().setNombre(nombre);
        }
        
    }

    /**
     * Método que valida que el jugador haya seleccionado un ícono
     *
     * @return true si eligió ícono y nombre, false en caso contrario
     */
    public boolean validaApodoIcono() {
        return !(modPrincipal.getJugador().getAvatar() == null
                || modPrincipal.getJugador().getNombre() == null);
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
        FrmPrincipal prin = FrmPrincipal.getInstance();
        prin.setVisible(true);
    }

    /**
     * Método que muestra mensaje cuando haya algún error
     *
     * @param mensaje Mensaje que será desplegado
     */
    public void muestraMensaje(String mensaje) {
        
        JOptionPane.showMessageDialog(null, mensaje,
                "", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método que regresa al jugador del modelo de principal
     *
     * @return jugador Jugador del modelo.
     */
    public Jugador getJugador() {
        return modPrincipal.getJugador();
    }
}
