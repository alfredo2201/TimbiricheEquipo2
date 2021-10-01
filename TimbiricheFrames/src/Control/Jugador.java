/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Jugador {

    private String nombre;
    private String avatar;
    private Color color;
    private ArrayList<Linea> lineas = new ArrayList();

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

    public ArrayList<Linea> getLineas() {
        //if(lineaas ==)
        return lineas!=null? lineas:null;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }
    
    public void addLinea(Linea lin){
        this.lineas.add(lin);
    }
}
