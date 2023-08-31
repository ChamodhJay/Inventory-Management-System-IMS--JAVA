package swing;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author aruna
 */
public class Text extends JTextField{
    private Color backgroundColor = Color.decode("#eff1f0");
    public Text(){
        setBackground(new Color(255,255,255,0));
        setOpaque(false);
        setBorder(new EmptyBorder(10,10,10,50));
        setText("roundedText1");
        setFont(new java.awt.Font("Poppins Medium", 0, 14));
        setSelectionColor(Color.decode("#4F52FF"));
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
    
    private final String hint = "Enter Here...";

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
