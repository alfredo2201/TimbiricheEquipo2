package Presentacion;


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
public class FrmPartida extends javax.swing.JFrame {

    /**
     * Creates new form FrmSala
     */
    private static FrmPartida instance ;
    Graphics g;
    JPanel lienzo;

    private FrmPartida(int tamanio) {

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
    public static FrmPartida getInstance(int tamanio){
        if (instance == null) {
            instance = new FrmPartida(tamanio);
        }
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblIconoJugador4 = new javax.swing.JLabel();
        lblIconoJugador3 = new javax.swing.JLabel();
        lblIconoJugador2 = new javax.swing.JLabel();
        lblIconoJugador1 = new javax.swing.JLabel();
        lblNombreJugador1 = new javax.swing.JLabel();
        lbllNombreJugador2 = new javax.swing.JLabel();
        lblINombreJugador3 = new javax.swing.JLabel();
        lblNombreJugador4 = new javax.swing.JLabel();
        iconConfiguracion4 = new javax.swing.JLabel();
        iconConfiguracion3 = new javax.swing.JLabel();
        iconConfiguracion2 = new javax.swing.JLabel();
        iconConfiguracion1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTurno = new javax.swing.JLabel();
        lblTurnoNombreJugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timbiriche");

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        lblIconoJugador4.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador4.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador4.setText("   Icono");
        lblIconoJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIconoJugador3.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador3.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador3.setText("   Icono");
        lblIconoJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIconoJugador2.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador2.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador2.setText("   Icono");
        lblIconoJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIconoJugador1.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador1.setText("   Icono");
        lblIconoJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreJugador1.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblNombreJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador1.setText("Nombre Jugador");

        lbllNombreJugador2.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lbllNombreJugador2.setForeground(new java.awt.Color(255, 255, 255));
        lbllNombreJugador2.setText("Nombre Jugador");

        lblINombreJugador3.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblINombreJugador3.setForeground(new java.awt.Color(255, 255, 255));
        lblINombreJugador3.setText("Nombre Jugador");

        lblNombreJugador4.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblNombreJugador4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador4.setText("Nombre Jugador");

        iconConfiguracion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N

        iconConfiguracion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N

        iconConfiguracion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N

        iconConfiguracion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confi.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIconoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblNombreJugador1)
                        .addGap(4, 4, 4)
                        .addComponent(iconConfiguracion1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblIconoJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lbllNombreJugador2)
                        .addGap(4, 4, 4)
                        .addComponent(iconConfiguracion2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblIconoJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblINombreJugador3)
                        .addGap(4, 4, 4)
                        .addComponent(iconConfiguracion3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblIconoJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblNombreJugador4)
                        .addGap(4, 4, 4)
                        .addComponent(iconConfiguracion4)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(iconConfiguracion1)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconoJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(iconConfiguracion2)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconoJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblINombreJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(iconConfiguracion3)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconoJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iconConfiguracion4)))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        lblTurno.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 0, 0));
        lblTurno.setText("Turno: ");

        lblTurnoNombreJugador.setFont(new java.awt.Font("Fugaz One", 0, 24)); // NOI18N
        lblTurnoNombreJugador.setForeground(new java.awt.Color(0, 0, 0));
        lblTurnoNombreJugador.setText("Nombre Jugador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(lblTurno)
                    .addGap(15, 15, 15)
                    .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1271, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconConfiguracion1;
    private javax.swing.JLabel iconConfiguracion2;
    private javax.swing.JLabel iconConfiguracion3;
    private javax.swing.JLabel iconConfiguracion4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    // End of variables declaration//GEN-END:variables
}
