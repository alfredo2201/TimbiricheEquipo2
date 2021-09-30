/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class pnJuego extends javax.swing.JPanel {

    private final int tamanio;
    private ArrayList<Punto> puntosList = new ArrayList();
    private int pulsacion=1;
    Punto p1;
    Punto p2;
    public pnJuego(int tamanio) {
        initComponents();
        this.tamanio = tamanio;

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g);
        Punto punto;
        g2d.setPaint(Color.BLACK);

        int posicion_x = 15;
        int posicion_y = 15;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                Ellipse2D e1 = new Ellipse2D.Double(posicion_x, posicion_y, 15, 15);
                punto = new Punto(posicion_x, posicion_y, 15, 15);
                puntosList.add(punto);
                g2d.fill(e1);
                posicion_x += 50;

            }
            posicion_x = 15;
            posicion_y += 50;
        }
    }

    public void dibujarLinea() {
        for (Punto punto : puntosList) {
            
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
        if (pulsacion == 1 ) {
            p1 = new Punto(evt.getX(), evt.getY(), 15, 0);
            pulsacion++;
        }else{
            p2 = new Punto(evt.getX(), evt.getY(), 15, 0);
            pulsacion--;
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
