package Control;

public class Cuadro {

    Linea superior;
    Linea inferior;
    Linea izq;
    Linea der;
    Linea linea;
    Jugador jugador;

    public Cuadro(Linea superior, Linea inferior, Linea izq, Linea der, Jugador jugador) {
        this.superior = superior;
        this.inferior = inferior;
        this.izq = izq;
        this.der = der;
        this.jugador = jugador;
    }

    public Cuadro() {
        
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
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
    public boolean esCuadrado(){
        if (this.superior.getX2() == this.der.getX() && this.superior.getX() == this.izq.getX()) {
            
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuadro{" + "superior=" + superior + ", inferior=" + inferior + ", izq=" + izq + ", der=" + der + '}';
    }

    
    
}
