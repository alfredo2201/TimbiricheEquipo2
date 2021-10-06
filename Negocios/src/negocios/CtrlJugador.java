/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import dominio.Jugador;

/**
 *
 * @author Angel
 */
public class CtrlJugador {

    private Jugador jugador;

    /**
     * Constructor por defecto que inicializa jugador
     */
    public CtrlJugador() {
        jugador = new Jugador();
    }

    /**
     * Metodo para obtener el jugador
     * @return un objeto tipo jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Otorga el valor del parametro jugador al jugador de la clase
     * @param jugador 
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
