/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.text.DecimalFormat;import java.util.Vector;
/**
 *
 * @author asus
 */
public class gajiKaryawan extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    private double pajakpenuh;
    /**
     * Creates new form gajiKaryawan
     */
    public gajiKaryawan() {
        initComponents();
         tbload();
   
  
        b_hapus.setVisible(true);
        b_edit.setVisible(true);
       
    }
    
    protected void aktif(){
        t_id.setEnabled(true);
        t_id.requestFocus();
    }
    
    protected void kosong(){
    t_id.setText("");
    combobox.setSelectedIndex(0);
    d_tanggal.setCalendar(null);
    }
    
    public void tbload() {
  try {
            DefaultTableModel dt = (DefaultTableModel) tb_gaji.getModel();
            dt.setRowCount(0);
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM gaji_karyawan");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
            
                dt.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
}}   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t_id = new javax.swing.JTextField();
        d_tanggal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        b_edit = new javax.swing.JButton();
        b_simpan = new javax.swing.JButton();
        b_hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_gaji = new javax.swing.JTable();
        combobox = new javax.swing.JComboBox<>();
        kembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idActionPerformed(evt);
            }
        });
        getContentPane().add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 160, -1));

        d_tanggal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(d_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jumlah Gaji");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 30));

        b_edit.setText("Ubah");
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });
        getContentPane().add(b_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 70, 40));

        b_simpan.setText("Simpan");
        b_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(b_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 80, 40));

        b_hapus.setText("Hapus");
        b_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(b_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tanggal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Karyawan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 120, 30));

        jButton1.setText("Muat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 70, 40));

        tb_gaji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Karyawan", "Jumlah Gaji", "Gaji Bersih", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_gaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_gajiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_gaji);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 850, 300));

        combobox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leader", "Marketing", "Office Boy/Girl", "Satpam" }));
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 160, -1));

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
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/Screenshot (1007).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 300, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/5.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
try {
    String sql = "UPDATE gaji_karyawan SET gaji=?, bersih=?, tgl=? WHERE Id_gj=?";
    PreparedStatement stat = conn.prepareStatement(sql);
    
    String selectedValue = combobox.getSelectedItem().toString();
    double gaji = 0.0;
    if (selectedValue.equals("Leader")) {
        gaji = 30000000;
    } else if (selectedValue.equals("Marketing")) {
        gaji = 20000000;
    } else if (selectedValue.equals("Office Boy/Girl")) {
        gaji = 4000000;
    } else if (selectedValue.equals("Satpam")) {
        gaji = 5000000;
    }
    stat.setDouble(1, gaji);
    
    double bersih = gaji - (gaji * 0.06);
    stat.setDouble(2, bersih);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String tanggal = sdf.format(d_tanggal.getDate());
    stat.setString(3, tanggal);
    stat.setString(4, t_id.getText());
    stat.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    kosong();
    t_id.requestFocus();
  String selectSql = "SELECT * FROM gaji_karyawan";
    java.sql.Statement selectStat = conn.createStatement();
    ResultSet hasil = selectStat.executeQuery(selectSql);
    DefaultTableModel model = (DefaultTableModel) tb_gaji.getModel();
    model.setRowCount(0); // Menghapus semua baris dalam tabel

    while (hasil.next()) {
        String id = hasil.getString("id_gj");
        float gj = hasil.getFloat("gaji");
        float bs = hasil.getFloat("bersih");
        String tgl = hasil.getString("tgl");
        String formattedGj = String.format("%.3f", gj); // Format gaji dengan 3 desimal
        String formattedBs = String.format("%.3f", bs); // Format gaji bersih dengan 3 desimal
        Object[] data = {id, formattedGj, formattedBs, tgl};
        model.addRow(data);
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Data Gagal Diubah: " + e.getMessage());
}

    }//GEN-LAST:event_b_editActionPerformed

    private void b_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanActionPerformed
