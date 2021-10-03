package Control;

/**
 *
 * @author Angel
 */
public class Cuadro {
//    aja, si, muy bien, excelente

    Linea linea1;
    Linea linea2;
    Linea linea3;
    Linea linea4;
    Jugador jugador;

    public Cuadro(Linea linea1, Linea linea2, Linea linea3, Linea linea4, Jugador jugador) {
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.linea3 = linea3;
        this.linea4 = linea4;
        this.jugador = jugador;
    }

    public Linea getLinea1() {
        return linea1;
    }

    public void setLinea1(Linea linea1) {
        this.linea1 = linea1;
    }

    public Linea getLinea2() {
        return linea2;
    }

    public void setLinea2(Linea linea2) {
        this.linea2 = linea2;
    }

    public Linea getLinea3() {
        return linea3;
    }

    public void setLinea3(Linea linea3) {
        this.linea3 = linea3;
    }

    public Linea getLinea4() {
        return linea4;
    }

    public void setLinea4(Linea linea4) {
        this.linea4 = linea4;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    
    
}
