package Presentacion;

import Control.Control;
import Control.Jugador;
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
        control = Control.getInstance();
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

    private void cargaJugador() {
        lblIconoJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource(control.getJ4().getAvatar())));
        lblNombreJugador1.setText(control.getJ4().getNombre());
        lblTurnoNombreJugador.setText(control.getJ4().getNombre());
        
        control.cargarJugador(lblIconoJugador2,lblNombreJugador2 ,control.getJ1(), 2000);
        control.cargarJugador(lblIconoJugador3,lblNombreJugador3 ,control.getJ2(),3000);
        control.cargarJugador(lblIconoJugador4,lblNombreJugador4 ,control.getJ3(),4000);
        
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
        lblIconoJugador2 = new javax.swing.JLabel();
        lblNombreJugador1 = new javax.swing.JLabel();
        btnCambiaColor = new javax.swing.JButton();
        lblIconoJugador1 = new javax.swing.JLabel();
        lblIconoJugador4 = new javax.swing.JLabel();
        lblIconoJugador3 = new javax.swing.JLabel();
        lblNombreJugador2 = new javax.swing.JLabel();
        btnCambiaColor1 = new javax.swing.JButton();
        btnCambiaColor2 = new javax.swing.JButton();
        lblNombreJugador3 = new javax.swing.JLabel();
        lblNombreJugador4 = new javax.swing.JLabel();
        btnCambiaColor3 = new javax.swing.JButton();
        pnTurnos = new javax.swing.JPanel();
        lblTurno = new javax.swing.JLabel();
        lblTurnoNombreJugador = new javax.swing.JLabel();
        btnAbandonaPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timbiriche");
        setBackground(new java.awt.Color(255, 255, 255));

        pnJugadores.setBackground(new java.awt.Color(41, 43, 47));
        pnJugadores.setPreferredSize(new java.awt.Dimension(400, 720));

        lblIconoJugador2.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador2.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIconoJugador2.setMaximumSize(new java.awt.Dimension(129, 128));
        lblIconoJugador2.setMinimumSize(new java.awt.Dimension(129, 128));

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

        lblIconoJugador1.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIconoJugador1.setMaximumSize(new java.awt.Dimension(129, 128));
        lblIconoJugador1.setMinimumSize(new java.awt.Dimension(129, 128));

        lblIconoJugador4.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador4.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIconoJugador4.setMaximumSize(new java.awt.Dimension(129, 128));
        lblIconoJugador4.setMinimumSize(new java.awt.Dimension(129, 128));

        lblIconoJugador3.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblIconoJugador3.setForeground(new java.awt.Color(255, 255, 255));
        lblIconoJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIconoJugador3.setMaximumSize(new java.awt.Dimension(129, 128));
        lblIconoJugador3.setMinimumSize(new java.awt.Dimension(129, 128));

        lblNombreJugador2.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lblNombreJugador2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador2.setText("Nombre Jugador");

        btnCambiaColor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor.png"))); // NOI18N
        btnCambiaColor1.setBorder(null);
        btnCambiaColor1.setContentAreaFilled(false);
        btnCambiaColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiaColor1ActionPerformed(evt);
            }
        });

        btnCambiaColor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor.png"))); // NOI18N
        btnCambiaColor2.setBorder(null);
        btnCambiaColor2.setContentAreaFilled(false);
        btnCambiaColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiaColor2ActionPerformed(evt);
            }
        });

        lblNombreJugador3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lblNombreJugador3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador3.setText("Nombre Jugador");

        lblNombreJugador4.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lblNombreJugador4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador4.setText("Nombre Jugador");

        btnCambiaColor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnColor.png"))); // NOI18N
        btnCambiaColor3.setBorder(null);
        btnCambiaColor3.setContentAreaFilled(false);
        btnCambiaColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiaColor3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnJugadoresLayout = new javax.swing.GroupLayout(pnJugadores);
        pnJugadores.setLayout(pnJugadoresLayout);
        pnJugadoresLayout.setHorizontalGroup(
            pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnJugadoresLayout.createSequentialGroup()
                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreJugador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addComponent(lblIconoJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreJugador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCambiaColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIconoJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIconoJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                                        .addComponent(lblNombreJugador3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCambiaColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                                        .addComponent(lblNombreJugador4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCambiaColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnJugadoresLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(lblIconoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );
        pnJugadoresLayout.setVerticalGroup(
            pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnJugadoresLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblIconoJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCambiaColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIconoJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIconoJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblNombreJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnCambiaColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lblNombreJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnCambiaColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnJugadoresLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(lblIconoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(519, Short.MAX_VALUE)))
        );

        pnTurnos.setBackground(new java.awt.Color(41, 43, 47));
        pnTurnos.setForeground(new java.awt.Color(41, 43, 47));

        lblTurno.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setText("Turno: ");

        lblTurnoNombreJugador.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lblTurnoNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        lblTurnoNombreJugador.setText("Nombre Jugador");

        javax.swing.GroupLayout pnTurnosLayout = new javax.swing.GroupLayout(pnTurnos);
        pnTurnos.setLayout(pnTurnosLayout);
        pnTurnosLayout.setHorizontalGroup(
            pnTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTurnosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTurno)
                .addGap(18, 18, 18)
                .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTurnosLayout.setVerticalGroup(
            pnTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTurnosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurnoNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnAbandonaPartida.setBackground(new java.awt.Color(153, 153, 153));
        btnAbandonaPartida.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnAbandonaPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAbandonar.png"))); // NOI18N
        btnAbandonaPartida.setBorder(null);
        btnAbandonaPartida.setContentAreaFilled(false);
        btnAbandonaPartida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAbandonar.png"))); // NOI18N
        btnAbandonaPartida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAbandonarC.png"))); // NOI18N
        btnAbandonaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonaPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1301, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(pnTurnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAbandonaPartida)
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(pnTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAbandonaPartida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiaColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColorActionPerformed
        Color c = JColorChooser.showDialog(this, "Color de jugador", Color.white);
        if (c != null) {
            lblNombreJugador1.setForeground(c);
            Jugador jugador = new Jugador();
            Control ct = Control.getInstance();
            ct.getJ4().setColor(c);
            jugador.setColor(c);

        }
    }//GEN-LAST:event_btnCambiaColorActionPerformed

    private void btnAbandonaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonaPartidaActionPerformed
        FrmPrincipal pr = FrmPrincipal.getInstance();
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAbandonaPartidaActionPerformed

    private void btnCambiaColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiaColor1ActionPerformed

    private void btnCambiaColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiaColor2ActionPerformed

    private void btnCambiaColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiaColor3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonaPartida;
    private javax.swing.JButton btnCambiaColor;
    private javax.swing.JButton btnCambiaColor1;
    private javax.swing.JButton btnCambiaColor2;
    private javax.swing.JButton btnCambiaColor3;
    private javax.swing.JLabel lblIconoJugador1;
    private javax.swing.JLabel lblIconoJugador2;
    private javax.swing.JLabel lblIconoJugador3;
    private javax.swing.JLabel lblIconoJugador4;
    private javax.swing.JLabel lblNombreJugador1;
    private javax.swing.JLabel lblNombreJugador2;
    private javax.swing.JLabel lblNombreJugador3;
    private javax.swing.JLabel lblNombreJugador4;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblTurnoNombreJugador;
    private javax.swing.JPanel pnJugadores;
    private javax.swing.JPanel pnTurnos;
    // End of variables declaration//GEN-END:variables
}
