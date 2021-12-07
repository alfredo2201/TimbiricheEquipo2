/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Equipo gatazo
 */
public class Partida {

    private ArrayList<Jugador> jugadores;
    //creo que estado debe ser un int y no una clase de estado
    private Estados estado;
    private Tablero tablero;
    private ArrayList<Jugador> turnos;

    public Partida() {
        estado = Estados.EN_ESPERA;
        jugadores = new ArrayList<>();
        turnos = new ArrayList<>();
    }

    public void setJugador(Jugador jugador) {
        if (jugadores.size() < 4) {
            jugadores.add(jugador);
        }
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public ArrayList<Jugador> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Jugador> turnos) {
        this.turnos = turnos;
    }

}
