/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Presentacion.FrmPrincipal;
import dominio.Jugador;
import observador.*;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmPrincipal implements IObservable,IObserver {

    private static ModeloFrmPrincipal instancia;
    private IObserver observadores ;
    private Jugador jugador = new Jugador();
    private String mensaje;

    protected ModeloFrmPrincipal(){
        attach();
    }
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

    @Override
    public void attach() {
        observadores = FrmPrincipal.getInstance();
    }


    @Override
    public void notificar() {
        observadores.update(this);
        //Segregación de interfaces
    }

    @Override
    public void update(Object modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
}
