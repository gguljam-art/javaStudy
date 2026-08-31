package ex04_listener;

import java.awt.*;

public class FramMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500,200,300,300);

        f.addWindowListener(new MyClosingListener());
        f.setVisible(true);
    }
}
