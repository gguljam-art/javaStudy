package ex7_frame;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramMain {
    public static void main(String[] args) {
        int width = 500;
        int heigh = 700;
        Frame f = new Frame();
        int x = 1920/2 - width/2;
        int y = 1080/2 - heigh/2;
        f.setBounds(x,y,width,heigh);
        f.setLayout(null);

        Font font = new Font("궁서체", Font.BOLD, 15);
        Label q1 = new Label("관심 분야는 무엇입니까?");
        q1.setFont(font);
        q1.setBackground(Color.YELLOW);
        q1.setBounds( 50, 100,150,100);

        Checkbox news = new Checkbox("뉴스");
        news.setBounds( 50,200,100,100);
        Checkbox sport = new Checkbox("운동");
        sport.setBounds( 150,200,150,100);

        //체크박스의 선택여부 판단
        ItemListener item = new ItemListener(){
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                Checkbox cb = (Checkbox)e.getItemSelectable();
                if(cb.getState()) {
                    System.out.println(cb.getLabel() + " 선택됨");
                } else {
                    System.out.println(cb.getLabel() + " 선택 해제됨");
                }

                //e.getStateChange() 1 이면 선택이 된 것
                //e.getStateChange() 2 이면 해제 된 것
            }
        };

        news.addItemListener(item);
        sport.addItemListener(item);

        CheckboxGroup cg1 = new CheckboxGroup();
        Checkbox c1 = new Checkbox("yes", cg1, false); // 라디오 버튼 yes
        Checkbox c2 = new Checkbox("no", cg1, false);  // 라디오 버튼 no
        c1.setBounds( 50,300,100,100);
        c2.setBounds( 150,300,100,100);

        ItemListener check1 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                System.out.println((String)e.getItem());
            }
        };

        c1.addItemListener(check1);
        c2.addItemListener(check1);

        f.add(q1);
        f.add(news);
        f.add(sport);
        f.add(c1);
        f.add(c2);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.setVisible(true);
    }
}
