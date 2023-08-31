/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.Model_Menu;

/**
 *
 * @author aruna
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * @param selected the selected to set
     */
    
    /**
     * Creates new form MenuItem
     */
    private boolean selected;
    private boolean over;
        
    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_Menu.MenuType.MENU){
            lblIcon.setIcon(data.toIcon());
            lblname.setText(data.getName());
        }else if(data.getType()==Model_Menu.MenuType.TITLE){
            lblIcon.setText(data.getName());
            lblIcon.setFont(new Font("Britannic", 2, 14));
            lblname.setVisible(false);
        }else{
            lblname.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    public void setOver(boolean over){
        this.over = over;
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(200, 35));

        lblIcon.setForeground(new java.awt.Color(255, 255, 255));

        lblname.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Menu Name");
        lblname.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblname.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(lblname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected || over){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if(selected){
            g2.setColor(new Color(255,255,255,80));
        }else{
            g2.setColor(new Color(255,255,255,20));
        }
        g2.fillRoundRect(10, 0, getWidth()-20, getHeight(), 5, 5);
        }
        super.paintComponent(g); 
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblname;
    // End of variables declaration//GEN-END:variables
}
