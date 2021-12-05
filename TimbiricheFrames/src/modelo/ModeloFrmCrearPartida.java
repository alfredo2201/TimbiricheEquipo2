package modelo;

import observador.IObservable;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmCrearPartida implements IObservable {

    private static ModeloFrmCrearPartida instancia;
    private int[] tamanioTabla;
    private String[] listaIconos;

    /**
     * Constructor que da los valores de la tabla al arreglo tamanioTabla
     */
    public ModeloFrmCrearPartida() {
        this.tamanioTabla = new int[]{10, 20, 40};
    }

    /**
     * Metodo que regresa el array con los tamanios de la tabla
     *
     * @return tamanioTable con los int de los tamanios
     */
    public int[] getTamanioTabla() {
        return tamanioTabla;
    }

    /**
     * Metodo que regresa el array con los Strings de los iconos
     *
     * @return listaIconos con Strings de iconos
     */
    public String[] getListaIconos() {
        return listaIconos;
    }

    /**
     * Metodo que regresa la instancia de ModeloFrmCrearPartida
     *
     * @return instancia de ModeloFrmCrearPartida
     */
    public static ModeloFrmCrearPartida getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmCrearPartida();
        }
        return instancia;
    }

//    @Override
//    public void attach(IObserver observer) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void detach(IObserver observer) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    /**
     * Metodo que notifica al observador
     */
    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
