package dominio;

import java.io.Serializable;

/**
 *
 * @author Equipo Gatazo
 */
public class Punto implements Serializable {

    private int x = 0;
    private int y = 0;
    private int radio = 0;

    /**
     * Constructor por defecto
     */
    public Punto() {
    }

    /**
     * Constructor que otorga valores a las variables de la clase
     *
     * @param x int coordenadaX
     * @param y int coordenadaY
     * @param radio Int radio
     */
    public Punto(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    /**
     * Regresa la coordenada X del punto
     *
     * @return int X
     */
    public int getX() {
        return x;
    }

    /**
     * Le otorga un valor a la coordenada X del punto
     *
     * @param x int X
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Regresa la coordenada Y del punto
     *
     * @return int Y
     */
    public int getY() {
        return y;
    }

    /**
     * Le otorga un valor a la coordenada Y del punto
     *
     * @param y int y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Regresa el dario del punto
     * @return int Radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * Otorga un valor al radio del punto
     * @param radio int
     */
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
