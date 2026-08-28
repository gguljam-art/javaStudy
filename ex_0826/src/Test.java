import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{
    public Test(){
        setTitle("Title");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel outPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.BOTH;

        JPanel topP = new JPanel(new GridLayout(1,3));
        topP.setBackground(Color.BLUE);
        
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        outPanel.add(topP, gc);

        JPanel mP = new JPanel(new GridLayout(1,3));
        mP.setBackground(Color.RED);
        
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.9;
        outPanel.add(mP, gc);

        setVisible(true);
        add(outPanel);
    }
    public static void main(String[] args) {
        new Test();
    }
}
