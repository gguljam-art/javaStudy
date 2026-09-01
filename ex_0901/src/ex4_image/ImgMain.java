package ex4_image;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class ImgMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(300, 0, 500, 1080);
        
        //이미지버튼
        ImageIcon btImg = new ImageIcon("src/images/cp.png");
        JButton imgBtn = new JButton(btImg);
        imgBtn.setBounds(50, 50, 175, 157);
        imgBtn.setBorderPainted(false);
        imgBtn.setContentAreaFilled(false);
        f.repaint();
        f.add(imgBtn);
        
        //이미지참조
        ImageIcon img = new ImageIcon("src/images/배경화면.jpg");
        JLabel jl = new JLabel(img);
        jl.setBounds(0,10,500,1080);
        f.add(jl);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
