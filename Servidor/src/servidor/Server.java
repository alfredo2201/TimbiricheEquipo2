package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Equipo Gatazo
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ServerSocketThread> listaSST = new ArrayList<>();
        try {
            ServerSocket servidor = null;
            servidor = new ServerSocket(6666);
            System.out.println("Creando el servidor");
            Socket cliente = null;

            ServerSocketThread sst;
            while (true) {
                cliente = servidor.accept();
                sst = new ServerSocketThread(cliente);
                listaSST.add(sst);
                for (ServerSocketThread serverSocketThread : listaSST) {
                    serverSocketThread.setListaOutputs(listaSST);
                }
                sst.start();
            }
        } catch (IOException ex) {
            System.err.println("Error en el servidor");
            System.exit(1);
        }

    }

}
