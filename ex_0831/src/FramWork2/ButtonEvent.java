package FramWork2;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent implements ActionListener{
    Label awlb;
    StringBuffer beStr = new StringBuffer();
    StringBuffer crt = new StringBuffer();
    char cmath = '0';

    public ButtonEvent(Label label){
        this.awlb = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str);
        if(str.equals("=")){
            int answer = 0;
            switch (cmath) {
                case '+':
                    answer =
                    Integer.parseInt(beStr.toString()) + 
                    Integer.parseInt(crt.toString());
                    break;
                case '-':
                    answer =
                    Integer.parseInt(beStr.toString()) - 
                    Integer.parseInt(crt.toString());
                    break;
                case 'x':
                    answer =
                    Integer.parseInt(beStr.toString()) * 
                    Integer.parseInt(crt.toString());
                    break;
                case '/': 
                    answer =
                    Integer.parseInt(beStr.toString()) / 
                    Integer.parseInt(crt.toString());
                    break;
            
                default:
                    break;
            }

            beStr.setLength(0);
            crt.setLength(0);
            beStr.append(""+answer);
            crt.append(""+answer);
            awlb.setText(crt.toString());
        }
        else{
            if(str.charAt(0) < '0' && str.charAt(0) > '9'){
                cmath = str.charAt(0);
                beStr.append(crt);
                crt.setLength(0);
                System.out.println((char)cmath);
            }
            crt.append(str);
            awlb.setText(crt.toString());
        }
        
    }
}
