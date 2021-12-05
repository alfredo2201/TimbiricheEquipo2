package modelo;

import Presentacion.FrmPrincipal;
import dominio.Jugador;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmPrincipal implements IObservable {

    private static ModeloFrmPrincipal instancia;
    private IObserver observadores;
    private Jugador jugador = new Jugador();
    private String mensaje;

    /**
     * Metodo que regresa la instancia de ModeloFrmPrincipal
     *
     * @return instancia ModeloFrmPrincipal
     */
    public static ModeloFrmPrincipal getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmPrincipal();
        }
        return instancia;
    }

    /**
     * Metodo que regresa el jugador
     *
     * @return Jugador jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Metodo que regresa el mensaje
     *
     * @return String mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Metodo que otorga un valor al string mensaje
     *
     * @param mensaje Valor que sera otorgado a mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        this.notificar();
    }
//
//    @Override
//    public void attach(IObserver observer) {
//        observadores = observer; 
////        observadores.add(observer);
//    }

    /**
     * Metodo que notifica al observador sobre cambios
     */
    @Override
    public void notificar() {
        observadores = FrmPrincipal.getInstance();
        observadores.update(this);
        //Segregación de interfaces
    }

}
