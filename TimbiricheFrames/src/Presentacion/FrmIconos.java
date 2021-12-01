/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import control.ControlFrmIconos;
import modelo.ModeloFrmCrearPartida;
import modelo.ModeloFrmIcono;
import modelo.ModeloFrmPartida;
import modelo.ModeloFrmPrincipal;
import negocios.Fabrica;
import negocios.iConexion;
import observador.IObserver;

/**
 *
 * @author Equipo gatazo
 */
public class FrmIconos extends javax.swing.JFrame implements IObserver {

    /**
     * Creates new form FrmIconos
     */
    private iConexion conexion = Fabrica.getInstance();
    private ControlFrmIconos control = new ControlFrmIconos();

    public FrmIconos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOpcionIcono4 = new javax.swing.JButton();
        btnOpcionIcono1 = new javax.swing.JButton();
        btnOpcionIcono2 = new javax.swing.JButton();
        btnOpcionIcono3 = new javax.swing.JButton();
        btnOpcionIcono8 = new javax.swing.JButton();
        btnOpcionIcono5 = new javax.swing.JButton();
        btnOpcionIcono6 = new javax.swing.JButton();
        btnOpcionIcono7 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOpcionIcono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono4.png"))); // NOI18N
        btnOpcionIcono4.setBorder(null);
        btnOpcionIcono4.setContentAreaFilled(false);
        btnOpcionIcono4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono4.png"))); // NOI18N
        btnOpcionIcono4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono4C.png"))); // NOI18N
        btnOpcionIcono4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono4ActionPerformed(evt);
            }
        });

        btnOpcionIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono1.png"))); // NOI18N
        btnOpcionIcono1.setBorder(null);
        btnOpcionIcono1.setContentAreaFilled(false);
        btnOpcionIcono1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono1.png"))); // NOI18N
        btnOpcionIcono1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono1C.png"))); // NOI18N
        btnOpcionIcono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono1ActionPerformed(evt);
            }
        });

        btnOpcionIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono2.png"))); // NOI18N
        btnOpcionIcono2.setBorder(null);
        btnOpcionIcono2.setContentAreaFilled(false);
        btnOpcionIcono2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono2.png"))); // NOI18N
        btnOpcionIcono2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono2C.png"))); // NOI18N
        btnOpcionIcono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono2ActionPerformed(evt);
            }
        });

        btnOpcionIcono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono3.png"))); // NOI18N
        btnOpcionIcono3.setBorder(null);
        btnOpcionIcono3.setContentAreaFilled(false);
        btnOpcionIcono3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono3.png"))); // NOI18N
        btnOpcionIcono3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono3C.png"))); // NOI18N
        btnOpcionIcono3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono3ActionPerformed(evt);
            }
        });

        btnOpcionIcono8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono8.png"))); // NOI18N
        btnOpcionIcono8.setBorder(null);
        btnOpcionIcono8.setContentAreaFilled(false);
        btnOpcionIcono8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono8.png"))); // NOI18N
        btnOpcionIcono8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono8C.png"))); // NOI18N
        btnOpcionIcono8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono8ActionPerformed(evt);
            }
        });

        btnOpcionIcono5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono5.png"))); // NOI18N
        btnOpcionIcono5.setBorder(null);
        btnOpcionIcono5.setContentAreaFilled(false);
        btnOpcionIcono5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono5.png"))); // NOI18N
        btnOpcionIcono5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono5C.png"))); // NOI18N
        btnOpcionIcono5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono5ActionPerformed(evt);
            }
        });

        btnOpcionIcono6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono6.png"))); // NOI18N
        btnOpcionIcono6.setBorder(null);
        btnOpcionIcono6.setContentAreaFilled(false);
        btnOpcionIcono6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono6.png"))); // NOI18N
        btnOpcionIcono6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono6C.png"))); // NOI18N
        btnOpcionIcono6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono6ActionPerformed(evt);
            }
        });

        btnOpcionIcono7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono7.png"))); // NOI18N
        btnOpcionIcono7.setBorder(null);
        btnOpcionIcono7.setContentAreaFilled(false);
        btnOpcionIcono7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono7.png"))); // NOI18N
        btnOpcionIcono7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnIcono7C.png"))); // NOI18N
        btnOpcionIcono7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionIcono7ActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelarBtn.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelarBtn2.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelarBtn2.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecione un avatar");

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoIconos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnOpcionIcono1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOpcionIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOpcionIcono3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOpcionIcono4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnOpcionIcono5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOpcionIcono6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOpcionIcono7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOpcionIcono8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel2))
            .addComponent(lblFondo)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpcionIcono1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpcionIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpcionIcono3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpcionIcono4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpcionIcono5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpcionIcono6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpcionIcono7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpcionIcono8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2))
            .addComponent(lblFondo)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcionIcono4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono4ActionPerformed
        control.añadirIconos("/img/btnIcono4.png");
//        conexion.getJugador().setAvatar("/img/btnIcono4.png");
        dispose();
    }//GEN-LAST:event_btnOpcionIcono4ActionPerformed

    private void btnOpcionIcono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono1ActionPerformed
//        conexion.getJugador().setAvatar("/img/btnIcono1.png");
        control.añadirIconos("/img/btnIcono1.png");
        dispose();

    }//GEN-LAST:event_btnOpcionIcono1ActionPerformed

    private void btnOpcionIcono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono2ActionPerformed
//        conexion.getJugador().setAvatar("/img/btnIcono2.png");
        control.añadirIconos("/img/btnIcono2.png");
        dispose();
    }//GEN-LAST:event_btnOpcionIcono2ActionPerformed

    private void btnOpcionIcono3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono3ActionPerformed
//        conexion.getJugador().setAvatar("/img/btnIcono3.png");
        control.añadirIconos("/img/btnIcono3.png");
        dispose();
    }//GEN-LAST:event_btnOpcionIcono3ActionPerformed

    private void btnOpcionIcono8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono8ActionPerformed
//        conexion.getJugador().setAvatar("/img/btnIcono8.png");
        control.añadirIconos("/img/btnIcono8.png");
        dispose();
    }//GEN-LAST:event_btnOpcionIcono8ActionPerformed

    private void btnOpcionIcono5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono5ActionPerformed
//       conexion.getJugador().setAvatar("/img/btnIcono5.png");
        control.añadirIconos("/img/btnIcono5.png");
        dispose();
    }//GEN-LAST:event_btnOpcionIcono5ActionPerformed

    private void btnOpcionIcono6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono6ActionPerformed
//        conexion.getJugador().setAvatar("/img/btnIcono6.png");
        control.añadirIconos("/img/btnIcono6.png");
        dispose();
    }//GEN-LAST:event_btnOpcionIcono6ActionPerformed

    private void btnOpcionIcono7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionIcono7ActionPerformed
//        conexion.getJugador().setAvatar("/img/btnIcono7.png");
        control.añadirIconos("/img/btnIcono7.png");
        dispose();
    }//GEN-LAST:event_btnOpcionIcono7ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmPrincipal fP = FrmPrincipal.getInstance();
        fP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOpcionIcono1;
    private javax.swing.JButton btnOpcionIcono2;
    private javax.swing.JButton btnOpcionIcono3;
    private javax.swing.JButton btnOpcionIcono4;
    private javax.swing.JButton btnOpcionIcono5;
    private javax.swing.JButton btnOpcionIcono6;
    private javax.swing.JButton btnOpcionIcono7;
    private javax.swing.JButton btnOpcionIcono8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(ModeloFrmIcono modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ModeloFrmPrincipal modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ModeloFrmPartida modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ModeloFrmCrearPartida modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
