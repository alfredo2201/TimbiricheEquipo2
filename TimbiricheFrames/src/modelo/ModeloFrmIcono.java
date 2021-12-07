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

    private ArrayList<String> iconos = new ArrayList<>();
    private IObserver observer = FrmIconos.getInstance();
    private static ModeloFrmIcono instancia;

    /**
     * Constructor que añade los iconos al ArrayList de iconos
     */
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

    /**
     * Metodo que notifica al observer sobre cambios
     */
    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que regresa el ArrayList de String que contiene los iconos
     *
     * @return ArrayList con Strings de iconos
     */
    public ArrayList<String> getIconos() {
        return iconos;
    }

    /**
     * Metodo que agrega un valor al array de iconos
     *
     * @param iconos Icono que será añadido al ArrayList de iconos
     */
    public void setIconos(String iconos) {
        this.iconos.add(iconos);
    }

    /**
     * Metodo que regresa la instancia de ModeloFrmIcono
     *
     * @return instancia de ModeloFrmIcono
     */
    public static ModeloFrmIcono getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmIcono();
        }
        return instancia;
    }

}
