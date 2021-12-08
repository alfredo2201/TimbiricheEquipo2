package forma;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Equipo gatazo
 */
public class Linea extends Forma {

    public Linea(float x, float y, float a, float h, Graphics2D g) {
        super(x, y, a, h, g);
    }


  

    @Override
    public void dibujar() {
        Rectangle2D rec = new Rectangle2D.Double(getX(),getY(),getA(),getH());
        getG().fill(rec);
    }

}
