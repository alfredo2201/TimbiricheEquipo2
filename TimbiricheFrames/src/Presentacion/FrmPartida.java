package Presentacion;

import Control.Control;
import Control.Tablero;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;
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
    private static FrmPartida instance;
    private final Graphics g;
    private JPanel lienzo;
    private final Control control;

    private FrmPartida(Tablero tablero) {
        initComponents();
        control = new Control();
        this.setExtendedState(MAXIMIZED_BOTH);
        configuracionLienzo(tablero);
        g = lienzo.getGraphics();
        cargaJugador();
    }


    private void configuracionLienzo(Tablero tablero) {
        lienzo = new pnJuego(tablero);//se inicializa el lienzo
        lienzo.setLocation(200, 0); //se establece su posición
        lienzo.setSize(1010, 1010); //establece el tamaño del panel
        lienzo.setVisible(true);
        add(lienzo); //se agrega al frame principal
        pack();
    }
    
    
    private void cargaJugador(){
        control.simulaCargaJuagadores();
        lblIconoJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource(control.getJ1().getAvatar())));
        lblNombreJugador1.setText(control.getJ1().getNombre());
    }
    
    
    

    public static FrmPartida getInstance(Tablero tablero) {
        if (instance == null) {
            instance = new FrmPartida(tablero);
        }
        return instance;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnJugadores = new javax.swing.JPanel();
        lblIconoJugador1 = new javax.swing.JLabel();
        lblNombreJugador1 = new javax.swing.JLabel();
        btnCambiaColor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTurno = new javax.swing.JLabel();
        lblTurnoNombreJugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timbiriche");

        pnJugadores.setBackground(new java.awt.Color(41, 43, 47));
        pnJugadores.setPreferredSize(new java.awt.Dimension(400, 720));

        lblIconoJugador1.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIconoJugador1.setMaximumSize(new java.awt.Dimension(129, 128));
        lblIconoJugador1.setMinimumSize(new java.awt.Dimension(129, 128));

        lblNombreJugador1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lblNombreJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador1.setText("Nombre Jugador");

        btnCambiaColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor.png"))); // NOI18N
        btnCambiaColor.setBorder(null);
        btnCambiaColor.setContentAreaFilled(false);
        btnCambiaColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiaColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnJugadoresLayout = new javax.swing.GroupLayout(pnJugadores);
        pnJugadores.setLayout(pnJugadoresLayout);
        pnJugadoresLayout.setHorizontalGroup(
            pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblIconoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreJugador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnJugadoresLayout.setVerticalGroup(
            pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnJugadoresLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIconoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnCambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(529, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(41, 43, 47));
        jPanel3.setForeground(new java.awt.Color(41, 43, 47));

        lblTurno.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setText("Turno: ");

        lblTurnoNombreJugador.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lblTurnoNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        lblTurnoNombreJugador.setText("Nombre Jugador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(lblTurno)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1318, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiaColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColorActionPerformed
        Color c = JColorChooser.showDialog(this, "Color de jugador", Color.white);
        if (c != null) {
            lblNombreJugador1.setForeground(c);
        }
    }//GEN-LAST:event_btnCambiaColorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiaColor;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIconoJugador1;
    private javax.swing.JLabel lblNombreJugador1;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblTurnoNombreJugador;
    private javax.swing.JPanel pnJugadores;
    // End of variables declaration//GEN-END:variables
}
