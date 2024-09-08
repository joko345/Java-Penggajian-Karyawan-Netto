/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javafx.scene.input.KeyCode;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

// * @author Administrator
 
public class Karyawan extends javax.swing.JFrame {
 private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form JTable
     */
    public Karyawan() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        dataTable();
    }
  private void dataTable() {
    Object[] Baris = {"Id Karyawan", "Nama Karyawan", "Jenis Kelamin", "Alamat", "Agama", "Status Kawin", "Jabatan"};
    tabmode = new DefaultTableModel(null, Baris);
    jTable1.setModel(tabmode);
    
    String sql = "SELECT * from dataKaryawan";
    
    try {
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        
        while (hasil.next()) {
            String idnik = hasil.getString("nik");
            String nama = hasil.getString("namaKaryawan");
            String kl = hasil.getString("jnsKelamin");
            String alamat = hasil.getString("alamat");            
            String agama = hasil.getString("agama");
            String kawin = hasil.getString("kawin");           
            String jabatan = hasil.getString("jabatan");
            String[] data = {idnik, nama, kl, alamat, agama, kawin, jabatan};
            tabmode.addRow(data);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}           
            private void kosong(){
            boxidkaryawan.setText("");
            boxnama.setText("");
            boxalamat.setText("");
            boxagama.setSelectedIndex(0);
            boxkawin.setSelectedIndex(0);
            boxkerja.setSelectedIndex(0);
            boxkelamin1.setSelected(false);
            boxkelamin2.setSelected(false);

}
    // ...
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtktp = new javax.swing.JLabel();
        boxidkaryawan = new javax.swing.JTextField();
        boxkerja = new javax.swing.JComboBox<>();
        txtnama = new javax.swing.JLabel();
        boxnama = new javax.swing.JTextField();
        txtkelamin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        txtalamat = new javax.swing.JLabel();
        txtagama = new javax.swing.JLabel();
        txtkawin = new javax.swing.JLabel();
        txtagama1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        boxkelamin1 = new javax.swing.JRadioButton();
        boxkelamin2 = new javax.swing.JRadioButton();
        boxagama = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        boxkawin = new javax.swing.JComboBox<>();
        kembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxalamat = new javax.swing.JTextArea();
        bgpicture = new javax.swing.JLabel();
        boalamat = new javax.swing.JTextField();
        Savedatabase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 550, 0);

        txtktp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtktp.setForeground(new java.awt.Color(255, 255, 255));
        txtktp.setText("Id Karyawan");
        getContentPane().add(txtktp);
        txtktp.setBounds(260, 130, 160, 40);

        boxidkaryawan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        boxidkaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxidkaryawanActionPerformed(evt);
            }
        });
        boxidkaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxidkaryawanKeyPressed(evt);
            }
        });
        getContentPane().add(boxidkaryawan);
        boxidkaryawan.setBounds(410, 140, 130, 30);

        boxkerja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxkerja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrasi", "Marketing", "Direktur", "Satpam", "Staff Teknik", "Personalia" }));
        getContentPane().add(boxkerja);
        boxkerja.setBounds(730, 180, 120, 30);

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setText("Nama");
        getContentPane().add(txtnama);
        txtnama.setBounds(260, 180, 140, 22);

        boxnama.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        boxnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxnamaActionPerformed(evt);
            }
        });
        boxnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxnamaKeyPressed(evt);
            }
        });
        getContentPane().add(boxnama);
        boxnama.setBounds(410, 180, 130, 30);

        txtkelamin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkelamin.setForeground(new java.awt.Color(255, 255, 255));
        txtkelamin.setText("Jenis Kelamin");
        getContentPane().add(txtkelamin);
        txtkelamin.setBounds(260, 250, 150, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Karyawan", "Nama", "Jns Kelamin", "Alamat", "Agama", "Status Kawin", "Jabatan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 380, 770, 290);

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
        getContentPane().add(edit);
        edit.setBounds(570, 300, 80, 50);

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
        getContentPane().add(delete);
        delete.setBounds(680, 300, 70, 50);

        txtalamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtalamat.setForeground(new java.awt.Color(255, 255, 255));
        txtalamat.setText("Alamat");
        getContentPane().add(txtalamat);
        txtalamat.setBounds(600, 220, 140, 30);

        txtagama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtagama.setForeground(new java.awt.Color(255, 255, 255));
        txtagama.setText("Agama");
        getContentPane().add(txtagama);
        txtagama.setBounds(260, 210, 140, 40);

        txtkawin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkawin.setForeground(new java.awt.Color(255, 255, 255));
        txtkawin.setText("Status Kawin");
        getContentPane().add(txtkawin);
        txtkawin.setBounds(600, 140, 140, 30);

        txtagama1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtagama1.setForeground(new java.awt.Color(255, 255, 255));
        txtagama1.setText("Jabatan");
        getContentPane().add(txtagama1);
        txtagama1.setBounds(600, 170, 130, 40);

        add.setText("Tambah");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(460, 300, 80, 50);

        boxkelamin1.setBackground(new java.awt.Color(79, 74, 69));
        buttonGroup1.add(boxkelamin1);
        boxkelamin1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        boxkelamin1.setForeground(new java.awt.Color(255, 255, 255));
        boxkelamin1.setText("Pria");
        boxkelamin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxkelamin1ActionPerformed(evt);
            }
        });
        getContentPane().add(boxkelamin1);
        boxkelamin1.setBounds(400, 250, 80, 30);

        boxkelamin2.setBackground(new java.awt.Color(79, 74, 69));
        buttonGroup1.add(boxkelamin2);
        boxkelamin2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        boxkelamin2.setForeground(new java.awt.Color(255, 255, 255));
        boxkelamin2.setText("Wanita");
        boxkelamin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxkelamin2ActionPerformed(evt);
            }
        });
        getContentPane().add(boxkelamin2);
        boxkelamin2.setBounds(480, 250, 90, 30);

        boxagama.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        boxagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plilih", "Islam", "Kristen", "Hindu", "Buddha" }));
        boxagama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxagamaActionPerformed(evt);
            }
        });
        getContentPane().add(boxagama);
        boxagama.setBounds(410, 220, 130, 26);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 300, 90, 50);

        boxkawin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        boxkawin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Lajang", "Menikah", "Cerai" }));
        boxkawin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxkawinActionPerformed(evt);
            }
        });
        getContentPane().add(boxkawin);
        boxkawin.setBounds(730, 140, 120, 30);

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
        kembali.setBounds(10, 30, 120, 40);

        boxalamat.setColumns(11);
        boxalamat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        boxalamat.setRows(2);
        boxalamat.setTabSize(2);
        jScrollPane2.setViewportView(boxalamat);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(730, 220, 220, 70);

        bgpicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/bgkarawan.png"))); // NOI18N
        getContentPane().add(bgpicture);
        bgpicture.setBounds(0, -40, 1370, 850);

        boalamat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        boalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boalamatActionPerformed(evt);
            }
        });
        boalamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boalamatKeyPressed(evt);
            }
        });
        getContentPane().add(boalamat);
        boalamat.setBounds(570, 170, 120, 30);

        Savedatabase.setText("Simpan");
        Savedatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavedatabaseActionPerformed(evt);
            }
        });
        getContentPane().add(Savedatabase);
        Savedatabase.setBounds(570, 360, 67, 0);

        setSize(new java.awt.Dimension(1374, 799));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // jtable1 variable baru. jTable1 adalah variable table
         DefaultTableModel jtable1=(DefaultTableModel)jTable1.getModel();
           if (jTable1.getRowCount()==1){
         //hapus baris table
         //jika yang dipilih 1 baris maka hapus baris
         jtable1.removeRow(jTable1.getSelectedRow());
    }else{
         if(jTable1.getRowCount()==0){
             //jika seluruh data table terhapus tampilkan pesan
            JOptionPane.showMessageDialog(this,"Tabel kosong");
         }else{
             //jika table tidak kosong dan baris yang dipilih lebih dari 1
             JOptionPane.showMessageDialog(this,"Tolong pilih satu baris untuk dihapus");
         }
  
        
    }
    }//GEN-LAST:event_deleteMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseClicked

    private void boxidkaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxidkaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxidkaryawanActionPerformed

    private void boxidkaryawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxidkaryawanKeyPressed
        // Hanya menerima Alphabet/huruf

    }//GEN-LAST:event_boxidkaryawanKeyPressed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
  if (boxidkaryawan.getText().equals("") || boxnama.getText().equals("") || boxalamat.getText().equals("")
            || boxagama.getSelectedItem().toString().equals("") || boxkawin.getSelectedItem().toString().equals("") || boxkerja.getSelectedItem().toString().equals("")) {
        JOptionPane.showMessageDialog(this, "Tolong Masukkan Data");
    } else {
        String kelamin = "";
        if (boxkelamin1.isSelected()) {
            kelamin = "Pria";
        } else if (boxkelamin2.isSelected()) {
            kelamin = "Wanita";
        } else {
            JOptionPane.showMessageDialog(this, "Tolong Pilih Jenis Kelamin");
            return; // Menghentikan eksekusi jika jenis kelamin tidak dipilih
        }

        String agama = boxagama.getSelectedItem().toString();
        String kawin = boxkawin.getSelectedItem().toString();
        String pekerjaan = boxkerja.getSelectedItem().toString();

        String id_karyawan = boxidkaryawan.getText();
        String nama1 = boxnama.getText();
        String alamat = boxalamat.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawantika", "root", "");

            String query = "UPDATE dataKaryawan SET namaKaryawan=?, jnsKelamin=?, alamat=?, agama=?, kawin=?, jabatan=? WHERE nik=?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, nama1);
            statement.setString(2, kelamin);
            statement.setString(3, alamat);
            statement.setString(4, agama);
            statement.setString(5, kawin);
            statement.setString(6, pekerjaan);
            statement.setString(7, id_karyawan);
            statement.executeUpdate();
            dataTable();
            kosong();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");

            // Setelah diupdate, kosongkan kotak input
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diperbarui: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_editActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 
    DefaultTableModel tabmode = (DefaultTableModel) jTable1.getModel();
    int bar = jTable1.getSelectedRow();
    if (bar != -1) {
        try {
            String a = tabmode.getValueAt(bar, 0).toString();
            String b = tabmode.getValueAt(bar, 1).toString();
            String c = tabmode.getValueAt(bar, 2).toString();
            String d = tabmode.getValueAt(bar, 3).toString();
            String e = tabmode.getValueAt(bar, 4).toString();
            String f = tabmode.getValueAt(bar, 5).toString();
            String g = tabmode.getValueAt(bar, 6).toString();

            // Set selected data to UI components
            boxidkaryawan.setText(a);
            boxnama.setText(b);
            if (c.equals("Pria")) {
                boxkelamin1.setSelected(true);
                boxkelamin2.setSelected(false);
            } else {
                boxkelamin1.setSelected(false);
                boxkelamin2.setSelected(true);
            }
            boxalamat.setText(d);
            boxagama.setSelectedItem(e);
            boxkawin.setSelectedItem(f);
            boxkerja.setSelectedItem(g); // Assuming boxkerja is a JComboBox
        } catch (Exception ex) {
            ex.printStackTrace(); // Print the exception details
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengisi data: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Pilih data pada tabel terlebih dahulu");
    }



    }//GEN-LAST:event_jTable1MouseClicked

    private void boxnamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxnamaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_boxnamaKeyPressed

    private void SavedatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavedatabaseActionPerformed
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
if (model.getRowCount() == 0) { // jika table kosong
    JOptionPane.showMessageDialog(this, "Table kosong");
} else { // jika table tidak kosong, koneksikan dengan SQL
    String id_karyawan, jns_kelamin, nama, alamat, agama, kawin, pekerjaan;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawantika", "root", "");
        
        for (int i = 0; i < model.getRowCount(); i++) {
            id_karyawan = model.getValueAt(i, 0).toString();
            nama = model.getValueAt(i, 1).toString();
            jns_kelamin = model.getValueAt(i, 2).toString();
            alamat = model.getValueAt(i, 3).toString();
            agama = model.getValueAt(i, 4).toString();
            kawin = model.getValueAt(i, 5).toString();
            pekerjaan = model.getValueAt(i, 6).toString();
            
            String query = "INSERT INTO karyawan (nik, namaKaryawan, jnsKelamin, alamat, agama, kawin, jabatan) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, id_karyawan);
            statement.setString(2, nama);
            
            if (boxkelamin1.isSelected()) {
                jns_kelamin = "Pria";
            } else {
                jns_kelamin = "Wanita";
            }
            
            statement.setString(3, jns_kelamin);
            statement.setString(4, alamat);
            statement.setString(5, agama);
            statement.setString(6, kawin);
            statement.setString(7, pekerjaan);
            statement.execute();
        }
        
        
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        model.setRowCount(0);
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data");
    }
}


        
    }//GEN-LAST:event_SavedatabaseActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
