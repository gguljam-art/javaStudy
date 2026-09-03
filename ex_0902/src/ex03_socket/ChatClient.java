package ex03_socket;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Frame implements Runnable{
    TextArea area;
    TextField input;
    Button send_bt;

    //서버접속 및 데이터 전달용 객체
    Socket s;
    BufferedReader in;
    PrintWriter out;
    Thread t;

    //메시지 전송 메서드
    private void sendData(){
        String msg = input.getText().trim();
        if(msg.length()>0){
            out.println(msg);
        }
        input.setText("");
    }

    @Override
    public void run() {
        while(true){
            try {
                String msg = in.readLine();
                if(msg.equals(Utill.ENDTOKEN)){
                    break;
                }
                if(msg != null){
                    area.append(msg + "\n");
                }
            } catch (Exception e) {
                
            }
        }//while

        //열려있는 스트림 닫기
        try {
            if(out != null) out.close();
            if(in != null) in.close();
            if(s != null) s.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

        System.exit(0);
    }

    public ChatClient(){
        setBounds(500,200,400,500);
        setLayout(null);

        area = new TextArea();
        area.setBounds(10,30,380,350);
        add(area);

        input = new TextField();
        input.setBounds(10, 450,300,20);
        add(input);

        send_bt = new Button("전송");
        send_bt.setBounds(320,440,70,40);
        add(send_bt);

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                //종료하기 전에 서버에게 접속 해제 요청
                out.println(Utill.ENDTOKEN);
            }
        });

        //서버접속 메서드 호출
        connected();

        //메시지를 감지하기 위한 스레드
        t = new Thread(this);
        t.start();

        //전송버튼 클릭 감자
        send_bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendData();//서버로 메시지를 전달 한다.
            }
        });

        setVisible(true);
    }

    //서버접속
    private void connected(){
        try {
            s=new Socket("192.168.0.46",3500);
            in = new BufferedReader(
                new InputStreamReader(s.getInputStream())
            );
            out = new PrintWriter(s.getOutputStream(),true);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
