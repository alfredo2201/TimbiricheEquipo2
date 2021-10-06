package dominio;

public class Punto {

    private int x = 0;
    private int y = 0;
    private int weidt = 0;
    private int high = 0;

    public Punto() {
    }

    /**
     * Constructor que inicializa los objetos de la clase
     *
     * @param x coordenada x
     * @param y coordenada y
     * @param weidt anchura del punto
     * @param high altura del punto
     */
    public Punto(int x, int y, int weidt, int high) {
        this.x = x;
        this.y = y;
        this.weidt = weidt;
        this.high = high;
    }

    /**
     * Metodo que regresa la coordenada x
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * metodo para dar un valor a la coordenada x del punto
     *
     * @param x coordenada x del punto
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Metodo que regresa la coordenada y
     *
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * metodo para dar un valor a la coordenada y del punto
     *
     * @param y coordenada y del punto
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Metodo que regresa la anchura del punto
     *
     * @return weidt
     */
    public int getWeidt() {
        return weidt;
    }

    /**
     * metodo para dar un valor a la anchura del punto
     *
     * @param weidt
     */
    public void setWeidt(int weidt) {
        this.weidt = weidt;
    }

    /**
     * Metodo que regresa la altura del punto
     *
     * @return high
     */
    public int getHigh() {
        return high;
    }

    /**
     * metodo para dar un valor a la altura del punto
     *
     * @param high altura
     */
    public void setHigh(int high) {
        this.high = high;
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
        return "x=" + x + ", y=" + y + ", weidt=" + weidt;
    }

}
