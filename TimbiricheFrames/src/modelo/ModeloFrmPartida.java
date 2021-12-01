/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dominio.Partida;
import java.util.Observer;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo Gatazo
 */
public class ModeloFrmPartida implements IObservable{
    private static ModeloFrmPartida instancia;
    private Partida partida;
    private String mensaje;

    @Override
    public void attach(IObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void detach(IObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Partida getPartida() {
        return partida;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    public static ModeloFrmPartida getInstance(){
        if (instancia==null) {
            instancia = new ModeloFrmPartida();
        }
        return instancia;
    }

}
