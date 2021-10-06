package dominio;

import java.awt.Color;
import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private String avatar;
    private Color color;

    /**
     * Constructor que inicialisa el nombre del jugador
     *
     * @param nombre nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor por defecto
     */
    public Jugador() {
    }

    /**
     * Metodo que regresa el nombre del jugador
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo para dar nombre al jugador
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el avatar del jugador
     *
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Metodo para dar un avatar al jugador
     *
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Metodo que regresa el color del jugador
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Metodo para dar un color al jugador
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

}
