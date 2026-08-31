package FramWork2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FramMain {
    public static void main(String[] args) {
        int w = 600;
        int h = 300;
        int x = 1920/2 - w/2;
        int y = 1080/2 - h/2;

        Frame f = new Frame("계산기");
        f.setBounds(x, y, w, h);
        f.setLayout(null);

        // Button btn = new Button("add");
        // btn.setBounds(0, 0, 50, 50);
        // f.add(btn);

        Button[][] numBtn = new Button[5][5];
        int posX = 0;
        int posY = 60;
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 5; j ++){
                numBtn[i][j] = new Button(""+(i*5+j));
                numBtn[i][j].setBounds(posX += 30, posY, 30, 30);
                f.add(numBtn[i][j]);
            }
            posX = 0;
            posY += 30;
        }

        Button[] mathBtn = new Button[5];
        String[] mathstr = {
            "+", "-", "x", "/", "="
        };

        for(int i = 0; i < 5; i++){
            mathBtn[i] = new Button(mathstr[i]);
            mathBtn[i].setBounds(posX += 30, posY, 30, 30);
            f.add(mathBtn[i]);
        }

        posY += 30;
        Label awlb = new Label("계산완료레이블");

        ButtonEvent mathal = new ButtonEvent(awlb);

        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 5; j ++){
                numBtn[i][j].addActionListener(mathal);
            }
            posX = 0;
            posY += 30;
        }

        for(int i = 0; i < 5; i++){
            mathBtn[i].addActionListener(mathal);
        }

        awlb.setBounds(30, posY, 150, 30);
        f.add(awlb);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
