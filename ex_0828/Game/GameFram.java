package Game;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.btnUI.Gbtn;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

public class GameFram extends JFrame{

    private int widt = 0;
    private int heig = 0;

    ArrayList<JButton> btnArr;

    public GameFram(int widt, int heig){

        this.widt = widt;
        this.heig = heig;

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel jp = new JPanel(new GridLayout(10,10));
        Random rd = new Random();

        for(int i = 0; i < 10 * 10; i++){
            Gbtn pn = new Gbtn();
            
            pn.setText(String.valueOf(i));
            //pn.setBackground(new Color(r,g,b));

            jp.add(pn);
        }

        add(jp);
        setVisible(true);
    }
    void setFrame(){
        
    }
}
