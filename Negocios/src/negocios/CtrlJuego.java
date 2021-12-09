/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import dominio.Cuadro;
import dominio.Linea;
import dominio.Punto;
import dominio.Tablero;
import java.util.ArrayList;

/**
 *
 * @author Equipo Gatazo
 */
public class CtrlJuego {
    public CtrlJuego() {

    }

    public boolean compruebaLinea(Linea linea, ArrayList<Linea> lineasList) {

        for (Linea l : lineasList) {
            if (l.equals(linea)) {
//                JOptionPane.showMessageDialog(null, "Linea ya existente",
//                        "", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    public boolean compruebaPunto(Punto p1, Punto p2) {
        if (p1.equals(p2)) {
//            JOptionPane.showMessageDialog(null, "Seleccione dos puntos distintos",
//                    "", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    public Cuadro verificarCuadro(Linea linea, ArrayList<Linea> lineasList, Tablero tabla) {
        Cuadro cuadro = new Cuadro();
        //listaLineasPositivasHorizontales.add(linea);
        for (Linea line : lineasList) {
            // Si es linea superior
            if (linea.getP1().getX() == line.getP2().getX() && linea.getP1().getY() == line.getP2().getY() && linea.getP1().getX() - tabla.getSeparacion() == line.getP2().getX() && linea.getP2().getY() == line.getP1().getY()
                    || linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() - tabla.getSeparacion() == line.getP2().getY() && linea.getP1().getX() - tabla.getSeparacion() == line.getP1().getX() && linea.getP1().getY() == line.getP1().getY()
                    || linea.getP1().getX() == line.getP1().getX() && linea.getP1().getY() == line.getP1().getY() && linea.getP1().getX() + tabla.getSeparacion() == line.getP2().getX() && linea.getP1().getY() == line.getP2().getY()) {

                cuadro.setSuperior(line);
            }
            // Si es linea inferior 
            if (linea.getP1().getX() == line.getP1().getX() && linea.getP1().getY() + tabla.getSeparacion() == line.getP1().getY() && linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() + tabla.getSeparacion() == line.getP2().getY()
                    || linea.getP1().getX() == line.getP1().getX() && linea.getP1().getY() - tabla.getSeparacion() == line.getP1().getY() && linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() - tabla.getSeparacion() == line.getP2().getY()
                    || linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() == line.getP2().getY() && linea.getP2().getX() - tabla.getSeparacion() == line.getP1().getX() && linea.getP1().getY() == line.getP1().getY()
                    || linea.getP2().getX() == line.getP1().getX() && linea.getP2().getY() == line.getP1().getY() && linea.getP2().getX() + tabla.getSeparacion() == line.getP2().getX() && linea.getP1().getY() == line.getP1().getY()) {
                if (cuadro.getSuperior() != null && !cuadro.getSuperior().equals(line)) {
                    cuadro.setInferior(line);
                }
                if (cuadro.getInferior() == cuadro.getSuperior()) {
                    for (Linea ln1 : lineasList) {
                        if (linea.getP1().getX() == ln1.getP1().getX() && linea.getP1().getY() + tabla.getSeparacion() == ln1.getP1().getY() && linea.getP2().getX() == ln1.getP2().getX() && linea.getP2().getY() + tabla.getSeparacion() == ln1.getP2().getY()
                                || linea.getP1().getX() == ln1.getP1().getX() && linea.getP1().getY() - tabla.getSeparacion() == ln1.getP1().getY() && linea.getP2().getX() == ln1.getP2().getX() && linea.getP2().getY() - tabla.getSeparacion() == ln1.getP2().getY()
                                || linea.getP2().getX() == ln1.getP2().getX() && linea.getP2().getY() == ln1.getP2().getY() && linea.getP2().getX() - tabla.getSeparacion() == ln1.getP1().getX() && linea.getP2().getY() == ln1.getP1().getY()
                                || linea.getP2().getX() == ln1.getP1().getX() && linea.getP2().getY() == ln1.getP1().getY() && linea.getP2().getX() + tabla.getSeparacion() == ln1.getP2().getX() && linea.getP2().getY() == ln1.getP2().getY()) {
                            if (linea != ln1) {
                                cuadro.setInferior(ln1);
                            }

                        }
                    }
                }
            }

        }

        if (cuadro.getSuperior() != null && cuadro.getInferior() != null) {
            if (cuadro.getInferior().getP1().getY() < cuadro.getSuperior().getP1().getY()) {
                Linea aux = cuadro.getInferior();
                cuadro.setInferior(cuadro.getSuperior());
                cuadro.setSuperior(aux);
            }
            for (Linea lnl : lineasList) {

                if (lnl.getP1().getX() == cuadro.getSuperior().getP1().getX() && lnl.getP1().getY() == cuadro.getSuperior().getP1().getY()
                        && lnl.getP2().getX() == cuadro.getInferior().getP1().getX() && lnl.getP2().getY() == cuadro.getInferior().getP1().getY()) {
                    cuadro.setIzq(lnl);
                } else if (linea.getP1().getX() == cuadro.getSuperior().getP1().getX() && linea.getP1().getY() == cuadro.getSuperior().getP1().getY()
                        && linea.getP2().getX() == cuadro.getInferior().getP1().getX() && linea.getP2().getY() == cuadro.getInferior().getP1().getY()) {
                    if (cuadro.getIzq() == null) {
                        for (Linea ln2 : lineasList) {
                            if (ln2.getP1().getX() == cuadro.getSuperior().getP1().getX() && ln2.getP1().getY() == cuadro.getSuperior().getP1().getY()
                                    && ln2.getP2().getX() == cuadro.getInferior().getP1().getX() && ln2.getP2().getY() == cuadro.getInferior().getP1().getY()) {
                                cuadro.setIzq(ln2);
                            }
                        }
                    }
                    cuadro.setIzq(linea);
                }
                if (lnl.getP1().getX() == cuadro.getSuperior().getP2().getX() && lnl.getP1().getY() == cuadro.getSuperior().getP2().getY()
                        && lnl.getP2().getX() == cuadro.getInferior().getP2().getX() && lnl.getP2().getY() == cuadro.getInferior().getP2().getY()) {
                    cuadro.setDer(lnl);
                } else if (linea.getP1().getX() == cuadro.getSuperior().getP2().getX() && linea.getP1().getY() == cuadro.getSuperior().getP2().getY()
                        && linea.getP2().getX() == cuadro.getInferior().getP2().getX() && linea.getP2().getY() == cuadro.getInferior().getP2().getY()) {
                    cuadro.setDer(linea);
                }
            }
        }
        if (cuadro.getSuperior() != null & cuadro.getInferior() != null && cuadro.getIzq() != null && cuadro.getDer() != null) {
            if (cuadro.getSuperior().getP1().getX() == cuadro.getInferior().getP1().getX()
                    && cuadro.getSuperior().getP1().getY() + tabla.getSeparacion() == cuadro.getInferior().getP1().getY()
                    && cuadro.getSuperior().getP2().getX() == cuadro.getInferior().getP2().getX()
                    && cuadro.getSuperior().getP2().getY() + tabla.getSeparacion() == cuadro.getInferior().getP2().getY()) {
                if (cuadro.getIzq().getP1().getX() + tabla.getSeparacion() == cuadro.getDer().getP1().getX()
                        && cuadro.getIzq().getP1().getY() == cuadro.getDer().getP1().getY()
                        && cuadro.getIzq().getP2().getX() + tabla.getSeparacion() == cuadro.getDer().getP2().getX()
                        && cuadro.getIzq().getP2().getY() == cuadro.getDer().getP2().getY()) {
                    return cuadro;
                }

            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("S: " + cuadro.getSuperior() + "< - > I: " + cuadro.getInferior() + "\nIzq: " + cuadro.getIzq() + " < - > Der:" + cuadro.getDer() + "\n");

        return null;
    }

    public Cuadro verificarCuadroDoble(Cuadro cuadro, ArrayList<Linea> lineasList, Tablero tabla) {
        for (Linea line : lineasList) {
            if (cuadro.getSuperior().getP1().getY() - tabla.getSeparacion() == line.getP1().getY() && cuadro.getSuperior().getP1().getX() == line.getP1().getX()
                    && cuadro.getSuperior().getP2().getY() - tabla.getSeparacion() == line.getP2().getY() && cuadro.getSuperior().getP2().getX() == line.getP2().getX()) {
                return verificarCuadro(line, lineasList, tabla);
            } else if (cuadro.getInferior().getP1().getY() + tabla.getSeparacion() == line.getP1().getY() && cuadro.getInferior().getP1().getX() == line.getP1().getX()
                    && cuadro.getInferior().getP2().getY() + tabla.getSeparacion() == line.getP2().getY() && cuadro.getInferior().getP2().getX() == line.getP2().getX()) {
                return verificarCuadro(line, lineasList, tabla);
            } else if (cuadro.getIzq().getP1().getX() - tabla.getSeparacion() == line.getP1().getX() && cuadro.getIzq().getP1().getY() == line.getP1().getY()
                    && cuadro.getIzq().getP2().getX() - tabla.getSeparacion() == line.getP2().getX() && cuadro.getIzq().getP2().getY() == line.getP2().getY()) {
                return verificarCuadro(line, lineasList, tabla);
            } else if (cuadro.getDer().getP1().getX() + tabla.getSeparacion() == line.getP1().getX() && cuadro.getDer().getP1().getY() == line.getP1().getY()
                    && cuadro.getDer().getP2().getX() + tabla.getSeparacion() == line.getP2().getX() && cuadro.getDer().getP2().getY() == line.getP2().getY()) {
                return verificarCuadro(line, lineasList, tabla);
            }
        }
        return null;
    }
}
