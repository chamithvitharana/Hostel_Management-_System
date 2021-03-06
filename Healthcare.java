import java.sql.*;
import Project.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamith
 */
public class Healthcare extends javax.swing.JFrame {

    public void clear(){
       stid.setText("");
       healthid.setText("");
       phiname.setText("");
       contact.setText("");
       moh.setText("");
       decsec.setText("");
       covid.getSelectedItem();
       sdate.setDateFormatString("");
       edate.setDateFormatString("");
       
    }
    public Healthcare() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stid = new javax.swing.JTextField();
        phiname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        moh = new javax.swing.JTextField();
        decsec = new javax.swing.JTextField();
        covid = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        sdate = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        healthid = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel8.setText("Student's Healthcare");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 30, 470, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 80));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Student ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("PHI Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setText("PHI Contact No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("MOH");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setText("Dev.Secretery");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setText("Covid");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setText("If Positive :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));
        jPanel1.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 240, -1));
        jPanel1.add(phiname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 240, -1));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 240, -1));
        jPanel1.add(moh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 240, -1));
        jPanel1.add(decsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 240, -1));

        covid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positive", "Negtive", "Other" }));
        jPanel1.add(covid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 240, -1));

        jLabel9.setText("Start Date  :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        jLabel10.setText("End Date   :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 90, 40));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 100, 40));

        jButton3.setBackground(new java.awt.Color(204, 51, 0));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 100, 40));

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 100, 40));

        sdate.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 160, -1));

        edate.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 160, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Of Student ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 340, 70));

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setText("Health_ID ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));
        jPanel1.add(healthid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 240, -1));

        jButton6.setBackground(new java.awt.Color(51, 51, 0));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 110, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\HND\\HND Final Project\\images\\healthcare11.png")); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 690, 520));

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\HND\\HND Final Project\\images\\healthcare11.png")); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 70, 680, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where Student_ID = '"+jTextField6.getText()+"'");
            
            while(rs.next()){
                stid.setText(rs.getString("Student_ID"));
            
            
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select * from Healthcare where Student_ID = '"+jTextField6.getText()+"'");
            
            while(rs1.next()){
                stid.setText(rs1.getString("Student_ID"));
                healthid.setText(rs1.getString("Health_ID"));
                phiname.setText(rs1.getString("PHI_Name"));
                contact.setText(rs1.getString("PHI_Contact"));
                moh.setText(rs1.getString("MOH"));
                decsec.setText(rs1.getString("Dev_Secreatary"));  
                covid.setSelectedItem(rs1.getString("Covid"));
                sdate.setDate(rs1.getDate("Start_Date"));
                edate.setDate(rs1.getDate("End_Date"));
            
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
  
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat dFormat =new SimpleDateFormat("yyyy-dd-mm");
         SimpleDateFormat dFormat1 =new SimpleDateFormat("yyyy-dd-mm");
         
        String Student_ID = stid.getText();
        String Health_ID = healthid.getText();
        String PHIName = phiname.getText();
        int PHIcontact = Integer.parseInt(contact.getText());
        String MOH = moh.getText();
        String DevSec = decsec.getText();
        String Covid = (String)covid.getSelectedItem();
        String Sdate = dFormat.format(sdate.getDate());
        String Edate = dFormat1.format(edate.getDate());
        
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into Healthcare values(?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1,Student_ID);
            ps.setString(2,Health_ID);
            ps.setString(3,PHIName);
            ps.setInt(4,PHIcontact);
            ps.setString(5,MOH);
            ps.setString(6,DevSec);
            ps.setString(7,Covid);
            ps.setString(8,Sdate);
            ps.setString(9,Edate);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully Healthcare Form..!!");
            clear();
            

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat dFormat =new SimpleDateFormat("yyyy-MM-dd");
         SimpleDateFormat dFormat1 =new SimpleDateFormat("yyyy-MM-dd");
        
        String Student_ID = stid.getText();
        String Health_ID = healthid.getText();
        String PHIName = phiname.getText();
        int PHIcontact = Integer.parseInt(contact.getText());
        String MOH = moh.getText();
        String DevSec = decsec.getText();
        String Covid = (String)covid.getSelectedItem();
        String Sdate = dFormat1.format(sdate.getDate());
        String Edate = dFormat1.format(edate.getDate());
        
        try {
            Connection con = ConnectionProvider.getCon();
                 Statement st = con.createStatement();
                 PreparedStatement ps = con.prepareStatement ("update Healthcare set Student_ID = ?,Health_ID = ?, PHI_Name = ?, PHI_Contact = ?, MOH = ?, Dev_Secreatary = ?, Covid = ?, Start_Date = ?, End_Date = ? where Health_ID = '"+Health_ID+"'");
                 
                 ps.setString(1,Student_ID);
                 ps.setString(2,Health_ID);
                 ps.setString(3,PHIName);
                 ps.setInt(4,PHIcontact);
                 ps.setString(5,MOH);
                 ps.setString(6,DevSec);
                 ps.setString(7,Covid);
                 ps.setString(8,Sdate);
                 ps.setString(9,Edate);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Successfully Updated.!");
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String Student_ID = stid.getText();
        String Health_ID = healthid.getText();
        
        try {
            Connection con = ConnectionProvider.getCon();
                 Statement st = con.createStatement();
                 st.executeUpdate("delete from Healthcare where Health_ID ='"+Health_ID+"'");
                 JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Are you Sure want to Delete!","EXIT",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
   
                 JOptionPane.showMessageDialog(null, "Successfully Deleted.!");
                 clear();
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Healthcare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Healthcare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Healthcare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Healthcare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Healthcare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> covid;
    private javax.swing.JTextField decsec;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JTextField healthid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField moh;
    private javax.swing.JTextField phiname;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTextField stid;
    // End of variables declaration//GEN-END:variables
}
