/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import modelo.*;

/**
 *
 * @author Angel
 */
public interface IObserver <T>{
    public void update(T modelo);
//    public void update(ModeloFrmIcono modelo);
//    public void update(ModeloFrmPrincipal modelo);
//    public void update(ModeloFrmPartida modelo);
//    public void update(ModeloFrmCrearPartida modelo);
}
