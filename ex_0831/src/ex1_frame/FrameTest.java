package ex1_frame;

import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        int width = 400;
        int heigh = 400;
        int lox = (1920/2) - width/2;
        int loy = (1080/2) - heigh/2;
        
        Frame frame = new Frame();
        frame.setSize(width,heigh);
        frame.setLocation(lox,loy);
        frame.setBackground(Color.black);
        frame.setVisible(true);
    }
}
