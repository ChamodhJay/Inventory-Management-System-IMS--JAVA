/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author aruna
 */
public class SearchText extends JTextField{
    public SearchText(){
        setBorder(new LineBorder(Color.yellow, 1, true));
        setSelectionColor(Color.decode("#4F52FF"));
    }
    private final String hint = "Search Here....";

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        if(getText().length() == 0){
            int h = getHeight();
            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm  = g.getFontMetrics();
            int  c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1)+ ((c1 & m) >>> 1);
            g.setColor(new Color(c2,true));
            g.drawString(hint, ins.left, h/2+fm.getAscent()/2-2);
            
        }
    }
    
    
}
