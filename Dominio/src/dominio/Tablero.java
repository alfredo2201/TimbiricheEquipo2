package dominio;

import java.util.ArrayList;

/**
 *
 * @author Equipo Gatazo
 */
public class Tablero {

    private int tamanio;
    private int separacion;
    private final Punto punto;
    private int grosor;
    private ArrayList<Jugador> jugadores;

    public Tablero() {
        punto = new Punto();
        jugadores = new ArrayList<>();
        grosor = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Punto getPuntos() {
        switch (tamanio) {
            case 10:
                punto.setX(15);
                punto.setY(15);
                punto.setRadio(30);
                break;
            case 20:
                punto.setX(15);
                punto.setY(15);
                punto.setRadio(20);
                break;
            case 40:
                punto.setX(15);
                punto.setY(15);
                punto.setRadio(8);
                break;
        }
        return punto;
    }

    public int getSeparacion() {
        switch (tamanio) {
            case 10:
                separacion = 100;
                break;
            case 20:
                separacion = 50;
                break;
            case 40:
                separacion = 25;
                break;
        }
        return separacion;
    }
    
    public int getGrosor() {
        switch (tamanio) {
            case 10:
                grosor = 10;
                break;
            case 20:
                grosor = 8;
                break;
            case 40:
                grosor = 4;
                break;
            default:
                break;
        }
        return grosor;
    }

}
