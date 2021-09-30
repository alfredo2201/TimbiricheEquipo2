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
    public void simulaCargaJuagadores(){
       j1 = new Jugador("JuanG");
       j1.setAvatar("/img/btnIcono1.png");
       j2 = new Jugador("Alex");
       j2.setAvatar("/img/btnIcono5.png");
       j3 = new Jugador("Paul");
       j3.setAvatar("/img/btnIcono2.png");
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
    
    
}
