package dominio;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Equipo Gatazo
 */
public class Cuadro implements Forma{

    private Linea superior;
    private Linea inferior;
    private Linea izq;
    private Linea der;

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

    @Override
    public String toString() {
        return "Cuadro{" + "superior=" + superior + ", inferior=" + inferior + ", izq=" + izq + ", der=" + der + '}';
    }

    @Override
    public void dibujar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
//        Rectangle2D rec = new Rectangle2D.Double(superior.getP1().getX() + (superior.getW() / 2), superior.getP1().getY() + (superior.getW() / 2)
//                , conexion.getTablero().getSeparacion(), conexion.getTablero().getSeparacion())
    }



    
    
}
