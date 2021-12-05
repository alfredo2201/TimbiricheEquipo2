package control;

import Presentacion.frmCrearPartida;
import dominio.Partida;
import dominio.Tablero;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.ModeloFrmCrearPartida;

/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmCrearPartida {

    private static ControlFrmCrearPartida instance;
    private ControlFrmPartida ctlPartida = ControlFrmPartida.getInstance();
    private ControlFrmPrincipal ctlPrincipal = ControlFrmPrincipal.getInstance();
    private ModeloFrmCrearPartida modCrearPartida = ModeloFrmCrearPartida.getInstance();

    /**
     * Método para crea el deminio de partida
     *
     * @param tamanioTablero
     */
    public void crearPartida(int tamanioTablero) {
        Tablero tableroNuevo = new Tablero();
        tableroNuevo.setTamanio(tamanioTablero);
        Partida partida = new Partida();
        partida.setTablero(tableroNuevo);
        ctlPartida.crearPartida(partida);
    }

    /**
     * Método que despliega el frame de crear partida, para configurar la
     * partida y crearla
     */
    public void despliegaPantallaCrearPartida() {
        frmCrearPartida crearPartida = frmCrearPartida.getInstance();
        crearPartida.setVisible(true);
    }

    /**
     * Método para mostrar el frame de partida POR SI ACADO
     */
    /**
     * Método que muestra mensaje cuando haya algún error
     *
     * @param mensaje Mensaje que será desplegado
     */
    public void muestraMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método que regresa la instancia de esta clase
     *
     * @return instance Instancia de ControlFrmCrearPartida
     */
    public static ControlFrmCrearPartida getInstance() {
        if (instance == null) {
            instance = new ControlFrmCrearPartida();
        }
        return instance;
    }

    /**
     * Método que agrega los tamaños disponibles para el tablero.
     *
     * @param cmbTamanio La lista de selección para seleccionar el tamaño del
     * tablero
     */
    public void agregarTamanioLista(JComboBox<Integer> cmbTamanio) {
        for (int i = 0; i < modCrearPartida.getTamanioTabla().length; i++) {
            cmbTamanio.addItem(modCrearPartida.getTamanioTabla()[i]);
        }
    }

    public void cierraPantalla(JFrame frame) {
        ctlPrincipal.despliegaPantallaPrincipal();
        frame.dispose();
    }

}
