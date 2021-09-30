package Presentacion;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author crist
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrnPrincipal
     */
    private static FrmPrincipal instancia;

    FrmPrincipal() {
        initComponents();
        this.setTitle("El Juego de Timbiriche");
        this.setLocationRelativeTo(null);

    }

    public static FrmPrincipal getInstance() {
        if (instancia == null) {
            instancia = new FrmPrincipal();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lbNombre = new javax.swing.JTextField();
        btnAvatar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnIngresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(33, 33, 33));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombre.setBackground(new java.awt.Color(41, 43, 47));
        lbNombre.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setBorder(null);
        lbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNombreActionPerformed(evt);
            }
        });
        panelPrincipal.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 282, 300, 30));

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
        panelPrincipal.add(btnAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 80, 60));

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
        panelPrincipal.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 390, 199, 56));

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
        panelPrincipal.add(btnIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 390, 199, 56));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoPrincipal.png"))); // NOI18N
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

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
        frmCrearPartida crearPartida = frmCrearPartida.getInstance();
        crearPartida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
//        lbNombre.getText();
//        
        int size = 10;
        FrmPartida sala = FrmPartida.getInstance(size);
        sala.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNombreActionPerformed

    private void btnAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatarActionPerformed
        FrmIconos fi = new FrmIconos();
        fi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAvatarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvatar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lbNombre;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
