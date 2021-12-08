package forma;

import java.awt.Graphics2D;

/**
 *
 * @author Equipo gatazo
 */
public abstract class Forma {
    private float x;
    private float y;
    private float a;
    private float h;
    private Graphics2D g;

    public Forma(float x, float y, float a, float h, Graphics2D g) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.h = h;
        this.g = g;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public Graphics2D getG() {
        return g;
    }

    public void setG(Graphics2D g) {
        this.g = g;
    }
    
    public abstract void dibujar();
}
