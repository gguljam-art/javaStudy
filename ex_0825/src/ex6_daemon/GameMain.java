package ex6_daemon;

public class GameMain {
    public static void main(String[] args) {
        //데몬스레드
        //다른 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드

        SaveCls sc = new SaveCls();
        sc.setDaemon(true);
        sc.start();
        for(int i = 0; i < 20; i++){
            try {
                Thread.sleep(1000);
                System.out.println("게임중...");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
