import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest extends JFrame{
    
    private int with = 500;
    private int higt = 600;
    
    public FrameTest(){
        setSize(with, higt);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel outPanel = new JPanel(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.BOTH;

        // JPanel hdP = new JPanel(new GridLayout(1,1));
        // hdP.setBackground(Color.CYAN);
        // hdP.setPreferredSize(new Dimension(0, 60));
        // gc.gridx = 0;
        // gc.weightx = 1;
        // gc.weighty = 0.01;
        // outPanel.add(hdP,gc);

        JPanel mP = new JPanel(new GridLayout(15,15));
        mP.setBackground(Color.RED);
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        outPanel.add(mP,gc);

        for(int i = 0; i < 15*15; i ++){
            JButton bttn = new JButton();
            bttn.setText("" + i);

            if(i%2 == 0)
                bttn.setEnabled(false);

            mP.add(bttn);
        }

        add(outPanel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FrameTest();
    }
}
