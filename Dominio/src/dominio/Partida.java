/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Equipo gatazo
 */
public class Partida implements Serializable {

    private Estados estado = Estados.EN_ESPERA;

    private ArrayList<Jugador> jugadores = new ArrayList<>();

    private ArrayList<Jugador> turnos = new ArrayList<>();

    private boolean cambioTurno;

    private Tablero tablero;

    private ArrayList<Linea> lineas;
    
    private ArrayList<Cuadro> cuadros;

    public void setJugador(Jugador jugador) {
        if (this.jugadores.size() < 4) {
            this.jugadores.add(jugador);
        }
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Estados getEstado() {
        return this.estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public Tablero getTablero() {
        return this.tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public ArrayList<Jugador> getTurnos() {
        return this.turnos;
    }

    public void setTurnos(ArrayList<Jugador> turnos) {
        this.turnos = turnos;
    }

    public boolean isCambioTurno() {
        return this.cambioTurno;
    }

    public void setCambioTurno(boolean cambioTurno) {
        this.cambioTurno = cambioTurno;
    }

    public ArrayList<Linea> getLinea() {
        return lineas;
    }

    public void setLinea(Linea linea) {
        lineas.add(linea);
    }

    public ArrayList<Cuadro> getCuadro() {
        return cuadros;
    }

    public void setCuadro(Cuadro cuadro) {
        cuadros.add(cuadro);
    }

}
