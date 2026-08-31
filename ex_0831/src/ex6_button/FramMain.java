package ex6_button;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500,500,200,300);

        Button btn1 = new Button("확인");
        btn1.setBounds(100,100,150,30);
        f.add(btn1);

        //버튼의 이벤트 감지자
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("확인버튼 클릭함");
            }
        };
        btn1.addActionListener(ac);
        
        Button btn2 = new Button("취소");
        btn2.setBounds(100,140,150,30);
        f.add(btn2);

        //버튼의 이벤트 감지자
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("취소버튼 클릭함");
            }
        });

        f.setLayout(null);//자동배치를 끈다.
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
