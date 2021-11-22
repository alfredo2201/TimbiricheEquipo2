/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import dominio.Jugador;
import java.awt.Color;

/**
 *
 * @author Equipo Gatazo
 */
public class CtrlJugador {

    private Jugador jugador;

    public CtrlJugador() {
        jugador = new Jugador();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
