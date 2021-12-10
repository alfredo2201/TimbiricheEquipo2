package SocketCliente;

import dominio.Jugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModeloFrmPartida;
import observador.*;

/**
 *
 * @author Equipo Gatazo
 */
public class SocketCliente extends Thread implements IObservable {

    private final String HOST = "localhost";
    private final int PORT = 6666;
    private Socket cliente;
    private Partida partida;
    private Jugador jugador;
    private static SocketCliente instance;
    private ObjectInputStream objetoEntrante;
    private ObjectOutputStream objetoSaliente;
    private IObserver observador;

    /**
     * Crea un socket cleinte y corre hilos para datos salientes o entrantes
     */
    private SocketCliente() {
        try {
            cliente = new Socket(HOST, PORT);
            objetoSaliente = new ObjectOutputStream(cliente.getOutputStream());
            objetoEntrante = new ObjectInputStream(cliente.getInputStream());
            this.start();
        } catch (IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Envia un jugador al servidor
     *
     * @param jugador Jugador enviado
     * @throws IOException En caso de haber un error, arroja IOException
     */
    public synchronized void enviarAlServidor(Jugador jugador) throws IOException {
        objetoSaliente.writeObject(jugador);
    }

    /**
     * Envia una partida al servidor
     *
     * @param partida Partida enviada
     * @throws IOException En caso de haber un error, arroja IOException
     */
    public synchronized void enviarAlServidor(Partida partida) throws IOException {
        System.out.println("Tamaño jugadores: " + partida.getJugadores().size());
        objetoSaliente.writeObject(partida);
    }

    /**
     * Cierra el servidor
     *
     * @throws IOException En caso de haber un error, arroja IOException
     */
    public synchronized void desconectarServidor() throws IOException {
        this.stop();
        instance = null;
        objetoEntrante.close();
        objetoSaliente.close();
        cliente.close();
    }

    /**
     * Obitene la isntancia de SocketCliente
     *
     * @return Instancia de SocketCliente
     */
    public static SocketCliente getInstance() {
        if (instance == null) {
            instance = new SocketCliente();
        }
        return instance;
    }

    /**
     * Procesa un objeto para determinarlo como Partida o Jugador
     *
     * @param objeto Objeto que será evaluado
     */
    public synchronized void procesaObjeto(Object objeto) {
        if (objeto instanceof Partida) {
            partida = (Partida) objeto;
            notificar();
        } else if (objeto instanceof Jugador) {
            jugador = (Jugador) objeto;
        }
    }

    /**
     * Corre los hilos
     */
    @Override
    public void run() {
        try {
            Object objeto;
            while (!cliente.isClosed() && ((objeto = objetoEntrante.readObject()) != null)) {
                procesaObjeto(objeto);
            }
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Notifica los cambios de la partida la observador
     */
    @Override
    public void notificar() {
        observador = ModeloFrmPartida.getInstance();
        this.observador.update(partida);
    }

}
