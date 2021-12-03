/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Presentacion.FrmIconos;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmIcono implements IObservable,IObserver {

    private static ModeloFrmIcono instancia;
    private IObserver observador;

    public ModeloFrmIcono() {
        attach();
    }
    @Override
    public void attach() {
        observador = FrmIconos.getInstance();
    }

    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ModeloFrmIcono getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmIcono();
        }
        return instancia;
    }

    @Override
    public void update(Object modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
