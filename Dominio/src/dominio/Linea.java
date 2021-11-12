/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Objects;

public class Linea {

    private Punto p1;
    private Punto p2;
    private double w;
    private double h;
    private Jugador jugador;

    /**
     *
     * @param p1 parametro que recibe punto uno
     * @param p2 parametro que recibe punto dos
     * @param w parametro que recibe lo anchura
     * @param h parametro que recibe a la altura
     * @param jugador parametro que recibe al jugador
     */
    public Linea(Punto p1, Punto p2, double w, double h, Jugador jugador) {
        this.p1 = p1;
        this.p2 = p2;
        this.w = w;
        this.h = h;
        this.jugador = jugador;
    }

    /**
     * Obtiene el punto inicial que usa para dibujar la línea
     *
     * @return devuelve el punto inicial
     */
    public Punto getP1() {
        return p1;
    }

    /**
     * Envia el punto inicial que usa para dibujar la línea
     *
     * @param p1 parametro que recibe el punto uno
     */
    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    /**
     * Obtiene el punto secundario que usa para dibujar la línea
     *
     * @return devuelve el punto dos
     */
    public Punto getP2() {
        return p2;
    }

    /**
     * Envia el punto inicial que usa para dibujar la línea
     *
     * @param p2 parametro que recibe el punto uno
     */
    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    /**
     * Obtiene la anchura que usa para dibujar la línea
     *
     * @return devuelve anchura
     */
    public double getW() {
        return w;
    }

    /**
     * Envia la anchura que usa para dibujar la línea
     *
     * @param w parametro que recibe la anchura
     */
    public void setW(double w) {
        this.w = w;
    }

    /**
     * Obtiene la altura que usa para dibujar la línea
     *
     * @return devuelve altura
     */
    public double getH() {
        return h;
    }

    /**
     * Envia la altura que usa para dibujar la línea
     *
     * @param h parametro que recibe la altura
     */
    public void setH(double h) {
        this.h = h;
    }

    /**
     * Obtiene al jugador que usa de la línea
     *
     * @return devuelve al jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Envia al jugador que usa de la línea
     *
     * @param jugador parametro que recibe la altura
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
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
        return "Linea{" + "p1=" + p1 + ", p2=" + p2 + ", jugador=" + jugador + '}';
    }

}
