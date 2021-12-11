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
    private ArrayList<Linea> lineas = new ArrayList<>();
    private ArrayList<Cuadro> cuadros = new ArrayList<>();

    /**
     * Otorga un valor al jugador
     *
     * @param jugador Jugador
     */
    public void setJugador(Jugador jugador) {
        if (this.jugadores.size() < 4) {
            this.jugadores.add(jugador);
        }
    }

    /**
     * Regresa una lista con los jugadores de la partida
     * @return ArrayList<Jugador> jugadores
     */
    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    /**
     * Otorga valor a los jugadores de la partida
     * @param jugadores ArrayList<Jugador>
     */
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Regresa el estado de la partida
     * @return Estado
     */
    public Estados getEstado() {
        return this.estado;
    }

    /**
     * Otorga un valor al estado de la partida
     * @param estado Estados 
     */
    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    /**
     * Regresa el tablero de la partida
     * @return Tablero
     */
    public Tablero getTablero() {
        return this.tablero;
    }

    /**
     * Otorga un valor al tablero de la partida
     * @param tablero Tablero 
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Regresa los turnos d elos jugadores
     * @return ArrayList<Jugador>
     */
    public ArrayList<Jugador> getTurnos() {
        return this.turnos;
    }

    /**
     * Otorga un valor a los turnos de los jugadores
     * @param turnos ArrayList<Jugador>
     */
    public void setTurnos(ArrayList<Jugador> turnos) {
        this.turnos = turnos;
    }

    /**
     * Regresa el cambio de turno
     * @return Boolean
     */
    public boolean isCambioTurno() {
        return this.cambioTurno;
    }

    /**
     * Otorga un valor al cambio de turno
     * @param cambioTurno Boolean
     */
    public void setCambioTurno(boolean cambioTurno) {
        this.cambioTurno = cambioTurno;
    }

    /**
     * Regresa las lineas de la partida
     * @return ArrayList<Linea>
     */
    public ArrayList<Linea> getLinea() {
        return lineas;
    }

    /**
     * Agrega una linea  alas lineas de la partida
     * @param linea Linea
     */
    public void setLinea(Linea linea) {
        lineas.add(linea);
    }

    /**
     * Regresa los cuadros de la partida
     * @return ArrayList<Cuadro> 
     */
    public ArrayList<Cuadro> getCuadro() {
        return cuadros;
    }

    /**
     * Añade un cuadro a los cuadros de la partida
     * @param cuadro Cuadro
     */
    public void setCuadro(Cuadro cuadro) {
        cuadros.add(cuadro);
    }

}
