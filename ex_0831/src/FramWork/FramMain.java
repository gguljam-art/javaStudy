package FramWork;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramMain {
    public static void main(String[] args) {
        int w = 600;
        int h = 300;
        int x = 1920/2 - w/2;
        int y = 1080/2 - h/2;
        
        Frame f = new Frame();
        f.setBounds(x, y, w, h);
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame endWin = new Frame();
                int eW = 250;
                int eH = 150;
                int eX = f.getX() + w/2 - eW/2;
                int eY = f.getY() + h/2 - eH/2;
                endWin.setBounds(eX, eY, eW, eH);
                endWin.setLayout(null);
                System.out.println("종료시도");

                Font hfont = new Font("맑은고딕", Font.BOLD, 15);
                Label ht = new Label("종료하시겠습니까?");
                ht.setFont(hfont);
                ht.setBounds(50, 25, 200, 50);

                Button btn1 = new Button("아니오");
                Button btn2 = new Button("예");

                btn1.setBounds(20, 75, 100, 50);
                btn2.setBounds(130, 75, 100, 50);

                btn1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        endWin.dispose();
                    }
                });

                btn2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });

                endWin.add(ht);
                endWin.add(btn1);
                endWin.add(btn2);

                endWin.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        endWin.dispose();
                    }
                });
                endWin.setVisible(true);
            }
        });
        f.setVisible(true);
    }
}
