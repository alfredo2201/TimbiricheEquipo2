package modelo;

import Presentacion.FrmPartida;
import dominio.Partida;
import observador.IObservable;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class ModeloFrmPartida implements IObservable, IObserver<Partida> {

    private static ModeloFrmPartida instancia = null;
    private Partida partida = null;
    private String mensaje;
    private IObserver observador;

    /**
     * Constructor que inicializa el observador
     */
    private ModeloFrmPartida() {
        observador = FrmPartida.getInstance();
    }

    /**
     * Metodo que regresa la partida del modelo
     *
     * @return partida del modelo
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     * Metodo que regresa un String con el mensaje
     *
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Metodo para crear una nueva partida
     *
     * @param partida Partida que será creada
     */
    public void crearPartida(Partida partida) {
        this.partida = partida;
    }

    /**
     * Metodo que otorga un valor a la partida y notifica al observador
     *
     * @param partida Valor que será otorgado a partida
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
        
        this.notificar();
    }

    /**
     * Metodo que otorga un valor al mensaje y notifica al observador
     *
     * @param mensaje Valor que será otorgado a mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        this.notificar();
    }

    /**
     * Metodo que regresa la instancia de ModeloFrmPartida
     *
     * @return instancia ModeloFrmPartida
     */
    public static ModeloFrmPartida getInstance() {
        if (instancia == null) {
            instancia = new ModeloFrmPartida();
        }
        return instancia;
    }

    /**
     * Metodo que otorga un valor al observador
     *
     * @param observer Valior que obrtendra el observador
     */
    public void attach(IObserver observer) {
        this.observador = observer;
    }

    /**
     * Metodo que notifica sobre cambios al observador
     */
    @Override
    public void notificar() {
        observador = FrmPartida.getInstance();
        this.observador.update(this);
    }

    /**
     * Metodo que actualiza la paritda
     *
     * @param partida Partida con la que será actualizada
     */
    @Override
    public void update(Partida partida) {
        this.setPartida(partida);
    }

}
