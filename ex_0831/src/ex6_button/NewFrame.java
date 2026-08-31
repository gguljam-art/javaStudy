package ex6_button;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewFrame extends Frame{
    public NewFrame(Frame f){
        setBounds(f.getX(), f.getY(),300,300);//f를 중심으로 생성
        setBackground(Color.CYAN);

        // 프레임의 사이즈를 고정
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //현제 열려있는 모든 프레임 종료
                //System.exit(0);
                
                //현제 프레임만 단독으로 종료
                dispose();
            }
        });
        setVisible(true);
    }
}
