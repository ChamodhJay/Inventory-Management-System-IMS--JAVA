/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author aruna
 */
public class TableHeader extends JLabel{

    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.red);
        setFont(new Font("Poppins SemiBold", 1, 12));
        
        setForeground(Color.decode("#4F52FF"));
        setBorder(new EmptyBorder(10,5,10,5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        
        super.paintComponent(g);
        g.setColor(new Color(230,230,230));
        g.drawLine(0, getHeight()-1,getWidth(), getHeight()-1);
    }
    
    
}
