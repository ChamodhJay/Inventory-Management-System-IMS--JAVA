package swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author aruna
 */
public class roundedText extends JTextField{
    private Color backgroundColor = Color.WHITE;
    public roundedText(){
        setBackground(new Color(255,255,255,0));
        setOpaque(false);
        setBorder(new EmptyBorder(10,10,10,50));
        setText("roundedText1");
        setFont(new java.awt.Font("Segoe UI", 0, 14));
        setSelectionColor(Color.blue);
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);    //  For smooth line
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR); //  For smooth image
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, width, height, height, height);
        super.paintComponent(g);
    }
    
    
    
}
