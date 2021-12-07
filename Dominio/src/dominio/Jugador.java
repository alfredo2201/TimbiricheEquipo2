/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Equipo Gatazo
 */
public class Jugador {

    private String nombre;
    private String avatar;
    private Color color;
    private ArrayList<Linea> linea;
    private ArrayList<Cuadro> cuadro;

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

    public ArrayList<Linea> getLinea() {
        return linea;
    }

    public void setLinea(ArrayList<Linea> linea) {
        this.linea = linea;
    }

    public ArrayList<Cuadro> getCuadro() {
        return cuadro;
    }

    public void setCuadro(ArrayList<Cuadro> cuadro) {
        this.cuadro = cuadro;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }

    
    
}
