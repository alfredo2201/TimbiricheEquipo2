/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Presentacion.FrmIconos;
import javax.swing.JOptionPane;
import modelo.ModeloFrmPrincipal;
import sun.security.krb5.internal.ktab.KeyTabConstants;

/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmIconos {
    
    ModeloFrmPrincipal princpial = ModeloFrmPrincipal.getInstance();
    
    /**
     * Metodo que añade ícono al jugador
     * @param avatar avatar que tendrá el jugador
     */
    public void añadirIconos(String avatar){
        princpial.getJugador().setAvatar(avatar);
        System.out.println(princpial.getJugador().getAvatar());
        System.out.println(princpial.getJugador().getNombre());
    }

    /**
     * Metodo que despliega el frame de Iconos
     */
    public void despliegaPantalla(){
        FrmIconos iconos = new FrmIconos();
        iconos.setVisible(true);
    }

    /**
     * Metodo que muestra el mensaje de parametro
     * @param mensaje Mensaje que será desplegado 
     */
    public void muestraMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,
                            "", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
