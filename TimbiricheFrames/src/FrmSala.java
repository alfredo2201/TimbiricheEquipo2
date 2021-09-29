
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author crist
 */
public class FrmSala extends javax.swing.JFrame {

    /**
     * Creates new form FrmSala
     */
    private static FrmSala instance ;
    Graphics g;
    JPanel lienzo;


    String pepe = "pica papas con un pico";
    String again = "volvi a actualizar";
    String awa = "awa de uwu";
    String uwu = "Chanchito feliz uwuwu";




    private FrmSala(int tamanio) {

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        configuracionLienzo(tamanio);
        g = lienzo.getGraphics();

    }

    private void configuracionLienzo(int tamanio) {
        lienzo = new pnJuego(tamanio);//se inicializa el lienzo
        lienzo.setLocation(-5, 0); //se establece su posición
        lienzo.setSize(1400, 1000); //establece el tamaño del panel
        lienzo.setVisible(true);
        add(lienzo); //se agrega al frame principal
        pack();
    }
    public static FrmSala getInstance(int tamanio){
        if (instance == null) {
            instance = new FrmSala(tamanio);
        }
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnJugadores = new javax.swing.JPanel();
        lblNombreJugador1 = new javax.swing.JLabel();
        lblIconoJugador1 = new javax.swing.JLabel();
        lblIconoJugador2 = new javax.swing.JLabel();
        lbllNombreJugador2 = new javax.swing.JLabel();
        lblIconoJugador3 = new javax.swing.JLabel();
        lblINombreJugador3 = new javax.swing.JLabel();
        lblIconoJugador4 = new javax.swing.JLabel();
        lblNombreJugador4 = new javax.swing.JLabel();
        iconConfiguracion4 = new javax.swing.JLabel();
        iconConfiguracion1 = new javax.swing.JLabel();
        iconConfiguracion2 = new javax.swing.JLabel();
        iconConfiguracion3 = new javax.swing.JLabel();
        pnTurno = new javax.swing.JPanel();
        lblTurnoNombreJugador = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timbiriche");

        pnJugadores.setBackground(new java.awt.Color(0, 102, 255));
        pnJugadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreJugador1.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblNombreJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador1.setText("Nombre Jugador");
        pnJugadores.add(lblNombreJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 85, -1, 60));

        lblIconoJugador1.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador1.setText("   Icono");
        lblIconoJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnJugadores.add(lblIconoJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 85, 70, 60));

        lblIconoJugador2.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador2.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador2.setText("   Icono");
        lblIconoJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnJugadores.add(lblIconoJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 178, 70, 60));

        lbllNombreJugador2.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lbllNombreJugador2.setForeground(new java.awt.Color(255, 255, 255));
        lbllNombreJugador2.setText("Nombre Jugador");
        pnJugadores.add(lbllNombreJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 178, -1, 60));

        lblIconoJugador3.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador3.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador3.setText("   Icono");
        lblIconoJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnJugadores.add(lblIconoJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 70, 60));

        lblINombreJugador3.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblINombreJugador3.setForeground(new java.awt.Color(255, 255, 255));
        lblINombreJugador3.setText("Nombre Jugador");
        pnJugadores.add(lblINombreJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 60));

        lblIconoJugador4.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador4.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador4.setText("   Icono");
        lblIconoJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnJugadores.add(lblIconoJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 70, 60));

        lblNombreJugador4.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblNombreJugador4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador4.setText("Nombre Jugador");
        pnJugadores.add(lblNombreJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, 60));

        iconConfiguracion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N
        pnJugadores.add(iconConfiguracion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        iconConfiguracion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N
        pnJugadores.add(iconConfiguracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        iconConfiguracion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N
        pnJugadores.add(iconConfiguracion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        iconConfiguracion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N
        pnJugadores.add(iconConfiguracion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        pnTurno.setBackground(new java.awt.Color(153, 204, 255));
        pnTurno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)));

        lblTurnoNombreJugador.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblTurnoNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        lblTurnoNombreJugador.setText("Nombre Jugador");

        lblTurno.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setText("Turno: ");

        javax.swing.GroupLayout pnTurnoLayout = new javax.swing.GroupLayout(pnTurno);
        pnTurno.setLayout(pnTurnoLayout);
        pnTurnoLayout.setHorizontalGroup(
            pnTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTurnoLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(pnTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTurnoLayout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(lblTurno)
                    .addContainerGap(281, Short.MAX_VALUE)))
        );
        pnTurnoLayout.setVerticalGroup(
            pnTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTurnoLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTurnoLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(pnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconConfiguracion1;
    private javax.swing.JLabel iconConfiguracion2;
    private javax.swing.JLabel iconConfiguracion3;
    private javax.swing.JLabel iconConfiguracion4;
    private javax.swing.JLabel lblINombreJugador3;
    private javax.swing.JLabel lblIconoJugador1;
    private javax.swing.JLabel lblIconoJugador2;
    private javax.swing.JLabel lblIconoJugador3;
    private javax.swing.JLabel lblIconoJugador4;
    private javax.swing.JLabel lblNombreJugador1;
    private javax.swing.JLabel lblNombreJugador4;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblTurnoNombreJugador;
    private javax.swing.JLabel lbllNombreJugador2;
    private javax.swing.JPanel pnJugadores;
    private javax.swing.JPanel pnTurno;
    // End of variables declaration//GEN-END:variables
}
