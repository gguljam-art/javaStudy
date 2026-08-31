package Game;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.btnUI.Gbtn;

import java.awt.GridLayout;
import java.util.ArrayList;

public class GameFram extends JFrame{

    private int widt = 0;
    private int heig = 0;
    private char[][] bord;
    private Gbtn[][] bttns;

    ArrayList<JButton> btnArr;

    public GameFram(int widt, int heig, char[][] bord){

        this.widt = widt;
        this.heig = heig;
        this.bord = bord;

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel jp = new JPanel(new GridLayout(10,10));
        bttns = new Gbtn[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                bttns[i][j] = new Gbtn(i, j, bord[i][j],bttns);
                //pn.setBackground(new Color(r,g,b));
                jp.add(bttns[i][j]);
            }
        }

        add(jp);
        setVisible(true);
    }
    void setFrame(){
        
    }
}
