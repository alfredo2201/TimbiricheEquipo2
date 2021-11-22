/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Objects;

/**
 *
 * @author Equipo Gatazo
 */
public class Linea implements Forma {

    private Punto p1;
    private Punto p2;
    private double ancho;
    private double alto;
    private Tablero tablero;

    public Linea(Punto p1, Punto p2, double w, double h, Tablero tablero) {
        this.p1 = p1;
        this.p2 = p2;
        this.ancho = w;
        this.alto = h;
        this.tablero = tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public double getW() {
        return ancho;
    }

    public void setW(double w) {
        this.ancho = w;
    }

    public double getH() {
        return alto;
    }

    public void setH(double h) {
        this.alto = h;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
    public String toString() {
        return "Linea{" + "p1=" + p1 + ", p2=" + p2;
    }

    @Override
    public void dibujar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
//        Rectangle2D rec = new Rectangle2D.Double((p1.getX() + (p1.getWeidt() / 2)),
//                ((p1.getY() + (p1.getWeidt() / 2)) - (Double.valueOf(tablero.getGrosor()) / 2)), 
//                Double.valueOf(tablero.getSeparacion()), Double.valueOf(tablero.getGrosor()));
    }

}
