/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    private SocketCliente() {
        try {
            cliente = new Socket(HOST, PORT);
            objetoSaliente = new ObjectOutputStream(cliente.getOutputStream());
            objetoEntrante = new ObjectInputStream(cliente.getInputStream());

        } catch (IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviarAlServidor(Jugador jugador) throws IOException {
        objetoSaliente.writeObject(jugador);
    }

    public void enviarAlServidor(Partida partida) throws IOException {
        objetoSaliente.writeObject(partida);
    }

    public void desconectarServidor() throws IOException {
        objetoSaliente.close();
        cliente.close();
    }

    public static SocketCliente getInstance() {
        if (instance == null) {
            instance = new SocketCliente();
        }
        return instance;
    }

    public void procesaObjeto(Object objeto) {
        if (objeto instanceof Partida) {
            partida = (Partida) objeto;
            notificar();
        } else if (objeto instanceof Jugador) {
            jugador = (Jugador) objeto;
        }
    }

    @Override
    public void run() {
        try {
            Object objeto;
            while ((objeto = objetoEntrante.readObject()) != null) {
                procesaObjeto(objeto);
            }
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void notificar() {
        observador = ModeloFrmPartida.getInstance();
        this.observador.update(partida);
    }

}
