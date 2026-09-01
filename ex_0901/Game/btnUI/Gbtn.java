package Game.btnUI;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;

/**
 * btnStyle
 */
public class Gbtn extends JButton{
    
    private int x;
    private int y;
    private char str;
    private Gbtn[][] bttns;

    public Gbtn(int x, int y, char str, Gbtn[][] bttns){
        this.x = x;
        this.y = y;
        this.str = str;
        this.bttns = bttns;

        Font font = new Font("",Font.BOLD,11);
        setFont(font);
        setMargin(new Insets(0, 0, 0, 0));
        this.addMouseListener(new GbtnEvent(this));
    }

    public char getstr(){
        return str;
    }

    public void setPush(){//버튼 눌렸을때 이벤트
        String flag = new String(Character.toChars(0X1F6A9));
        String t = this.getText();

        if(t.equals(flag) || t.equals("?")) return;

        this.setEnabled(false);
        if(this.str == '0'){
            setNearbttn();
        }
        setText(String.valueOf(str));
    }

    public void setRbtn(){
        String flag = new String(Character.toChars(0X1F6A9));
        String t = this.getText();

        if(!t.equals(flag) && !t.equals("?")){
            setText(flag);
        }
        else if(t.equals(flag)){
            setText("?");
        }
        else {
            setText("");
        }
    }
    
    public void setNearbttn(){
        int cul = 10;
        int low = 10;

        int culStart = x - 1 < 0 ? 0 : x - 1;
        int culEnd   = x + 1 >= cul ? cul-1 : x + 1;

        int lowStart = y - 1 < 0 ? 0 : y - 1;
        int lowEnd   = y + 1 >= low ? low-1 : y + 1;

        for(int i = culStart; i <= culEnd; i ++ ){
            for(int j = lowStart; j <= lowEnd; j++){
                if(bttns[i][j].isEnabled()){
                    bttns[i][j].setPush();
                }
            }
        }
    }

    public void endgame(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(bttns[i][j].getstr() == '●'){
                    bttns[i][j].setEnabled(false);
                    bttns[i][j].setText(String.valueOf(str));
                }
            }
        }
    }
}