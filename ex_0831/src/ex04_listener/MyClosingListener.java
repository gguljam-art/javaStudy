package ex04_listener;

import java.awt.event.WindowEvent;

public class MyClosingListener extends MyEvent{
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("종료할겨");
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("최소화가 돼었음");
    }
}
