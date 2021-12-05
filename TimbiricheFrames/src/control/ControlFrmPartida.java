package control;

import Presentacion.FrmPartida;
import Presentacion.pnJuego;
import SocketCliente.SocketCliente;
import dominio.Partida;
import dominio.Tablero;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.ModeloFrmPartida;

/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmPartida {

    private static ControlFrmPartida instance;
    private ModeloFrmPartida modeloPartida;
    private FrmPartida frmPartida;
    private SocketCliente cliente;
    private Tablero tablero;

    /**
     * Constructor que inicialisa el SocketCliente
     */
    private ControlFrmPartida() {
        this.cliente = SocketCliente.getInstance();
    }

    /**
     * Metodo para actualiza rlos valores del lienzo
     *
     * @param lienzo Objeto JPanel con los valores con los que se actualizara el
     * lienzo
     * @return Lienzo con los cambios aplciados
     */
    public JPanel configurarLienzo(JPanel lienzo) {
        lienzo = new pnJuego(tablero);//se inicializa el lienzo
        lienzo.setLocation(200, 0); //se establece su posición
        lienzo.setSize(1010, 1010); //establece el tamaño del panel
        lienzo.setVisible(true);
        return lienzo;
    }

    /**
     * Metodo que regresa la instancia de ControlFrmPartida
     *
     * @return Instancia de ControlFrmPartida
     */
    public static ControlFrmPartida getInstance() {
        if (instance == null) {
            instance = new ControlFrmPartida();
        }
        return instance;
    }

    /**
     * Metodo que crea una partida enciandola al servidor
     *
     * @param partida Objeto partida con el que la partida sera creada
     */
    public void crearPartida(Partida partida) {
        this.tablero = partida.getTablero();
        modeloPartida = ModeloFrmPartida.getInstance();
        modeloPartida.crearPartida(partida);
        try {
            cliente.enviarAlServidor(partida);
        } catch (IOException ex) {
            Logger.getLogger(ControlFrmPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
        despliegaPantallaPartida();
    }

    /**
     * Método que despliega el frame de Partida Aquí se le agregó el parámetro
     */
    public void despliegaPantallaPartida() {
        modeloPartida = ModeloFrmPartida.getInstance();
        frmPartida = FrmPartida.getInstance();
        frmPartida.setVisible(true);
    }

    /**
     * Método que muestra la configuración de los contrincantes
     */
    public void muestraConfigurarContrincantes() {

    }

    /**
     * Metodo que muestra la partida con los jugadores
     */
    public void muestraPartida() {

    }

    /**
     * Método que valida la configuración del los usuarios
     *
     * @return true si se vaido con exito, false si no se acepto la validación
     */
    public boolean validaConfiguracion() {
        return true;
    }

    /**
     * Método que guarda la configuración de los usuarios
     */
    public void guardaConfiguracion() {

    }

    /**
     * Metodo que elimina la informacion del usuario de la pantalla
     */
    public void quitarInforamcionPantalla() {

    }

    /**
     * Metodo que borra los datos del jugador
     */
    public void borrarDatosJugador() {

    }

    /**
     * Metodo que confirma la selección de inicio del jugador
     */
    public void confirmarInicioJugador() {

    }

    /**
     * Metodo que muestra el frame Pantalla Principal
     */
    public void mostrarPantallaPrincipal() {

    }

    /**
     * Metodo que muestra la informacion de los jugadores de la partida
     */
    public void muestraInformacionJugadores() {

    }

    /**
     * Metodo que valida que una linea pueda ser dibujada
     *
     * @return True si es posible dibujar la linea, false si no es posible
     */
    public boolean validaLinea() {
        return true;
    }

    /**
     * Metodo que dibuja la linea en el tablero
     */
    public void dibujaLinea() {

    }

    /**
     * Metodo que valida que un cuadro pueda ser rellenado
     *
     * @return True si es posible rellenar el cuadro, false si no es posible
     */
    public boolean verificaCuadro() {
        return true;
    }

    /**
     * Metodo que dibuja la cuadro en el tablero
     */
    public void dibujaCuadro() {

    }

    /**
     * Metodo que verifica el numero de cuadros restantes
     *
     * @return True en caso de que queden cuadros, False si ya no quedan
     */
    public boolean validaNumeroCuadros() {
        return true;
    }

    /**
     * Metodo que reasigna el turno a otro jugador
     */
    public void cambiaTurno() {

    }

    /**
     * Metodo para actualizar los estados de la partida
     */
    public void actualizaEstado() {

    }

    /**
     * Metodo que despliega un mensaje
     */
    public void muestraMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Metodo que regresa la partida de modeloPartida
     *
     * @return Partoda de ModeloPartida
     */
    public Partida getPartida() {
        return modeloPartida.getPartida();
    }

    /**
     * Metodo que otorga un valor a la partida de ModeloPartida
     *
     * @param partida Partida que actualizara la partida de ModeloPartida
     */
    public void setPartida(Partida partida) {
        this.modeloPartida.setPartida(partida);
    }

    /**
     * Metodo que otorga un valor al mensaje de ModeloPartida
     *
     * @param mensaje Mensaje que actualizara el mensaje de ModeloPartida
     */
    public void setMensaje(String mensaje) {
        this.modeloPartida.setMensaje(mensaje);
    }

}
