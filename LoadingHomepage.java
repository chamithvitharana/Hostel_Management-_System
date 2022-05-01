import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Chamith
 */
public class LoadingHomepage extends javax.swing.JFrame {

    /**
     * Creates new form LoadingHomepage
     */
    public LoadingHomepage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        loadinglbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loadingValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\HND\\HND Final Project\\images\\hostel.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 620, 250));
        jPanel1.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 514, 940, 20));

        loadinglbl.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        loadinglbl.setText("Loading..");
        jPanel1.add(loadinglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel1.setText("HOSTEL   MANAGEMENT   SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        loadingValue.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        loadingValue.setText("0 %");
        jPanel1.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clr1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clr1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 350, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LoadingHomepage().setVisible(true);
            }
        });
       
    
        LoadingHomepage load = new LoadingHomepage();
        load.setVisible(true);
        
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                load.loadingValue.setText(i +"%");
                
                if(i == 10){
                    load.loadinglbl.setText("Turning on Modules....");
                }
                
                if(i == 20){
                    load.loadinglbl.setText("Loading Modules....");
                }
                
                if(i == 50){
                    load.loadinglbl.setText("Connecting to Database....");
                }
                
                if(i == 70){
                    load.loadinglbl.setText("Connection is Successfull");
                }
                
                if(i == 80){
                    load.loadinglbl.setText("Launching Application.");
                }
                
                load.loadingBar.setValue(i);
                
                  
            }
            load.setVisible(false);
            new Login().setVisible(true);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingValue;
    private javax.swing.JLabel loadinglbl;
    // End of variables declaration//GEN-END:variables
}
