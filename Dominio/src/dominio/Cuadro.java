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

    public Cuadro(Linea superior, Linea inferior, Linea izq, Linea der) {
        this.superior = superior;
        this.inferior = inferior;
        this.izq = izq;
        this.der = der;
    }

    public Cuadro() {

    }

    public Linea getSuperior() {
        return superior;
    }

    public void setSuperior(Linea superior) {
        this.superior = superior;
    }

    public Linea getInferior() {
        return inferior;
    }

    public void setInferior(Linea inferior) {
        this.inferior = inferior;
    }

    public Linea getIzq() {
        return izq;
    }

    public void setIzq(Linea izq) {
        this.izq = izq;
    }

    public Linea getDer() {
        return der;
    }

    public void setDer(Linea der) {
        this.der = der;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Cuadro{" + "superior=" + superior + ", inferior=" + inferior + ", izq=" + izq + ", der=" + der + '}';
    }

}
