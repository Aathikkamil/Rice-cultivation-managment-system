/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.*;
import java.awt.Graphics;  
import java.awt.HeadlessException;
 import java.awt.Image;  
 import java.awt.Toolkit;  
import java.util.ArrayList;
 import javax.swing.JPanel;
public class Add extends javax.swing.JFrame {

   Connection con;
    PreparedStatement pst;
    public Add() {
       initComponents();
        con=SQL_connection.connect();
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 =  new JPanel() {  
            public void paintComponent(Graphics g) {  
                Image img = Toolkit.getDefaultToolkit().getImage(  
                    Add.class.getResource("/Images/aaa.jpg"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
        };  ;
        btnback = new javax.swing.JButton();
        lbltitle = new javax.swing.JLabel();
        lbllname = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        lblfname = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        lblnic = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        lblphone = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        lblfeld = new javax.swing.JLabel();
        btnfarmer = new javax.swing.JButton();
        brnreset = new javax.swing.JButton();
        txtfeld = new javax.swing.JTextField();
        lbluorn = new javax.swing.JLabel();
        txtuorn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnback.setBackground(new java.awt.Color(153, 153, 153));
        btnback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lbltitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbltitle.setText("Enter The Farmer details ");

        lbllname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbllname.setText("Last Name :");

        lblfname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfname.setForeground(new java.awt.Color(0, 51, 51));
        lblfname.setText("First Name :");

        lblnic.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblnic.setText("NIC :");

        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });

        lblphone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblphone.setText("Phone No :");

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        lblfeld.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfeld.setText("Feld Details :");

        btnfarmer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnfarmer.setText("Add Farmet");
        btnfarmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfarmerActionPerformed(evt);
            }
        });

        brnreset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        brnreset.setText("Reset");
        brnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnresetActionPerformed(evt);
            }
        });

        txtfeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeldActionPerformed(evt);
            }
        });

        lbluorn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbluorn.setText("UORN :");

        txtuorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuornActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtuorn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                        .addComponent(btnfarmer))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnback))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(brnreset)))
                                .addGap(12, 12, 12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblfname)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblnic)
                                    .addComponent(lbllname)
                                    .addComponent(lbluorn)
                                    .addComponent(lblphone)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblfeld)
                                .addGap(1, 1, 1)))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbllname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnic))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuorn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluorn))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblphone)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnfarmer)
                        .addGap(18, 18, 18)
                        .addComponent(brnreset)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfeld)
                    .addComponent(txtfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        FAO fl=new FAO();
        fl.show();
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void btnfarmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfarmerActionPerformed
            String sql="INSERT INTO farmer ( NIC,F_Name,L_Name,Phone_No,Feld_Details,UORN) VALUES (?,?,?,?,?,?)";
         try 
        {
            pst=con.prepareStatement(sql);
            pst.setString(1,txtnic.getText());
            pst.setString(2,txtfname.getText());
            pst.setString(3,txtlname.getText());
            pst.setString(4,txtphone.getText());
            pst.setString(5,txtfeld.getText());
            pst.setString(6,txtuorn.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Sussecfully addedd");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_btnfarmerActionPerformed
    }
    private void brnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnresetActionPerformed
     txtfname.setText("");
     txtlname.setText("");
     txtnic.setText("");
     txtphone.setText("");
     txtfeld.setText("");
     txtuorn.setText("");
     
    }//GEN-LAST:event_brnresetActionPerformed

    private void txtuornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuornActionPerformed

    private void txtfeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfeldActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnreset;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnfarmer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfeld;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lbllname;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbluorn;
    private javax.swing.JTextField txtfeld;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtuorn;
    // End of variables declaration//GEN-END:variables

    private static class farmerList {

        public farmerList() {
        }
    }
}
