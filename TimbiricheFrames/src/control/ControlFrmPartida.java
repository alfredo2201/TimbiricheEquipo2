package control;

import Presentacion.FrmPartida;
import Presentacion.FrmPrincipal;
import Presentacion.pnJuego;
import SocketCliente.SocketCliente;
import dominio.Estados;
import dominio.Jugador;
import dominio.Partida;
import dominio.Punto;
import dominio.Tablero;
import forma.Linea;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    private ControlFrmPrincipal ctlPrincipal;
    private SocketCliente cliente;
    private Tablero tablero;

    /**
     * Constructor que inicialisa el SocketCliente
     */
    private ControlFrmPartida() {
        this.cliente = SocketCliente.getInstance();
    }

    public void setModeloPartida(ModeloFrmPartida modeloPartida) {
        this.modeloPartida = modeloPartida;
    }

    public void boton(JButton btnComenzarPartida, boolean tipoJugador) {
        if (tipoJugador == false) {
            btnComenzarPartida.setEnabled(false);
            
        } else {
            btnComenzarPartida.setEnabled(true);
            Jugador ju = ctlPrincipal.getJugador();
            
            for(Jugador jugador : modeloPartida.getPartida().getJugadores()){
                if(ju.equals(jugador)){
                    jugador.setIniciar(true);
                    break;
                }
            }
            
            try{
                cliente.enviarAlServidor(modeloPartida.getPartida());
            }catch(Exception e){
                System.out.println("uwu");
            }
            
        }
    }


    /**
     * Metodo para actualiza rlos valores del lienzo
     *
     * @param lienzo Objeto JPanel con los valores con los que se actualizara el
     * lienzo
     * @return Lienzo con los cambios aplciados
     */
    public JPanel configurarLienzo(JPanel lienzo) {
        modeloPartida = ModeloFrmPartida.getInstance();
        
        if (tablero != null) {
            lienzo = new pnJuego(tablero);//se inicializa el lienzo
            lienzo.setLocation(200, 0); //se establece su posición
            lienzo.setSize(1010, 1010); //establece el tamaño del panel
            lienzo.setVisible(false);
            lienzo.setEnabled(false);
            return lienzo;
        } else if (modeloPartida.getPartida() != null) {
            lienzo = new pnJuego(modeloPartida.getPartida().getTablero());//se inicializa el lienzo
            lienzo.setLocation(200, 0); //se establece su posición
            lienzo.setSize(1010, 1010); //establece el tamaño del panel
            lienzo.setVisible(false);
            lienzo.setEnabled(false);
            return lienzo;
        }
        return null;
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
        frmPartida.setExtendedState(MAXIMIZED_BOTH);
        frmPartida.setLienzo(configurarLienzo(frmPartida.getLienzo()));
        frmPartida.add(frmPartida.getLienzo()); //se agrega al frame principal
        frmPartida.pack();
        frmPartida.setG(frmPartida.getLienzo().getGraphics());
        frmPartida.setResizable(false);
        frmPartida.getLienzo().setEnabled(false);
        muestraInformacionJugadores(frmPartida);
    }

    /**
     * Método que muestra la configuración de los contrincantes
     *
     * @param label nombre del jugador
     * @param frame frame en uso
     * @param jugador número de identificación del jugador
     */
    public void muestraConfigurarContrincantes(JLabel label, JFrame frame, int jugador) {
        Color c = JColorChooser.showDialog(frame, "Color de jugador", Color.white);
        if (c != null) {
            Jugador j = modeloPartida.getPartida().getJugadores().get(jugador);
            if (j != null) {
                j.setColor(c);
                label.setForeground(c);
            }
        }
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
    public void quitarInformacionPantalla() {

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
        FrmPrincipal pr = FrmPrincipal.getInstance();
        pr.setVisible(true);
        frmPartida.getInstance().dispose();
    }

    /**
     * Metodo que muestra la informacion de los jugadores de la partida
     *
     * @param frmPartida
     */
    public void muestraInformacionJugadores(FrmPartida frmPartida) {
        if (modeloPartida != null) {
            int iterar = 0;
            for (Jugador jugador : modeloPartida.getPartida().getJugadores()) {
                switch (iterar) {
                    case 0:
                        frmPartida.setLblIconoJugador1(jugador.getAvatar());
                        frmPartida.setLblNombreJugador1(jugador.getNombre());
                        iterar++;
                        break;
                    case 1:
                        frmPartida.setLblIconoJugador2(jugador.getAvatar());
                        frmPartida.setLblNombreJugador2(jugador.getNombre());
                        iterar++;
                        break;
                    case 2:
                        frmPartida.setLblIconoJugador3(jugador.getAvatar());
                        frmPartida.setLblNombreJugador3(jugador.getNombre());
                        iterar++;
                        break;
                    case 3:
                        frmPartida.setLblIconoJugador4(jugador.getAvatar());
                        frmPartida.setLblNombreJugador4(jugador.getNombre());
                        iterar++;
                        break;
                    default:
                        break;
                }
            }
        }

    }

    /**
     * Metodo que valida que una linea pueda ser dibujada
     *
     * @return True si es posible dibujar la linea, false si no es posible
     */
    public boolean validaLinea() {
        return true;
    }

    public void ordenaPuntos(pnJuego lienzo, Punto p1, Punto p2) {
        if (p1.getX() == p2.getX()) {
            if (p1.getY() > p2.getY()) {
                Punto aux;
                aux = p1;
                p1 = p2;
                p2 = aux;
                lienzo.setP1(p1);
                lienzo.setP2(p2);
            }
        } else if (p1.getY() == p2.getY()) {
            if (p1.getX() > p2.getX()) {
                Punto aux;
                aux = p1;
                p1 = p2;
                p2 = aux;
                lienzo.setP1(p1);
                lienzo.setP2(p2);
            }
        }

    }
    
    public void agregaPuntos(pnJuego lienzo, Punto p1, Punto p2,java.awt.event.MouseEvent evt){
        int pulsacion = 0;
         if (pulsacion == 1) {
            for (Punto punto : lienzo.getPuntosList()) {

                if (punto.getX() <= evt.getX()) {
                    if (punto.getY() <= evt.getY()) {
                        p1 = new Punto();
                        p1.setX(punto.getX());
                        p1.setY(punto.getY());
                        p1.setRadio(punto.getRadio());
                    }
                }

            }
            pulsacion++;
        } else {

            for (Punto punto : lienzo.getPuntosList()) {

                if (punto.getX() <= evt.getX()) {
                    if (punto.getY() <= evt.getY()) {
                        p2 = new Punto();
                        p2.setX(punto.getX());
                        p2.setY(punto.getY());
                        p2.setRadio(punto.getRadio());
                    }
                }

            }
            pulsacion--;
            ordenaPuntos(lienzo, p1, p2);
            //System.out.println(p1 + " - " + p2);
            dibujaLinea(lienzo.getGraphics());
        }
    }
    
    

    /**
     * Metodo que dibuja la linea en el tablero
     * @param g
     */
    public void dibujaLinea(Graphics g) {
        frmPartida = FrmPartida.getInstance();
        Linea linea = new Linea(MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_BOTH, (Graphics2D) frmPartida.getLienzo().getGraphics());

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
        modeloPartida = ModeloFrmPartida.getInstance();
        Partida p = modeloPartida.getPartida();
        if (modeloPartida.getPartida().getEstado() == Estados.EN_ESPERA) {
            p.setEstado(Estados.INICIADO);
            modeloPartida.setPartida(p);
            try {
                cliente.enviarAlServidor(p);
            } catch (Exception e) {
                System.out.println("Chales");
            }
        } else if (modeloPartida.getPartida().getEstado() == Estados.INICIADO) {
            p.setEstado(Estados.FINALIZADO);
            modeloPartida.setPartida(p);
            try {
                cliente.enviarAlServidor(p);
            } catch (Exception e) {
                System.out.println("Chales");
            }
        }
    }

    /**
     * Metodo que despliega un mensaje
     *
     * @param mensaje
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
        modeloPartida = ModeloFrmPartida.getInstance();
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
