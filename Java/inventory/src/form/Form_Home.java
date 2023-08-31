/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import model.Model_Card;

/**
 *
 * @author aruna
 */
public class Form_Home extends javax.swing.JPanel {
    JDBC.Jdbc DB = new JDBC.Jdbc();
    int Qun0 =0;
    int Qun1 =0;
    int Qun2 =0;
    int Qun3 =0;
     private void get_Computer(){
        
        try {
            java.sql.ResultSet rs = DB.getdata("SELECT * FROM computer_item;");
            while(rs.next()){
                 Qun0 = Qun0 + Integer.valueOf(rs.getString("Quantity"));
                card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/images/computer.png")),"Computer Items",Integer.toString(Qun0),"Computer Items In the Stock"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void get_Electricity_Items(){
        try {
            java.sql.ResultSet rs = DB.getdata("SELECT * FROM electricity_items;");
            while(rs.next()){
                Qun1 = Qun1 + Integer.valueOf(rs.getString("Quantity"));
                card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/images/Elecrtonic.png")),"Elecrtonic Items",Integer.toString(Qun1),"Elecrtonic Items In the Stock"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void get_furnitures(){
        try {
            java.sql.ResultSet rs = DB.getdata("SELECT * FROM furnitures;");
            while(rs.next()){
                Qun2 = Qun2 +  Integer.valueOf(rs.getString("Quantity"));
                card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/images/furnitures.png")),"Furniture",Integer.toString(Qun2),"Furniture In the Stock"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void get_vehicals(){
        try {
            java.sql.ResultSet rs = DB.getdata("SELECT * FROM vehicals;");
            while(rs.next()){
                Qun3 = Qun3 +  Integer.valueOf(rs.getString("Quantity"));
                card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/images/vehicals.png")),"Vehicles",Integer.toString(Qun3),"Vehicles In the Stock"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Form_Home() {
        initComponents();
        get_Computer();
        get_Electricity_Items();
        get_furnitures();
        get_vehicals();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new swing.Table();
        panalBorder1 = new swing.PanalBorder();
        jPanel2 = new javax.swing.JPanel();
        card1 = new component.Card();
        card2 = new component.Card();
        card3 = new component.Card();
        card4 = new component.Card();
        panalBorder2 = new swing.PanalBorder();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new swing.Table();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(824, 723));

        panalBorder1.setMinimumSize(new java.awt.Dimension(824, 723));
        panalBorder1.setPreferredSize(new java.awt.Dimension(824, 713));
        panalBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        card1.setColor1(new java.awt.Color(255, 175, 189));
        card1.setColor2(new java.awt.Color(255, 195, 160));
        jPanel2.add(card1);

        card2.setColor1(new java.awt.Color(2, 170, 176));
        card2.setColor2(new java.awt.Color(0, 205, 172));
        jPanel2.add(card2);

        card3.setColor1(new java.awt.Color(123, 67, 151));
        card3.setColor2(new java.awt.Color(220, 36, 48));
        jPanel2.add(card3);

        card4.setColor1(new java.awt.Color(54, 209, 220));
        card4.setColor2(new java.awt.Color(91, 134, 229));
        jPanel2.add(card4);

        panalBorder1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 780, 300));

        panalBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panalBorder2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 127, 127));
        jLabel2.setText("Summery");
        panalBorder2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 111, 22));

        jScrollPane1.setBorder(null);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Catogery", "Location", "Quntitiy", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(table);

        panalBorder2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 780, 316));

        panalBorder1.add(panalBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 780, 350));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FIXED ASSESTS");
        panalBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -3, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Front_Bar.png"))); // NOI18N
        panalBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -20, 310, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background_Image.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(824, 723));
        jLabel1.setMinimumSize(new java.awt.Dimension(824, 723));
        jLabel1.setPreferredSize(new java.awt.Dimension(824, 723));
        panalBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panalBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panalBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Card card1;
    private component.Card card2;
    private component.Card card3;
    private component.Card card4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.PanalBorder panalBorder1;
    private swing.PanalBorder panalBorder2;
    private swing.Table table;
    private swing.Table table1;
    // End of variables declaration//GEN-END:variables

  
}