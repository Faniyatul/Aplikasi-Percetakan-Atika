package login;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.koneksi1;

/**
 *
 * @author Faniyatul Arifa
 */
public class form_login extends javax.swing.JFrame {
    koneksi1 xxx;
    
    /**
     * Creates new form form_login
     */
    public form_login() {
        initComponents();
        xxx = new koneksi1();
        xxx.Class();
        this.setLocationRelativeTo(null);
    }
    
    private void masuk() {
        try {
            String nama = fuser.getText();
            String passw = new String (fpass.getPassword());
            xxx.ss = xxx.cc.createStatement();
            String sql = "Select * from tlogin Where User = '"+nama+"' And password ='"+passw+"'";
            xxx.rr = xxx.ss.executeQuery(sql);
        if (xxx.rr.next()) {
                if (fpass.getText().equals(xxx.rr.getString("password"))) {
                    new menu().show();
                    this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(rootPane, "password salah,silahkan coba lagi");
                    fpass.setText("");
                    fpass.requestFocus();
                }
        }
        else {
            JOptionPane.showMessageDialog(null, "Login Gagal");
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fuser = new javax.swing.JTextField();
        fpass = new javax.swing.JPasswordField();
        fmasuk = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atika Print");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        fuser.setBackground(new java.awt.Color(204, 204, 255));
        fuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuserActionPerformed(evt);
            }
        });
        jPanel1.add(fuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 30));

        fpass.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 200, 30));

        fmasuk.setText("Sign In");
        fmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmasukActionPerformed(evt);
            }
        });
        jPanel1.add(fmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 303, 80, 30));

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\FANI-IMUT\\Pictures\\milky-way-2695569_960_720.jpg")); // NOI18N
        background.setText("Password");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 563, 374));

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
    }// </editor-fold>//GEN-END:initComponents

    private void fmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmasukActionPerformed
        masuk();
    }//GEN-LAST:event_fmasukActionPerformed

    private void fuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuserActionPerformed

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
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton fmasuk;
    private javax.swing.JPasswordField fpass;
    private javax.swing.JTextField fuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
