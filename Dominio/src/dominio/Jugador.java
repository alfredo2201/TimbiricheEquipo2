package dominio;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Equipo Gatazo
 */
public class Jugador implements Serializable {

    private String nombre;
    private String avatar;
    private Color color;
    private boolean esMiTurno;
    private boolean iniciar;
    private int Puntos;

    /**
     * Constructor con el jugador
     *
     * @param nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor por vacio por defecto de jugador
     */
    public Jugador() {
    }

    /**
     * Devuelve el nombre del jugador
     *
     * @return nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe nombre del jugador
     *
     * @param nombre nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el icono del jugador
     *
     * @return icono del jugador
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Recibe el icono del jugador
     *
     * @param avatar icono de jugador
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Devuelve el color del jugador
     *
     * @returncolor del jugador
     */
    public Color getColor() {
        return color;
    }

    /**
     * Recibe el color del jugador
     *
     * @param color color del jugador
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * toString que regresa nombre del jugador
     * @return nombre de jugador
     */
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }

    /**
     * Devuelve los puntos que tiene el jugador
     *
     * @return puntos de jugador
     */
    public int getPuntos() {
        return Puntos;
    }

    /**
     * Recibe los puntos que tiene el jugador
     *
     * @param Puntos puntos del jugador
     */
    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    /**
     * Devuelve cuadno sea el jugador
     *
     * @return si es turno del jugador
     */
    public boolean isEsMiTurno() {
        return esMiTurno;
    }

    /**
     * Envia que es el turno del jugador
     *
     * @param esMiTurno es el turno del jugador
     */
    public void setEsMiTurno(boolean esMiTurno) {
        this.esMiTurno = esMiTurno;
    }

    /**
     * Envia que puede iniciar la partida
     *
     * @return inicia partida
     */
    public boolean isIniciar() {
        return iniciar;
    }

    /**
     * Envia que puede iniciar la partida
     *
     * @param iniciar inicia partida
     *
     */
    public void setIniciar(boolean iniciar) {
        this.iniciar = iniciar;
    }

}
