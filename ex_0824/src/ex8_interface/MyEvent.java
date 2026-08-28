package ex8_interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent {
    public static void main(String[] args) {
        Frame fm = new Frame();
        Button btn = new Button("버튼");
        Button btn1 = new Button("버튼");
        Button btn2 = new Button("버튼");

        fm.setSize(300,300);
        fm.add(btn);
        fm.add(btn1);
        fm.add(btn2);
        fm.setVisible(true);

        // btn.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.exit(0);
        //     }
        // });

        btn.addActionListener(e -> {
            System.out.println("안녕");
        });
    }
}
