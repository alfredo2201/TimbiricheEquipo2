/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Observer;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmIcono implements IObservable {

    private ModeloFrmIcono instancia;

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
    
    public ModeloFrmIcono getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmIcono();
        }
        return instancia;
    }


}
