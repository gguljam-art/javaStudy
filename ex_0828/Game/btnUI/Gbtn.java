package Game.btnUI;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;

/**
 * btnStyle
 */
public class Gbtn extends JButton{
    
    public Gbtn(){
        Font font = new Font("",Font.BOLD,11);
        setFont(font);
        setMargin(new Insets(0, 0, 0, 0));
    }
}