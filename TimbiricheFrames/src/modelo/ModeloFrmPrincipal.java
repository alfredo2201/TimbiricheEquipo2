/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Presentacion.FrmPartida;
import java.util.ArrayList;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Angel
 */
public class ModeloFrmPrincipal implements IObservable{
    private ArrayList<IObserver> observadores;
    
    
    
    public void agregar(){
        observadores = new ArrayList<IObserver>();
    }
    
    public void cambiar(){
        notificar();
    }
    
    @Override
    public void notificar() {
        for(IObserver o : observadores){
            o.update();
        }
    }
    
}
