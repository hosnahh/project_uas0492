/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_0492;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.lang.RuntimeException;
import java.lang.NullPointerException;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class FormBiodataSiswa extends javax.swing.JFrame {
    
        private Connection koneksi; 
    /**
     * Creates new form FormBiodataSiswa
     */
    public FormBiodataSiswa() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("BIODATA MAHASISWA");

        jLabel2.setText("NAMA  SISWA");

        jLabel3.setText("NIM");

        jLabel4.setText("KELAS");

        jLabel5.setText("JURUSAN");

        jLabel6.setText("SEMESTER");

        jLabel7.setText("ALAMAT");

        jRadioButton1.setText("Laki-Laki");

        jRadioButton2.setText("Perempuan");

        jLabel8.setText("JENIS KELAMIN");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SILAHKAN PILIH", "T.INFORMATIKA", "HUKUM", "PSIKOLOGI", "EKONOMI", "KEDOKTERAN" }));

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BATAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("UBAH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("HAPUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("CARI");

        jButton6.setText("CETAK");

        jButton7.setText("Keluar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton2))
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton7))))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(11, 11, 11)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = jTextField1.getText();
        String nim = jTextField2.getText();
        String kelas = jTextField3.getText();
        String jeniskelamin = null;
        if (jRadioButton1.isSelected()){
            jeniskelamin = "Laki-Laki";
        } else if (jRadioButton2.isSelected()){
            jeniskelamin = "Perempuan";
        }
        String jurusan = (String) jComboBox1.getSelectedItem();
        String semester = jTextField4.getText();
        String alamat = jTextField5.getText();
        
        if (jTextField1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Mohon Inputkan Data Yang Lengkap", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                java.sql.Statement stat = koneksi.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM mahasiswa WHERE nim ='" + jTextField2.getText() + "'");
                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "NIM Sudah Ada", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
                    jTextField2.requestFocus();
                } else {
                    String sql = "INSERT INTO jTable1 VALUES ('" + nama + ""
                    + ",'" + nim + "'" 
                    + ",'" + jeniskelamin + "'" 
                    + ",'" + jurusan + "'" 
                    + ",'" + semester + "'" 
                    + ",'" + alamat + "')";
                    stat.executeUpdate(sql);
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jComboBox1.setSelectedIndex(-0);
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField1.requestFocus();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    TampilData();
                }
                stat.close();
            } catch (Exception exc) {
                System.err.println ("Terjadi Kesalahan :" + exc);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jComboBox1.setSelectedIndex(-0);
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Pilih Data Yang Ingin Dihapus!", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "DELETE FROM mahasiswa WHERE nim='" + jTextField2.getText().trim() + "'";
            if (jTextField2.getText().trim().equals("")) {
                
            }else 
                try {
                    Statement stat = koneksi.createStatement();
                    stat.executeUpdate (sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                    stat.close();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jComboBox1.setSelectedIndex(-0);
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField1.requestFocus();
                    TampilData();
                } catch (SQLException exc) {
                    System.err.println (sql);
                    System.err.println ("Error : " + exc);
                    JOptionPane.showMessageDialog(null, "Mohon Masukkan Data Untuk Di Input", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
                }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.getSelectedRow();
        if (baris != -1) {
            jTextField1.setText(jTable1.getValueAt(baris, 0).toString());
            jTextField2.setText(jTable1.getValueAt(baris, 1).toString());
            jTextField3.setText(jTable1.getValueAt(baris, 1).toString());
            if ("Laki-Laki".equals(jTable1.getValueAt(baris, 2).toString())){
                jRadioButton1.setSelected(true);
            } else {
                jRadioButton2.setSelected(true);
            }
        }
        jComboBox1.setSelectedItem(jTable1.getValueAt(baris, 3).toString());
        jTextField4.setText(jTable1.getValueAt(baris, 4).toString());
        jTextField5.setText(jTable1.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Terimakasih Atas Perhatiannya", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           System.exit(0);
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   int ok = JOptionPane.showConfirmDialog(null, "Data Kosong", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
   if (ok == 0) {
       String jeniskelamin = null;
       if (jRadioButton1.isSelected()){
           jeniskelamin = "Laki-Laki";
       } else if (jRadioButton2.isSelected()){
            jeniskelamin = "Perempuan";
       }
       String sql = "update mahasiswa set nama='" + jTextField1.getText()
       + "',jeniskelamin='" + jeniskelamin
       + ",'kelas='" + jTextField3.getText()
       + "',jurusan='" + jComboBox1.getSelectedItem()
       + ",'semester='" + jTextField4.getText()
       + ",'alamat='" + jTextField5.getText()
       + ",'where nim='" + jTextField2.getText(). trim() + "'";
       if (jTextField2.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Pilih Data yang Ingin Diubah!", "Ubah Data", JOptionPane.WARNING_MESSAGE);
           jTextField2.requestFocus();
       }else {
           try {
              Statement stat = koneksi.createStatement();
              stat.executeUpdate(sql);
              JOptionPane.showMessageDialog(null, "Data Berhasil Diubah", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
              stat.close();
                jTextField2.requestFocus();
                TampilData();
        } catch (Exception exc) {
            System.err.println("Error :" + exc);
                }
            }
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormBiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBiodataSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void TampilData() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("nama");
    model.addColumn("NIM");
    model.addColumn("Kelas");
    model.addColumn("JenisKelamin");
    model.addColumn("Jurusan");
    model.addColumn("Alamat");
    
    try{
        java.sql.Statement stat = koneksi.createStatement();
        ResultSet data = stat.executeQuery("SELECT * FROM mahasiswa");
        while (data.next()) {
            model.addRow(new Object[]{
                data.getString("nama"),
                data.getString("nim"),
                data.getString("kelas"),
                data.getString("jeniskelamin"),
                data.getString("jurusan"),
                data.getString("semester"),
                data.getString("alamat"),
            });
            
            jTable1.setModel (model);
            }
        } catch (Exception e){
            System.err.println("Terjadi Kesalahan :" + e);
    }
}
 
private void KoneksiDatabase(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException cnf) {
    }
    try{
        koneksi = DriverManager.getConnection("jdbc:mysql://localhost/UAS_0492", "root", "");
        System.out.println("Koneksi Database Berhasil");
    }catch (SQLException se){
        System.out.println("Koneksi Datbase Gagal :" + se);
        }catch (Exception e){
      }
    }
}