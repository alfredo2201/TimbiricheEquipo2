package Presentacion;

import control.ControlFrmPartida;
import dominio.Cuadro;
import dominio.Linea;
import dominio.Punto;
import dominio.Tablero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
/**
 *
 * @author Equipo gatazo
 */
public class pnJuego extends javax.swing.JPanel {

    private final int tamanio;
    private final ArrayList<Punto> puntosList = new ArrayList();
    private final ArrayList<Cuadro> listCuadro = new ArrayList();
    private final int separacion;
    private int pulsacion = 1;
    private int posicion_x;
    private int posicion_y;
    private final int radio;
    private Punto p1;
    private Punto p2;
    private Graphics g;
    private int grosor;
    private final ArrayList<Linea> lineasList;
    
    private ControlFrmPartida ctrlPartida;

    public pnJuego(Tablero tablero) {
        initComponents();
        this.tamanio = tablero.getTamanio();
        this.separacion = tablero.getSeparacion();
        this.posicion_x = tablero.getPuntos().getX();
        this.posicion_y = tablero.getPuntos().getY();
        this.radio = tablero.getPuntos().getRadio();
        this.lineasList = new ArrayList<>();        
    }

    /**
     * Dibuja los puntos en la tabla
     *
     * @param g Graphics
     */
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
                Ellipse2D e1 = new Ellipse2D.Double(posicion_x, posicion_y, radio, radio);
                punto = new Punto(posicion_x, posicion_y, radio);
                puntosList.add(punto);
                g2d.fill(e1);
                posicion_x += separacion;
            }
            posicion_x = puntoInicialx;
            posicion_y += separacion;
        }
        posicion_y = puntoInicialy;
            
    }

    /**
     * Asigna el valor de Graphics
     *
     * @param g Valor que tendrá Graphics
     */
    public void setG(Graphics g) {
        this.g = g;
    }

    public ArrayList<Punto> getPuntosList() {
        return puntosList;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
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
        ctrlPartida = ControlFrmPartida.getInstance();        
        if (pulsacion == 1) {
            ctrlPartida.agregaPuntos(this, pulsacion, evt);
            pulsacion++;
        } else {
            ctrlPartida.agregaPuntos(this, pulsacion, evt);
            pulsacion--;
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
