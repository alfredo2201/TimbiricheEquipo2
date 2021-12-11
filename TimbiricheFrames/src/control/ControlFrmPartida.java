package control;

import Presentacion.FrmPartida;
import Presentacion.FrmPrincipal;
import Presentacion.pnJuego;
import SocketCliente.SocketCliente;
import dominio.*;
import forma.FCuadro;
import forma.FLinea;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;
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
    private Jugador jugador;
    private SocketCliente cliente;
    private Tablero tablero;
    private final ArrayList<Linea> lineasList;
    private final ArrayList<Cuadro> listaCuadros;
    private Punto p1 = null;
    private Punto p2 = null;
    private Color color1 = Color.BLUE;
    private Color color2 = Color.PINK;
    private Color color3 = Color.green;
    private Color color4 = Color.green;

    /**
     * Constructor que inicialisa el SocketCliente
     */
    private ControlFrmPartida() {
        this.cliente = SocketCliente.getInstance();
        this.lineasList = new ArrayList<>();
        this.listaCuadros = new ArrayList<>();
    }

    /**
     * Método que despliega el frame de Partida Aquí se le agregó el parámetro
     */
    public void despliegaPantallaPartida() {
        ctlPrincipal = ControlFrmPrincipal.getInstance();
        modeloPartida = ModeloFrmPartida.getInstance();
        frmPartida = FrmPartida.getInstance();
        jugador = ctlPrincipal.getJugador();
        frmPartida.setVisible(true);
        habilitaBotonComenzar(frmPartida.getBtnComenzarPartida());
        frmPartida.setExtendedState(MAXIMIZED_BOTH);
        frmPartida.setLienzo(configurarLienzo(frmPartida.getLienzo()));
        frmPartida.add(frmPartida.getLienzo()); //se agrega al frame principal
        frmPartida.pack();
        frmPartida.setG(frmPartida.getLienzo().getGraphics());
        frmPartida.setResizable(false);
        frmPartida.getLienzo().setEnabled(true);
        muestraInformacionJugadores(frmPartida);
//        modeloPartida = modeloPartida.getInstance();

        System.out.println("Es turno de: " + modeloPartida.getPartida().getTurnos().toString());
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

            for (Jugador jug : modeloPartida.getPartida().getJugadores()) {
                if (ju.equals(jug)) {
                    jug.setIniciar(true);
                    break;
                }
            }

            try {
                cliente.enviarAlServidor(modeloPartida.getPartida());
            } catch (IOException e) {
                System.out.println("ta mal");
            }

        }
    }

    /**
     * Metodo que muestra la partida con los jugadores
     */
    public void muestraPartida() {
        frmPartida.getLienzo().setVisible(true);
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
        Jugador j = modeloPartida.getPartida().getJugadores().get(jugador);
        guardaConfiguracion(label, jugador, j, c);
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
            lienzo.setEnabled(true);
            return lienzo;
        } else if (modeloPartida.getPartida() != null) {
            lienzo = new pnJuego(modeloPartida.getPartida().getTablero());//se inicializa el lienzo
            lienzo.setLocation(200, 0); //se establece su posición
            lienzo.setSize(1010, 1010); //establece el tamaño del panel
            lienzo.setVisible(false);
            lienzo.setEnabled(true);
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
     * Método que valida la configuración del los usuarios
     *
     * @return true si se vaido con exito, false si no se acepto la validación
     */
    public boolean validaConfiguracion() {

        return true;
    }

    /**
     * Método que guarda la configuración de los usuarios
     *
     * @param label
     * @param jugador
     * @param j
     * @param c
     */
    public void guardaConfiguracion(JLabel label, int jugador, Jugador j, Color c) {

        if (c != null) {
            j = modeloPartida.getPartida().getJugadores().get(jugador);
            if (j != null) {
                if (label.getText().equalsIgnoreCase(this.jugador.getNombre())) {
                    modeloPartida.getPartida().getJugadores().get(jugador).setColor(c);
                    label.setForeground(c);
                } else if (jugador == 0) {
                    this.color1 = c;
                } else if (jugador == 1) {
                    this.color2 = c;
                } else if (jugador == 2) {
                    this.color3 = c;
                } else if (jugador == 3) {
                    this.color4 = c;
                }

            }
        }

    }

    public void habilitaBotonComenzar(JButton boton) {
        Partida partida = modeloPartida.getPartida();
        if (jugador.equals(partida.getJugadores().get(0))) {
            boton.setEnabled(true);
        } else {
            boton.setEnabled(false);
        }
    }

    public void quitarInformacion() {
        frmPartida = FrmPartida.getInstance();
        frmPartida.setLblIconoJugador1("");
        frmPartida.setLblNombreJugador1("Nombre Jugador");
        frmPartida.setLblIconoJugador2("");
        frmPartida.setLblNombreJugador2("Nombre Jugador");
        frmPartida.setLblIconoJugador3("");
        frmPartida.setLblNombreJugador3("Nombre Jugador");
        frmPartida.setLblIconoJugador4("");
        frmPartida.setLblNombreJugador4("Nombre Jugador");
    }

    /**
     * Metodo que borra los datos del jugador
     */
    public void borrarDatosJugador() {
        cliente = SocketCliente.getInstance();
        Jugador jug = new Jugador(jugador.getNombre());
        jug.setAvatar("eliminar");
        try {
            cliente.enviarAlServidor(jug);
        } catch (IOException ex) {
            Logger.getLogger(ControlFrmPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo que confirma la selección de inicio del jugador
     *
     * @param confirmacion
     */
    public void confirmarInicioJugador(boolean confirmacion) {
        Partida partida = modeloPartida.getPartida();
        int i =0;
        for (Jugador jugadore : partida.getJugadores()) {
            if (jugadore.getNombre().equalsIgnoreCase(jugador.getNombre())) {
                partida.getJugadores().get(i).setIniciar(confirmacion);
            }
            i++;
        }
        
        try {
            cliente.enviarAlServidor(partida);
        } catch (IOException ex) {
            System.err.println("Trono al enviar la confirmacion: " + ex.getMessage());
        }
    }

    /**
     * Metodo que muestra el frame Pantalla Principal
     */
    public synchronized void mostrarPantallaPrincipal() {

        ctlPrincipal = ControlFrmPrincipal.getInstance();
        ctlPrincipal.despliegaPantallaPrincipal();
        try {
            cliente.desconectarServidor();
        } catch (IOException ex) {
            Logger.getLogger(ControlFrmPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
        FrmPartida.getInstance().dispose();
    }

    /**
     * Metodo que muestra la informacion de los jugadores de la partida
     *
     * @param frmPartida
     */
    public void muestraInformacionJugadores(FrmPartida frmPartida) {
        modeloPartida = ModeloFrmPartida.getInstance();
        if (modeloPartida != null) {
            int iterar = 0;
            for (Jugador jugad : modeloPartida.getPartida().getJugadores()) {
                switch (iterar) {
                    case 0:
                        frmPartida.setLblIconoJugador1(jugad.getAvatar());
                        frmPartida.setLblNombreJugador1(jugad.getNombre());
                        frmPartida.setLbPuntosJ1(String.valueOf(jugad.getPuntos()));
                        iterar++;
                        break;
                    case 1:
                        frmPartida.setLblIconoJugador2(jugad.getAvatar());
                        frmPartida.setLblNombreJugador2(jugad.getNombre());
                        frmPartida.setLbPuntosJ2(String.valueOf(jugad.getPuntos()));
                        iterar++;
                        break;
                    case 2:
                        frmPartida.setLblIconoJugador3(jugad.getAvatar());
                        frmPartida.setLblNombreJugador3(jugad.getNombre());
                        frmPartida.setLbPuntosJ3(String.valueOf(jugad.getPuntos()));
                        iterar++;
                        break;
                    case 3:
                        frmPartida.setLblIconoJugador4(jugad.getAvatar());
                        frmPartida.setLblNombreJugador4(jugad.getNombre());
                        frmPartida.setLbPuntosJ4(String.valueOf(jugad.getPuntos()));
                        iterar++;
                        break;
                    default:
                        break;
                }
            }
        }

    }

    public void habilitaPantalla(Partida partida, pnJuego panel) {
        if (partida.getEstado().equals(Estados.INICIADO)) {
            panel.setVisible(true);
        }

    }

    public void ordenaPuntos(pnJuego lienzo, Punto p1, Punto p2) {
        if (p1.getX() == p2.getX()) {
            if (p1.getY() > p2.getY()) {
                Punto aux;
                aux = p1;
                p1 = p2;
                p2 = aux;
                this.p1 = p1;
                this.p2 = p2;
            }
        } else if (p1.getY() == p2.getY()) {
            if (p1.getX() > p2.getX()) {
                Punto aux;
                aux = p1;
                p1 = p2;
                p2 = aux;
                this.p1 = p1;
                this.p2 = p2;
            }
        }

    }

    public boolean comprobarLinea(Linea linea, ArrayList<Linea> lineasList) {
        for (Linea l : lineasList) {
            if (l.equals(linea)) {
                return true;
            }
        }
        return false;
    }

    public boolean compruebaPunto(Punto p1, Punto p2) {
        return p1.equals(p2);
    }

    /**
     * Metodo que valida que una linea pueda ser dibujada
     *
     * @param p1
     * @param p2
     * @return True si es posible dibujar la linea, false si no es posible
     */
    public boolean validaLinea(Punto p1, Punto p2) {
        return (p1.getX() != p2.getX() && p1.getY() != p2.getY());
    }

    /**
     * Dibuja la linea en la tabla y crea los cuadros
     *
     * @param g Grágico del panel
     * @param lienzo
     * @param p1
     * @param p2
     */
    public void dibujarLinea(Graphics g, pnJuego lienzo, Punto p1, Punto p2) {
        Partida partida = modeloPartida.getPartida();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(jugador.getColor());
        float grosor = modeloPartida.getPartida().getTablero().getGrosor();
        float separacion = modeloPartida.getPartida().getTablero().getSeparacion();
        Tablero tab = modeloPartida.getPartida().getTablero();
        //Se comprueba que no se hayan seleccionado dos veces el mismo punto
        Cuadro cd;
        if (this.compruebaPunto(p1, p2)) {
            modeloPartida.setMensaje("Seleccione dos puntos distintos");
            return;
        }

        if (this.validaLinea(p1, p2)) {
            modeloPartida.setMensaje("Linea no valida ugu");
        } else if (p1.getY() == p2.getY()) {
            // Linea de izquierda a derecha
            FLinea lineaNueva = new FLinea((p1.getX() + (p1.getRadio() / 2)), ((p1.getY() + (p1.getRadio() / 2)) - (grosor / 2)), separacion, grosor, g2d);
            Linea linea = new Linea(p1, p2, grosor, separacion, tab);
            linea.setJugador(jugador);
            System.out.println(linea);
            if (!comprobarLinea(linea, partida.getLinea())) {
                partida.setLinea(linea);

                this.dibujaLinea(lineaNueva);
                //hice este partida.getLinea para ver si se agrega, posiblemente faltó esto
//                partida.getLinea().add(linea);
                cd = this.verificarCuadro(linea, partida.getLinea(), separacion);
                if (cd != null) {
                    cd.setJugador(jugador);
                    FCuadro cuadroSimple;
                    partida.setCuadro(cd);

                    //Se agrega un punto al jugador 
                    for (Jugador j : modeloPartida.getPartida().getJugadores()) {
                        if (j.equals(this.jugador)) {
                            j.setPuntos(j.getPuntos() + 1);
                            modeloPartida.setPartida(modeloPartida.getPartida());
                            break;
                        }
                    }

                    cuadroSimple = new FCuadro(cd.getSuperior().getP1().getX() + (p1.getRadio() / 2), cd.getSuperior().getP1().getY() + (p1.getRadio() / 2), separacion, separacion, g2d);
                    this.dibujaCuadro(cuadroSimple);
                    Cuadro cdDoble = verificarCuadroDoble(cd, partida.getLinea(), separacion);
                    if (cdDoble != null) {
                        cdDoble.setJugador(jugador);
                        if (cdDoble.getSuperior() != null
                                && cdDoble.getInferior() != null
                                && cdDoble.getDer() != null
                                && cdDoble.getIzq() != null) {
                            System.out.println(cdDoble);
                            partida.setCuadro(cdDoble);
                            FCuadro cuadroDoble;
                            cuadroDoble = new FCuadro(cdDoble.getSuperior().getP1().getX() + (p1.getRadio() / 2), cdDoble.getSuperior().getP1().getY() + (p1.getRadio() / 2), separacion, separacion, g2d);
                            this.dibujaCuadroDoble(cuadroDoble);

                            //2 puntos para el jugador
                            for (Jugador j : modeloPartida.getPartida().getJugadores()) {
                                if (j.equals(this.jugador)) {
                                    j.setPuntos(j.getPuntos() + 2);
                                    modeloPartida.setPartida(modeloPartida.getPartida());
                                    break;
                                }
                            }

                            cuadroDoble.dibujar();

                        }
                    }
                } else {

                    cambiaTurno(true, partida);
                }
                try {
                    cliente.enviarAlServidor(partida);
                } catch (IOException ex) {
                    Logger.getLogger(ControlFrmPartida.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                modeloPartida.setMensaje("Linea ya existente");
            }
        } else {
            // Linea de arriba para abajo
            FLinea lineaNueva = new FLinea((p1.getX() + (p1.getRadio() / 2)), ((p1.getY() + (p1.getRadio() / 2)) - (grosor / 2)), grosor, separacion, g2d);
            Linea linea = new Linea(p1, p2, grosor, separacion, tab);
            linea.setJugador(jugador);

            if (!comprobarLinea(linea, partida.getLinea())) {

                partida.setLinea(linea);
                this.dibujaLinea(lineaNueva);

                cd = this.verificarCuadro(linea, partida.getLinea(), separacion);
                if (cd != null) {
                    cd.setJugador(jugador);
                    FCuadro cuadradito = new FCuadro(cd.getSuperior().getP1().getX() + (p1.getRadio() / 2), cd.getSuperior().getP1().getY() + (p1.getRadio() / 2), separacion, separacion, g2d);
                    this.dibujaCuadro(cuadradito);
                    for (Jugador j : modeloPartida.getPartida().getJugadores()) {
                        if (j.equals(this.jugador)) {
                            j.setPuntos(j.getPuntos() + 1);
                            modeloPartida.setPartida(modeloPartida.getPartida());
                            break;
                        }
                    }
                    partida.setCuadro(cd);
                    Cuadro cdDoble = verificarCuadroDoble(cd, partida.getLinea(), separacion);
                    if (cdDoble != null) {
                        cdDoble.setJugador(jugador);
                        if (cdDoble.getSuperior() != null
                                && cdDoble.getInferior() != null
                                && cdDoble.getDer() != null
                                && cdDoble.getIzq() != null) {
                            System.out.println(cdDoble);
                            partida.setCuadro(cdDoble);
                            FCuadro cuadradito2 = new FCuadro(cdDoble.getSuperior().getP1().getX() + (p1.getRadio() / 2), cdDoble.getSuperior().getP1().getY() + (p1.getRadio() / 2), separacion, separacion, g2d);
                            for (Jugador j : modeloPartida.getPartida().getJugadores()) {
                                if (j.equals(this.jugador)) {
                                    j.setPuntos(j.getPuntos() + 2);
                                    modeloPartida.setPartida(modeloPartida.getPartida());
                                    break;
                                }
                            }
                            this.dibujaCuadroDoble(cuadradito2);
                        }
                    }

                } else {
                    cambiaTurno(true, partida);
                }
                try {
                    cliente.enviarAlServidor(partida);
                } catch (IOException ex) {
                    Logger.getLogger(ControlFrmPartida.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Linea ya existente",
                        "", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void dibujarLineasPartida(Graphics g) {
        Partida partida = modeloPartida.getPartida();
        frmPartida = FrmPartida.getInstance();
        Graphics2D g2d = (Graphics2D) g;
        System.out.println("Hay lineas para dibujar?" + (partida.getLinea().isEmpty() ? "wtf sin lineas" : "uwu"));
        for (Linea l : partida.getLinea()) {
            g.setColor(l.getJugador().getColor());
//            this.dibujarLinea(g, frmPartida.getLienzo(), p1, p2);
            this.reDibujarLinea(g, frmPartida.getLienzo(), l.getP1(), l.getP2());
        }
//        if (partida.getLinea().size() > 0) {
//            for (Linea linea : partida.getLinea()) {
//                g2d.setColor(linea.getJugador().getColor());
//                if (linea.getP1().getX() == linea.getP2().getX()) {
//                    FLinea fLinea1 = new FLinea((linea.getP1().getX() + (linea.getP1().getRadio() / 2)), ((linea.getP1().getY() + (linea.getP1().getRadio() / 2)) - (linea.getH() / 2)), linea.getW(), linea.getH(), g2d);
//                    this.dibujaLinea(fLinea1);
//                } else if (linea.getP1().getY() == linea.getP2().getY()) {
//                    FLinea fLinea2 = new FLinea((linea.getP1().getX() + (linea.getP1().getRadio() / 2)), ((linea.getP1().getY() + (linea.getP1().getRadio() / 2)) - (linea.getH() / 2)), linea.getH(), linea.getW(), g2d);
//                    this.dibujaLinea(fLinea2);
//                }
//            }
//        }
    }

    public void dibujarCuadrosPartida(Graphics g) {
        Partida partida = modeloPartida.getPartida();
        Graphics2D g2d = (Graphics2D) g;

        if (partida.getCuadro().size() > 0) {
            for (Cuadro cuadro : partida.getCuadro()) {
                g2d.setColor(cuadro.getJugador().getColor());
                FCuadro fLinea = new FCuadro(cuadro.getSuperior().getP1().getX()
                        + (cuadro.getDer().getP1().getRadio() / 2),
                        cuadro.getSuperior().getP1().getY() + (cuadro.getDer().getP1().getRadio() / 2),
                        partida.getTablero().getSeparacion(), partida.getTablero().getSeparacion(), g2d);
                fLinea.dibujar();
            }
        }
    }

    public Cuadro verificarCuadroDoble(Cuadro cuadro, ArrayList<Linea> lineasList, Float separacion) {
        for (Linea line : lineasList) {
            if (cuadro.getSuperior().getP1().getY() - separacion == line.getP1().getY() && cuadro.getSuperior().getP1().getX() == line.getP1().getX()
                    && cuadro.getSuperior().getP2().getY() - separacion == line.getP2().getY() && cuadro.getSuperior().getP2().getX() == line.getP2().getX()) {
                return verificarCuadro(line, lineasList, separacion);
            } else if (cuadro.getInferior().getP1().getY() + separacion == line.getP1().getY() && cuadro.getInferior().getP1().getX() == line.getP1().getX()
                    && cuadro.getInferior().getP2().getY() + separacion == line.getP2().getY() && cuadro.getInferior().getP2().getX() == line.getP2().getX()) {
                return verificarCuadro(line, lineasList, separacion);
            } else if (cuadro.getIzq().getP1().getX() - separacion == line.getP1().getX() && cuadro.getIzq().getP1().getY() == line.getP1().getY()
                    && cuadro.getIzq().getP2().getX() - separacion == line.getP2().getX() && cuadro.getIzq().getP2().getY() == line.getP2().getY()) {
                return verificarCuadro(line, lineasList, separacion);
            } else if (cuadro.getDer().getP1().getX() + separacion == line.getP1().getX() && cuadro.getDer().getP1().getY() == line.getP1().getY()
                    && cuadro.getDer().getP2().getX() + separacion == line.getP2().getX() && cuadro.getDer().getP2().getY() == line.getP2().getY()) {
                return verificarCuadro(line, lineasList, separacion);
            }
        }
        return null;
    }

    public Cuadro verificarCuadro(Linea linea, ArrayList<Linea> lineasList, Float separacion) {
        Cuadro cuadro = new Cuadro();
        //listaLineasPositivasHorizontales.add(linea);
        for (Linea line : lineasList) {
            // Si es linea superior
            if (linea.getP1().getX() == line.getP2().getX() && linea.getP1().getY() == line.getP2().getY() && linea.getP1().getX() - separacion == line.getP2().getX() && linea.getP2().getY() == line.getP1().getY()
                    || linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() - separacion == line.getP2().getY() && linea.getP1().getX() - separacion == line.getP1().getX() && linea.getP1().getY() == line.getP1().getY()
                    || linea.getP1().getX() == line.getP1().getX() && linea.getP1().getY() == line.getP1().getY() && linea.getP1().getX() + separacion == line.getP2().getX() && linea.getP1().getY() == line.getP2().getY()) {

                cuadro.setSuperior(line);
            }
            // Si es linea inferior 
            if (linea.getP1().getX() == line.getP1().getX() && linea.getP1().getY() + separacion == line.getP1().getY() && linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() + separacion == line.getP2().getY()
                    || linea.getP1().getX() == line.getP1().getX() && linea.getP1().getY() - separacion == line.getP1().getY() && linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() - separacion == line.getP2().getY()
                    || linea.getP2().getX() == line.getP2().getX() && linea.getP2().getY() == line.getP2().getY() && linea.getP2().getX() - separacion == line.getP1().getX() && linea.getP1().getY() == line.getP1().getY()
                    || linea.getP2().getX() == line.getP1().getX() && linea.getP2().getY() == line.getP1().getY() && linea.getP2().getX() + separacion == line.getP2().getX() && linea.getP1().getY() == line.getP1().getY()) {
                if (cuadro.getSuperior() != null && !cuadro.getSuperior().equals(line)) {
                    cuadro.setInferior(line);
                }
                if (cuadro.getInferior() == cuadro.getSuperior()) {
                    for (Linea ln1 : lineasList) {
                        if (linea.getP1().getX() == ln1.getP1().getX() && linea.getP1().getY() + separacion == ln1.getP1().getY() && linea.getP2().getX() == ln1.getP2().getX() && linea.getP2().getY() + separacion == ln1.getP2().getY()
                                || linea.getP1().getX() == ln1.getP1().getX() && linea.getP1().getY() - separacion == ln1.getP1().getY() && linea.getP2().getX() == ln1.getP2().getX() && linea.getP2().getY() - separacion == ln1.getP2().getY()
                                || linea.getP2().getX() == ln1.getP2().getX() && linea.getP2().getY() == ln1.getP2().getY() && linea.getP2().getX() - separacion == ln1.getP1().getX() && linea.getP2().getY() == ln1.getP1().getY()
                                || linea.getP2().getX() == ln1.getP1().getX() && linea.getP2().getY() == ln1.getP1().getY() && linea.getP2().getX() + separacion == ln1.getP2().getX() && linea.getP2().getY() == ln1.getP2().getY()) {
                            if (linea != ln1) {
                                cuadro.setInferior(ln1);
                            }

                        }
                    }
                }
            }

        }

        if (cuadro.getSuperior() != null && cuadro.getInferior() != null) {
            if (cuadro.getInferior().getP1().getY() < cuadro.getSuperior().getP1().getY()) {
                Linea aux = cuadro.getInferior();
                cuadro.setInferior(cuadro.getSuperior());
                cuadro.setSuperior(aux);
            }
            for (Linea lnl : lineasList) {

                if (lnl.getP1().getX() == cuadro.getSuperior().getP1().getX() && lnl.getP1().getY() == cuadro.getSuperior().getP1().getY()
                        && lnl.getP2().getX() == cuadro.getInferior().getP1().getX() && lnl.getP2().getY() == cuadro.getInferior().getP1().getY()) {
                    cuadro.setIzq(lnl);
                } else if (linea.getP1().getX() == cuadro.getSuperior().getP1().getX() && linea.getP1().getY() == cuadro.getSuperior().getP1().getY()
                        && linea.getP2().getX() == cuadro.getInferior().getP1().getX() && linea.getP2().getY() == cuadro.getInferior().getP1().getY()) {
                    if (cuadro.getIzq() == null) {
                        for (Linea ln2 : lineasList) {
                            if (ln2.getP1().getX() == cuadro.getSuperior().getP1().getX() && ln2.getP1().getY() == cuadro.getSuperior().getP1().getY()
                                    && ln2.getP2().getX() == cuadro.getInferior().getP1().getX() && ln2.getP2().getY() == cuadro.getInferior().getP1().getY()) {
                                cuadro.setIzq(ln2);
                            }
                        }
                    }
                    cuadro.setIzq(linea);
                }
                if (lnl.getP1().getX() == cuadro.getSuperior().getP2().getX() && lnl.getP1().getY() == cuadro.getSuperior().getP2().getY()
                        && lnl.getP2().getX() == cuadro.getInferior().getP2().getX() && lnl.getP2().getY() == cuadro.getInferior().getP2().getY()) {
                    cuadro.setDer(lnl);
                } else if (linea.getP1().getX() == cuadro.getSuperior().getP2().getX() && linea.getP1().getY() == cuadro.getSuperior().getP2().getY()
                        && linea.getP2().getX() == cuadro.getInferior().getP2().getX() && linea.getP2().getY() == cuadro.getInferior().getP2().getY()) {
                    cuadro.setDer(linea);
                }
            }
        }
        if (cuadro.getSuperior() != null & cuadro.getInferior() != null && cuadro.getIzq() != null && cuadro.getDer() != null) {
            if (cuadro.getSuperior().getP1().getX() == cuadro.getInferior().getP1().getX()
                    && cuadro.getSuperior().getP1().getY() + separacion == cuadro.getInferior().getP1().getY()
                    && cuadro.getSuperior().getP2().getX() == cuadro.getInferior().getP2().getX()
                    && cuadro.getSuperior().getP2().getY() + separacion == cuadro.getInferior().getP2().getY()) {
                if (cuadro.getIzq().getP1().getX() + separacion == cuadro.getDer().getP1().getX()
                        && cuadro.getIzq().getP1().getY() == cuadro.getDer().getP1().getY()
                        && cuadro.getIzq().getP2().getX() + separacion == cuadro.getDer().getP2().getX()
                        && cuadro.getIzq().getP2().getY() == cuadro.getDer().getP2().getY()) {
                    return cuadro;
                }

            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("S: " + cuadro.getSuperior() + "< - > I: " + cuadro.getInferior() + "\nIzq: " + cuadro.getIzq() + " < - > Der:" + cuadro.getDer() + "\n");

        return null;
    }

    public void agregaPuntos(pnJuego lienzo, int pulsacion, java.awt.event.MouseEvent evt) {
        if (pulsacion == 1) {
            for (int i = 0; i < (lienzo.getPuntosList().size() / 2); i++) {

                if (lienzo.getPuntosList().get(i).getX() <= evt.getX()) {
                    if (lienzo.getPuntosList().get(i).getY() <= evt.getY()) {
                        p1 = new Punto();
                        p1.setX(lienzo.getPuntosList().get(i).getX());
                        p1.setY(lienzo.getPuntosList().get(i).getY());
                        p1.setRadio(lienzo.getPuntosList().get(i).getRadio());
                    }
                }

            }
            pulsacion++;
        } else {

            for (int i = 0; i < (lienzo.getPuntosList().size() / 2); i++) {

                if (lienzo.getPuntosList().get(i).getX() <= evt.getX()) {
                    if (lienzo.getPuntosList().get(i).getY() <= evt.getY()) {
                        p2 = new Punto();
                        p2.setX(lienzo.getPuntosList().get(i).getX());
                        p2.setY(lienzo.getPuntosList().get(i).getY());
                        p2.setRadio(lienzo.getPuntosList().get(i).getRadio());
                    }
                }

            }
            pulsacion--;
            ordenaPuntos(lienzo, p1, p2);
            dibujarLinea(lienzo.getGraphics(), lienzo, p1, p2);
        }
    }

    /**
     * Metodo que verifica el numero de cuadros restantes
     *
     * @return True en caso de que queden cuadros, False si ya no quedan
     */
    public boolean validaNumeroCuadros() {
        Partida partida = modeloPartida.getPartida();
        return partida.getCuadro().size() != ((partida.getTablero().getTamanio() * partida.getTablero().getTamanio()) / 4);
    }

    /**
     * Metodo que reasigna el turno a otro jugador
     *
     * @param cambio
     * @param partida
     */
    public void cambiaTurno(boolean cambio, Partida partida) {
        partida.setCambioTurno(cambio);
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
            } catch (IOException e) {
                System.out.println("Chales: " + e.getMessage());
            }
        } else if (modeloPartida.getPartida().getEstado() == Estados.INICIADO) {
            p.setEstado(Estados.FINALIZADO);
            modeloPartida.setPartida(p);
            try {
                cliente.enviarAlServidor(p);
            } catch (IOException e) {
                System.out.println("Chales: " + e.getMessage());
            }
        }
    }

    public void finalizaPartida() {
        this.actualizaEstado();
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

    public void dibujaLinea(FLinea linea) {
        linea.dibujar();
    }

    public void dibujaCuadro(FCuadro cuadro) {
        cuadro.dibujar();
    }

    public void dibujaCuadroDoble(FCuadro cuadro) {
        cuadro.dibujar();
    }

    public void reDibujarLinea(Graphics g, pnJuego lienzo, Punto p1, Punto p2) {
        Graphics2D g2d = (Graphics2D) g;
        float grosor = modeloPartida.getPartida().getTablero().getGrosor();
        float separacion = modeloPartida.getPartida().getTablero().getSeparacion();
        FLinea lineaNueva = null;
        if (p1.getY() == p2.getY()) {
            lineaNueva = new FLinea((p1.getX() + (p1.getRadio() / 2)), ((p1.getY() + (p1.getRadio() / 2)) - (grosor / 2)), separacion, grosor, g2d);
        } else {
            lineaNueva = new FLinea((p1.getX() + (p1.getRadio() / 2)), ((p1.getY() + (p1.getRadio() / 2)) - (grosor / 2)), grosor, separacion, g2d);
        }

//        FLinea lineaNueva = new FLinea((
//                p1.getX() + (p1.getRadio())), 
//                ((p1.getY() + (p1.getRadio())) - (grosor)), 
//                separacion, grosor, g2d);
        this.dibujaLinea(lineaNueva);

    }

}
