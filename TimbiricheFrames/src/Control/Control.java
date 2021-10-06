package Control;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class Control {

    private Jugador j1;
    private Jugador j2;
    private Jugador j3;
    private Jugador j4;
    private static Control instancia;

    public Control() {
        j1 = new Jugador("JuanG");
        j1.setAvatar("/img/btnIcono1.png");
        j2 = new Jugador("Alex");
        j2.setAvatar("/img/btnIcono5.png");
        j3 = new Jugador("Paul");
        j3.setAvatar("/img/btnIcono2.png");
        j4 = new Jugador();
    }
    
    public Jugador getJ1() {
        return j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public Jugador getJ3() {
        return j3;
    }

    public Jugador getJ4() {
        return j4;
    }

    public void setJ4(Jugador j4) {
        this.j4 = j4;
    }

    /**
     * Carga a los jugadores faltantes en un determinado tiempo
     *
     * @param icono ícono que se le pondrá al jugador
     * @param nombre Nombre del jugador
     * @param j Jugador el cual será cargado
     * @param time Tiempo que dardará en ser cargado
     */
    public void cargarJugador(JLabel icono, JLabel nombre, Jugador j, int time) {
        Timer timer = new Timer();

        TimerTask jugador = new TimerTask() {
            @Override
            public void run() {
                icono.setIcon(new javax.swing.ImageIcon(getClass().getResource(j.getAvatar())));
                String n = String.format("%-10s", j.getNombre());

                nombre.setText(n);
            }
        };

        timer.schedule(jugador, time);
    }

    
    public static Control getInstance() {
        if (instancia == null) {
            instancia = new Control();
        }
        return instancia;
    }

}
