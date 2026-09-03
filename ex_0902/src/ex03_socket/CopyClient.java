package ex03_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{
    //arraylist에 담겨질 client의 복사본

    Socket s;
    BufferedReader in;
    PrintWriter out;
    ChatServer server;
    String ip;

    public CopyClient(Socket s, ChatServer cs){
        this.s = s;
        this.server = cs;

        try {
            out = new PrintWriter( s.getOutputStream() );
            in = new BufferedReader(
                new InputStreamReader(s.getInputStream())
            );
            ip = s.getInetAddress().getHostAddress();
        } catch (Exception e) {
        }
    }//생성자
    @Override
    public void run() {
        while ( true ) {
            try {
                String msg = in.readLine();
                if(msg.equals(Utill.ENDTOKEN)){
                    out.print(Utill.ENDTOKEN);
                    server.removeClient(this);
                    break;
                }

                server.sendMessage(msg);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
