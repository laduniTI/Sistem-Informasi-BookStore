/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book;

import javax.swing.*;
import java.awt.event.*;


public class MenuUtama extends javax.swing.JFrame {

    private boolean b;

   
    public MenuUtama() {
        initComponents();
        setSize(530, 370);
        setDefaultCloseOperation(penulis.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    
    
      btnAnggota.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            anggota anggotaFrame = new anggota(); 
            anggotaFrame.setVisible(true); 
        }
    });
      
      btnbuku.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            buku bukuFrame = new buku(); 
            bukuFrame.setVisible(true); 
        }
    });
      
       btnpenerbit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            penulis penerbitFrame = new penulis(); 
            penerbitFrame.setVisible(true); 
        }
    });
       
        
         btnpenjualan.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            transaksibuku PenjualanFrame = new transaksibuku(); 
            PenjualanFrame.setVisible(true); 
        }
    });

}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuUtama = new javax.swing.JMenu();
        btnbuku = new javax.swing.JMenuItem();
        btnpenerbit = new javax.swing.JMenuItem();
        btnAnggota = new javax.swing.JMenuItem();
        btnpenjualan = new javax.swing.JMenuItem();
        Keluar = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\palup\\Downloads\\kartun.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 255, 0));

        MenuUtama.setForeground(new java.awt.Color(0, 51, 255));
        MenuUtama.setText("SILAKAN PILIH");
        MenuUtama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUtamaActionPerformed(evt);
            }
        });

        btnbuku.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnbuku.setText("1).BUKU");
        MenuUtama.add(btnbuku);

        btnpenerbit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnpenerbit.setForeground(new java.awt.Color(51, 51, 255));
        btnpenerbit.setText("2).PENULIS");
        MenuUtama.add(btnpenerbit);

        btnAnggota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAnggota.setForeground(new java.awt.Color(51, 0, 255));
        btnAnggota.setText("3).ANGGOTA");
        btnAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnggotaActionPerformed(evt);
            }
        });
        MenuUtama.add(btnAnggota);

        btnpenjualan.setBackground(new java.awt.Color(255, 204, 51));
        btnpenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnpenjualan.setForeground(new java.awt.Color(0, 204, 0));
        btnpenjualan.setText("4).TRANSAKSI");
        MenuUtama.add(btnpenjualan);

        Keluar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Keluar.setForeground(new java.awt.Color(255, 0, 0));
        Keluar.setText("5).KELUAR");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        MenuUtama.add(Keluar);

        jMenuBar1.add(MenuUtama);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    private void btnAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnggotaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAnggotaActionPerformed

    private void MenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUtamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MenuUtamaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Keluar;
    private javax.swing.JMenu MenuUtama;
    private javax.swing.JMenuItem btnAnggota;
    private javax.swing.JMenuItem btnbuku;
    private javax.swing.JMenuItem btnpenerbit;
    private javax.swing.JMenuItem btnpenjualan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}