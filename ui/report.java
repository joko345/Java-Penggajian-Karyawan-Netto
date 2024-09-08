/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

// *
 //* @author JOKO PRASETYO UTOMO
 //*/
    public class report extends javax.swing.JFrame {

    public report() {
        
        initComponents();
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bgpicture = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pinjam = new javax.swing.JLabel();
        DaftarKaryawan = new javax.swing.JLabel();
        insentif = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        gaji1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        bgpicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/360_F_541288365_m9ZqOVrT5YAohdBhJH5bxVT2CkvfdfVR.png"))); // NOI18N
        jPanel1.add(bgpicture);
        bgpicture.setBounds(0, -30, 600, 430);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Karyawan", "Nama", "Jabatan", "Insentif"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 240, 460, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(643, 0, 0, 0);

        pinjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/laporpinjam.png"))); // NOI18N
        pinjam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinjamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pinjamMousePressed(evt);
            }
        });
        getContentPane().add(pinjam);
        pinjam.setBounds(580, 410, 230, 80);

        DaftarKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/laporkaryawan.png"))); // NOI18N
        DaftarKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DaftarKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DaftarKaryawanMouseClicked(evt);
            }
        });
        getContentPane().add(DaftarKaryawan);
        DaftarKaryawan.setBounds(580, 170, 230, 80);

        insentif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/laporinsentif.png"))); // NOI18N
        insentif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insentif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insentifMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insentifMousePressed(evt);
            }
        });
        getContentPane().add(insentif);
        insentif.setBounds(580, 520, 230, 80);

        kembali.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/back(2).png"))); // NOI18N
        kembali.setContentAreaFilled(false);
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali);
        kembali.setBounds(0, 20, 120, 40);

        gaji1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/laporgaji.png"))); // NOI18N
        gaji1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gaji1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gaji1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gaji1MousePressed(evt);
            }
        });
        getContentPane().add(gaji1);
        gaji1.setBounds(580, 290, 230, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/bglapor.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1370, 770);

        setSize(new java.awt.Dimension(1374, 799));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamMouseClicked
    try {
    Connection conn = new koneksi().connect();
    
            String nfile = "src/ui/pinjam.jasper";
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File(nfile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }//GEN-LAST:event_pinjamMouseClicked

    private void DaftarKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DaftarKaryawanMouseClicked
        // TODO add your handling code here:
try {
            Connection conn = new koneksi().connect();
    
            String nfile = "src/ui/karyawan.jasper";
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File(nfile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

        
        

    }//GEN-LAST:event_DaftarKaryawanMouseClicked

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        // TODO add your handling code here:
        
        this.hide();
    }//GEN-LAST:event_kembaliMouseClicked

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        this.setState(1);

    }//GEN-LAST:event_kembaliActionPerformed

    private void insentifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insentifMouseClicked

     try {
    Connection conn = new koneksi().connect();
    
            String nfile = "src/ui/intensif.jasper";
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File(nfile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        

    }//GEN-LAST:event_insentifMouseClicked

    private void gaji1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gaji1MouseClicked
       try {
    Connection conn = new koneksi().connect();
    
            String nfile = "src/ui/akhir.jasper";
            HashMap<String, Object> parameter = new HashMap<>();
            File file_report = new File(nfile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file_report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_gaji1MouseClicked

    private void gaji1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gaji1MousePressed
     
    }//GEN-LAST:event_gaji1MousePressed

    private void pinjamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamMousePressed
     
    }//GEN-LAST:event_pinjamMousePressed

    private void insentifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insentifMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_insentifMousePressed

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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DaftarKaryawan;
    private javax.swing.JLabel bgpicture;
    private javax.swing.JLabel gaji1;
    private javax.swing.JLabel insentif;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel pinjam;
    // End of variables declaration//GEN-END:variables
}
