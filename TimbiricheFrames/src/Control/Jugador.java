package Control;

import java.awt.Color;

public class Jugador {

    private String nombre;
    private String avatar;
    private Color color;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    

  
}
