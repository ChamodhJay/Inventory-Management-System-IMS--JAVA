/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author aruna
 */
public class Header extends javax.swing.JPanel {
    
    

    /**
     * Creates new form Header
     */
    public Header() {
        initComponents();
        setOpaque(false);
    }
     
    
    //component.Header seaech = new component.Header();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchlbl = new javax.swing.JLabel();
        searchText1 = new swing.SearchText();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(824, 45));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BlueSearch_2.png"))); // NOI18N
        searchlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchlblMouseClicked(evt);
            }
        });
        add(searchlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -5, 30, 45));

        searchText1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchText1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        searchText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText1ActionPerformed(evt);
            }
        });
        add(searchText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 30));
    }// </editor-fold>//GEN-END:initComponents

   
    private void searchlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchlblMouseClicked
  
    }//GEN-LAST:event_searchlblMouseClicked

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText1ActionPerformed

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth()-25, getHeight()-25, getWidth(), getHeight());
        super.paintComponent(g); 
    }

    public String textout(){
        return searchText1.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.SearchText searchText1;
    private javax.swing.JLabel searchlbl;
    // End of variables declaration//GEN-END:variables
}
