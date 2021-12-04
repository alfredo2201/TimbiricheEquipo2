/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dominio.Partida;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo Gatazo
 */
public class ModeloFrmPartida implements IObservable,IObserver{
    private static ModeloFrmPartida instancia;
    private Partida partida;
    private String mensaje;
    private IObserver observador;

    
    public Partida getPartida() {
        return partida;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
        this.notificar();
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        this.notificar();
    }
    
    
    
    public static ModeloFrmPartida getInstance(){
        if (instancia==null) {
            instancia = new ModeloFrmPartida();
        }
        return instancia;
    }
    
//        @Override
//    public void attach(IObserver observer) {
//        this.observador = observer;
//    }


    @Override
    public void notificar() {
        this.observador.update(this);
    }

    @Override
    public void update(Object modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
