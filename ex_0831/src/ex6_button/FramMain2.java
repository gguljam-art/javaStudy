package ex6_button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramMain2 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(300,300,500,500);
        f.setLayout(null);

        //버튼들 생성
        Button btn1 = new Button("버튼 1");
        Button btn2 = new Button("버튼 2");
        Button btn3 = new Button("버튼 3");
        Button btn4 = new Button("버튼 4");

        int buttonWidth = 300;
        int buttonHeight = 100;
        int margin = 10;
        btn1.setBounds(0, 0, buttonWidth, buttonHeight);
        btn2.setBounds(0, buttonHeight + margin, buttonWidth, buttonHeight);
        btn3.setBounds(0, (buttonHeight + margin) * 2, buttonWidth, buttonHeight);
        btn4.setBounds(0, (buttonHeight + margin) * 3, buttonWidth, buttonHeight);
    
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                switch (e.getActionCommand()) {
                    case "버튼 1":System.out.println("버튼 1 클릭함");break;
                    case "버튼 2":System.out.println("버튼 2를 클릭함");break;
                    case "버튼 3":
                        new NewFrame(f);
                        break;
                    case "버튼 4":break;
                
                    default:break;
                }
            }
        };

        btn1.addActionListener(action);
        btn2.addActionListener(action);
        btn3.addActionListener(action);
        btn4.addActionListener(action);
   
        //생성된 버튼들을 f에 추가
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
