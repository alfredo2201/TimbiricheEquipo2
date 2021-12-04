/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Presentacion.FrmIconos;
import java.util.ArrayList;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmIcono implements IObservable {

    private ArrayList<String>iconos = new ArrayList<>();
    private IObserver observer = FrmIconos.getInstance();
    
    private static ModeloFrmIcono instancia;

    public ModeloFrmIcono() {
        iconos.add("/img/btnIcono4.png");
        iconos.add("/img/btnIcono1.png");
        iconos.add("/img/btnIcono2.png");
        iconos.add("/img/btnIcono3.png");
        iconos.add("/img/btnIcono8.png");
        iconos.add("/img/btnIcono5.png");
        iconos.add("/img/btnIcono6.png");
        iconos.add("/img/btnIcono7.png");
    }
    
    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<String> getIconos() {
        return iconos;
    }

    public void setIconos(String iconos) {
        this.iconos.add(iconos);
    }
    
    
    
    public static ModeloFrmIcono getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmIcono();
        }
        return instancia;
    }

}
