/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Control.Control;
import Control.Cuadro;
import Control.Linea;
import Control.Punto;
import Control.Tablero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    private Tablero tabla;
    private int grosor;
    private Control control;
    private ArrayList<Linea> lineasList;

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

    //Se comprueba que no se vaya a crear la misma linea
    private boolean comprobarLinea(Linea lin) {
        for (Linea l : lineasList) {
            if (l.equals(lin)) {
                JOptionPane.showMessageDialog(null, "Linea ya existente",
                        "", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    //Se comprueba que no se hayan seleccionado dos veces el mismo punto
    private boolean comprobarPunto() {
        if (p1.equals(p2)) {
            JOptionPane.showMessageDialog(null, "Seleccione dos puntos distintos",
                    "", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    public void dibujarLinea(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Control con = Control.getInstance();
        //Se comprueba que no se hayan seleccionado dos veces el mismo punto
        Cuadro cd;
        if (comprobarPunto()) {
            return;
        }

        if (p1.getX() != p2.getX() && p1.getY() != p2.getY()) {
            JOptionPane.showMessageDialog(null, "Puntos seleccionados no válidos",
                    "", JOptionPane.ERROR_MESSAGE);
        } else if (p1.getY() == p2.getY()) {

            // Linea de izquierda a derecha
            Rectangle2D rec = new Rectangle2D.Double((p1.getX() + (p1.getWeidt() / 2)), ((p1.getY() + (p1.getWeidt() / 2)) - (grosor / 2)), tabla.getSeparacion(), grosor);
            Linea linea = new Linea(p1.getX(), p1.getY(), p2.getX(), p2.getY(), grosor, tabla.getSeparacion(), control.getJ4());
            if (!comprobarLinea(linea)) {
                lineasList.add(linea);

                g2d.setColor(con.getJ4().getColor());
                g2d.fill(rec);
                cd = verificarCuadro(linea);

                if (cd !=null) {
                    listCuadro.add(cd);
                    rec.setRect(cd.getSuperior().getX() + (p1.getWeidt() / 2), cd.getSuperior().getY() + (p1.getWeidt() / 2), tabla.getSeparacion(), tabla.getSeparacion());
                    g2d.setColor(con.getJ4().getColor());
                    g2d.fill(rec);
                    Cuadro cdDoble = verificaCuadroDoble(cd);
                    if (cdDoble != null) {
                        if (cdDoble.getSuperior() != null
                                && cdDoble.getInferior() != null
                                && cdDoble.getDer() != null
                                && cdDoble.getIzq() != null) {
                            System.out.println(cdDoble);
                            rec.setRect(cdDoble.getSuperior().getX() + (p1.getWeidt() / 2), cdDoble.getSuperior().getY() + (p1.getWeidt() / 2), tabla.getSeparacion(), tabla.getSeparacion());
                            g2d.setColor(con.getJ4().getColor());
                            g2d.fill(rec);

                        }
                    }
                }
            }

        } else {

            // Linea de arriba para abajo
            Rectangle2D rec = new Rectangle2D.Double((p1.getX() + (p1.getWeidt() / 2)), ((p1.getY() + (p1.getWeidt() / 2)) - (grosor / 2)), grosor, tabla.getSeparacion());
            Linea linea = new Linea(p1.getX(), p1.getY(), p2.getX(), p2.getY(), grosor, tabla.getSeparacion(), control.getJ4());
            if (!comprobarLinea(linea)) {
                lineasList.add(linea);

                g2d.setColor(con.getJ4().getColor());
                g2d.fill(rec);
                cd = verificarCuadro(linea);
                if (cd !=null) {
                    rec.setRect(cd.getSuperior().getX() + (p1.getWeidt() / 2), cd.getSuperior().getY() + (p1.getWeidt() / 2), tabla.getSeparacion(), tabla.getSeparacion());
                    g2d.setColor(con.getJ4().getColor());
                    g2d.fill(rec);
                    Cuadro cdDoble = verificaCuadroDoble(cd);
                    if (cdDoble != null) {
                        if (cdDoble.getSuperior() != null
                                && cdDoble.getInferior() != null
                                && cdDoble.getDer() != null
                                && cdDoble.getIzq() != null) {
                            System.out.println(cdDoble);
                            rec.setRect(cdDoble.getSuperior().getX() + (p1.getWeidt() / 2), cdDoble.getSuperior().getY() + (p1.getWeidt() / 2), tabla.getSeparacion(), tabla.getSeparacion());
                            g2d.setColor(con.getJ4().getColor());
                            g2d.fill(rec);

                        }
                    }

                }

            }
        }

    }

    public Cuadro verificarCuadro(Linea linea) {

        Cuadro cuadro = new Cuadro();
        //listaLineasPositivasHorizontales.add(linea);
        for (Linea line : lineasList) {
            // Si es linea superior
            if (linea.getX() == line.getX2() && linea.getY() == line.getY2() && linea.getX() - tabla.getSeparacion() == line.getX2() && linea.getY2() == line.getY()
                    || linea.getX2() == line.getX2() && linea.getY2() - tabla.getSeparacion() == line.getY2() && linea.getX() - tabla.getSeparacion() == line.getX() && linea.getY() == line.getY()
                    || linea.getX() == line.getX() && linea.getY() == line.getY() && linea.getX() + tabla.getSeparacion() == line.getX2() && linea.getY() == line.getY2()) {

                cuadro.setSuperior(line);
            }
            // Si es linea inferior 
            if (linea.getX() == line.getX() && linea.getY() + tabla.getSeparacion() == line.getY() && linea.getX2() == line.getX2() && linea.getY2() + tabla.getSeparacion() == line.getY2()
                    || linea.getX() == line.getX() && linea.getY() - tabla.getSeparacion() == line.getY() && linea.getX2() == line.getX2() && linea.getY2() - tabla.getSeparacion() == line.getY2()
                    || linea.getX2() == line.getX2() && linea.getY2() == line.getY2() && linea.getX2() - tabla.getSeparacion() == line.getX() && linea.getY2() == line.getY()
                    || linea.getX2() == line.getX() && linea.getY2() == line.getY() && linea.getX2() + tabla.getSeparacion() == line.getX2() && linea.getY2() == line.getY2()
                    ) {
                if (cuadro.getSuperior() != null && !cuadro.getSuperior().equals(line)) {
                    cuadro.setInferior(line);
                }
                if (cuadro.getInferior() == cuadro.getSuperior()) {
                    for (Linea ln1 : lineasList) {
                        if (linea.getX() == ln1.getX() && linea.getY() + tabla.getSeparacion() == ln1.getY() && linea.getX2() == ln1.getX2() && linea.getY2() + tabla.getSeparacion() == ln1.getY2()
                                || linea.getX() == ln1.getX() && linea.getY() - tabla.getSeparacion() == ln1.getY() && linea.getX2() == ln1.getX2() && linea.getY2() - tabla.getSeparacion() == ln1.getY2()
                                || linea.getX2() == ln1.getX2() && linea.getY2() == ln1.getY2() && linea.getX2() - tabla.getSeparacion() == ln1.getX() && linea.getY2() == ln1.getY()
                                || linea.getX2() == ln1.getX() && linea.getY2() == ln1.getY() && linea.getX2() + tabla.getSeparacion() == ln1.getX2() && linea.getY2() == ln1.getY2()) {
                            if (linea != ln1) {
                                cuadro.setInferior(ln1);
                            }

                        }
                    }
                }
            }

        }

        if (cuadro.getSuperior() != null && cuadro.getInferior() != null) {
            if (cuadro.getInferior().getY() < cuadro.getSuperior().getY()) {
                Linea aux = cuadro.getInferior();
                cuadro.setInferior(cuadro.getSuperior());
                cuadro.setSuperior(aux);
            }
            for (Linea lnl : lineasList) {

                if (lnl.getX() == cuadro.getSuperior().getX() && lnl.getY() == cuadro.getSuperior().getY()
                        && lnl.getX2() == cuadro.getInferior().getX() && lnl.getY2() == cuadro.getInferior().getY()) {
                    cuadro.setIzq(lnl);
                } else if (linea.getX() == cuadro.getSuperior().getX() && linea.getY() == cuadro.getSuperior().getY()
                        && linea.getX2() == cuadro.getInferior().getX() && linea.getY2() == cuadro.getInferior().getY()) {
                    if (cuadro.getIzq() == null) {
                        for (Linea ln2 : lineasList) {
                            if (ln2.getX() == cuadro.getSuperior().getX() && ln2.getY() == cuadro.getSuperior().getY()
                                    && ln2.getX2() == cuadro.getInferior().getX() && ln2.getY2() == cuadro.getInferior().getY()) {
                                cuadro.setIzq(ln2);
                            }
                        }
                    }
                    cuadro.setIzq(linea);
                }
                if (lnl.getX() == cuadro.getSuperior().getX2() && lnl.getY() == cuadro.getSuperior().getY2()
                        && lnl.getX2() == cuadro.getInferior().getX2() && lnl.getY2() == cuadro.getInferior().getY2()) {
                    cuadro.setDer(lnl);
                } else if (linea.getX() == cuadro.getSuperior().getX2() && linea.getY() == cuadro.getSuperior().getY2()
                        && linea.getX2() == cuadro.getInferior().getX2() && linea.getY2() == cuadro.getInferior().getY2()) {
                    cuadro.setDer(linea);
                }
            }
        }
        if (cuadro.getSuperior() != null & cuadro.getInferior() != null && cuadro.getIzq() != null && cuadro.getDer() != null) {
            if (cuadro.getSuperior().getX() == cuadro.getInferior().getX()
                    && cuadro.getSuperior().getY() + tabla.getSeparacion() == cuadro.getInferior().getY()
                    && cuadro.getSuperior().getX2() == cuadro.getInferior().getX2()
                    && cuadro.getSuperior().getY2() + tabla.getSeparacion() == cuadro.getInferior().getY2()) {
                if (cuadro.getIzq().getX() + tabla.getSeparacion() == cuadro.getDer().getX()
                        && cuadro.getIzq().getY() == cuadro.getDer().getY()
                        && cuadro.getIzq().getX2() + tabla.getSeparacion() == cuadro.getDer().getX2()
                        && cuadro.getIzq().getY2() == cuadro.getDer().getY2()) {
                    return cuadro;
                }

            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("S: " + cuadro.getSuperior() + "< - > I: " + cuadro.getInferior() + "\nIzq: " + cuadro.getIzq() + " < - > Der:" + cuadro.getDer() + "\n");

        return null;
    }

    public Cuadro verificaCuadroDoble(Cuadro cuadro) {
        for (Linea line : lineasList) {
            if (cuadro.getSuperior().getY() - tabla.getSeparacion() == line.getY() && cuadro.getSuperior().getX() == line.getX()
                    && cuadro.getSuperior().getY2() - tabla.getSeparacion() == line.getY2() && cuadro.getSuperior().getX2() == line.getX2()) {
                return verificarCuadro(line);
            } else if (cuadro.getInferior().getY() + tabla.getSeparacion() == line.getY() && cuadro.getInferior().getX() == line.getX()
                    && cuadro.getInferior().getY2() + tabla.getSeparacion() == line.getY2() && cuadro.getInferior().getX2() == line.getX2()) {
                return verificarCuadro(line);
            } else if (cuadro.getIzq().getX() - tabla.getSeparacion() == line.getX() && cuadro.getIzq().getY() == line.getY()
                    && cuadro.getIzq().getX2() - tabla.getSeparacion() == line.getX2() && cuadro.getIzq().getY2() == line.getY2()) {
                return verificarCuadro(line);
            } else if (cuadro.getDer().getX() + tabla.getSeparacion() == line.getX() && cuadro.getDer().getY() == line.getY()
                    && cuadro.getDer().getX2() + tabla.getSeparacion() == line.getX2() && cuadro.getDer().getY2() == line.getY2()) {
                return verificarCuadro(line);
            }
        }
        return null;
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
