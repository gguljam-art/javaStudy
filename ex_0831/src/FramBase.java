import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramBase {
    public static void main(String[] args) {
        int width = 500;
        int heigh = 300;
        Frame f = new Frame();
        int x = 1920/2 - width/2;
        int y = 1080/2 - heigh/2;
        f.setBounds(x,y,width,heigh);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
}