DefaultTableModel jtable1 = (DefaultTableModel) jTable1.getModel();
int selectedRow = jTable1.getSelectedRow();
if (selectedRow != -1) { // Memastikan ada baris yang dipilih
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawantika", "root", "");
        // Hapus baris tabel
        String idKaryawan = jtable1.getValueAt(selectedRow, 0).toString();
        String query = "DELETE FROM dataKaryawan WHERE nik = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, idKaryawan);
        statement.executeUpdate();
        statement.close();
        con.close();

        // Remove the row from the table model
        jtable1.removeRow(selectedRow);

        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data");
    }
}

    }//GEN-LAST:event_deleteActionPerformed

    private void boalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boalamatActionPerformed

    private void boalamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boalamatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boalamatKeyPressed

    private void boxnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxnamaActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
if (boxidkaryawan.getText().equals("") || boxnama.getText().equals("") || boxalamat.getText().equals("")
            || boxagama.getSelectedItem().toString().equals("") || boxkawin.getSelectedItem().toString().equals("") || boxkerja.getSelectedItem().toString().equals("")) {
        JOptionPane.showMessageDialog(this, "Tolong Masukkan Data");
    } else {
        String kelamin = "";
        if (boxkelamin1.isSelected()) {
            kelamin = "Pria";
        } else if (boxkelamin2.isSelected()) {
            kelamin = "Wanita";
        } else {
            JOptionPane.showMessageDialog(this, "Tolong Pilih Jenis Kelamin");
            return; // Menghentikan eksekusi jika jenis kelamin tidak dipilih
        }

        String agama = boxagama.getSelectedItem().toString();
        String kawin = boxkawin.getSelectedItem().toString();
        String pekerjaan = boxkerja.getSelectedItem().toString();

        String id_karyawan = boxidkaryawan.getText();
        String nama1 = boxnama.getText();
        String alamat = boxalamat.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawantika", "root", "");

            String query = "INSERT INTO dataKaryawan (nik, namaKaryawan, jnsKelamin, alamat, agama, kawin, jabatan) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, id_karyawan);
            statement.setString(2, nama1);
            statement.setString(3, kelamin);
            statement.setString(4, alamat);
            statement.setString(5, agama);
            statement.setString(6, kawin);
            statement.setString(7, pekerjaan);
            statement.executeUpdate();
            dataTable();
            kosong();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dimasukkan");

            // Setelah diinput, kosongkan kotak input
          
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    }//GEN-LAST:event_addActionPerformed

    private void boxkelamin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxkelamin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxkelamin1ActionPerformed

    private void boxkelamin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxkelamin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxkelamin2ActionPerformed

    private void boxagamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxagamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxagamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawantika", "root", "");

    String selectSql = "SELECT * FROM dataKaryawan";
    java.sql.Statement selectStat = con.createStatement();
    ResultSet hasil = selectStat.executeQuery(selectSql);
    DefaultTableModel selectModel = (DefaultTableModel) jTable1.getModel();
    selectModel.setRowCount(0); // Menghapus semua baris dalam tabel

    while (hasil.next()) {
        String id_karyawan = hasil.getString("nik");
        String nama = hasil.getString("namaKaryawan");
        String jns_kelamin = hasil.getString("jnsKelamin");
        String alamat = hasil.getString("alamat");
        String agama = hasil.getString("agama");
        String kawin = hasil.getString("kawin");
        String pekerjaan = hasil.getString("jabatan");
        Object[] data = {id_karyawan, nama, jns_kelamin, alamat, agama, kawin, pekerjaan};
        selectModel.addRow(data);
    }
    
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengambil data: " + e.getMessage());
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxkawinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxkawinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxkawinActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        // TODO add your handling code here:
         home hm=new home();
            hm.setVisible(true);
        this.hide();
    }//GEN-LAST:event_kembaliMouseClicked

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Savedatabase;
    private javax.swing.JButton add;
    private javax.swing.JLabel bgpicture;
    private javax.swing.JTextField boalamat;
    private javax.swing.JComboBox<String> boxagama;
    private javax.swing.JTextArea boxalamat;
    private javax.swing.JTextField boxidkaryawan;
    private javax.swing.JComboBox<String> boxkawin;
    private javax.swing.JRadioButton boxkelamin1;
    private javax.swing.JRadioButton boxkelamin2;
    private javax.swing.JComboBox<String> boxkerja;
    private javax.swing.JTextField boxnama;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel txtagama;
    private javax.swing.JLabel txtagama1;
    private javax.swing.JLabel txtalamat;
    private javax.swing.JLabel txtkawin;
    private javax.swing.JLabel txtkelamin;
    private javax.swing.JLabel txtktp;
    private javax.swing.JLabel txtnama;
    // End of variables declaration//GEN-END:variables
}
