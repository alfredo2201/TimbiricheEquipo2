/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Control.Punto;
import Control.Tablero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class pnJuego extends javax.swing.JPanel {

    private final int tamanio;
    private final ArrayList<Punto> puntosList = new ArrayList();
    private final int separacion;
    private int pulsacion = 1;
    private int posicion_x;
    private int posicion_y;
    private int w;
    private int h;
    private Punto p1;
    private Punto p2;
    private Graphics g;
    private Tablero tabla;
    private int grosor;

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
        this.tabla = tablero;
        grosor();
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
        switch (tabla.getTamanio()) {
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

    public void dibujarLinea(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if (p1.getY() == p2.getY()) {
            if (p1.getX() > p2.getX()) {
                Rectangle2D rec = new Rectangle2D.Double((p2.getX() + (p2.getWeidt() / 2)), ((p2.getY() + (p2.getWeidt() / 2)) - (grosor / 2)), tabla.getSeparacion(), grosor);
                g2d.setColor(Color.MAGENTA);
                g2d.fill(rec);
            } else {
                //                                       x   y  ancho altura
                Rectangle2D rec = new Rectangle2D.Double((p1.getX() + (p1.getWeidt() / 2)), ((p1.getY() + (p1.getWeidt() / 2)) - (grosor / 2)), tabla.getSeparacion(), grosor);
                g2d.setColor(Color.green);
                g2d.fill(rec);
            }
        } else {
            if (p1.getY() > p2.getY()) {
                //                                       x   y  ancho altura
                Rectangle2D rec = new Rectangle2D.Double((p2.getX() + (p2.getWeidt() / 2)), ((p2.getY() + (p2.getWeidt() / 2)) - (grosor / 2)), grosor, tabla.getSeparacion());
                g2d.setColor(Color.red);
                g2d.fill(rec);
            } else {
                Rectangle2D rec = new Rectangle2D.Double((p1.getX() + (p1.getWeidt() / 2)), ((p1.getY() + (p1.getWeidt() / 2)) - (grosor / 2)), grosor, tabla.getSeparacion());
                g2d.setColor(Color.blue);
                g2d.fill(rec);
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
            System.out.println("Turno");
            System.out.println("P1: " + p1.toString());
            System.out.println("P2: " + p2.toString());
            this.dibujarLinea(this.getGraphics());
        }


    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
