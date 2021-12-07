/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import dominio.Cuadro;
import dominio.Jugador;
import dominio.Linea;
import dominio.Punto;
import dominio.Tablero;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Equipo Gatazo
 */
public interface iConexion {

    public boolean compruebaLinea(Linea linea, ArrayList<Linea> lineasList);

    public boolean compruebaPunto(Punto p1, Punto p2);

    public Cuadro verificarCuadro(Linea linea, ArrayList<Linea> lineasList, Tablero tabla);

    public Cuadro verificarCuadroDoble(Cuadro cuadro, ArrayList<Linea> lineasList, Tablero tabla);

    public Jugador getJugador();

    public void setJugador(Jugador jugador);
    
    public void setTamanio(int tamanio);

    public Tablero getTablero();
}
