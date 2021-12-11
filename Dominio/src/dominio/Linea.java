package dominio;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Equipo Gatazo
 */
public class Linea implements Serializable {

    private Punto p1;
    private Punto p2;
    private float ancho;
    private float alto;
    private Tablero tablero;
    private Jugador jugador;

    /**
     * Constructor que inicializa las variables de la clase
     *
     * @param p1 Punto
     * @param p2 Punto
     * @param w float Anchura
     * @param h float Altura
     * @param tablero Tablero
     */
    public Linea(Punto p1, Punto p2, float w, float h, Tablero tablero) {
        this.p1 = p1;
        this.p2 = p2;
        this.ancho = w;
        this.alto = h;
        this.tablero = tablero;
    }

    /**
     * Otorga un valor al tablero
     *
     * @param tablero Tablero que sera instanciado
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Regresa el punto 1
     *
     * @return Punto
     */
    public Punto getP1() {
        return p1;
    }

    /**
     * Otorga un valor al punto 1
     *
     * @param p1 Punto
     */
    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    /**
     * Regresa el punto 2
     *
     * @return Punto
     */
    public Punto getP2() {
        return p2;
    }

    /**
     * Otorga un valor al punto 2
     *
     * @param p2 Punto
     */
    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    /**
     * Regresa la anchura
     *
     * @return Float ancho
     */
    public float getW() {
        return ancho;
    }

    /**
     * Otorga un valor a la anchura
     *
     * @param w Float ancho
     */
    public void setW(float w) {
        this.ancho = w;
    }

    /**
     * Regresa lo alto
     *
     * @return Float alto
     */
    public float getH() {
        return alto;
    }

    /**
     * Otorga un valor a la altura
     *
     * @param h Float altura
     */
    public void setH(float h) {
        this.alto = h;
    }

    /**
     * Regresa al jugador
     *
     * @return Jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Otorga un valor al jugador
     *
     * @param jugador Jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Linea other = (Linea) obj;
        if (!Objects.equals(this.p1, other.p1)) {
            return false;
        }
        if (!Objects.equals(this.p2, other.p2)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public String toString() {
        return "Linea{" + "p1=" + p1 + ", p2=" + p2;
    }

}
