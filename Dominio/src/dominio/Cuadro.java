package dominio;

public class Cuadro {

    Linea superior;
    Linea inferior;
    Linea izq;
    Linea der;
    Linea linea;
    Jugador jugador;

    /**
     * Constructor de cuadro que recibe las lineas superior e inferior,
     * izquierda y derecha para formarlo, así ocomo el jugador que lo fomró
     *
     * @param superior linea superior
     * @param inferior linea inferior
     * @param izq linea izquierda
     * @param der linea derecha
     * @param jugador jugador
     */
    public Cuadro(Linea superior, Linea inferior, Linea izq, Linea der, Jugador jugador) {
        this.superior = superior;
        this.inferior = inferior;
        this.izq = izq;
        this.der = der;
        this.jugador = jugador;
    }

    /**
     * Constructor por defecto
     */
    public Cuadro() {

    }

    /**
     * Obtiene la línea del cuadrado
     *
     * @return devuelve la línea
     */
    public Linea getLinea() {
        return linea;
    }

    /**
     * Envía la línea del cuadrado
     *
     * @param linea recibe línea
     */
    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    /**
     * Obtiene línea superior del cuadrado
     *
     * @return devuelve línea superior
     */
    public Linea getSuperior() {
        return superior;
    }

    /**
     * Envía línea superior del cuadrado
     *
     * @param superior recibe la línea superior
     */
    public void setSuperior(Linea superior) {
        this.superior = superior;
    }

    /**
     * Obtiene línea inferior del cuadrado
     *
     * @return devuelve línea inferior
     */
    public Linea getInferior() {
        return inferior;
    }

    /**
     * Envía línea superior del cuadrado
     *
     * @param inferior recibe la línea inferior
     */
    public void setInferior(Linea inferior) {
        this.inferior = inferior;
    }

    /**
     * Obtiene línea izquierda del cuadrado
     *
     * @return devuelve línea izquierda
     */
    public Linea getIzq() {
        return izq;
    }

    /**
     * Envía línea izquierda del cuadrado
     *
     * @param izq recibe línea izquierda
     */
    public void setIzq(Linea izq) {
        this.izq = izq;
    }

    /**
     * Obtiene línea derecha del cuadrado
     *
     * @return devuelve línea derecha
     */
    public Linea getDer() {
        return der;
    }

    /**
     * Envía línea izquierda del cuadrado
     *
     * @param der recibe línea derecha
     */
    public void setDer(Linea der) {
        this.der = der;
    }

    /**
     * Obtiene al jugador
     *
     * @return devuelve al jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Envia al jugador
     *
     * @param jugador recibe al jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Cuadro{" + "superior=" + superior + ", inferior=" + inferior + ", izq=" + izq + ", der=" + der + '}';
    }

}
