package dominio;

import java.io.Serializable;

/**
 *
 * @author Equipo Gatazo
 */
public class Cuadro implements Serializable {

    private Linea superior;
    private Linea inferior;
    private Linea izq;
    private Linea der;
    private Jugador jugador;

    /**
     * Constructor que inicializa las variables de la clase
     *
     * @param superior Liena superior
     * @param inferior Linea inferior
     * @param izq Linea izquierda
     * @param der Linea derecha
     */
    public Cuadro(Linea superior, Linea inferior, Linea izq, Linea der) {
        this.superior = superior;
        this.inferior = inferior;
        this.izq = izq;
        this.der = der;
    }

    /**
     * Constructor por defecto
     */
    public Cuadro() {

    }

    /**
     * Regresa la linea superior
     *
     * @return Linea superior
     */
    public Linea getSuperior() {
        return superior;
    }

    /**
     * Otorga un valor a la linea superior
     *
     * @param superior Linea
     */
    public void setSuperior(Linea superior) {
        this.superior = superior;
    }

    /**
     * Regresa la linea inferior
     *
     * @return Linea inferior
     */
    public Linea getInferior() {
        return inferior;
    }

    /**
     * Otorga un valor a la linea inferior
     *
     * @param inferior Linea
     */
    public void setInferior(Linea inferior) {
        this.inferior = inferior;
    }

    /**
     * Regresa la linea izquierda
     *
     * @return Linea izquierda
     */
    public Linea getIzq() {
        return izq;
    }

    /**
     * Otorga un valor a la linea izquierda
     *
     * @param izq Linea
     */
    public void setIzq(Linea izq) {
        this.izq = izq;
    }

    /**
     * Regresa la linea derecha
     *
     * @return Linea derecha
     */
    public Linea getDer() {
        return der;
    }

    /**
     * Otorga un valor a la linea derecha
     *
     * @param der Linea
     */
    public void setDer(Linea der) {
        this.der = der;
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
    /**
     * toString que regresa superior, inferior, izquieda y derecha
     */
    public String toString() {
        return "Cuadro{" + "superior=" + superior + ", inferior=" + inferior + ", izq=" + izq + ", der=" + der + '}';
    }

}
