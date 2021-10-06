/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Control.Control;
import dominio.Cuadro;
import dominio.Linea;
import dominio.Punto;
import dominio.Tablero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocios.Fabrica;
import negocios.iConexion;

/**
 *
 * @author crist
 */
public class pnJuego extends javax.swing.JPanel {

    private final int tamanio;
    private final ArrayList<Punto> puntosList = new ArrayList();
    private final ArrayList<Cuadro> listCuadro = new ArrayList();
    private final int separacion;
    private int pulsacion = 1;
    private int posicion_x;
    private int posicion_y;
    private int w;
    private int h;
    private Punto p1;
    private Punto p2;
    private Graphics g;
    private int grosor;
    private Control control;
    private ArrayList<Linea> lineasList;
    private iConexion conexion = Fabrica.getInstance();

    public pnJuego(Tablero tablero) {
        initComponents();
        this.tamanio = tablero.getTamanio();
        this.separacion = tablero.getSeparacion();
        this.posicion_x = tablero.getPuntos().getX();
        this.posicion_y = tablero.getPuntos().getY();
        this.w = tablero.getPuntos().getWeidt();
        this.h = tablero.getPuntos().getHigh();
        this.p1 = new Punto();
        this.p2 = new Punto();
        this.lineasList = new ArrayList<>();
        control = Control.getInstance();
        grosor();
//        dibujaCirculos(this.getGraphics());
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g);
        Punto punto;
        g2d.setPaint(Color.DARK_GRAY);
        int puntoInicialx = posicion_x;
        int puntoInicialy = posicion_y;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                Ellipse2D e1 = new Ellipse2D.Double(posicion_x, posicion_y, w, h);
                punto = new Punto(posicion_x, posicion_y, w, h);
                puntosList.add(punto);
                g2d.fill(e1);
                posicion_x += separacion;
            }
            posicion_x = puntoInicialx;
            posicion_y += separacion;
        }
        posicion_y = puntoInicialy;

    }

    public void setG(Graphics g) {
        this.g = g;
    }

    private void grosor() {
        switch (conexion.getTablero().getTamanio()) {
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
    }

    //Se comprueba que no se vaya a crear la misma linea
//    private boolean comprobarLinea(Linea lin) {
////        for (Linea l : lineasList) {
////            if (l.equals(lin)) {
////                JOptionPane.showMessageDialog(null, "Linea ya existente",
////                        "", JOptionPane.ERROR_MESSAGE);
////                return true;
////            }
////        }
////        return false;
//        //if()
//        
//        return conexion.compruebaLinea(lin, lineasList) ;
//    }
    //Se comprueba que no se hayan seleccionado dos veces el mismo punto
//    private boolean comprobarPunto() {
//        if (p1.equals(p2)) {
//            JOptionPane.showMessageDialog(null, "Seleccione dos puntos distintos",
//                    "", JOptionPane.ERROR_MESSAGE);
//            return true;
//        }
//        return false;
//    }
    public void dibujarLinea(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Control con = Control.getInstance();
        //Se comprueba que no se hayan seleccionado dos veces el mismo punto
        Cuadro cd;
        if (conexion.compruebaPunto(p1, p2)) {
            JOptionPane.showMessageDialog(null, "Seleccione dos puntos distintos",
                    "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (p1.getX() != p2.getX() && p1.getY() != p2.getY()) {
            JOptionPane.showMessageDialog(null, "Puntos seleccionados no válidos",
                    "", JOptionPane.ERROR_MESSAGE);
        } else if (p1.getY() == p2.getY()) {

            // Linea de izquierda a derecha
            Rectangle2D rec = new Rectangle2D.Double((p1.getX() + (p1.getWeidt() / 2)), ((p1.getY() + (p1.getWeidt() / 2)) - (grosor / 2)), conexion.getTablero().getSeparacion(), grosor);
            Linea linea = new Linea(p1, p2, grosor, conexion.getTablero().getSeparacion(), conexion.getJugador());
            if (!conexion.compruebaLinea(linea, lineasList)) {
                lineasList.add(linea);

                g2d.setColor(con.getJ4().getColor());
                g2d.fill(rec);
                cd = verificarCuadro(linea);

                if (cd != null) {
                    listCuadro.add(cd);
                    rec.setRect(cd.getSuperior().getP1().getX() + (p1.getWeidt() / 2), cd.getSuperior().getP1().getY() + (p1.getWeidt() / 2), conexion.getTablero().getSeparacion(), conexion.getTablero().getSeparacion());
                    g2d.setColor(con.getJ4().getColor());
                    g2d.fill(rec);
                    Cuadro cdDoble = verificaCuadroDoble(cd);
                    if (cdDoble != null) {
                        if (cdDoble.getSuperior() != null
                                && cdDoble.getInferior() != null
                                && cdDoble.getDer() != null
                                && cdDoble.getIzq() != null) {
                            System.out.println(cdDoble);
                            rec.setRect(cdDoble.getSuperior().getP1().getX() + (p1.getWeidt() / 2), cdDoble.getSuperior().getP1().getY() + (p1.getWeidt() / 2), conexion.getTablero().getSeparacion(), conexion.getTablero().getSeparacion());
                            g2d.setColor(con.getJ4().getColor());
                            g2d.fill(rec);

                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Linea ya existente",
                        "", JOptionPane.ERROR_MESSAGE);
            }

        } else {

            // Linea de arriba para abajo
            Rectangle2D rec = new Rectangle2D.Double((p1.getX() + (p1.getWeidt() / 2)), ((p1.getY() + (p1.getWeidt() / 2)) - (grosor / 2)), grosor, conexion.getTablero().getSeparacion());
             Linea linea = new Linea(p1, p2, grosor, conexion.getTablero().getSeparacion(), conexion.getJugador());
            if (!conexion.compruebaLinea(linea, lineasList)) {
                lineasList.add(linea);

                g2d.setColor(con.getJ4().getColor());
                g2d.fill(rec);
                cd = verificarCuadro(linea);
                if (cd != null) {
                    rec.setRect(cd.getSuperior().getP1().getX() + (p1.getWeidt() / 2), cd.getSuperior().getP1().getY() + (p1.getWeidt() / 2), conexion.getTablero().getSeparacion(), conexion.getTablero().getSeparacion());
                    g2d.setColor(con.getJ4().getColor());
                    g2d.fill(rec);
                    Cuadro cdDoble = verificaCuadroDoble(cd);
                    if (cdDoble != null) {
                        if (cdDoble.getSuperior() != null
                                && cdDoble.getInferior() != null
                                && cdDoble.getDer() != null
                                && cdDoble.getIzq() != null) {
                            System.out.println(cdDoble);
                            rec.setRect(cdDoble.getSuperior().getP1().getX() + (p1.getWeidt() / 2), cdDoble.getSuperior().getP1().getY() + (p1.getWeidt() / 2), conexion.getTablero().getSeparacion(), conexion.getTablero().getSeparacion());
                            g2d.setColor(con.getJ4().getColor());
                            g2d.fill(rec);

                        }
                    }

                }

            }else{
                JOptionPane.showMessageDialog(null, "Linea ya existente",
                        "", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public Cuadro verificarCuadro(Linea linea) {

        return conexion.verificarCuadro(linea, lineasList, conexion.getTablero());
    }

    public Cuadro verificaCuadroDoble(Cuadro cuadro) {
        return conexion.verificarCuadroDoble(cuadro, lineasList, conexion.getTablero());
    }

    private void ordenaPuntos() {
        if (p1.getX() == p2.getX()) {
            if (p1.getY() > p2.getY()) {
                Punto aux;
                aux = p1;
                p1 = p2;
                p2 = aux;
            }
        } else if (p1.getY() == p2.getY()) {
            if (p1.getX() > p2.getX()) {
                Punto aux;
                aux = p1;
                p1 = p2;
                p2 = aux;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(153, 153, 153));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (pulsacion == 1) {
            for (Punto punto : puntosList) {

                if (punto.getX() <= evt.getX()) {
                    if (punto.getY() <= evt.getY()) {
                        p1.setX(punto.getX());
                        p1.setY(punto.getY());
                        p1.setWeidt(punto.getWeidt());
                        p1.setHigh(punto.getHigh());
                    }
                }

            }
            pulsacion++;
        } else {

            for (Punto punto : puntosList) {

                if (punto.getX() <= evt.getX()) {
                    if (punto.getY() <= evt.getY()) {
                        p2.setX(punto.getX());
                        p2.setY(punto.getY());
                        p2.setWeidt(punto.getWeidt());
                        p2.setHigh(punto.getHigh());
                    }
                }

            }
            pulsacion--;
            ordenaPuntos();
            System.out.println(p1 + " - " + p2);
            this.dibujarLinea(this.getGraphics());
        }


    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
