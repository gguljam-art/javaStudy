package ex1_choice;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoicMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setBounds(500, 100, 400, 300);
        f.setLayout(null);

        Choice day = new Choice();
        day.add("지역선택");
        day.add("서울");
        day.add("경기");
        day.add("인천");
        day.add("광주");
        day.add("대구");
        day.add("대전");
        day.add("부산");
        day.setBounds(70,150, 120, 0);
   
        Font font = new Font("맑은고딕", Font.BOLD, 15);
        Label label = new Label("지역선택");
        label.setFont(font);
        day.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(day.getSelectedItem());
                label.setText("\'"+day.getSelectedItem()+"\'"+"를(을) 선택");
            }
        });
        f.add(day);
        label.setBounds(200, 47, 300, 230);

        f.add(label);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
