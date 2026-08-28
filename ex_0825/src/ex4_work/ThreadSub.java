package ex4_work;

public class ThreadSub extends Thread{
    
    int n;

    @Override
    public void run() {
        for(int i = n; i >= 0; i --){
            try {
                System.out.print(i + ",");
                Thread.sleep(1000);    
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void fac(int n){
        this.n = n;
        this.start();
    }
}
