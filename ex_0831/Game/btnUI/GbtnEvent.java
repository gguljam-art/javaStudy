package Game.btnUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GbtnEvent extends MouseAdapter{
    
    Gbtn gbtn;
    public GbtnEvent(Gbtn gbtn){
        this.gbtn = gbtn;
    };
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            gbtn.setPush();
        }
        if(e.getButton() == MouseEvent.BUTTON3){
            gbtn.setRbtn();
        }
    }
}
