/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

/**
 *
 * @author aruna
 */
public class Form_4 extends javax.swing.JPanel {

    /**
     * Creates new form form1
     */
    public Form_4() {
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

        panalBorder1 = new swing.PanalBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new swing.Table();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonGradient2 = new swing.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();
        buttonGradient1 = new swing.ButtonGradient();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(824, 723));

        panalBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panalBorder1.setPreferredSize(new java.awt.Dimension(824, 713));
        panalBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setBackground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Date", "Report Name", "Report Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(40);
            table1.getColumnModel().getColumn(0).setPreferredWidth(40);
            table1.getColumnModel().getColumn(0).setMaxWidth(40);
            table1.getColumnModel().getColumn(1).setMinWidth(90);
            table1.getColumnModel().getColumn(1).setPreferredWidth(90);
            table1.getColumnModel().getColumn(1).setMaxWidth(90);
        }

        panalBorder1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 510, 410));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        panalBorder1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 220, 370));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Notes.png"))); // NOI18N
        panalBorder1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 30, 50));

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(79, 82, 255));
        jLabel4.setText("Notes");
        panalBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 100, 50));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reports");
        panalBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -30, 300, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Front_Bar.png"))); // NOI18N
        panalBorder1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -20, 350, 80));

        buttonGradient2.setText("Create Yearly  Report");
        buttonGradient2.setToolTipText("");
        buttonGradient2.setFont(new java.awt.Font("Poppins SemiBold", 0, 17)); // NOI18N
        buttonGradient2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonGradient2.setSizeSpeed(10.0F);
        buttonGradient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient2ActionPerformed(evt);
            }
        });
        panalBorder1.add(buttonGradient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 340, 40));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 82, 255));
        jLabel1.setText("Create Report Now");
        panalBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 380, 40));

        buttonGradient1.setText("Create Monthly Report");
        buttonGradient1.setToolTipText("");
        buttonGradient1.setFont(new java.awt.Font("Poppins SemiBold", 0, 17)); // NOI18N
        buttonGradient1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonGradient1.setSizeSpeed(10.0F);
        buttonGradient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient1ActionPerformed(evt);
            }
        });
        panalBorder1.add(buttonGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 340, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background_Image.png"))); // NOI18N
        panalBorder1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 824, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panalBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panalBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGradient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGradient1ActionPerformed

    private void buttonGradient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGradient2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private swing.ButtonGradient buttonGradient1;
    private swing.ButtonGradient buttonGradient2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private swing.PanalBorder panalBorder1;
    private swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
