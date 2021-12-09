package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Equipo Gatazo
 */
public class Tablero implements Serializable {

    private final Punto punto = new Punto();

    private int grosor = 0;

    private int tamanio;

    private int separacion;

    public int getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Punto getPuntos() {
        switch (this.tamanio) {
            case 10:
                this.punto.setX(15);
                this.punto.setY(15);
                this.punto.setRadio(30);
                break;
            case 20:
                this.punto.setX(15);
                this.punto.setY(15);
                this.punto.setRadio(20);
                break;
            case 40:
                this.punto.setX(15);
                this.punto.setY(15);
                this.punto.setRadio(8);
                break;
        }
        return this.punto;
    }

    public int getSeparacion() {
        switch (this.tamanio) {
            case 10:
                this.separacion = 100;
                break;
            case 20:
                this.separacion = 50;
                break;
            case 40:
                this.separacion = 25;
                break;
        }
        return this.separacion;
    }

    public int getGrosor() {
        switch (this.tamanio) {
            case 10:
                this.grosor = 10;
                break;
            case 20:
                this.grosor = 8;
                break;
            case 40:
                this.grosor = 4;
                break;
        }
        return this.grosor;
    }
}
