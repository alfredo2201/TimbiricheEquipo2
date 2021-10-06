package dominio;

import java.util.ArrayList;

public class Tablero {

    private int tamanio;
    private int separacion;
    private final Punto punto;
    private ArrayList<Jugador> jugadores;

    /**
     * Constructor del tablero con punto y jugadores
     */
    public Tablero() {
        punto = new Punto();
        jugadores = new ArrayList<>();
    }

    /**
     * Obtiene el tamaño del tablero
     *
     * @return devuelve el tamaño del tablero
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * Envia el tamaño del tablero
     *
     * @param tamanio parametro que recibe el tamaño
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Obtiene a las posiciones y tamaño de los puntos
     *
     * @return devuelve los puntos
     */
    public Punto getPuntos() {
        switch (tamanio) {
            case 10:
                punto.setX(15);
                punto.setY(15);
                punto.setHigh(30);
                punto.setWeidt(30);
                break;
            case 20:
                punto.setX(15);
                punto.setY(15);
                punto.setHigh(20);
                punto.setWeidt(20);
                break;
            case 40:
                punto.setX(15);
                punto.setY(15);
                punto.setHigh(8);
                punto.setWeidt(8);
                break;
        }
        return punto;
    }

    /**
     * Devuelve la separación entre los puntos de acuerdo a su tamaño
     *
     * @return separacion de los puntos
     */
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

}
