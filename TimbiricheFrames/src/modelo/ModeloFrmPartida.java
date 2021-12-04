/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Presentacion.FrmPartida;
import dominio.Partida;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo Gatazo
 */
public class ModeloFrmPartida implements IObservable, IObserver<Partida> {

    private static ModeloFrmPartida instancia;
    private Partida partida = null;
    private String mensaje;
    private IObserver observador;

    public Partida getPartida() {
        return partida;
    }

    public String getMensaje() {
        return mensaje;
    }
    public void crearPartida(Partida partida){
        this.partida = partida;
    }
    public void setPartida(Partida partida) {
        this.partida = partida;
        this.notificar();
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        this.notificar();
    }

    public static ModeloFrmPartida getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmPartida();
        }
        return instancia;
    }

    @Override
    public void notificar() {
        this.observador.update(this);
    }

    @Override
    public void update(Partida partida) {
        this.setPartida(partida);
        notificar();
    }

}
