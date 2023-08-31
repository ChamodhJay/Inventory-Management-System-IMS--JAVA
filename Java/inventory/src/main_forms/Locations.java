/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_forms;

import JDBC.Jdbc;
import java.awt.Color;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aruna
 */
public class Locations extends javax.swing.JFrame {

    /**
     * Creates new form Main_Items
     */
    public Locations() {
        initComponents();
    }
    
    JDBC.Jdbc DB = new Jdbc();
    
    private void textClear(){
        idTxt.setText("");
        nameTxt.setText("");
        discriptionTxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBtn = new swing.ButtonGradient();
        updateBtn = new swing.ButtonGradient();
        cancelBtn = new swing.ButtonGradient();
        idTxt = new swing.Text();
        errorLbl = new javax.swing.JLabel();
        nameTxt = new swing.Text();
        jScrollPane1 = new javax.swing.JScrollPane();
        discriptionTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setText("Add");
        addBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        addBtn.setSizeSpeed(5.0F);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 110, 35));

        updateBtn.setText("Update");
        updateBtn.setColor1(new java.awt.Color(0, 153, 0));
        updateBtn.setColor2(new java.awt.Color(0, 102, 0));
        updateBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        updateBtn.setSizeSpeed(5.0F);
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 565, 110, 35));

        cancelBtn.setText("Cancel");
        cancelBtn.setColor1(new java.awt.Color(255, 0, 0));
        cancelBtn.setColor2(new java.awt.Color(153, 0, 0));
        cancelBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        cancelBtn.setSizeSpeed(5.0F);
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 110, 35));

        idTxt.setText("");
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 150, 340, 40));

        errorLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        errorLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(errorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 340, 30));

        nameTxt.setText("");
        getContentPane().add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 250, 340, 40));

        jScrollPane1.setBackground(new java.awt.Color(239, 241, 240));

        discriptionTxt.setBackground(new java.awt.Color(239, 241, 240));
        discriptionTxt.setColumns(20);
        discriptionTxt.setRows(5);
        jScrollPane1.setViewportView(discriptionTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 340, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LocationForm.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        setVisible(false);
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String ID = idTxt.getText();
        String Name = nameTxt.getText();
        String Des = discriptionTxt.getText();
        
        if(ID.equals("")){
            errorLbl.setForeground(Color.red);
            errorLbl.setText("ID is Empty!!!");
        }else if(Name.equals("")){
            errorLbl.setForeground(Color.red);
            errorLbl.setText("Name is Empty!!!");
        }else{
            try {
                if (Des.equals("")){
                    String empty = "Empty";
                    DB.putdata("INSERT INTO location VALUES('"+ID+"','"+Name+"','"+empty+"')");
                    errorLbl.setForeground(Color.GREEN);
                    errorLbl.setText("Done");
                    textClear();
                }else{
                    DB.putdata("INSERT INTO location VALUES('"+ID+"','"+Name+"','"+Des+"')");
                    errorLbl.setForeground(Color.GREEN);
                    errorLbl.setText("Done");
                    textClear();
                }
                
            } catch (Exception e) {
                String exceptionClassName = e.getClass().getName();
                System.out.println(exceptionClassName);
                if (exceptionClassName.equals("java.sql.SQLException")){
                    errorLbl.setForeground(Color.red);
                    errorLbl.setText("Only Numbers for ID!!!");
                    textClear();
                }else if (exceptionClassName.equals("java.sql.SQLIntegrityConstraintViolationException")){
                    errorLbl.setForeground(Color.red);
                    errorLbl.setText("ID Already Exists");
                    textClear();
                }
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Locations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonGradient addBtn;
    private swing.ButtonGradient cancelBtn;
    private javax.swing.JTextArea discriptionTxt;
    private javax.swing.JLabel errorLbl;
    private swing.Text idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.Text nameTxt;
    private swing.ButtonGradient updateBtn;
    // End of variables declaration//GEN-END:variables
}