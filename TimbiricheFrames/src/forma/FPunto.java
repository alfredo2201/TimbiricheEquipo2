package forma;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Equipo gatazo
 */
public class FPunto extends Forma{

    public FPunto(float x, float y, float a, float h, Graphics2D g) {
        super(x, y, a, h, g);
    }


    @Override
    public void dibujar() {
        Ellipse2D el = new Ellipse2D.Double(getX(), getY(), getH(),getH());
        this.getG().fill(el);
    }
    
}
