/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Presentacion.FrmPrincipal;
import javax.swing.JOptionPane;
import modelo.ModeloFrmPrincipal;
import javax.swing.JOptionPane;
/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmPrincipal {

    //de momento poongo esto, posiblemente se elimine la variable
//    public static ModeloFrmPrincipal instancia;
//    private String nombre = "";
    private ModeloFrmPrincipal principal = ModeloFrmPrincipal.getInstance();

    

    /**
     * Método que asigna nombre al jugador
     *
     * @param nombre
     */
    public void asignaNombre(String nombre) {
        principal.getJugador().setNombre(nombre);

    }

    /**
     * Método que valida que el jugador haya seleccionado un ícono
     *
     * @return true si eligió ícono y nombre, false en caso contrario
     */
    public boolean validaApodoIcono() {
        if (principal.getJugador().getAvatar() == null || 
                principal.getJugador().getNombre() == null) {
            return false;
        }
        return true;
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
        JOptionPane.showMessageDialog(null,mensaje,
                            "", JOptionPane.INFORMATION_MESSAGE);
    }
}
