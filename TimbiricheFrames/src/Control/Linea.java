/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Angel
 */
public class Linea {
    private double x1;
    private double y1;
    private double x2;
    private double y2;  
    private double w;
    private double h;
    private Jugador jugador;


    public Linea(double x1, double y1, double x2, double y2, double w, double h, Jugador jugador) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.w = w;
        this.h = h;
        this.jugador = jugador;
    }

   
    
    public double getX() {
        return x1;
    }

    public void setX(double x) {
        this.x1 = x;
    }

    public double getY() {
        return y1;
    }

    public void setY(double y) {
        this.y1 = y;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    public void getLineas(){
        System.out.println(x1+""+y1+"-"+x2+""+y2);
    }

    public Jugador getJugador() {
        return jugador;
    }

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
        if (Double.doubleToLongBits(this.x1) != Double.doubleToLongBits(other.x1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y1) != Double.doubleToLongBits(other.y1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.x2) != Double.doubleToLongBits(other.x2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y2) != Double.doubleToLongBits(other.y2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.w) != Double.doubleToLongBits(other.w)) {
            return false;
        }
        if (Double.doubleToLongBits(this.h) != Double.doubleToLongBits(other.h)) {
            return false;
        }
        return true;
    }
 
    
    @Override
    public String toString() {
        return "Linea{" + "x=" + x1 + ", y=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", w=" + w + ", h=" + h + '}';
    }
    
    

    
    
    
}
