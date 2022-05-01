import java.sql.*;
import Project.ConnectionProvider;
import java.util.jar.Attributes.Name;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;



public class Vaccination extends javax.swing.JFrame {
    public void clear(){
        vacID.setText("");
        name.setText("");
        stid.setText("");
        jTextField3.setText("");
        vacname.setText("");
        
        
    }
    
  
    public Vaccination() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vacID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        stid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        vacname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel8.setText("Vaccination Form");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Vac_ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 80, 20));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel6.setText("Dose ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        vacID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacIDActionPerformed(evt);
            }
        });
        jPanel1.add(vacID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 210, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 210, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 80, 30));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, 30));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit1.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, -1, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search of Student ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 15))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, 80));

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 90, 30));

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 100, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setText("Student_ID  ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel1.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 210, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setText("Vac Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dose1", "Dose2", "Dose3", "Dose4", "Dose5", "Dose6", "Dose7", "Dose8", "Dose9", "Dose10", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 210, -1));

        vacname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacnameActionPerformed(evt);
            }
        });
        jPanel1.add(vacname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 210, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\HND\\HND Final Project\\images\\vax.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 200, 270));

        jButton6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\HND\\HND Final Project\\images\\vform.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 70, -1, 1080));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Homepage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String Student_ID =stid.getText();
        String Name = name.getText();
        String Vac_ID=vacID.getText();
        String Vac_Name =vacname.getText();
        String Dose = (String)jComboBox1.getSelectedItem();
        

        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into vaccination values(?,?,?,?,?)");
            
            ps.setString(1, Student_ID);
            ps.setString(2, Name);
            ps.setString(3, Vac_ID);
            ps.setString(4, Vac_Name);
            ps.setString(5,Dose);
            ps.executeUpdate();
            
            
           
            JOptionPane.showMessageDialog(null, "Successfully Vacinated Form..!!");
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
  
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from vaccination where Student_ID = '"+jTextField3.getText()+"'"); 
            
            while(rs.next()){
                /*name.setText(rs.getString("name"));
                stid.setText(rs.getString("Student_ID"));*/
                stid.setText(rs.getString("Student_ID"));
                name.setText(rs.getString("Name"));
                vacID.setText(rs.getString("Vac_ID"));
                vacname.setText(rs.getString("Vac_Name"));
                jComboBox1.setSelectedItem(rs.getString("Dose"));
                 
   
            }
        
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select * from student where Student_ID = '"+jTextField3.getText()+"'"); 
            
            while(rs1.next()){
                /*name.setText(rs.getString("name"));
                stid.setText(rs.getString("Student_ID"));*/
                stid.setText(rs1.getString("Student_ID"));
                name.setText(rs1.getString("Name"));
               /* vacID.setText(rs1.getString("Vac_ID"));
                vacname.setText(rs1.getString("Vac_Name"));
                jComboBox1.setSelectedItem(rs1.getString("Dose"));*/
            }       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void vacnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Student_ID =stid.getText();
        String Name = name.getText();
        String Vac_ID=vacID.getText();
        String Vac_Name =vacname.getText();
        String Dose =jComboBox1.getSelectedItem().toString();
        
        try {
            Connection con = ConnectionProvider.getCon();
                 Statement st = con.createStatement();
                 PreparedStatement ps = con.prepareStatement ("update vaccination set Student_ID =?,Name=?,Vac_ID=?,Vac_Name=? , Dose=? where Vac_ID='"+Vac_ID+"'");
                 ps.setString(1, Student_ID);
                 ps.setString(2, Name);
                 ps.setString(3, Vac_ID);
                 ps.setString(4, Vac_Name);
                 ps.setString(5,Dose);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Successfully Updated.!");
                 clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vacIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacIDActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String Student_ID = stid.getText();
        String Vac_ID = vacID.getText();
        
        try {
            Connection con = ConnectionProvider.getCon();
                 Statement st = con.createStatement();
                 st.executeUpdate("delete from vaccination where Vac_ID ='"+Vac_ID+"'");
                 JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Are you Sure want to Delete!","EXIT",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    
                 JOptionPane.showMessageDialog(null, "Successfully Deleted.!");
                 clear();
        } catch (Exception e) {
        }
        
        
        
        
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
            java.util.logging.Logger.getLogger(Vaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vaccination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vaccination().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField stid;
    private javax.swing.JTextField vacID;
    private javax.swing.JTextField vacname;
    // End of variables declaration//GEN-END:variables
}
