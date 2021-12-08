package Presentacion;

import control.ControlFrmPartida;
import control.ControlFrmPrincipal;

/**
 *
 * @author Equipo gatazo
 */
public class main {

    public static void main(String[] args) {
        ControlFrmPrincipal principal = ControlFrmPrincipal.getInstance();        
        principal.despliegaPantallaPrincipal();
        ControlFrmPartida partida = ControlFrmPartida.getInstance();
        if (partida.getPartida()!= null) {
            principal.setPartida(partida.getPartida());
        }
        
    }

}
