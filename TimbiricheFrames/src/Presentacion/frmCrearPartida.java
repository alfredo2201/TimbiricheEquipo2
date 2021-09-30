/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author crist
 */
public class frmCrearPartida extends javax.swing.JFrame {

    /**
     * Creates new form frmCrearPartida
     */
    private static frmCrearPartida instancia;
    private DefaultComboBoxModel cmbModelTamanio = this.cmbModelTamanio;
    private final int[]lista;
    private frmCrearPartida() {
        this.lista = new int[]{10, 20, 40};
        initComponents();
        agregarTamanioLista();
        this.setLocationRelativeTo(null);
    }
    
    public static frmCrearPartida getInstance(){
        if (instancia == null) {
            instancia = new frmCrearPartida();
        }
        return instancia;
    }
    public int tamanioTablero(){
        return (int)cmbTamanio.getSelectedItem();
    }
    private void agregarTamanioLista(){
        for (int i = 0; i < lista.length; i++) {
            cmbTamanio.addItem(lista[i]);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTamanio = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        cmbTamanio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuracion");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTamanio.setFont(new java.awt.Font("OCR A Extended", 1, 20)); // NOI18N
        lblTamanio.setForeground(new java.awt.Color(255, 255, 255));
        lblTamanio.setText("Tamaño del tablero:");
        jPanel1.add(lblTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmarBtn.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmarBtn2.png"))); // NOI18N
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmarBtn2.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 140, 50));

        cmbTamanio.setFont(new java.awt.Font("OCR A Extended", 1, 20)); // NOI18N
        jPanel1.add(cmbTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoIconos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 620, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        FrmPartida partida = FrmPartida.getInstance(this.tamanioTablero());
        partida.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<Integer> cmbTamanio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTamanio;
    // End of variables declaration//GEN-END:variables
}
