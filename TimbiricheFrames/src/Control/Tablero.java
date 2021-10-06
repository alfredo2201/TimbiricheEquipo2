package Control;

public class Tablero {

    private int tamanio;
    private int separacion;
    private final Punto punto;

    public Tablero() {
        punto = new Punto();
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
