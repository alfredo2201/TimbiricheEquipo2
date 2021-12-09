/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Equipo Gatazo
 */
public class Jugador implements Serializable{

    private String nombre;
    private String avatar;
    private Color color;
    private boolean esMiTurno;
    private boolean iniciar;

    public boolean isEsMiTurno() {
        return esMiTurno;
    }

    public void setEsMiTurno(boolean esMiTurno) {
        this.esMiTurno = esMiTurno;
    }

    public boolean isIniciar() {
        return iniciar;
    }

    public void setIniciar(boolean iniciar) {
        this.iniciar = iniciar;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        //lineas = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }

}
