/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package signup;
import java.util.regex.*;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aruna
 */
public class Signup extends javax.swing.JFrame {

    JDBC.Jdbc DB = new JDBC.Jdbc();
    
    
    public Signup() {
        initComponents();
    }
    
    private void textClear(){
        fullName_txt.setText("");
        userName_txt.setText("");
        password_txt.setText("");
        verifyPassword.setText("");
    }
    private void loadDB_Empty(String fullName, String userName, String Password){
        try {
            DB.putdata("INSERT INTO login VALUES('"+userName+"','"+Password+"','"+fullName+"')");
        } catch (Exception ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadDB_Full(){
        String fullName = fullName_txt.getText();//get full name to variable
        String userName = userName_txt.getText();//get user name to variable
        String password = password_txt.getText();//get password to variable
        String passwordVerify = verifyPassword_txt.getText();//get verify password to variable
        try {
            java.sql.ResultSet rs = DB.getdata("SELECT * FROM login");
            if(fullName_txt.getText().isEmpty() || userName_txt.getText().isEmpty() || password_txt.getText().isEmpty() || verifyPassword_txt.getText().isEmpty()){
                  System.out.println("Field Can't Be Empty (Full)");
                  error_lbl.setText("Field Can't Be Empty");
            }while(rs.next()){
                String DB_userName = String.valueOf(rs.getString("username"));
                if(DB_userName.equals(userName)){
                    System.out.println("username Exits");
                    error_lbl.setText("User Account Already Exits..");
                }else if(!password.equals(passwordVerify)){
                    System.out.println("Password Does not Match");
                    error_lbl.setText("Password Does not Match");
                }else{
                    DB.putdata("INSERT INTO login VALUES('"+userName+"','"+password+"','"+fullName+"')");
                    error_lbl.setForeground(Color.GREEN);
                    error_lbl.setText("Done");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        fullName_txt = new swing.fullName_txt();
        userName_txt = new swing.userName_txt();
        password_txt = new swing.Password();
        verifyPassword_txt = new swing.verifyPassword_txt();
        plab = new javax.swing.JLabel();
        ulab = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        userName1 = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        userName2 = new javax.swing.JLabel();
        Nic = new swing.userName_txt();
        terms1 = new javax.swing.JLabel();
        terms2 = new javax.swing.JLabel();
        password3 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        signUpButton = new swing.ButtonGradient();
        login_txt = new javax.swing.JLabel();
        login_txt2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        error_lbl = new javax.swing.JLabel();
        verifyPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullName_txt.setText("");
        fullName_txt.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jPanel1.add(fullName_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 290, 35));

        userName_txt.setText("");
        userName_txt.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        userName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userName_txtActionPerformed(evt);
            }
        });
        userName_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userName_txtKeyReleased(evt);
            }
        });
        jPanel1.add(userName_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 290, 35));

        password_txt.setText("");
        password_txt.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password_txtKeyReleased(evt);
            }
        });
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 290, 35));

        verifyPassword_txt.setText("");
        verifyPassword_txt.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        verifyPassword_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verifyPassword_txtKeyReleased(evt);
            }
        });
        jPanel1.add(verifyPassword_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 290, 35));

        plab.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        plab.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(plab, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 220, 30));

        ulab.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ulab.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(ulab, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 220, 30));

        fullName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 42.png"))); // NOI18N
        jPanel1.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 30));

        userName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 42.png"))); // NOI18N
        jPanel1.add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, 30));

        password1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Password.png"))); // NOI18N
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, 30));

        Gender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Password.png"))); // NOI18N
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, 30));

        userName2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NIC.png"))); // NOI18N
        jPanel1.add(userName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, 30));

        Nic.setText("");
        Nic.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        Nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicActionPerformed(evt);
            }
        });
        Nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NicKeyReleased(evt);
            }
        });
        jPanel1.add(Nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 290, 35));

        terms1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        terms1.setForeground(new java.awt.Color(28, 32, 124));
        terms1.setText("Tearms and Conditions");
        jPanel1.add(terms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, 40));

        terms2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        terms2.setForeground(new java.awt.Color(28, 32, 124));
        terms2.setText("I Read and Agree to ");
        jPanel1.add(terms2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, 40));

        password3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Password.png"))); // NOI18N
        jPanel1.add(password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, 30));

        Male.setBackground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        jPanel1.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        Female.setBackground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        jPanel1.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        signUpButton.setText("SignUp");
        signUpButton.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        signUpButton.setSizeSpeed(10.0F);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 120, 30));

        login_txt.setFont(new java.awt.Font("Poppins SemiBold", 2, 12)); // NOI18N
        login_txt.setForeground(new java.awt.Color(56, 64, 247));
        login_txt.setText("Login Here");
        login_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_txtMouseExited(evt);
            }
        });
        jPanel1.add(login_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, -1, -1));

        login_txt2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        login_txt2.setForeground(new java.awt.Color(28, 32, 124));
        login_txt2.setText("Alraedy Have an Account ?");
        jPanel1.add(login_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 660, -1, -1));
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, -1, -1));

        jLabel1.setFont(new java.awt.Font("Master of Comics Personal Use", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 75, 229));
        jLabel1.setText("Hello!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 140, 90));

        error_lbl.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        error_lbl.setForeground(new java.awt.Color(255, 0, 0));
        error_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(error_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 280, 60));

        verifyPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SignUp.png"))); // NOI18N
        jPanel1.add(verifyPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pass1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1TxtActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        String fullName = fullName_txt.getText();//get full name to variable
        String userName = userName_txt.getText();//get user name to variable
        String password = password_txt.getText();//get password to variable
        String passwordVerify = verifyPassword_txt.getText();//get verify password to variable
        
        //System.out.println("Full "+fullName+" User "+userName+" Pass "+password+" Ver "+passwordVerify);
        
        try {
           java.sql.ResultSet rs = DB.getdata("SELECT * FROM login");
           if(!rs.next()){//if DB Empty
              if(fullName_txt.getText().isEmpty() || userName_txt.getText().isEmpty() || password_txt.getText().isEmpty() || verifyPassword_txt.getText().isEmpty()){
                  System.out.println("Field Can't Be Empty (Empty)");
                  error_lbl.setText("Field Can't Be Empty");
               }else if(password.equals(passwordVerify)){
                   System.out.println("Password Done (Empty)");
                   loadDB_Empty(fullName, userName, password);
                   error_lbl.setForeground(Color.GREEN);
                   error_lbl.setText("Done");   
               }
           }else{//if DB Has Data
               loadDB_Full();
           } 
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void login_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_txtMouseClicked
        login.Login log = new login.Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_login_txtMouseClicked

    private void login_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_txtMouseEntered
        setCursor(HAND_CURSOR);
    }//GEN-LAST:event_login_txtMouseEntered

    private void login_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_txtMouseExited
        setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_login_txtMouseExited

    private void userName_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userName_txtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9@#_.]{0,15}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(userName_txt.getText());
        if(!match.matches())
        {
            ulab.setText("Invalid username");
        }
        else
        {
            ulab.setText(null);
        }
    }//GEN-LAST:event_userName_txtKeyReleased

    private void password_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(password_txt.getText());
        if(!match.matches())
        {
            plab.setText("Not Strong Enough");
        }
        else
        {
            plab.setText(null);
        }
    }//GEN-LAST:event_password_txtKeyReleased

    private void verifyPassword_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifyPassword_txtKeyReleased
        // TODO add your handling code here:
        /* if(password_txt!=verifyPassword_txt)
        {
             pvlab.setText("Passwords doesn't match");
        }
        else
        {
            pvlab.setText(null);
        }*/
    }//GEN-LAST:event_verifyPassword_txtKeyReleased

    private void NicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NicKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_NicKeyReleased

    private void NicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NicActionPerformed

    private void userName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userName_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userName_txtActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JLabel Gender;
    private javax.swing.JRadioButton Male;
    private swing.userName_txt Nic;
    private javax.swing.JLabel error_lbl;
    private javax.swing.JLabel fullName;
    private swing.fullName_txt fullName_txt;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_txt;
    private javax.swing.JLabel login_txt2;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel password3;
    private swing.Password password_txt;
    private javax.swing.JLabel plab;
    private swing.ButtonGradient signUpButton;
    private javax.swing.JLabel terms1;
    private javax.swing.JLabel terms2;
    private javax.swing.JLabel ulab;
    private javax.swing.JLabel userName1;
    private javax.swing.JLabel userName2;
    private swing.userName_txt userName_txt;
    private javax.swing.JLabel verifyPassword;
    private swing.verifyPassword_txt verifyPassword_txt;
    // End of variables declaration//GEN-END:variables
}