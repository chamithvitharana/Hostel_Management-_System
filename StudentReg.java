import java.sql.*;
import Project.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;



public class StudentReg extends javax.swing.JFrame {
   
  //<---------Clear data------------------>>  
    public void clear(){
        
        jTextField1.setText("");
        jTextField2.setText("");
        //jTextField7.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jDateChooser1.setDateFormatString("");
        jComboBox1.removeAllItems();
        RoomNumber();
        
    }
    public void RoomNumber(){
        int i=0;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from room where Avtivate = 'Yes' and Status = 'Not Booked'");
            while(rs.next()){
                i=1;
                jComboBox1.addItem(rs.getString(1));
            }
            if(i==0){
               jButton1.setVisible(false);
                JOptionPane.showMessageDialog(null, "All Rooms are Already Booked..!!");
                new Homepage().setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public StudentReg() {
        initComponents();
      
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

       
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Student_ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Contact");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("MOH");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("E-Mail");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Room_No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 260, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 260, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 260, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 260, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 260, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 260, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel8.setText("Student Registration Form");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 70));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save1.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 130, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel10.setText("Rm_Type");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel11.setText("Age");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Rm001");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Rm002");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Rm003");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Rm004");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Rm005");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Rm006");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("13/14");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("15");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("16");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("17");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("18");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("18");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit1.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 110, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel25.setText("DOB");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 260, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/st.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1010, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // <----------save the data option---------------->>
        
        SimpleDateFormat dFormat =new SimpleDateFormat("MMM-dd-yyyy");
        String st_id = jTextField1.getText();
        String name = jTextField2.getText();
       // String dob = jTextField7.getText();
        String address = jTextField3.getText();
        int contact = Integer.parseInt(jTextField4.getText());
        String moh = jTextField5.getText();
        String email = jTextField6.getText();
        String Room_Number = (String)jComboBox1.getSelectedItem();
        String status = "Living";
        String dobb = dFormat.format(jDateChooser1.getDate());
        
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1,st_id );
            ps.setString(2,name);
           // ps.setString(3,dob);
            ps.setString(3,dobb);
            ps.setString(4,address);
            ps.setInt(5,contact);
            ps.setString(6,moh);
            ps.setString(7,email);
            ps.setString(8,Room_Number);
            ps.setString(9,status);
            ps.executeUpdate();
            
            PreparedStatement ps1 = con.prepareStatement("update room set Status='Booked' where Room_No=?");
            ps1.setString(1,Room_Number);
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated..!!");
            clear();
             
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); 
        } 
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        RoomNumber();
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Homepage().setVisible(true);
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
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.persistence.Query query1;
    // End of variables declaration//GEN-END:variables
}
