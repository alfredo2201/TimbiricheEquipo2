package control;

import Presentacion.FrmIconos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo gatazo
 */
public class ControlFrmIconos {

    ControlFrmPrincipal ctlPrincipal = ControlFrmPrincipal.getInstance();
    private static ControlFrmIconos instance;

    /**
     * Metodo que añade ícono al jugador
     *
     * @param avatar avatar que tendrá el jugador
     */
    public void añadirIconos(String avatar) {
        ctlPrincipal.añadirIcono(avatar);
    }

    /**
     * Metodo que regresa la instancia de ControlFrmIconos
     *
     * @return Instancia ControlFrmIconos
     */
    public static ControlFrmIconos getInstance() {
        if (instance == null) {
            instance = new ControlFrmIconos();
        }
        return instance;
    }

    /**
     * Metodo que despliega el frame de Iconos
     */
    public void despliegaPantalla() {
        FrmIconos iconos = FrmIconos.getInstance();
        iconos.setVisible(true);
    }

    /**
     * Metodo que muestra el mensaje de parametro
     *
     * @param mensaje Mensaje que será desplegado
     */
    public void muestraMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     *
     * @param frame
     */
    public void cierraPantalla(JFrame frame) {
        ctlPrincipal.despliegaPantallaPrincipal();
        frame.dispose();
    }

}
