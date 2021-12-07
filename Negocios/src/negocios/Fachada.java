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
public class Fachada implements iConexion {

    private CtrlJuego ctrlJuego;
    private CtrlJugador ctrlJugador;
    private CtrlTablero ctrlTablero;

    public Fachada() {
        ctrlJuego = new CtrlJuego();
        ctrlJugador = new CtrlJugador();
        ctrlTablero = new CtrlTablero();
    }

    @Override
    public boolean compruebaLinea(Linea linea, ArrayList<Linea> lineasList) {
        return ctrlJuego.compruebaLinea(linea, lineasList);
    }

    @Override
    public boolean compruebaPunto(Punto p1, Punto p2) {
        return ctrlJuego.compruebaPunto(p1, p2);
    }

    @Override
    public Cuadro verificarCuadro(Linea linea, ArrayList<Linea> lineasList, Tablero tabla) {
        return ctrlJuego.verificarCuadro(linea, lineasList, tabla);
    }

    @Override
    public Cuadro verificarCuadroDoble(Cuadro cuadro, ArrayList<Linea> lineasList, Tablero tabla) {
        return ctrlJuego.verificarCuadroDoble(cuadro, lineasList, tabla);
    }

    @Override
    public void setTamanio(int tamanio) {
        ctrlTablero.setTamanio(tamanio);
    }

    @Override
    public Tablero getTablero() {
        return ctrlTablero.getTablero();
    }

    @Override
    public Jugador getJugador() {
        return ctrlJugador.getJugador();
    }

    @Override
    public void setJugador(Jugador jugador) {
        ctrlJugador.setJugador(jugador);
    }

}
