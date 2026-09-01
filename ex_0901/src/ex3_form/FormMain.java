package ex3_form;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FormMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(500, 200, 400, 600);
        f.setBackground(Color.CYAN);
        f.setResizable(false);

        Font font = new Font("",Font.PLAIN,30);
        //최상단
        TextField tf = new TextField();
        tf.setFont(font);
        tf.setBounds(30, 50, 290, 50);
        f.add(tf);

        Button inputbtn = new Button("입력");
        inputbtn.setEnabled(false);
        inputbtn.setBounds(330, 50, 50, 50);

        //중앙
        TextArea ta = new TextArea();
        ta.setFont(font);
        ta.setBounds(30,110, 350,400);
        ta.setEditable(false); //값을 직접 입력 못하게막음
        f.add(ta);

        //최하단
        Button btnSave = new Button("저장");
        Button btnClose = new Button("종료");
        btnSave.setBounds(30,520,250,40);
        btnClose.setBounds(290,520,90,40);
        f.add(btnSave);
        f.add(btnClose);
        
        //tf에 값이 들어간 경우
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                if(!tf.getText().trim().equals("")){
                    inputbtn.setEnabled(true);
                }
                else{
                    inputbtn.setEnabled(false);
                }
            }
        });
        f.add(inputbtn);

        //입력버튼에 대한 감지
        inputbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append(tf.getText() + "\n");
                tf.setText("");
                tf.requestFocus();
            }
        });

        //tf에서 키보드에 엔터값을 감지
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_ENTER){
                    ta.append(tf.getText()+"\n");
                    tf.setText("");
                    tf.requestFocus();
                }
            }
        });

        //종료버튼 감지
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //저장버튼
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = ta.getText();
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    FileDialog fdl = new FileDialog(f, "저장", FileDialog.SAVE);//팝업창처럼 올라오는 공간
                    fdl.setVisible(true);

                    String path = fdl.getDirectory() + fdl.getFile();
                    System.out.println(path);

                    //msg를 저장
                    fw = new FileWriter(path);
                    bw = new BufferedWriter(fw);
                    bw.write(msg);
                    bw.flush();
                } catch (Exception e2) {
                    // TODO: handle exception
                } finally{
                    try {
                        if(bw != null) bw.close();
                        if(fw != null) fw.close();
                    } catch (Exception e3) {
                        // TODO: handle exception
                    }
                }
            }
        });

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
