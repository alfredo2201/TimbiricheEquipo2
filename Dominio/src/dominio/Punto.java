package dominio;

import java.awt.Graphics;
import java.io.Serializable;

/**
 *
 * @author Equipo Gatazo
 */
public class Punto implements Serializable {

    private int x = 0;
    private int y = 0;
    private int radio = 0;

    public Punto() {
    }

    public Punto(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Punto other = (Punto) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }

}
