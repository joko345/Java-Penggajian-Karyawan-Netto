/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.input.KeyCode;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import koneksi.koneksi;
/**

/**
 *
 * @author Joko Prasetyo Utomo
 */
public class lemburan extends javax.swing.JFrame {
    double intensifValue;
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form lemburan
     */
  protected void kosong(){
    nama.setText("");
    boxNik.setSelectedIndex(0);
    
    tgl.setCalendar(null);
 
    }
  
  private void dataTable() {
    Object[] Baris = {"Id Karyawan", "Nama Karyawan", "Intensif", "Keterangan", "Tanggal"};
    tabmode = new DefaultTableModel(null, Baris);
    jTable1.setModel(tabmode);
    
    String sql = "SELECT a.nik, b.namaKaryawan, a.insentif, a.noteInsentif, a.tgl " +
                 "FROM lembur a " +
                 "JOIN dataKaryawan b ON b.nik = a.nik";
    
    try {
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        
        while (hasil.next()) {
            String idnik = hasil.getString("nik");
            String nama = hasil.getString("namaKaryawan");
            String ins = hasil.getString("insentif");
            String note = hasil.getString("noteInsentif");
            java.util.Date tanggal = hasil.getDate("tgl"); // Date type
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tgl = sdf.format(tanggal); // Format Date to String
            String[] data = {idnik, nama, ins, note, tgl};
            tabmode.addRow(data);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    public lemburan() {
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);   
       initComponents();
       dataTable();
       setIdKaryawan();
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
        txtnik = new javax.swing.JLabel();
        boxNik = new javax.swing.JComboBox<>();
        txtnama = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        R1 = new javax.swing.JRadioButton();
        R3 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kembali2 = new javax.swing.JButton();
        tgl = new com.toedter.calendar.JDateChooser();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnik.setForeground(new java.awt.Color(255, 255, 255));
        txtnik.setText("Id Karyawan");
        jPanel1.add(txtnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 30));

        boxNik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNikActionPerformed(evt);
            }
        });
        jPanel1.add(boxNik, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 150, 30));

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setText("Nama Karyawan");
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 160, -1));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaKeyPressed(evt);
            }
        });
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 150, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 100, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Insentif        ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, -1));

        R1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        R1.setForeground(new java.awt.Color(255, 255, 255));
        R1.setText("Lembur");
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });
        jPanel1.add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 100, -1));

        R3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        R3.setForeground(new java.awt.Color(255, 255, 255));
        R3.setText("Penyelesaian Tugas");
        jPanel1.add(R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 210, 30));

        R2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        R2.setForeground(new java.awt.Color(255, 255, 255));
        R2.setText("Dinas");
        jPanel1.add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 93, -1));

        delete.setText("Hapus");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 80, 40));

        edit.setText("Ubah");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 80, 40));

        save.setText("Simpan");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 80, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Insentif", "Id Karyawan", "Insentif", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 750, -1));

        kembali2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        kembali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/back(2).png"))); // NOI18N
        kembali2.setContentAreaFilled(false);
        kembali2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembali2MouseClicked(evt);
            }
        });
        kembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali2ActionPerformed(evt);
            }
        });
        jPanel1.add(kembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel1.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 140, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/bginsen.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        ;

    }//GEN-LAST:event_namaActionPerformed

    private void namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaKeyPressed

    private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1ActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // jtable1 variable baru. jTable1 adalah variable table
      
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      int ok = JOptionPane.showConfirmDialog(null, "hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from lembur where nik ='"+boxNik.getSelectedItem()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                nama.requestFocus();
                dataTable();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
  if (nama.getText().isEmpty() || (!R1.isSelected() && !R2.isSelected() && !R3.isSelected())) {
        JOptionPane.showMessageDialog(this, "Tolong Masukkan Data");
    } else {
        float intens = 0; // Default insentif jika tidak ada pilihan yang dipilih
        String catat = ""; // Default catatan insentif

        if (R1.isSelected() && R1.getText().equals("Lembur")) {
            intens = 200000;
            catat = "Lembur";
        } else if (R3.isSelected() && R3.getText().equals("Penyelesaian Tugas")) {
            intens = 300000;
            catat = "Penyelesaian tugas";
        } else if (R2.isSelected() && R2.getText().equals("Dinas")) {
            intens = 500000;
            catat = "Dinas";
        }

        // Format angka insentif menjadi 3 desimal
        String formattedIntens = String.format("%.3f", intens);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tglValue = dateFormat.format(tgl.getDate());

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawantika", "root", "");
            String query = "UPDATE lembur SET namaKaryawan=?, insentif=?, noteInsentif=?, tgl=? WHERE nik=?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, nama.getText());
            statement.setString(2, formattedIntens);
            statement.setString(3, catat);
            statement.setDate(4, java.sql.Date.valueOf(tglValue));
            statement.setString(5, boxNik.getSelectedItem().toString());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");

            // Setelah diperbarui, kosongkan kotak input
            nama.setText("");
            boxNik.setSelectedIndex(0);
            tgl.setDate(null);
            R1.setSelected(false);
            R2.setSelected(false);
            R3.setSelected(false);
            dataTable();
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan SQL: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_editActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
 if (nama.getText().isEmpty() || (!R1.isSelected() && !R2.isSelected() && !R3.isSelected())) {
        JOptionPane.showMessageDialog(this, "Tolong Masukkan Data");
    } else {
        float intens = 0; // Default insentif jika tidak ada pilihan yang dipilih
        String catat = ""; // Default catatan insentif

        if (R1.isSelected() && R1.getText().equals("Lembur")) {
            intens = 200000;
            catat = "Lembur";
        } else if (R3.isSelected() && R3.getText().equals("Penyelesaian Tugas")) {
            intens = 300000;
            catat = "Penyelesaian tugas";
        } else if (R2.isSelected() && R2.getText().equals("Dinas")) {
            intens = 500000;
            catat = "Dinas";
        }

        // Format angka insentif menjadi 3 desimal
        String formattedIntens = String.format("%.3f", intens);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tglValue = dateFormat.format(tgl.getDate());

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawantika", "root", "");
            String query = "INSERT INTO lembur (nik, namaKaryawan, insentif, noteInsentif, tgl) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, boxNik.getSelectedItem().toString());
            statement.setString(2, nama.getText());
            statement.setString(3, formattedIntens);
            statement.setString(4, catat);
            statement.setDate(5, java.sql.Date.valueOf(tglValue));
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dimasukkan");

            // Setelah diinput, kosongkan kotak input
            nama.setText("");
            boxNik.setSelectedIndex(0);
            tgl.setDate(null);
            R1.setSelected(false);
            R2.setSelected(false);
            R3.setSelected(false);
            dataTable();
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan SQL: " + e.getMessage());
        }
    }
     
    }//GEN-LAST:event_saveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    DefaultTableModel tabmode = (DefaultTableModel) jTable1.getModel();
    int bar = jTable1.getSelectedRow();
    String a = tabmode.getValueAt(bar, 0).toString(); // nik
    String b = tabmode.getValueAt(bar, 1).toString(); // namaKaryawan
    String c = tabmode.getValueAt(bar, 3).toString(); // insentif
    String d = tabmode.getValueAt(bar, 4).toString(); // tgl

    boxNik.setSelectedItem(a);   
    nama.setText(b);

    if (c.equals("Lembur")) {
        R1.setSelected(true);
        R2.setSelected(false);
        R3.setSelected(false);
    } else if (c.equals("Dinas")) {
        R1.setSelected(false);
        R2.setSelected(true);
        R3.setSelected(false);
    } else if (c.equals("Penyelesaian Tugas")) {
        R1.setSelected(false);
        R2.setSelected(false);
        R3.setSelected(true);
    }

    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date tanggal = dateFormat.parse(d);
        tgl.setDate(tanggal);
    } catch (ParseException ex) {
        ex.printStackTrace();
    }

    }//GEN-LAST:event_jTable1MouseClicked

    private void boxNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNikActionPerformed
        // TODO add your handling code here:
         String sql = "SELECT * FROM dataKaryawan WHERE nik = ?";
    
    try {
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, boxNik.getSelectedItem().toString());
        ResultSet hasil = stat.executeQuery();
        
        while (hasil.next()) {
            nama.setText(hasil.getString("namaKaryawan"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_boxNikActionPerformed

    private void kembali2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembali2MouseClicked
        // TODO add your handling code here:
         home hm=new home();
            hm.setVisible(true);
        this.hide();
    }//GEN-LAST:event_kembali2MouseClicked

    private void kembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembali2ActionPerformed

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
            java.util.logging.Logger.getLogger(lemburan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lemburan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lemburan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lemburan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lemburan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> boxNik;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kembali2;
    private javax.swing.JTextField nama;
    private javax.swing.JButton save;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JLabel txtnama;
    private javax.swing.JLabel txtnik;
    // End of variables declaration//GEN-END:variables
public void setIdKaryawan() {
    List<String> kyList = new ArrayList<>(); // Objek ArrayList yang akan digunakan untuk menyimpan semua idGap yang diambil dari database.
    String sql = "SELECT nik FROM dataKaryawan"; // Query SQL untuk mengambil semua idGap dari tabel gaptabel

    try {
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);

        while (hasil.next()) {
            String nik = hasil.getString("nik");
            kyList.add(nik);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }

    DefaultComboBoxModel<String> cbnik = new DefaultComboBoxModel<>();
    for (String nik : kyList) {
        cbnik.addElement(nik);
    }

    boxNik.setModel(cbnik);
}
}