try {
    String sql = "INSERT INTO gaji_karyawan (id_gj, gaji, bersih, tgl) VALUES (?, ?, ?, ?)";

    PreparedStatement stat = conn.prepareStatement(sql);
    stat.setString(1, t_id.getText());

    String selectedValue = combobox.getSelectedItem().toString();
    double gaji = 0.0;
    if (selectedValue.equals("Leader")) {
        gaji = 30000000;
    } else if (selectedValue.equals("Marketing")) {
        gaji = 20000000;
    } else if (selectedValue.equals("Office Boy/Girl")) {
        gaji = 4000000;
    } else if (selectedValue.equals("Satpam")) {
        gaji = 5000000;
    }
    stat.setDouble(2, gaji);

    double bersih = gaji - (gaji * 0.06);
    stat.setDouble(3, bersih);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String tanggal = sdf.format(d_tanggal.getDate());
    stat.setString(4, tanggal);

    stat.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
    kosong();
    t_id.requestFocus();
    
    String selectSql = "SELECT * FROM gaji_karyawan";
    java.sql.Statement selectStat = conn.createStatement();
    ResultSet hasil = selectStat.executeQuery(selectSql);
    DefaultTableModel model = (DefaultTableModel) tb_gaji.getModel();
    model.setRowCount(0); // Menghapus semua baris dalam tabel

    while (hasil.next()) {
        String id = hasil.getString("id_gj");
        float gj = hasil.getFloat("gaji");
        float bs = hasil.getFloat("bersih");
        String tgl = hasil.getString("tgl");
        Object[] data = { id, String.format("%.2f", gj), String.format("%.2f", bs), tgl };
        model.addRow(data);
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
}


    }//GEN-LAST:event_b_simpanActionPerformed

    private void b_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from gaji_karyawan where id_gj ='"+t_id.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                t_id.requestFocus();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_b_hapusActionPerformed

    private void tb_gajiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_gajiMouseClicked
DefaultTableModel tabmode = (DefaultTableModel) tb_gaji.getModel();
b_hapus.setVisible(true);
b_edit.setVisible(true);

int bar = tb_gaji.getSelectedRow();
String a = tabmode.getValueAt(bar, 0).toString();
String b = tabmode.getValueAt(bar, 1).toString();
String c = tabmode.getValueAt(bar, 2).toString();
String d = tabmode.getValueAt(bar, 3).toString();

t_id.setText(a);

try {
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d,yyyy");
    java.util.Date tanggal = dateFormat.parse(d);
    d_tanggal.setDate(tanggal);
} catch (ParseException ex) {
    ex.printStackTrace();
}

if (b.equals("5000000")) {
    combobox.setSelectedItem("Satpam");
} else if (b.equals("4000000")) {
    combobox.setSelectedItem("Office Boy/Girl");
} else if (Double.parseDouble(b) >= 21000000) {
    combobox.setSelectedItem("Leader");
}


    }//GEN-LAST:event_tb_gajiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
    String selectSql = "SELECT * FROM gaji_karyawan";
    java.sql.Statement selectStat = conn.createStatement();
    ResultSet hasil = selectStat.executeQuery(selectSql);
    DefaultTableModel model = (DefaultTableModel) tb_gaji.getModel();
    model.setRowCount(0); // Menghapus semua baris dalam tabel

    while (hasil.next()) {
        String id = hasil.getString("id_gj");
        float gj = hasil.getFloat("gaji");
        float bs = hasil.getFloat("bersih");
        String tgl = hasil.getString("tgl");
        String formattedGj = String.format("%.2f", gj); // Format gaji dengan 3 desimal
        String formattedBs = String.format("%.2f", bs); // Format gaji bersih dengan 3 desimal
        Object[] data = {id, formattedGj, formattedBs, tgl};
        model.addRow(data);
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        // TODO add your handling code here:

        this.hide();
    }//GEN-LAST:event_kembaliMouseClicked

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        this.setState(1);

        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(gajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gajiKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_edit;
    private javax.swing.JButton b_hapus;
    private javax.swing.JButton b_simpan;
    private javax.swing.JComboBox<String> combobox;
    private com.toedter.calendar.JDateChooser d_tanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField t_id;
    private javax.swing.JTable tb_gaji;
    // End of variables declaration//GEN-END:variables
}
