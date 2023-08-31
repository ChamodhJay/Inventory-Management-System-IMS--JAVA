/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main_forms;

import JDBC.Jdbc;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aruna
 */
public class Main_Items extends javax.swing.JFrame {

    private void comboLoader(){
        try {
            java.sql.ResultSet rs = DB.getdata("SELECT Cat_Name from main_category");
            
            while(rs.next()){
                String name = rs.getString("Cat_Name");
                mainItemCombo.addItem(name);
            }
        } catch (Exception e) {
        }
    }
    /**
     * Creates new form Main_Items
     */
    JDBC.Jdbc DB = new Jdbc();
    private void textClear(){
        idTxt.setText("");
        itemNameTxt.setText("");
        disTxt.setText("");
        mainItemCombo.setSelectedIndex(0);
    }
    public Main_Items() {
        initComponents();
        comboLoader();     
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
        itemNameTxt = new swing.Text();
        idTxt = new swing.Text();
        jScrollPane1 = new javax.swing.JScrollPane();
        disTxt = new javax.swing.JTextArea();
        mainItemCombo = new combobox.Combobox();
        errorLbl = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();

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
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
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

        itemNameTxt.setText("");
        itemNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(itemNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 340, 320, 40));

        idTxt.setText("");
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 310, -1));

        disTxt.setBackground(new java.awt.Color(239, 241, 240));
        disTxt.setColumns(20);
        disTxt.setRows(5);
        jScrollPane1.setViewportView(disTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 320, 230));

        mainItemCombo.setBackground(new java.awt.Color(239, 241, 240));
        mainItemCombo.setLabeText("Select Category Name");
        mainItemCombo.setLineColor(new java.awt.Color(0, 0, 255));
        getContentPane().add(mainItemCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 310, -1));

        errorLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        errorLbl.setForeground(new java.awt.Color(255, 0, 51));
        errorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(errorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 320, 30));

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MainItemsFom.png"))); // NOI18N
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 830, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameTxtActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String comboValue = (String) mainItemCombo.getSelectedItem();
        String ID = idTxt.getText();
        String Name = itemNameTxt.getText();
        String Des = disTxt.getText();
        int catId = 0;
        
        if(ID.equals("")){
            errorLbl.setForeground(Color.red);
            errorLbl.setText("ID is Empty!!!");
        }else if(Name.equals("")){
            errorLbl.setForeground(Color.red);
            errorLbl.setText("Name is Empty!!!");
        }else{
            try {
                java.sql.ResultSet rs = DB.getdata("SELECT Cat_ID FROM main_category where Cat_Name = '"+comboValue+"'");
                while(rs.next()){
                    catId = (rs.getInt("Cat_ID"));
                }
                try {
                    
                    if (Des.equals("")){
                        String empty = "Empty";
                        DB.putdata("INSERT INTO main_items VALUES('"+ID+"','"+Name+"','"+catId+"','"+empty+"')");
                        errorLbl.setForeground(Color.GREEN);
                        errorLbl.setText("Done");
                        textClear();
                    }else{
                        DB.putdata("INSERT INTO main_items VALUES('"+ID+"','"+Name+"','"+catId+"','"+Des+"')");
                        errorLbl.setForeground(Color.GREEN);
                        errorLbl.setText("Done");
                        textClear();
                    }
                    
                } catch (Exception e) {
                    String exceptionClassName = e.getClass().getName();
                    System.out.println(exceptionClassName);
                    System.out.println(e + " Get");
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
            } catch (Exception ex) {
                Logger.getLogger(Main_Items.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        textClear();
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonGradient addBtn;
    private swing.ButtonGradient cancelBtn;
    private javax.swing.JTextArea disTxt;
    private javax.swing.JLabel errorLbl;
    private swing.Text idTxt;
    private swing.Text itemNameTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private combobox.Combobox mainItemCombo;
    private swing.ButtonGradient updateBtn;
    // End of variables declaration//GEN-END:variables
}
