/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import dominio.Tablero;

public class CtrlTablero {
    private Tablero tablero;

    /**
     * Constructor que inicialisa el objeto tablero
     */
    public CtrlTablero() {
        this.tablero = new Tablero();
    }
    
    /**
     * Metodo que inicializa el tamanio del tablero
     * @param tamanio tamanio del tablero
     */
    public void setTamanio(int tamanio){
        tablero.setTamanio(tamanio);
    }

    /**
     * Metodo que te regresa un objeto tipo Tablero
     * @return 
     */
    public Tablero getTablero(){
        return this.tablero;
    }
    
}
