/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.Graphics;  
 import java.awt.Image;  
 import java.awt.Toolkit;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
 import javax.swing.JPanel;
public class Delete_farmer extends javax.swing.JFrame {

    /**
     * Creates new form Delete_farmer
     */
    Connection con;
    PreparedStatement pst;
   
   public Delete_farmer() {
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
                    Delete_farmer.class.getResource("/Images/paddy.jpg"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
        };  ;
        lbltitle = new javax.swing.JLabel();
        lblselect = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        lblfname = new javax.swing.JLabel();
        lbllname = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lblfeld = new javax.swing.JLabel();
        lblfnametx = new javax.swing.JLabel();
        lbllnametx = new javax.swing.JLabel();
        lblphonetx = new javax.swing.JLabel();
        lblfdetail = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        detete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbltitle.setText("You can Delete the farmer Entrey here");

        lblselect.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblselect.setText("Select The NIC ");

        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        lblfname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfname.setText("First Name :");

        lbllname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbllname.setText("Last Name :");

        lblphone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblphone.setText("Phone No :");

        lblfeld.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfeld.setText("Feld Details :");

        lblfnametx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lbllnametx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lblphonetx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lblfdetail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        detete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        detete.setText("Delete_Farmer");
        detete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deteteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblselect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsearch)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lbltitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblfname)
                                    .addComponent(lbllname)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblfeld)
                                    .addComponent(lblphone))))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblfnametx, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(lbllnametx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblphonetx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblfdetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detete)
                            .addComponent(btnback))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbltitle)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblselect)
                        .addComponent(btnsearch))
                    .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblfname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblfnametx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllnametx, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(detete)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblphone)
                            .addComponent(lblphonetx, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblfeld)
                            .addComponent(lblfdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnback)))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void deteteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deteteActionPerformed
        // TODO add your handling code here:

        String nic =txtnic.getText();
        String SQL="DELETE FROM farmer WHERE NIC='"+nic+"'";
        try {

            pst=con.prepareStatement(SQL);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Deleted ");

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deteteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:

        try
        {
            Statement st =con.createStatement();
            String nic =txtnic.getText();
            String sql="SELECT * FROM farmer WHERE NIC='"+nic+"'";
            ResultSet rs=st.executeQuery(sql);

            if (rs.next()==false)
            {
                JOptionPane.showMessageDialog(null, "Invalid NIC");
            }

            String F_Name=rs.getString("F_Name");
            lblfnametx.setText(F_Name);

            String L_Name=rs.getString("L_Name");
            lbllnametx.setText(L_Name);

            

            String Phone_No=rs.getString("Phone_No");
            lblphonetx.setText(Phone_No);

            String Feld_Details=rs.getString("Feld_Details");
            lblfdetail.setText(Feld_Details);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_farmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_farmer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton detete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfdetail;
    private javax.swing.JLabel lblfeld;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lblfnametx;
    private javax.swing.JLabel lbllname;
    private javax.swing.JLabel lbllnametx;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblphonetx;
    private javax.swing.JLabel lblselect;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables
}