/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dominio.Jugador;
import java.util.ArrayList;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmPrincipal implements IObservable {

    private static ModeloFrmPrincipal instancia;
    private ArrayList<IObserver> observadores;
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
    }
    
    
    
    @Override
    public void attach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void detach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificar() {
        for (IObserver o : observadores) {
            
        }
    }
    

}
