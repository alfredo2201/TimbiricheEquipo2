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

        pnConfiguracion = new javax.swing.JPanel();
        lblTamanio = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbTamanio = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuracion");

        pnConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        pnConfiguracion.setPreferredSize(new java.awt.Dimension(520, 400));
        pnConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTamanio.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblTamanio.setForeground(new java.awt.Color(0, 0, 0));
        lblTamanio.setText("Tamaño:");
        pnConfiguracion.add(lblTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        txtNickname.setBackground(new java.awt.Color(255, 255, 255));
        txtNickname.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        txtNickname.setForeground(new java.awt.Color(0, 0, 0));
        txtNickname.setToolTipText("Ingresa tu nickname");
        txtNickname.setBorder(null);
        pnConfiguracion.add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 210, -1));
        pnConfiguracion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 210, 10));

        pnConfiguracion.add(cmbTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        lblNombre.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");
        pnConfiguracion.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pnConfiguracion.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTamanio;
    private javax.swing.JPanel pnConfiguracion;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
