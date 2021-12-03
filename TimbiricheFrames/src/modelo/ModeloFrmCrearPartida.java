/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Presentacion.frmCrearPartida;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmCrearPartida implements IObservable{

    private static ModeloFrmCrearPartida instancia;
    private IObserver observador;
    private int[]tamanioTabla;
    private String[]listaIconos;

    
    public ModeloFrmCrearPartida() {
        this.tamanioTabla = new int[]{10, 20, 40};
        attach();
    }

    public int[] getTamanioTabla() {
        return tamanioTabla;
    }

    public String[] getListaIconos() {
        return listaIconos;
    } 
    
    public static ModeloFrmCrearPartida getInstance(){
        if (instancia==null) {
            instancia = new ModeloFrmCrearPartida();
        }
        return instancia;
    }

    @Override
    public void attach() {
        observador = frmCrearPartida.getInstance();
    }


    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
