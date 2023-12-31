/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.form.ticket;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class FormTiket extends javax.swing.JFrame {

    /**
     * Creates new form FormTiket
     */
    public FormTiket() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        nama = new javax.swing.JLabel();
        umur = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtumur = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Form Tiket");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        nama.setText("Nama");

        umur.setText("Umur");

        jumlah.setText("Jumlah Tiket");

        total.setText("Total");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtumur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtumurActionPerformed(evt);
            }
        });

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama)
                            .addComponent(umur)
                            .addComponent(jumlah)
                            .addComponent(total))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtumur)
                            .addComponent(txtjumlah)
                            .addComponent(txttotal)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Simpan)))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nama)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umur)
                    .addComponent(txtumur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Simpan)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
     
    }//GEN-LAST:event_txtnamaActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
       try{
            String nama = txtnama.getText().toString().trim();
            int umur = Integer.parseInt(txtumur.getText());
            int jumlah = Integer.parseInt(txtjumlah.getText());
            int total = 0;
               if (umur > 35){
                   total = jumlah * 150000;
                   txttotal.setText(Integer.toString(total));
                   JOptionPane.showMessageDialog(null, "Nama : "+nama+"\nUmur : "+umur+"\nTiket : "+jumlah+"\nTotal : "+total);
                } else if (umur > 25) {
                   total = jumlah * 100000;
                   txttotal.setText(Integer.toString(total));
                   JOptionPane.showMessageDialog(null, "Nama : "+nama+"\nUmur : "+umur+"\nTiket : "+jumlah+"\nTotal : "+total);
                }else if (umur > 17) {
                   total = jumlah * 50000;
                   txttotal.setText(Integer.toString(total));
                   JOptionPane.showMessageDialog(null, "Nama : "+nama+"\nUmur : "+umur+"\nTiket : "+jumlah+"\nTotal : "+total);                
                } else {
                    JOptionPane.showMessageDialog(null,"Usia di bawah 17 tahun tidak boleh mendaftar\nUntuk mendaftar dan membeli Tiket Harus berumur diatas 17 tahun");
                }
             }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Semua isian Harus Diisi!");
        }
    
    }//GEN-LAST:event_SimpanActionPerformed

    private void txtumurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtumurActionPerformed
    
    }//GEN-LAST:event_txtumurActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
             
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
   
    }//GEN-LAST:event_txtjumlahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtumur;
    private javax.swing.JLabel umur;
    // End of variables declaration//GEN-END:variables
}
