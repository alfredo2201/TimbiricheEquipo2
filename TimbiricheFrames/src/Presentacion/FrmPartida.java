package Presentacion;

import Control.Control;
import Control.Jugador;
import Control.Tablero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

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
    private Timer tiempo;
    

    private FrmPartida(Tablero tablero) {
        initComponents();
        control = Control.getInstance();
        this.setExtendedState(MAXIMIZED_BOTH);
        configuracionLienzo(tablero);
        g = lienzo.getGraphics();
        this.setResizable(false);
        cargaJugador();
         btnPreparado.setEnabled(false);
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
        control.cargarJugador(lblIconoJugador2, lblNombreJugador2, control.getJ1(), 2000);
        control.cargarJugador(lblIconoJugador3, lblNombreJugador3, control.getJ2(), 3000);
        control.cargarJugador(lblIconoJugador4, lblNombreJugador4, control.getJ3(), 4000);
    }

    public void boton(boolean tipoJugador) {
        if (tipoJugador == false) {
            btnComenzarPartida.setEnabled(false);
        } else {
           
            btnComenzarPartida.setEnabled(true);
        }
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
        btnComenzarPartida = new javax.swing.JButton();
        btnAbandonarPartida = new javax.swing.JButton();
        btnPreparado = new javax.swing.JButton();

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
                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombreJugador1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCambiaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnJugadoresLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(lblIconoJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNombreJugador2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCambiaColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconoJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconoJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addComponent(lblNombreJugador3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCambiaColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addComponent(lblNombreJugador4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCambiaColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                                .addComponent(lblNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJugadoresLayout.createSequentialGroup()
                                .addComponent(btnCambiaColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addComponent(lblIconoJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIconoJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnJugadoresLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCambiaColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lblNombreJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnJugadoresLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnCambiaColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(pnJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnJugadoresLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(lblIconoJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(452, Short.MAX_VALUE)))
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

        btnComenzarPartida.setBackground(new java.awt.Color(153, 153, 153));
        btnComenzarPartida.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnComenzarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnComenzar.png"))); // NOI18N
        btnComenzarPartida.setBorder(null);
        btnComenzarPartida.setContentAreaFilled(false);
        btnComenzarPartida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnComenzar.png"))); // NOI18N
        btnComenzarPartida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnComenzarC.png"))); // NOI18N
        btnComenzarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarPartidaActionPerformed(evt);
            }
        });

        btnAbandonarPartida.setBackground(new java.awt.Color(153, 153, 153));
        btnAbandonarPartida.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnAbandonarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAbandonar.png"))); // NOI18N
        btnAbandonarPartida.setBorder(null);
        btnAbandonarPartida.setContentAreaFilled(false);
        btnAbandonarPartida.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAbandonar.png"))); // NOI18N
        btnAbandonarPartida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAbandonarC.png"))); // NOI18N
        btnAbandonarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarPartidaActionPerformed(evt);
            }
        });

        btnPreparado.setBackground(new java.awt.Color(153, 153, 153));
        btnPreparado.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnPreparado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnPreparado.png"))); // NOI18N
        btnPreparado.setBorder(null);
        btnPreparado.setContentAreaFilled(false);
        btnPreparado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnPreparado.png"))); // NOI18N
        btnPreparado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnPreparadoC.png"))); // NOI18N
        btnPreparado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreparadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1292, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbandonarPartida)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnComenzarPartida)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPreparado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                        .addComponent(pnTurnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnComenzarPartida))
                    .addComponent(btnPreparado))
                .addGap(2, 2, 2)
                .addComponent(btnAbandonarPartida)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void btnComenzarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarPartidaActionPerformed
        tiempo = new Timer(5000, null);
        tiempo.start();
        Color myWhite = new Color(255, 255, 255); // Color white

        if (lblNombreJugador1.getForeground().equals(myWhite) || lblNombreJugador2.getForeground().equals(myWhite)
                || lblNombreJugador3.getForeground().equals(myWhite) || lblNombreJugador4.getForeground().equals(myWhite)) {
            JOptionPane.showMessageDialog(null, "Escoge el color de tus contrincantes",
                    "", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cargando...",
                    "", JOptionPane.INFORMATION_MESSAGE);
            tiempo.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    operacion();
                }

                private void operacion() {
                    tiempo.stop();
                    btnPreparado.setEnabled(false);
                    btnCambiaColor1.setEnabled(false);
                    btnCambiaColor2.setEnabled(false);
                    btnCambiaColor3.setEnabled(false);
                    btnCambiaColor.setEnabled(false);

                }
            });
        }
    }//GEN-LAST:event_btnComenzarPartidaActionPerformed

    private void btnCambiaColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColor1ActionPerformed
        Color c = JColorChooser.showDialog(this, "Color de jugador", Color.white);
        if (c != null) {
            lblNombreJugador2.setForeground(c);
            Jugador jugador = new Jugador();
            Control ct = Control.getInstance();
            ct.getJ1().setColor(c);
            jugador.setColor(c);
        }

    }//GEN-LAST:event_btnCambiaColor1ActionPerformed

    private void btnCambiaColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColor2ActionPerformed

        Color c = JColorChooser.showDialog(this, "Color de jugador", Color.white);
        if (c != null) {
            lblNombreJugador3.setForeground(c);
            Jugador jugador = new Jugador();
            Control ct = Control.getInstance();
            ct.getJ2().setColor(c);
            jugador.setColor(c);
        }
    }//GEN-LAST:event_btnCambiaColor2ActionPerformed

    private void btnCambiaColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaColor3ActionPerformed
        Color c = JColorChooser.showDialog(this, "Color de jugador", Color.white);
        if (c != null) {
            lblNombreJugador4.setForeground(c);
            Jugador jugador = new Jugador();
            Control ct = Control.getInstance();
            ct.getJ3().setColor(c);
            jugador.setColor(c);

        }
    }//GEN-LAST:event_btnCambiaColor3ActionPerformed

    private void btnAbandonarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarPartidaActionPerformed
        FrmPrincipal pr = FrmPrincipal.getInstance();
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAbandonarPartidaActionPerformed

    private void btnPreparadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreparadoActionPerformed
        tiempo = new Timer(5000, null);
        tiempo.start();
        Color myWhite = new Color(255, 255, 255); // Color white

        if (lblNombreJugador1.getForeground().equals(myWhite) || lblNombreJugador2.getForeground().equals(myWhite)
                || lblNombreJugador3.getForeground().equals(myWhite) || lblNombreJugador4.getForeground().equals(myWhite)) {
            JOptionPane.showMessageDialog(null, "Escoge el color de tus contrincantes",
                    "", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El juego comenzará en breve cuando los demás participantes estén preparados",
                    "", JOptionPane.INFORMATION_MESSAGE);
            tiempo.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    operacion();
                }

                private void operacion() {
                    tiempo.stop();
                    btnPreparado.setEnabled(false);
                    btnCambiaColor1.setEnabled(false);
                    btnCambiaColor2.setEnabled(false);
                    btnCambiaColor3.setEnabled(false);
                    btnCambiaColor.setEnabled(false);

                }
            });
        }

    }//GEN-LAST:event_btnPreparadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonarPartida;
    private javax.swing.JButton btnCambiaColor;
    private javax.swing.JButton btnCambiaColor1;
    private javax.swing.JButton btnCambiaColor2;
    private javax.swing.JButton btnCambiaColor3;
    private javax.swing.JButton btnComenzarPartida;
    private javax.swing.JButton btnPreparado;
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
