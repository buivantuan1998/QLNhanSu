/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhansu;

import entity.ConnectionDB;
import entity.NhanSu;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUAN
 */
public class TimKiemNS extends javax.swing.JFrame {

    /**
     * Creates new form TimKiemNS
     */
    public TimKiemNS() {
        initComponents();
        setLocationByPlatform(true);
        //showData();
    }

    public List<NhanSu> getAllNV(){
        Connection con=null;
        CallableStatement callSt=null;
        List<NhanSu> listNS=new ArrayList<>();
        try {
            con=ConnectionDB.openConnection();
            callSt=con.prepareCall("{call getAllNV()}");
            ResultSet rs=callSt.executeQuery();
            while (rs.next()) {   
                NhanSu ns=new NhanSu();
                ns.setMaNV(rs.getString("maNV"));
                ns.setHoTen(rs.getString("hoTen"));
                ns.setNgaySinh(rs.getString("ngaySinh"));
                ns.setDiaChi(rs.getString("diaChi"));
                ns.setsDT(rs.getString("sDT"));
                ns.setGioiTinh(rs.getBoolean("gioiTinh"));
                ns.setMaCV(rs.getString("maCV"));
                ns.setMaTDHV(rs.getString("maTDHV"));
                ns.setMaPB(rs.getString("maPB"));
                listNS.add(ns);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            ConnectionDB.closeConnection(con, callSt);
        }
        return listNS;
    }
    
    public void showData(){
        
        List<NhanSu> list=getAllNV();
        DefaultTableModel dtbm=(DefaultTableModel)tableTimKiem.getModel();
        Object[] row=new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0]=list.get(i).getMaNV();
            row[1]=list.get(i).getHoTen();
            row[2]=list.get(i).getNgaySinh();
            row[3]=list.get(i).getDiaChi();
            row[4]=list.get(i).getsDT();
            row[5]=list.get(i).isGioiTinh();
            row[6]=list.get(i).getMaCV();
            row[7]=list.get(i).getMaTDHV();
            row[8]=list.get(i).getMaPB();
            dtbm.addRow(row);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTimKiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bui_Van_Tuan_HTTT15");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Tìm kiếm nhân sự theo mã nhân sự");

        jLabel2.setText("Nhập vào mã nhân sự cần tìm:");

        btnTimKiem.setBackground(new java.awt.Color(0, 204, 204));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 0, 0));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tableTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "TenNV", "NgaySinh", "DiaChi", "SDT", "GioiTinh", "MaCV", "MaTDHV", "MaPB"
            }
        ));
        jScrollPane1.setViewportView(tableTimKiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTimKiem)
                                .addGap(39, 39, 39)
                                .addComponent(btnThoat)
                                .addGap(16, 16, 16))
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        CacChucNang cn=new CacChucNang();
        cn.setVisible(true);
        this.dispose();//dong frame
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        List<NhanSu> list=getAllNV();
        
        DefaultTableModel dtbm=(DefaultTableModel)tableTimKiem.getModel();
        for (int i = 0; i <list.size() ; i++) {
            if(txtTimKiem.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Nhap vao ma nhan vien can tim.!");
                break;
            }
            else if(txtTimKiem.getText().equals("NV02")){
//                Object[] row=new Object[9];
//                row[0]=list.get(i).getMaNV();
//                row[1]=list.get(i).getHoTen();
//                row[2]=list.get(i).getNgaySinh();
//                row[3]=list.get(i).getDiaChi();
//                row[4]=list.get(i).getsDT();
//                row[5]=list.get(i).isGioiTinh();
//                row[6]=list.get(i).getMaCV();
//                row[7]=list.get(i).getMaTDHV();
//                row[8]=list.get(i).getMaPB();
//                
//                dtbm.addRow(row);
            }
            else{
                JOptionPane.showMessageDialog(this, "Khong co nhan su nay..!");
                break;
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(TimKiemNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiemNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiemNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiemNS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiemNS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTimKiem;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
