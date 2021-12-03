/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Presentacion.FrmPartida;
import dominio.Partida;
import dominio.Tablero;
import javax.swing.JOptionPane;
import modelo.ModeloFrmPartida;

/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmPartida {

    private static ControlFrmPartida instance;
    private ModeloFrmPartida modeloPartida = ModeloFrmPartida.getInstance();
    private FrmPartida partida;
    
    public static ControlFrmPartida getInstance() {
        if (instance == null) {
            instance = new ControlFrmPartida();
        }
        return instance;
    }

    /**
     * Método que despliega el frame de Partida
     * Aquí se le agregó el parámetro
     */
    public void despliegaPantallaPartida(Tablero tablero) {
        tablero.setTamanio(10);
        partida = FrmPartida.getInstance(tablero);
        partida.setVisible(true);
    }

    /**
     * Método que muestra la configuración de los contrincantes
     */
    public void muestraConfigurarContrincantes() {

    }

    /**
     * Metodo que muestra la partida con los jugadores
     */
    public void muestraPartida() {

    }

    /**
     * Método que valida la configuración del los usuarios
     *
     * @return true si se vaido con exito, false si no se acepto la validación
     */
    public boolean validaConfiguracion() {
        return true;
    }

    /**
     * Método que guarda la configuración de los usuarios
     */
    public void guardaConfiguracion() {

    }

    /**
     * Metodo que elimina la informacion del usuario de la pantalla
     */
    public void quitarInforamcionPantalla() {

    }

    /**
     * Metodo que borra los datos del jugador
     */
    public void borrarDatosJugador() {

    }

    /**
     * Metodo que confirma la selección de inicio del jugador
     */
    public void confirmarInicioJugador() {

    }

    /**
     * Metodo que muestra el frame Pantalla Principal
     */
    public void mostrarPantallaPrincipal() {

    }

    /**
     * Metodo que muestra la informacion de los jugadores de la partida
     */
    public void muestraInformacionJugadores() {
        
    }

    /**
     * Metodo que valida que una linea pueda ser dibujada
     *
     * @return True si es posible dibujar la linea, false si no es posible
     */
    public boolean validaLinea() {
        return true;
    }

    /**
     * Metodo que dibuja la linea en el tablero
     */
    public void dibujaLinea() {

    }

    /**
     * Metodo que valida que un cuadro pueda ser rellenado
     *
     * @return True si es posible rellenar el cuadro, false si no es posible
     */
    public boolean verificaCuadro() {
        return true;
    }

    /**
     * Metodo que dibuja la cuadro en el tablero
     */
    public void dibujaCuadro() {

    }

    /**
     * Metodo que verifica el numero de cuadros restantes
     *
     * @return True en caso de que queden cuadros, False si ya no quedan
     */
    public boolean validaNumeroCuadros() {
        return true;
    }

    /**
     * Metodo que reasigna el turno a otro jugador
     */
    public void cambiaTurno() {

    }

    /**
     * Metodo para actualizar los estados de la partida
     */
    public void actualizaEstado() {

    }

    /**
     * Metodo que despliega un mensaje
     */
    public void muestraMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
    }

    public Partida getPartida() {
        return modeloPartida.getPartida();
    }

    public void setPartida(Partida partida) {
        this.modeloPartida.setPartida(partida);
    }

    public void setMensaje(String mensaje) {
        this.modeloPartida.setMensaje(mensaje);
    }

}
