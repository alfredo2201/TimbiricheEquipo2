package servidor;

import dominio.Jugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo Gatazo
 */
public class ServerSocketThread extends Thread {

    private Socket cliente;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private ServerSocketProtocol ssp = ServerSocketProtocol.getInstance();
    private ArrayList<ServerSocketThread> listaOutputs = new ArrayList<>();

    /**
     * Crea socket hilos para datos salientes o entrantes
     */
    public ServerSocketThread(Socket cliente) {
        this.cliente = cliente;
        try {
            in = new ObjectInputStream(cliente.getInputStream());
            out = new ObjectOutputStream(cliente.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServerSocketThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Corre los hilos
     */
    @Override
    public void run() {
        try {
            Object objeto;
            while ((objeto = in.readObject()) != null) {
                if (objeto instanceof Jugador) {
                    Jugador jugador = (Jugador) objeto;
                    if (ssp.procesaJugador(jugador)) {
                        for (int i = 0; i < listaOutputs.size(); i++) {
                            if (!listaOutputs.get(i).getCliente().equals(cliente)) {
                                listaOutputs.get(i).escribir(ssp.enviarPartida());
                            } else {
                                out.writeObject(ssp.enviarPartida());
                            }
                        }
                    }
                } else {
                    Partida partida = (Partida) objeto;
                    ssp.procesaPartida(partida);
                    for (int i = 0; i < listaOutputs.size(); i++) {
                        if (!listaOutputs.get(i).getCliente().equals(cliente)) {
                            listaOutputs.get(i).escribir(ssp.enviarPartida());
                        }
                    }
                }
            }
            in.close();
            out.close();
            cliente.close();
        } catch (IOException ex) {
            System.err.println("Problemas de entrada y salida: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("Problemas para encontrar clases: " + ex.getMessage());
        }
    }

    /**
     * Escribe los objetos en partida
     */
    public void escribir(Partida partida) throws IOException {
        out.writeObject(partida);
    }

    /**
     * Obtiene al cliente
     *
     * @return devuelve al cliente
     */
    public Socket getCliente() {
        return cliente;
    }

    /**
     * Lista de salidas
     * @param listaOutputs
     */
    public void setListaOutputs(ArrayList<ServerSocketThread> listaOutputs) {
        this.listaOutputs = listaOutputs;
    }

}
