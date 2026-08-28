package ex1_thread;

public class ThreadSub extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(500);    
            } catch (Exception e) {
                // TODO: handle exception
            }
            
            System.out.println("스레드실행중");
        }
    }
}
