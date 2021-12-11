/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import dominio.Estados;
import dominio.Jugador;
import dominio.Partida;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Equipo Gatazo
 */
public class ServerSocketProtocol {

    private static ServerSocketProtocol instance;
    private Partida partida = null;
    private Jugador jugadorAdmin;

    /**
     * Método que recibe al jugador que ingresa a la partida
     *
     * @param jugador jugador que ha ingresado
     */
    public void ingresaJugador(Jugador jugador) {
        if (partida == null && jugadorAdmin == null) {
            this.jugadorAdmin = jugador;
            System.out.println(jugadorAdmin.getNombre() + " : " + jugadorAdmin.getAvatar());
        } else if (partida != null && partida.getJugadores().size() <= 4) {
            partida.getJugadores().add(jugador);
            for (Jugador jugadore : partida.getJugadores()) {
                System.out.println(jugadore);
            }
        }
    }

    /**
     * ´Método que crea la partida
     *
     * @param partida partida
     */
    public void creaPartida(Partida partida) {
        this.partida = partida;
    }

    /**
     * Método que asigna los turnos al azar a los jugadores
     */
    public void asignarTurnos() {
        ArrayList<Jugador> aux = new ArrayList<>(partida.getJugadores());
        Random random = new Random();
        while (aux.size() > 0) {
            int randomIndex = random.nextInt(aux.size());
            partida.getTurnos().add(aux.get(randomIndex));
            aux.remove(randomIndex);
        }
    }

    /**
     * Método que inicia la partida
     *
     * @param partida partida
     */
    public void iniciarPartida(Partida partida) {
        this.partida = partida;
        int confirmaciones = 0;
        for (Jugador jugadore : partida.getJugadores()) {
            if (jugadore.isIniciar()) {
                confirmaciones++;
            }
        }
        if (confirmaciones > 1 && partida.getJugadores().size() <= 4) {
            this.partida.setEstado(Estados.INICIADO);
        }
    }

    /**
     * Método que cambia el turno de los jugadores
     *
     * @param partida
     */
    public void cambiaTurno(Partida partida) {
        this.partida = partida;
        Jugador aux = this.partida.getTurnos().get(0);
        aux.setEsMiTurno(false);
        this.partida.getTurnos().remove(0);
        this.partida.getTurnos().get(0).setEsMiTurno(true);
        this.partida.getTurnos().add(aux);
    }

    /**
     * Método que notifica los cambios de estado de la partida
     *
     * @param partida partida en curso
     */
    public void cambioEstado(Partida partida) {
        this.partida.setEstado(partida.getEstado());
    }

    /**
     * Método que envia a la partida
     *
     * @return partida actual
     */
    public synchronized Partida enviarPartida() {
        return this.partida;
    }

    /**
     * Método que procesa la partida actual
     *
     * @param partida partida en curso
     */
    public void procesaPartida(Partida partida) {
        if (this.partida == null) {
            creaPartida(partida);
        } else if (partida.getEstado() != this.partida.getEstado()) {
            cambioEstado(partida);
        } else if (partida.isCambioTurno()) {
            cambiaTurno(partida);
        } else if (partida.getJugadores().get(0).isIniciar()) {
            iniciarPartida(partida);
        } else {
            this.partida = partida;
        }
    }

    /**
     * Crea una instancia de ServerSocketProtocol
     *
     * @return Regresa una instancia de ServerSocketProtocol
     */
    public static ServerSocketProtocol getInstance() {
        if (instance == null) {
            instance = new ServerSocketProtocol();
        }
        return instance;
    }

    /**
     * Método que elimina a un jugador de la partida
     *
     * @param jugador jugador a eliminar
     */
    public synchronized void eliminarJugador(Jugador jugador) {
        ArrayList<Jugador> jugadores = partida.getJugadores();
        Jugador aux = null;
        for (Jugador jgd : jugadores) {
            if (jgd.getNombre().equals(jugador.getNombre())) {
                aux = jgd;
            }
        }
        jugadores.remove(partida.getJugadores().indexOf(aux));
        this.partida.setJugadores(jugadores);
    }

    /**
     * Método que procesa a los jugadores
     *
     * @param jugador jugador a procesar
     * @return true al realizar una acción
     */
    public synchronized boolean procesaJugador(Jugador jugador) {
        if (jugador.getNombre() == null && jugador.getAvatar() == null) {
            if (this.partida != null) {
                return true;
            }
        } else if (jugador.getAvatar().equalsIgnoreCase("eliminar")) {
            eliminarJugador(jugador);
            if (this.partida != null) {
                return true;
            }
        } else {
            ingresaJugador(jugador);
            if (this.partida != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene al jugador principal
     *
     * @return jugador inicial
     */
    public Jugador getJugadorAdmin() {
        return jugadorAdmin;
    }

}
