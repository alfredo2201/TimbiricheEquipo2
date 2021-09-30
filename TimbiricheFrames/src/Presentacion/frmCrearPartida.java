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

        txtNickname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbTamanio = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblTamanio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuracion");

        txtNickname.setBackground(new java.awt.Color(255, 255, 255));
        txtNickname.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        txtNickname.setForeground(new java.awt.Color(0, 0, 0));
        txtNickname.setToolTipText("Ingresa tu nickname");
        txtNickname.setBorder(null);

        lblNombre.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblTamanio.setFont(new java.awt.Font("Fugaz One", 0, 18)); // NOI18N
        lblTamanio.setForeground(new java.awt.Color(0, 0, 0));
        lblTamanio.setText("Tamaño:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(5, 5, 5)
                        .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTamanio)
                        .addGap(11, 11, 11)
                        .addComponent(cmbTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnAceptar)))
                .addGap(0, 111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTamanio)
                    .addComponent(cmbTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnAceptar)
                .addGap(0, 113, Short.MAX_VALUE))
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
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
