/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import observador.IObservable;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmIcono implements IObservable {

    private ModeloFrmIcono instancia;

    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void detach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ModeloFrmIcono getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmIcono();
        }
        return instancia;
    }
}
