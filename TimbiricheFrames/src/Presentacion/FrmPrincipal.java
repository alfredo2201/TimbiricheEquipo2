package Presentacion;

import Control.Control;
import Control.Tablero;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrnPrincipal
     */
    private Control ct;
    private static FrmPrincipal instancia;
    Timer tiempo;

    FrmPrincipal() {
        initComponents();
        this.setTitle("El Juego de Timbiriche");
        this.setLocationRelativeTo(null);
        this.ct = Control.getInstance();
    }

    public static FrmPrincipal getInstance() {
        if (instancia == null) {
            instancia = new FrmPrincipal();
        }
        return instancia;
        
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        btnAvatar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnIngresar1 = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(33, 33, 33));

        txtNombre.setBackground(new java.awt.Color(41, 43, 47));
        txtNombre.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escogeIconosBtn.png"))); // NOI18N
        btnAvatar.setBorder(null);
        btnAvatar.setContentAreaFilled(false);
        btnAvatar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escogeIconosBtn2.png"))); // NOI18N
        btnAvatar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escogeIconosBtn2.png"))); // NOI18N
        btnAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvatarActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Fugaz One", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresarBtn.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresarBtnC.png"))); // NOI18N
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresarBtnC.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnIngresar1.setFont(new java.awt.Font("Fugaz One", 0, 14)); // NOI18N
        btnIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/partidaBtn.png"))); // NOI18N
        btnIngresar1.setBorder(null);
        btnIngresar1.setContentAreaFilled(false);
        btnIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/partidaBtnC.png"))); // NOI18N
        btnIngresar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/partidaBtnC.png"))); // NOI18N
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoPrincipal.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(btnAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblImagen)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(btnAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        String nombre = txtNombre.getText();
        if (txtNombre.getText().length() < 10) {
            String padded = String.format("%-10s", nombre);
            nombre = (padded);
        }

        ct.getJ4().setNombre(nombre);
        String icono = ct.getJ4().getAvatar();
        if (nombre.equalsIgnoreCase("") || icono == null) {
            JOptionPane.showMessageDialog(null, "Debe de poner su nombre o seleccionar un icono",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            frmCrearPartida crearPartida = frmCrearPartida.getInstance();
            crearPartida.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        tiempo = new Timer(2000, null);
        tiempo.start();

        String nombre = txtNombre.getText();
        if (txtNombre.getText().length() < 10) {
            String padded = String.format("%-10s", nombre);
            nombre = (padded);
        }

        Tablero tablero = new Tablero();
        tablero.setTamanio(40);
        ct.getJ4().setNombre(nombre);
        String icono = ct.getJ4().getAvatar();
        if (nombre.equalsIgnoreCase("") || icono == null) {
            JOptionPane.showMessageDialog(null, "Debe de poner su nombre o seleccionar un icono",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            tiempo.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    operacion();
                }

                private void operacion() {
                    JOptionPane.showMessageDialog(null, "Has sido aceptado en el juego",
                            "", JOptionPane.INFORMATION_MESSAGE);
                    FrmPartida sala = FrmPartida.getInstance(tablero);
                    sala.setVisible(true);
                    tiempo.stop();
                    sala.boton(false);
                    dispose();
                }

            });

        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatarActionPerformed
        FrmIconos fi = new FrmIconos();
        fi.setVisible(true);

    }//GEN-LAST:event_btnAvatarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        if (txtNombre.getText().length() == 10) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo se permiten 10 caracteres");
        }
    }//GEN-LAST:event_txtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvatar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
