/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dominio.Jugador;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmPrincipal implements IObservable{

    private static ModeloFrmPrincipal instancia;
    private IObserver observadores;
    private Jugador jugador = new Jugador();
    private String mensaje;

    public static ModeloFrmPrincipal getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmPrincipal();
        }
        return instancia;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        this.notificar();
    }
//
//    @Override
//    public void attach(IObserver observer) {
//        observadores = observer; 
////        observadores.add(observer);
//    }


    @Override
    public void notificar() {
        observadores.update(this);
        //Segregación de interfaces
    }


    
    

    

}
