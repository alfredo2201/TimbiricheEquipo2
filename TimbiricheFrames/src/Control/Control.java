/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author crist
 */
public class Control {

    private Jugador j1;
    private Jugador j2;
    private Jugador j3;
    private Jugador j4;
    private static Control instancia;

    private Control() {
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

    public static Control getInstance() {
        if (instancia == null) {
            instancia = new Control();
        }
        return instancia;
    }

}
