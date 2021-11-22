/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import dominio.Tablero;

/**
 *
 * @author Equipo Gatazo
 */
public class CtrlTablero {
    private Tablero tablero;

    public CtrlTablero() {
        this.tablero = new Tablero();
    }
    
    public void setTamanio(int tamanio){
        tablero.setTamanio(tamanio);
    }

    public Tablero getTablero(){
        return this.tablero;
    }
    
}
