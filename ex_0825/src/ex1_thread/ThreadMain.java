package ex1_thread;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadSub ts = new ThreadSub();
        ts.start();

        for(int i = 0; i < 10; i ++){
            System.out.println("메인스레드 실행중");
        }

        System.out.println("메인스레드 종료");
    }
}